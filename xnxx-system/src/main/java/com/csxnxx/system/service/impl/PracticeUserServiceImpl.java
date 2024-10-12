package com.csxnxx.system.service.impl;

import java.util.List;
import com.csxnxx.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.system.mapper.PracticeUserMapper;
import com.csxnxx.system.domain.PracticeUser;
import com.csxnxx.system.service.IPracticeUserService;

/**
 * 客户数据练习Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
@Service
public class PracticeUserServiceImpl implements IPracticeUserService 
{
    @Autowired
    private PracticeUserMapper practiceUserMapper;

    /**
     * 查询客户数据练习
     * 
     * @param userId 客户数据练习主键
     * @return 客户数据练习
     */
    @Override
    public PracticeUser selectPracticeUserByUserId(Long userId)
    {
        return practiceUserMapper.selectPracticeUserByUserId(userId);
    }

    /**
     * 查询客户数据练习列表
     * 
     * @param practiceUser 客户数据练习
     * @return 客户数据练习
     */
    @Override
    public List<PracticeUser> selectPracticeUserList(PracticeUser practiceUser)
    {
        return practiceUserMapper.selectPracticeUserList(practiceUser);
    }

    /**
     * 新增客户数据练习
     * 
     * @param practiceUser 客户数据练习
     * @return 结果
     */
    @Override
    public int insertPracticeUser(PracticeUser practiceUser)
    {
        practiceUser.setCreateTime(DateUtils.getNowDate());
        return practiceUserMapper.insertPracticeUser(practiceUser);
    }

    /**
     * 修改客户数据练习
     * 
     * @param practiceUser 客户数据练习
     * @return 结果
     */
    @Override
    public int updatePracticeUser(PracticeUser practiceUser)
    {
        practiceUser.setUpdateTime(DateUtils.getNowDate());
        return practiceUserMapper.updatePracticeUser(practiceUser);
    }

    /**
     * 批量删除客户数据练习
     * 
     * @param userIds 需要删除的客户数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeUserByUserIds(Long[] userIds)
    {
        return practiceUserMapper.deletePracticeUserByUserIds(userIds);
    }

    /**
     * 删除客户数据练习信息
     * 
     * @param userId 客户数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeUserByUserId(Long userId)
    {
        return practiceUserMapper.deletePracticeUserByUserId(userId);
    }
}
