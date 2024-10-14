package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectStageCopyMapper;
import com.csxnxx.sisco.domain.SProjectStageCopy;
import com.csxnxx.sisco.service.ISProjectStageCopyService;

/**
 * 项目阶段管理Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectStageCopyServiceImpl implements ISProjectStageCopyService
{
    @Autowired
    private SProjectStageCopyMapper sProjectStageCopyMapper;

    /**
     * 查询项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 项目阶段管理
     */
    @Override
    public SProjectStageCopy selectSProjectStageCopyByStageId(String stageId)
    {
        return sProjectStageCopyMapper.selectSProjectStageCopyByStageId(stageId);
    }

    /**
     * 查询项目阶段管理列表
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 项目阶段管理
     */
    @Override
    public List<SProjectStageCopy> selectSProjectStageCopyList(SProjectStageCopy sProjectStageCopy)
    {
        return sProjectStageCopyMapper.selectSProjectStageCopyList(sProjectStageCopy);
    }

    /**
     * 新增项目阶段管理
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 结果
     */
    @Override
    public int insertSProjectStageCopy(SProjectStageCopy sProjectStageCopy)
    {
        return sProjectStageCopyMapper.insertSProjectStageCopy(sProjectStageCopy);
    }

    /**
     * 修改项目阶段管理
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 结果
     */
    @Override
    public int updateSProjectStageCopy(SProjectStageCopy sProjectStageCopy)
    {
        return sProjectStageCopyMapper.updateSProjectStageCopy(sProjectStageCopy);
    }

    /**
     * 批量删除项目阶段管理
     *
     * @param stageIds 需要删除的项目阶段管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageCopyByStageIds(String[] stageIds)
    {
        return sProjectStageCopyMapper.deleteSProjectStageCopyByStageIds(stageIds);
    }

    /**
     * 删除项目阶段管理信息
     *
     * @param stageId 项目阶段管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectStageCopyByStageId(String stageId)
    {
        return sProjectStageCopyMapper.deleteSProjectStageCopyByStageId(stageId);
    }
}
