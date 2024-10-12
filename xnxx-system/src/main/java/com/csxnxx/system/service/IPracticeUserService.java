package com.csxnxx.system.service;

import java.util.List;
import com.csxnxx.system.domain.PracticeUser;

/**
 * 客户数据练习Service接口
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
public interface IPracticeUserService 
{
    /**
     * 查询客户数据练习
     * 
     * @param userId 客户数据练习主键
     * @return 客户数据练习
     */
    public PracticeUser selectPracticeUserByUserId(Long userId);

    /**
     * 查询客户数据练习列表
     * 
     * @param practiceUser 客户数据练习
     * @return 客户数据练习集合
     */
    public List<PracticeUser> selectPracticeUserList(PracticeUser practiceUser);

    /**
     * 新增客户数据练习
     * 
     * @param practiceUser 客户数据练习
     * @return 结果
     */
    public int insertPracticeUser(PracticeUser practiceUser);

    /**
     * 修改客户数据练习
     * 
     * @param practiceUser 客户数据练习
     * @return 结果
     */
    public int updatePracticeUser(PracticeUser practiceUser);

    /**
     * 批量删除客户数据练习
     * 
     * @param userIds 需要删除的客户数据练习主键集合
     * @return 结果
     */
    public int deletePracticeUserByUserIds(Long[] userIds);

    /**
     * 删除客户数据练习信息
     * 
     * @param userId 客户数据练习主键
     * @return 结果
     */
    public int deletePracticeUserByUserId(Long userId);
}
