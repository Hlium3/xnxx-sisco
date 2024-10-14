package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SManday;

/**
 * 月标准工时Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SMandayMapper
{
    /**
     * 查询月标准工时
     *
     * @param mandayId 月标准工时主键
     * @return 月标准工时
     */
    public SManday selectSMandayByMandayId(String mandayId);

    /**
     * 查询月标准工时列表
     *
     * @param sManday 月标准工时
     * @return 月标准工时集合
     */
    public List<SManday> selectSMandayList(SManday sManday);

    /**
     * 新增月标准工时
     *
     * @param sManday 月标准工时
     * @return 结果
     */
    public int insertSManday(SManday sManday);

    /**
     * 修改月标准工时
     *
     * @param sManday 月标准工时
     * @return 结果
     */
    public int updateSManday(SManday sManday);

    /**
     * 删除月标准工时
     *
     * @param mandayId 月标准工时主键
     * @return 结果
     */
    public int deleteSMandayByMandayId(String mandayId);

    /**
     * 批量删除月标准工时
     *
     * @param mandayIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSMandayByMandayIds(String[] mandayIds);
}
