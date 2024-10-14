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
import com.csxnxx.sisco.domain.SProjectStage;
import com.csxnxx.sisco.service.ISProjectStageService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 项目阶段管理Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/stage")
public class SProjectStageController extends BaseController
{
    @Autowired
    private ISProjectStageService sProjectStageService;

    /**
     * 查询项目阶段管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:stage:list')")
    @GetMapping("/list")
    public TableDataInfo list(SProjectStage sProjectStage)
    {
        startPage();
        List<SProjectStage> list = sProjectStageService.selectSProjectStageList(sProjectStage);
        return getDataTable(list);
    }

    /**
     * 导出项目阶段管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:stage:export')")
    @Log(title = "项目阶段管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SProjectStage sProjectStage)
    {
        List<SProjectStage> list = sProjectStageService.selectSProjectStageList(sProjectStage);
        ExcelUtil<SProjectStage> util = new ExcelUtil<SProjectStage>(SProjectStage.class);
        util.exportExcel(response, list, "项目阶段管理数据");
    }

    /**
     * 获取项目阶段管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:stage:query')")
    @GetMapping(value = "/{stageId}")
    public AjaxResult getInfo(@PathVariable("stageId") String stageId)
    {
        return success(sProjectStageService.selectSProjectStageByStageId(stageId));
    }

    /**
     * 新增项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('system:stage:add')")
    @Log(title = "项目阶段管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SProjectStage sProjectStage)
    {
        return toAjax(sProjectStageService.insertSProjectStage(sProjectStage));
    }

    /**
     * 修改项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('system:stage:edit')")
    @Log(title = "项目阶段管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SProjectStage sProjectStage)
    {
        return toAjax(sProjectStageService.updateSProjectStage(sProjectStage));
    }

    /**
     * 删除项目阶段管理
     */
    @PreAuthorize("@ss.hasPermi('system:stage:remove')")
    @Log(title = "项目阶段管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{stageIds}")
    public AjaxResult remove(@PathVariable String[] stageIds)
    {
        return toAjax(sProjectStageService.deleteSProjectStageByStageIds(stageIds));
    }
}
