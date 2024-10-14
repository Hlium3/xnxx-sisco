package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectStage;

/**
 * 项目阶段管理Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SProjectStageMapper
{
    /**
     * 查询项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 项目阶段管理
     */
    public SProjectStage selectSProjectStageByStageId(String stageId);

    /**
     * 查询项目阶段管理列表
     *
     * @param sProjectStage 项目阶段管理
     * @return 项目阶段管理集合
     */
    public List<SProjectStage> selectSProjectStageList(SProjectStage sProjectStage);

    /**
     * 新增项目阶段管理
     *
     * @param sProjectStage 项目阶段管理
     * @return 结果
     */
    public int insertSProjectStage(SProjectStage sProjectStage);

    /**
     * 修改项目阶段管理
     *
     * @param sProjectStage 项目阶段管理
     * @return 结果
     */
    public int updateSProjectStage(SProjectStage sProjectStage);

    /**
     * 删除项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 结果
     */
    public int deleteSProjectStageByStageId(String stageId);

    /**
     * 批量删除项目阶段管理
     *
     * @param stageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSProjectStageByStageIds(String[] stageIds);
}
