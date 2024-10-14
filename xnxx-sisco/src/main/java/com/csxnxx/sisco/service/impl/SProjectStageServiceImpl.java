package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectStageMapper;
import com.csxnxx.sisco.domain.SProjectStage;
import com.csxnxx.sisco.service.ISProjectStageService;

/**
 * 项目阶段管理Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectStageServiceImpl implements ISProjectStageService
{
    @Autowired
    private SProjectStageMapper sProjectStageMapper;

    /**
     * 查询项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 项目阶段管理
     */
    @Override
    public SProjectStage selectSProjectStageByStageId(String stageId)
    {
        return sProjectStageMapper.selectSProjectStageByStageId(stageId);
    }

    /**
     * 查询项目阶段管理列表
     *
     * @param sProjectStage 项目阶段管理
     * @return 项目阶段管理
     */
    @Override
    public List<SProjectStage> selectSProjectStageList(SProjectStage sProjectStage)
    {
        return sProjectStageMapper.selectSProjectStageList(sProjectStage);
    }

    /**
     * 新增项目阶段管理
     *
     * @param sProjectStage 项目阶段管理
     * @return 结果
     */
    @Override
    public int insertSProjectStage(SProjectStage sProjectStage)
    {
        return sProjectStageMapper.insertSProjectStage(sProjectStage);
    }

    /**
     * 修改项目阶段管理
     *
     * @param sProjectStage 项目阶段管理
     * @return 结果
     */
    @Override
    public int updateSProjectStage(SProjectStage sProjectStage)
    {
        return sProjectStageMapper.updateSProjectStage(sProjectStage);
    }

    /**
     * 批量删除项目阶段管理
     *
     * @param stageIds 需要删除的项目阶段管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageByStageIds(String[] stageIds)
    {
        return sProjectStageMapper.deleteSProjectStageByStageIds(stageIds);
    }

    /**
     * 删除项目阶段管理信息
     *
     * @param stageId 项目阶段管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageByStageId(String stageId)
    {
        return sProjectStageMapper.deleteSProjectStageByStageId(stageId);
    }
}
