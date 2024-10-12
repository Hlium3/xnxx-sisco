package com.csxnxx.system.service;

import com.csxnxx.system.domain.PracticeUser;

import java.util.List;

public interface PracticeUserService {

    /**
     * 查询客户数据
     *
     * @param user
     * @return
     */
    List<PracticeUser> selectUserList(PracticeUser user);

    /**
     * 查询客户名称是否已存在
     *
     * @param user
     * @return
     */
    boolean checkUserNameUnique(PracticeUser user);

    /**
     * 新增客户
     * @param user
     * @return
     */
    int insertPracticeUser(PracticeUser user);

    /**
     * 批量删除客户
     * @param userIds
     * @return
     */
    int deleteUserByIds(Long[] userIds);

    /**
     * 修改客户信息
     * @param user
     * @return
     */
    int updateUser(PracticeUser user);
}
