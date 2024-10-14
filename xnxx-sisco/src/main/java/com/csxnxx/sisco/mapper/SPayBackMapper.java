package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SPayBack;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SPayBackMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SPayBack selectSPayBackById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sPayBack 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SPayBack> selectSPayBackList(SPayBack sPayBack);

    /**
     * 新增【请填写功能名称】
     *
     * @param sPayBack 【请填写功能名称】
     * @return 结果
     */
    public int insertSPayBack(SPayBack sPayBack);

    /**
     * 修改【请填写功能名称】
     *
     * @param sPayBack 【请填写功能名称】
     * @return 结果
     */
    public int updateSPayBack(SPayBack sPayBack);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSPayBackById(String id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSPayBackByIds(String[] ids);
}
