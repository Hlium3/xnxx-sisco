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
import com.csxnxx.sisco.domain.SProjectMaintenance;
import com.csxnxx.sisco.service.ISProjectMaintenanceService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/sisco/maintenance")
public class SProjectMaintenanceController extends BaseController
{
    @Autowired
    private ISProjectMaintenanceService sProjectMaintenanceService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:list')")
    @GetMapping("/list")
    public TableDataInfo list(SProjectMaintenance sProjectMaintenance)
    {
        startPage();
        List<SProjectMaintenance> list = sProjectMaintenanceService.selectSProjectMaintenanceList(sProjectMaintenance);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SProjectMaintenance sProjectMaintenance)
    {
        List<SProjectMaintenance> list = sProjectMaintenanceService.selectSProjectMaintenanceList(sProjectMaintenance);
        ExcelUtil<SProjectMaintenance> util = new ExcelUtil<SProjectMaintenance>(SProjectMaintenance.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(sProjectMaintenanceService.selectSProjectMaintenanceById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SProjectMaintenance sProjectMaintenance)
    {
        return toAjax(sProjectMaintenanceService.insertSProjectMaintenance(sProjectMaintenance));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SProjectMaintenance sProjectMaintenance)
    {
        return toAjax(sProjectMaintenanceService.updateSProjectMaintenance(sProjectMaintenance));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('sisco:maintenance:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(sProjectMaintenanceService.deleteSProjectMaintenanceByIds(ids));
    }
}
