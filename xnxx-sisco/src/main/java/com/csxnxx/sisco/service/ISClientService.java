package com.csxnxx.sisco.service;

import java.util.List;
import com.csxnxx.sisco.domain.SClient;

/**
 * 客户管理Service接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface ISClientService
{
    /**
     * 查询客户管理
     *
     * @param clientId 客户管理主键
     * @return 客户管理
     */
    public SClient selectSClientByClientId(String clientId);

    /**
     * 查询客户管理列表
     *
     * @param sClient 客户管理
     * @return 客户管理集合
     */
    public List<SClient> selectSClientList(SClient sClient);

    /**
     * 新增客户管理
     *
     * @param sClient 客户管理
     * @return 结果
     */
    public int insertSClient(SClient sClient);

    /**
     * 修改客户管理
     *
     * @param sClient 客户管理
     * @return 结果
     */
    public int updateSClient(SClient sClient);

    /**
     * 批量删除客户管理
     *
     * @param clientIds 需要删除的客户管理主键集合
     * @return 结果
     */
    public int deleteSClientByClientIds(String[] clientIds);

    /**
     * 删除客户管理信息
     *
     * @param clientId 客户管理主键
     * @return 结果
     */
    public int deleteSClientByClientId(String clientId);
}
