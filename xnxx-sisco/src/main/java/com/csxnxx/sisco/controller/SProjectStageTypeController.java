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
import com.csxnxx.sisco.domain.SProjectStageType;
import com.csxnxx.sisco.service.ISProjectStageTypeService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 项目阶段类型Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/type")
public class SProjectStageTypeController extends BaseController
{
    @Autowired
    private ISProjectStageTypeService sProjectStageTypeService;

    /**
     * 查询项目阶段类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(SProjectStageType sProjectStageType)
    {
        startPage();
        List<SProjectStageType> list = sProjectStageTypeService.selectSProjectStageTypeList(sProjectStageType);
        return getDataTable(list);
    }

    /**
     * 导出项目阶段类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:type:export')")
    @Log(title = "项目阶段类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SProjectStageType sProjectStageType)
    {
        List<SProjectStageType> list = sProjectStageTypeService.selectSProjectStageTypeList(sProjectStageType);
        ExcelUtil<SProjectStageType> util = new ExcelUtil<SProjectStageType>(SProjectStageType.class);
        util.exportExcel(response, list, "项目阶段类型数据");
    }

    /**
     * 获取项目阶段类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:type:query')")
    @GetMapping(value = "/{stageTypeId}")
    public AjaxResult getInfo(@PathVariable("stageTypeId") String stageTypeId)
    {
        return success(sProjectStageTypeService.selectSProjectStageTypeByStageTypeId(stageTypeId));
    }

    /**
     * 新增项目阶段类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:add')")
    @Log(title = "项目阶段类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SProjectStageType sProjectStageType)
    {
        return toAjax(sProjectStageTypeService.insertSProjectStageType(sProjectStageType));
    }

    /**
     * 修改项目阶段类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:edit')")
    @Log(title = "项目阶段类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SProjectStageType sProjectStageType)
    {
        return toAjax(sProjectStageTypeService.updateSProjectStageType(sProjectStageType));
    }

    /**
     * 删除项目阶段类型
     */
    @PreAuthorize("@ss.hasPermi('system:type:remove')")
    @Log(title = "项目阶段类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stageTypeIds}")
    public AjaxResult remove(@PathVariable String[] stageTypeIds)
    {
        return toAjax(sProjectStageTypeService.deleteSProjectStageTypeByStageTypeIds(stageTypeIds));
    }
}
