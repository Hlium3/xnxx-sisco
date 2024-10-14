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
import com.csxnxx.sisco.domain.SProjectStageCopy;
import com.csxnxx.sisco.service.ISProjectStageCopyService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 项目阶段管理Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/sisco/copy")
public class SProjectStageCopyController extends BaseController
{
    @Autowired
    private ISProjectStageCopyService sProjectStageCopyService;

    /**
     * 查询项目阶段管理列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:list')")
    @GetMapping("/list")
    public TableDataInfo list(SProjectStageCopy sProjectStageCopy)
    {
        startPage();
        List<SProjectStageCopy> list = sProjectStageCopyService.selectSProjectStageCopyList(sProjectStageCopy);
        return getDataTable(list);
    }

    /**
     * 导出项目阶段管理列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:export')")
    @Log(title = "项目阶段管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SProjectStageCopy sProjectStageCopy)
    {
        List<SProjectStageCopy> list = sProjectStageCopyService.selectSProjectStageCopyList(sProjectStageCopy);
        ExcelUtil<SProjectStageCopy> util = new ExcelUtil<SProjectStageCopy>(SProjectStageCopy.class);
        util.exportExcel(response, list, "项目阶段管理数据");
    }

    /**
     * 获取项目阶段管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:query')")
    @GetMapping(value = "/{stageId}")
    public AjaxResult getInfo(@PathVariable("stageId") String stageId)
    {
        return success(sProjectStageCopyService.selectSProjectStageCopyByStageId(stageId));
    }

    /**
     * 新增项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:add')")
    @Log(title = "项目阶段管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SProjectStageCopy sProjectStageCopy)
    {
        return toAjax(sProjectStageCopyService.insertSProjectStageCopy(sProjectStageCopy));
    }

    /**
     * 修改项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:edit')")
    @Log(title = "项目阶段管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SProjectStageCopy sProjectStageCopy)
    {
        return toAjax(sProjectStageCopyService.updateSProjectStageCopy(sProjectStageCopy));
    }

    /**
     * 删除项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('sisco:copy:remove')")
    @Log(title = "项目阶段管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stageIds}")
    public AjaxResult remove(@PathVariable String[] stageIds)
    {
        return toAjax(sProjectStageCopyService.deleteSProjectStageCopyByStageIds(stageIds));
    }
}
