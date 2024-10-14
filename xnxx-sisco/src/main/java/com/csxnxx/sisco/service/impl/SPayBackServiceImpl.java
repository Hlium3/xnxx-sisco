package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SPayBackMapper;
import com.csxnxx.sisco.domain.SPayBack;
import com.csxnxx.sisco.service.ISPayBackService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SPayBackServiceImpl implements ISPayBackService
{
    @Autowired
    private SPayBackMapper sPayBackMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SPayBack selectSPayBackById(String id)
    {
        return sPayBackMapper.selectSPayBackById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sPayBack 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SPayBack> selectSPayBackList(SPayBack sPayBack)
    {
        return sPayBackMapper.selectSPayBackList(sPayBack);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sPayBack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSPayBack(SPayBack sPayBack)
    {
        return sPayBackMapper.insertSPayBack(sPayBack);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sPayBack 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSPayBack(SPayBack sPayBack)
    {
        return sPayBackMapper.updateSPayBack(sPayBack);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSPayBackByIds(String[] ids)
    {
        return sPayBackMapper.deleteSPayBackByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSPayBackById(String id)
    {
        return sPayBackMapper.deleteSPayBackById(id);
    }
}
