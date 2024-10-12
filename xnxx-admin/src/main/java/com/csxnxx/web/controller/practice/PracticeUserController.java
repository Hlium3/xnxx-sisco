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
import com.csxnxx.system.domain.PracticeUser;
import com.csxnxx.system.service.IPracticeUserService;
import com.csxnxx.common.utils.poi.ExcelUtil;
import com.csxnxx.common.core.page.TableDataInfo;

/**
 * 客户数据练习Controller
 *
 * @author ruoyi
 * @date 2024-09-24
 */
@RestController
@RequestMapping("/practice/user")
public class PracticeUserController extends BaseController {
    @Autowired
    private IPracticeUserService practiceUserService;

    /**
     * 查询客户数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(PracticeUser practiceUser) {
        startPage();
        List<PracticeUser> list = practiceUserService.selectPracticeUserList(practiceUser);
        return getDataTable(list);
    }

    /**
     * 导出客户数据练习列表
     */
    @PreAuthorize("@ss.hasPermi('practice:user:export')")
    @Log(title = "客户数据练习", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PracticeUser practiceUser) {
        List<PracticeUser> list = practiceUserService.selectPracticeUserList(practiceUser);
        ExcelUtil<PracticeUser> util = new ExcelUtil<PracticeUser>(PracticeUser.class);
        util.exportExcel(response, list, "客户数据练习数据");
    }

    /**
     * 获取客户数据练习详细信息
     */
    @PreAuthorize("@ss.hasPermi('practice:user:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId) {
        return success(practiceUserService.selectPracticeUserByUserId(userId));
    }

    /**
     * 新增客户数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:user:add')")
    @Log(title = "客户数据练习", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PracticeUser practiceUser) {
        return toAjax(practiceUserService.insertPracticeUser(practiceUser));
    }

    /**
     * 修改客户数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:user:edit')")
    @Log(title = "客户数据练习", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PracticeUser practiceUser) {
        return toAjax(practiceUserService.updatePracticeUser(practiceUser));
    }

    /**
     * 删除客户数据练习
     */
    @PreAuthorize("@ss.hasPermi('practice:user:remove')")
    @Log(title = "客户数据练习", businessType = BusinessType.DELETE)
    @DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds) {
        return toAjax(practiceUserService.deletePracticeUserByUserIds(userIds));
    }
}
