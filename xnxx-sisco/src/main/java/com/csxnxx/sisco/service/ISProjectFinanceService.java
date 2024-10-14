package com.csxnxx.sisco.service;

import java.util.List;
import com.csxnxx.sisco.domain.SProjectFinance;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface ISProjectFinanceService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SProjectFinance selectSProjectFinanceById(String id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SProjectFinance> selectSProjectFinanceList(SProjectFinance sProjectFinance);

    /**
     * 新增【请填写功能名称】
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 结果
     */
    public int insertSProjectFinance(SProjectFinance sProjectFinance);

    /**
     * 修改【请填写功能名称】
     *
     * @param sProjectFinance 【请填写功能名称】
     * @return 结果
     */
    public int updateSProjectFinance(SProjectFinance sProjectFinance);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSProjectFinanceByIds(String[] ids);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSProjectFinanceById(String id);
}
