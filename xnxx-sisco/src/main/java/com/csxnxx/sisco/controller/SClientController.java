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
import com.csxnxx.sisco.domain.SClient;
import com.csxnxx.sisco.service.ISClientService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 客户管理Controller
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@RestController
@RequestMapping("/system/client")
public class SClientController extends BaseController
{
    @Autowired
    private ISClientService sClientService;

    /**
     * 查询客户管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:client:list')")
    @GetMapping("/list")
    public TableDataInfo list(SClient sClient)
    {
        startPage();
        List<SClient> list = sClientService.selectSClientList(sClient);
        return getDataTable(list);
    }

    /**
     * 导出客户管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:client:export')")
    @Log(title = "客户管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SClient sClient)
    {
        List<SClient> list = sClientService.selectSClientList(sClient);
        ExcelUtil<SClient> util = new ExcelUtil<SClient>(SClient.class);
        util.exportExcel(response, list, "客户管理数据");
    }

    /**
     * 获取客户管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:client:query')")
    @GetMapping(value = "/{clientId}")
    public AjaxResult getInfo(@PathVariable("clientId") String clientId)
    {
        return success(sClientService.selectSClientByClientId(clientId));
    }

    /**
     * 新增客户管理
     */
    @PreAuthorize("@ss.hasPermi('system:client:add')")
    @Log(title = "客户管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SClient sClient)
    {
        return toAjax(sClientService.insertSClient(sClient));
    }

    /**
     * 修改客户管理
     */
    @PreAuthorize("@ss.hasPermi('system:client:edit')")
    @Log(title = "客户管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SClient sClient)
    {
        return toAjax(sClientService.updateSClient(sClient));
    }

    /**
     * 删除客户管理
     */
    @PreAuthorize("@ss.hasPermi('system:client:remove')")
    @Log(title = "客户管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{clientIds}")
    public AjaxResult remove(@PathVariable String[] clientIds)
    {
        return toAjax(sClientService.deleteSClientByClientIds(clientIds));
    }
}
