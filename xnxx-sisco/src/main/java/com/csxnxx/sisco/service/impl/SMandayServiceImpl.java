package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SMandayMapper;
import com.csxnxx.sisco.domain.SManday;
import com.csxnxx.sisco.service.ISMandayService;

/**
 * 月标准工时Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SMandayServiceImpl implements ISMandayService
{
    @Autowired
    private SMandayMapper sMandayMapper;

    /**
     * 查询月标准工时
     *
     * @param mandayId 月标准工时主键
     * @return 月标准工时
     */
    @Override
    public SManday selectSMandayByMandayId(String mandayId)
    {
        return sMandayMapper.selectSMandayByMandayId(mandayId);
    }

    /**
     * 查询月标准工时列表
     *
     * @param sManday 月标准工时
     * @return 月标准工时
     */
    @Override
    public List<SManday> selectSMandayList(SManday sManday)
    {
        return sMandayMapper.selectSMandayList(sManday);
    }

    /**
     * 新增月标准工时
     *
     * @param sManday 月标准工时
     * @return 结果
     */
    @Override
    public int insertSManday(SManday sManday)
    {
        return sMandayMapper.insertSManday(sManday);
    }

    /**
     * 修改月标准工时
     *
     * @param sManday 月标准工时
     * @return 结果
     */
    @Override
    public int updateSManday(SManday sManday)
    {
        return sMandayMapper.updateSManday(sManday);
    }

    /**
     * 批量删除月标准工时
     *
     * @param mandayIds 需要删除的月标准工时主键
     * @return 结果
     */
    @Override
    public int deleteSMandayByMandayIds(String[] mandayIds)
    {
        return sMandayMapper.deleteSMandayByMandayIds(mandayIds);
    }

    /**
     * 删除月标准工时信息
     *
     * @param mandayId 月标准工时主键
     * @return 结果
     */
    @Override
    public int deleteSMandayByMandayId(String mandayId)
    {
        return sMandayMapper.deleteSMandayByMandayId(mandayId);
    }
}
