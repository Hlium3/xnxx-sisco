package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectStageType;

/**
 * 项目阶段类型Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SProjectStageTypeMapper
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
     * 删除项目阶段类型
     *
     * @param stageTypeId 项目阶段类型主键
     * @return 结果
     */
    public int deleteSProjectStageTypeByStageTypeId(String stageTypeId);

    /**
     * 批量删除项目阶段类型
     *
     * @param stageTypeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSProjectStageTypeByStageTypeIds(String[] stageTypeIds);
}
