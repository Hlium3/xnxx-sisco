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
import com.csxnxx.sisco.domain.SManday;
import com.csxnxx.sisco.service.ISMandayService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 月标准工时Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/sisco/manday")
public class SMandayController extends BaseController
{
    @Autowired
    private ISMandayService sMandayService;

    /**
     * 查询月标准工时列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:list')")
    @GetMapping("/list")
    public TableDataInfo list(SManday sManday)
    {
        startPage();
        List<SManday> list = sMandayService.selectSMandayList(sManday);
        return getDataTable(list);
    }

    /**
     * 导出月标准工时列表
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:export')")
    @Log(title = "月标准工时", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SManday sManday)
    {
        List<SManday> list = sMandayService.selectSMandayList(sManday);
        ExcelUtil<SManday> util = new ExcelUtil<SManday>(SManday.class);
        util.exportExcel(response, list, "月标准工时数据");
    }

    /**
     * 获取月标准工时详细信息
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:query')")
    @GetMapping(value = "/{mandayId}")
    public AjaxResult getInfo(@PathVariable("mandayId") String mandayId)
    {
        return success(sMandayService.selectSMandayByMandayId(mandayId));
    }

    /**
     * 新增月标准工时
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:add')")
    @Log(title = "月标准工时", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SManday sManday)
    {
        return toAjax(sMandayService.insertSManday(sManday));
    }

    /**
     * 修改月标准工时
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:edit')")
    @Log(title = "月标准工时", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SManday sManday)
    {
        return toAjax(sMandayService.updateSManday(sManday));
    }

    /**
     * 删除月标准工时
     */
    @PreAuthorize("@ss.hasPermi('sisco:manday:remove')")
    @Log(title = "月标准工时", businessType = BusinessType.DELETE)
	@DeleteMapping("/{mandayIds}")
    public AjaxResult remove(@PathVariable String[] mandayIds)
    {
        return toAjax(sMandayService.deleteSMandayByMandayIds(mandayIds));
    }
}
