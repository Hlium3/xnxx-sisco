package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectStageCopy;

/**
 * 项目阶段管理Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SProjectStageCopyMapper
{
    /**
     * 查询项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 项目阶段管理
     */
    public SProjectStageCopy selectSProjectStageCopyByStageId(String stageId);

    /**
     * 查询项目阶段管理列表
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 项目阶段管理集合
     */
    public List<SProjectStageCopy> selectSProjectStageCopyList(SProjectStageCopy sProjectStageCopy);

    /**
     * 新增项目阶段管理
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 结果
     */
    public int insertSProjectStageCopy(SProjectStageCopy sProjectStageCopy);

    /**
     * 修改项目阶段管理
     *
     * @param sProjectStageCopy 项目阶段管理
     * @return 结果
     */
    public int updateSProjectStageCopy(SProjectStageCopy sProjectStageCopy);

    /**
     * 删除项目阶段管理
     *
     * @param stageId 项目阶段管理主键
     * @return 结果
     */
    public int deleteSProjectStageCopyByStageId(String stageId);

    /**
     * 批量删除项目阶段管理
     *
     * @param stageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSProjectStageCopyByStageIds(String[] stageIds);
}
