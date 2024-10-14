package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectMaintenance;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SProjectMaintenanceMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SProjectMaintenance selectSProjectMaintenanceById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SProjectMaintenance> selectSProjectMaintenanceList(SProjectMaintenance sProjectMaintenance);

    /**
     * 新增【请填写功能名称】
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 结果
     */
    public int insertSProjectMaintenance(SProjectMaintenance sProjectMaintenance);

    /**
     * 修改【请填写功能名称】
     *
     * @param sProjectMaintenance 【请填写功能名称】
     * @return 结果
     */
    public int updateSProjectMaintenance(SProjectMaintenance sProjectMaintenance);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSProjectMaintenanceById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSProjectMaintenanceByIds(String[] ids);
}
