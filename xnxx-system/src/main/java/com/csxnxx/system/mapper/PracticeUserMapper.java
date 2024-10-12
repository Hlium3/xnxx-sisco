package com.csxnxx.system.mapper;

import java.util.List;
import com.csxnxx.system.domain.PracticeUser;

/**
 * 客户数据练习Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
public interface PracticeUserMapper 
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
     * 删除客户数据练习
     * 
     * @param userId 客户数据练习主键
     * @return 结果
     */
    public int deletePracticeUserByUserId(Long userId);

    /**
     * 批量删除客户数据练习
     * 
     * @param userIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePracticeUserByUserIds(Long[] userIds);
}
