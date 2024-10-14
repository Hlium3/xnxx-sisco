package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectStageTypeMapper;
import com.csxnxx.sisco.domain.SProjectStageType;
import com.csxnxx.sisco.service.ISProjectStageTypeService;

/**
 * 项目阶段类型Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectStageTypeServiceImpl implements ISProjectStageTypeService
{
    @Autowired
    private SProjectStageTypeMapper sProjectStageTypeMapper;

    /**
     * 查询项目阶段类型
     *
     * @param stageTypeId 项目阶段类型主键
     * @return 项目阶段类型
     */
    @Override
    public SProjectStageType selectSProjectStageTypeByStageTypeId(String stageTypeId)
    {
        return sProjectStageTypeMapper.selectSProjectStageTypeByStageTypeId(stageTypeId);
    }

    /**
     * 查询项目阶段类型列表
     *
     * @param sProjectStageType 项目阶段类型
     * @return 项目阶段类型
     */
    @Override
    public List<SProjectStageType> selectSProjectStageTypeList(SProjectStageType sProjectStageType)
    {
        return sProjectStageTypeMapper.selectSProjectStageTypeList(sProjectStageType);
    }

    /**
     * 新增项目阶段类型
     *
     * @param sProjectStageType 项目阶段类型
     * @return 结果
     */
    @Override
    public int insertSProjectStageType(SProjectStageType sProjectStageType)
    {
        return sProjectStageTypeMapper.insertSProjectStageType(sProjectStageType);
    }

    /**
     * 修改项目阶段类型
     *
     * @param sProjectStageType 项目阶段类型
     * @return 结果
     */
    @Override
    public int updateSProjectStageType(SProjectStageType sProjectStageType)
    {
        return sProjectStageTypeMapper.updateSProjectStageType(sProjectStageType);
    }

    /**
     * 批量删除项目阶段类型
     *
     * @param stageTypeIds 需要删除的项目阶段类型主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageTypeByStageTypeIds(String[] stageTypeIds)
    {
        return sProjectStageTypeMapper.deleteSProjectStageTypeByStageTypeIds(stageTypeIds);
    }

    /**
     * 删除项目阶段类型信息
     *
     * @param stageTypeId 项目阶段类型主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageTypeByStageTypeId(String stageTypeId)
    {
        return sProjectStageTypeMapper.deleteSProjectStageTypeByStageTypeId(stageTypeId);
    }
}
