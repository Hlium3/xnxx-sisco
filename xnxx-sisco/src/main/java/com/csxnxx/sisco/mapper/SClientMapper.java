package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SClient;

/**
 * 客户管理Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SClientMapper
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
     * 删除客户管理
     *
     * @param clientId 客户管理主键
     * @return 结果
     */
    public int deleteSClientByClientId(String clientId);

    /**
     * 批量删除客户管理
     *
     * @param clientIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSClientByClientIds(String[] clientIds);
}
