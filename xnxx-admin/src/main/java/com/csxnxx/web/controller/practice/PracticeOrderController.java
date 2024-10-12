package com.csxnxx.web.controller.practice;

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
import com.csxnxx.system.domain.PracticeOrder;
import com.csxnxx.system.service.IPracticeOrderService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 订单数据练习Controller
 *
 * @author ruoyi
 * @date 2024-09-24
 */
@RestController
@RequestMapping("/practice/order")
public class PracticeOrderController extends BaseController {
    @Autowired
    private IPracticeOrderService practiceOrderService;

    /**
     * 查询订单数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:order:list')")
    @GetMapping("/list")
    public TableDataInfo list(PracticeOrder practiceOrder) {
        startPage();
        List<PracticeOrder> list = practiceOrderService.selectPracticeOrderList(practiceOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:order:export')")
    @Log(title = "订单数据练习", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PracticeOrder practiceOrder) {
        List<PracticeOrder> list = practiceOrderService.selectPracticeOrderList(practiceOrder);
        ExcelUtil<PracticeOrder> util = new ExcelUtil<PracticeOrder>(PracticeOrder.class);
        util.exportExcel(response, list, "订单数据练习数据");
    }

    /**
     * 获取订单数据练习详细信息
     */
    @PreAuthorize("@ss.hasPermi('practice:order:query')")
    @GetMapping(value = "/{orderId}")
    public AjaxResult getInfo(@PathVariable("orderId") Long orderId) {
        return success(practiceOrderService.selectPracticeOrderByOrderId(orderId));
    }

    /**
     * 新增订单数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:order:add')")
    @Log(title = "订单数据练习", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PracticeOrder practiceOrder) {
        return toAjax(practiceOrderService.insertPracticeOrder(practiceOrder));
    }

    /**
     * 修改订单数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:order:edit')")
    @Log(title = "订单数据练习", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PracticeOrder practiceOrder) {
        return toAjax(practiceOrderService.updatePracticeOrder(practiceOrder));
    }

    /**
     * 删除订单数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:order:remove')")
    @Log(title = "订单数据练习", businessType = BusinessType.DELETE)
    @DeleteMapping("/{orderIds}")
    public AjaxResult remove(@PathVariable Long[] orderIds) {
        return toAjax(practiceOrderService.deletePracticeOrderByOrderIds(orderIds));
    }
}
