package com.csxnxx.sisco.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.csxnxx.common.annotation.Log;
import com.csxnxx.common.core.controller.BaseController;
import com.csxnxx.common.core.domain.AjaxResult;
import com.csxnxx.common.enums.BusinessType;
import com.csxnxx.sisco.domain.SCaseDynamics;
import com.csxnxx.sisco.service.ISCaseDynamicsService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 成功案例和资讯动态Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/sisco/dynamics")
public class SCaseDynamicsController extends BaseController
{
    @Autowired
    private ISCaseDynamicsService sCaseDynamicsService;

    /**
     * 查询成功案例和资讯动态列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:list')")
    @GetMapping("/list")
    public TableDataInfo list(SCaseDynamics sCaseDynamics)
    {
        startPage();
        List<SCaseDynamics> list = sCaseDynamicsService.selectSCaseDynamicsList(sCaseDynamics);
        return getDataTable(list);
    }

    /**
     * 导出成功案例和资讯动态列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:export')")
    @Log(title = "成功案例和资讯动态", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SCaseDynamics sCaseDynamics)
    {
        List<SCaseDynamics> list = sCaseDynamicsService.selectSCaseDynamicsList(sCaseDynamics);
        ExcelUtil<SCaseDynamics> util = new ExcelUtil<SCaseDynamics>(SCaseDynamics.class);
        util.exportExcel(response, list, "成功案例和资讯动态数据");
    }

    /**
     * 获取成功案例和资讯动态详细信息
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:query')")
    @GetMapping(value = "/{cdId}")
    public AjaxResult getInfo(@PathVariable("cdId") String cdId)
    {
        return success(sCaseDynamicsService.selectSCaseDynamicsByCdId(cdId));
    }

    /**
     * 新增成功案例和资讯动态
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:add')")
    @Log(title = "成功案例和资讯动态", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SCaseDynamics sCaseDynamics)
    {
        return toAjax(sCaseDynamicsService.insertSCaseDynamics(sCaseDynamics));
    }

    /**
     * 修改成功案例和资讯动态
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:edit')")
    @Log(title = "成功案例和资讯动态", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SCaseDynamics sCaseDynamics)
    {
        return toAjax(sCaseDynamicsService.updateSCaseDynamics(sCaseDynamics));
    }

    /**
     * 删除成功案例和资讯动态
     */
    @PreAuthorize("@ss.hasPermi('sisco:dynamics:remove')")
    @Log(title = "成功案例和资讯动态", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cdIds}")
    public AjaxResult remove(@PathVariable String[] cdIds)
    {
        return toAjax(sCaseDynamicsService.deleteSCaseDynamicsByCdIds(cdIds));
    }
}
