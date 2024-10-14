package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SClientMapper;
import com.csxnxx.sisco.domain.SClient;
import com.csxnxx.sisco.service.ISClientService;

/**
 * 客户管理Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SClientServiceImpl implements ISClientService
{
    @Autowired
    private SClientMapper sClientMapper;

    /**
     * 查询客户管理
     *
     * @param clientId 客户管理主键
     * @return 客户管理
     */
    @Override
    public SClient selectSClientByClientId(String clientId)
    {
        return sClientMapper.selectSClientByClientId(clientId);
    }

    /**
     * 查询客户管理列表
     *
     * @param sClient 客户管理
     * @return 客户管理
     */
    @Override
    public List<SClient> selectSClientList(SClient sClient)
    {
        return sClientMapper.selectSClientList(sClient);
    }

    /**
     * 新增客户管理
     *
     * @param sClient 客户管理
     * @return 结果
     */
    @Override
    public int insertSClient(SClient sClient)
    {
        return sClientMapper.insertSClient(sClient);
    }

    /**
     * 修改客户管理
     *
     * @param sClient 客户管理
     * @return 结果
     */
    @Override
    public int updateSClient(SClient sClient)
    {
        return sClientMapper.updateSClient(sClient);
    }

    /**
     * 批量删除客户管理
     *
     * @param clientIds 需要删除的客户管理主键
     * @return 结果
     */
    @Override
    public int deleteSClientByClientIds(String[] clientIds)
    {
        return sClientMapper.deleteSClientByClientIds(clientIds);
    }

    /**
     * 删除客户管理信息
     *
     * @param clientId 客户管理主键
     * @return 结果
     */
    @Override
    public int deleteSClientByClientId(String clientId)
    {
        return sClientMapper.deleteSClientByClientId(clientId);
    }
}
