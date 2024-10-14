package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectFinanceMapper;
import com.csxnxx.sisco.domain.SProjectFinance;
import com.csxnxx.sisco.service.ISProjectFinanceService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectFinanceServiceImpl implements ISProjectFinanceService
{
    @Autowired
    private SProjectFinanceMapper sProjectFinanceMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SProjectFinance selectSProjectFinanceById(String id)
    {
        return sProjectFinanceMapper.selectSProjectFinanceById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SProjectFinance> selectSProjectFinanceList(SProjectFinance sProjectFinance)
    {
        return sProjectFinanceMapper.selectSProjectFinanceList(sProjectFinance);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSProjectFinance(SProjectFinance sProjectFinance)
    {
        return sProjectFinanceMapper.insertSProjectFinance(sProjectFinance);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSProjectFinance(SProjectFinance sProjectFinance)
    {
        return sProjectFinanceMapper.updateSProjectFinance(sProjectFinance);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSProjectFinanceByIds(String[] ids)
    {
        return sProjectFinanceMapper.deleteSProjectFinanceByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSProjectFinanceById(String id)
    {
        return sProjectFinanceMapper.deleteSProjectFinanceById(id);
    }
}
