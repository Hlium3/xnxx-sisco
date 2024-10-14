package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectMaintenanceMapper;
import com.csxnxx.sisco.domain.SProjectMaintenance;
import com.csxnxx.sisco.service.ISProjectMaintenanceService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectMaintenanceServiceImpl implements ISProjectMaintenanceService
{
    @Autowired
    private SProjectMaintenanceMapper sProjectMaintenanceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SProjectMaintenance selectSProjectMaintenanceById(String id)
    {
        return sProjectMaintenanceMapper.selectSProjectMaintenanceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SProjectMaintenance> selectSProjectMaintenanceList(SProjectMaintenance sProjectMaintenance)
    {
        return sProjectMaintenanceMapper.selectSProjectMaintenanceList(sProjectMaintenance);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSProjectMaintenance(SProjectMaintenance sProjectMaintenance)
    {
        return sProjectMaintenanceMapper.insertSProjectMaintenance(sProjectMaintenance);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSProjectMaintenance(SProjectMaintenance sProjectMaintenance)
    {
        return sProjectMaintenanceMapper.updateSProjectMaintenance(sProjectMaintenance);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSProjectMaintenanceByIds(String[] ids)
    {
        return sProjectMaintenanceMapper.deleteSProjectMaintenanceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSProjectMaintenanceById(String id)
    {
        return sProjectMaintenanceMapper.deleteSProjectMaintenanceById(id);
    }
}
