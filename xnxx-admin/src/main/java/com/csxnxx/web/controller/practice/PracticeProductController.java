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
import com.csxnxx.system.domain.PracticeProduct;
import com.csxnxx.system.service.IPracticeProductService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 产品数据练习Controller
 *
 * @author ruoyi
 * @date 2024-09-24
 */
@RestController
@RequestMapping("/practice/product")
public class PracticeProductController extends BaseController {
    @Autowired
    private IPracticeProductService practiceProductService;

    /**
     * 查询产品数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:product:list')")
    @GetMapping("/list")
    public TableDataInfo list(PracticeProduct practiceProduct) {
        startPage();
        List<PracticeProduct> list = practiceProductService.selectPracticeProductList(practiceProduct);
        return getDataTable(list);
    }

    /**
     * 导出产品数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:product:export')")
    @Log(title = "产品数据练习", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PracticeProduct practiceProduct) {
        List<PracticeProduct> list = practiceProductService.selectPracticeProductList(practiceProduct);
        ExcelUtil<PracticeProduct> util = new ExcelUtil<PracticeProduct>(PracticeProduct.class);
        util.exportExcel(response, list, "产品数据练习数据");
    }

    /**
     * 获取产品数据练习详细信息
     */
    @PreAuthorize("@ss.hasPermi('practice:product:query')")
    @GetMapping(value = "/{productId}")
    public AjaxResult getInfo(@PathVariable("productId") Long productId) {
        return success(practiceProductService.selectPracticeProductByProductId(productId));
    }

    /**
     * 新增产品数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:product:add')")
    @Log(title = "产品数据练习", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PracticeProduct practiceProduct) {
        return toAjax(practiceProductService.insertPracticeProduct(practiceProduct));
    }

    /**
     * 修改产品数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:product:edit')")
    @Log(title = "产品数据练习", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PracticeProduct practiceProduct) {
        return toAjax(practiceProductService.updatePracticeProduct(practiceProduct));
    }

    /**
     * 删除产品数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:product:remove')")
    @Log(title = "产品数据练习", businessType = BusinessType.DELETE)
    @DeleteMapping("/{productIds}")
    public AjaxResult remove(@PathVariable Long[] productIds) {
        return toAjax(practiceProductService.deletePracticeProductByProductIds(productIds));
    }
}
