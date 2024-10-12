package com.csxnxx.system.service.impl;

import java.util.List;
import com.csxnxx.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.system.mapper.PracticeOrderMapper;
import com.csxnxx.system.domain.PracticeOrder;
import com.csxnxx.system.service.IPracticeOrderService;

/**
 * 订单数据练习Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
@Service
public class PracticeOrderServiceImpl implements IPracticeOrderService 
{
    @Autowired
    private PracticeOrderMapper practiceOrderMapper;

    /**
     * 查询订单数据练习
     * 
     * @param orderId 订单数据练习主键
     * @return 订单数据练习
     */
    @Override
    public PracticeOrder selectPracticeOrderByOrderId(Long orderId)
    {
        return practiceOrderMapper.selectPracticeOrderByOrderId(orderId);
    }

    /**
     * 查询订单数据练习列表
     * 
     * @param practiceOrder 订单数据练习
     * @return 订单数据练习
     */
    @Override
    public List<PracticeOrder> selectPracticeOrderList(PracticeOrder practiceOrder)
    {
        return practiceOrderMapper.selectPracticeOrderList(practiceOrder);
    }

    /**
     * 新增订单数据练习
     * 
     * @param practiceOrder 订单数据练习
     * @return 结果
     */
    @Override
    public int insertPracticeOrder(PracticeOrder practiceOrder)
    {
        practiceOrder.setCreateTime(DateUtils.getNowDate());
        return practiceOrderMapper.insertPracticeOrder(practiceOrder);
    }

    /**
     * 修改订单数据练习
     * 
     * @param practiceOrder 订单数据练习
     * @return 结果
     */
    @Override
    public int updatePracticeOrder(PracticeOrder practiceOrder)
    {
        practiceOrder.setUpdateTime(DateUtils.getNowDate());
        return practiceOrderMapper.updatePracticeOrder(practiceOrder);
    }

    /**
     * 批量删除订单数据练习
     * 
     * @param orderIds 需要删除的订单数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeOrderByOrderIds(Long[] orderIds)
    {
        return practiceOrderMapper.deletePracticeOrderByOrderIds(orderIds);
    }

    /**
     * 删除订单数据练习信息
     * 
     * @param orderId 订单数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeOrderByOrderId(Long orderId)
    {
        return practiceOrderMapper.deletePracticeOrderByOrderId(orderId);
    }
}
