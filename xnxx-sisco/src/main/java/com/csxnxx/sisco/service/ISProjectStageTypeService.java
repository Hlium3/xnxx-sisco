package com.csxnxx.sisco.service;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectStageType;

/**
 * 项目阶段类型Service接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface ISProjectStageTypeService
{
    /**
     * 查询项目阶段类型
     *
     * @param stageTypeId 项目阶段类型主键
     * @return 项目阶段类型
     */
    public SProjectStageType selectSProjectStageTypeByStageTypeId(String stageTypeId);

    /**
     * 查询项目阶段类型列表
     *
     * @param sProjectStageType 项目阶段类型
     * @return 项目阶段类型集合
     */
    public List<SProjectStageType> selectSProjectStageTypeList(SProjectStageType sProjectStageType);

    /**
     * 新增项目阶段类型
     *
     * @param sProjectStageType 项目阶段类型
     * @return 结果
     */
    public int insertSProjectStageType(SProjectStageType sProjectStageType);

    /**
     * 修改项目阶段类型
     *
     * @param sProjectStageType 项目阶段类型
     * @return 结果
     */
    public int updateSProjectStageType(SProjectStageType sProjectStageType);

    /**
     * 批量删除项目阶段类型
     *
     * @param stageTypeIds 需要删除的项目阶段类型主键集合
     * @return 结果
     */
    public int deleteSProjectStageTypeByStageTypeIds(String[] stageTypeIds);

    /**
     * 删除项目阶段类型信息
     *
     * @param stageTypeId 项目阶段类型主键
     * @return 结果
     */
    public int deleteSProjectStageTypeByStageTypeId(String stageTypeId);
}
