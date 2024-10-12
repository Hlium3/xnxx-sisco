package com.csxnxx.system.service;

import java.util.List;
import com.csxnxx.system.domain.PracticeOrder;

/**
 * 订单数据练习Service接口
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
public interface IPracticeOrderService 
{
    /**
     * 查询订单数据练习
     * 
     * @param orderId 订单数据练习主键
     * @return 订单数据练习
     */
    public PracticeOrder selectPracticeOrderByOrderId(Long orderId);

    /**
     * 查询订单数据练习列表
     * 
     * @param practiceOrder 订单数据练习
     * @return 订单数据练习集合
     */
    public List<PracticeOrder> selectPracticeOrderList(PracticeOrder practiceOrder);

    /**
     * 新增订单数据练习
     * 
     * @param practiceOrder 订单数据练习
     * @return 结果
     */
    public int insertPracticeOrder(PracticeOrder practiceOrder);

    /**
     * 修改订单数据练习
     * 
     * @param practiceOrder 订单数据练习
     * @return 结果
     */
    public int updatePracticeOrder(PracticeOrder practiceOrder);

    /**
     * 批量删除订单数据练习
     * 
     * @param orderIds 需要删除的订单数据练习主键集合
     * @return 结果
     */
    public int deletePracticeOrderByOrderIds(Long[] orderIds);

    /**
     * 删除订单数据练习信息
     * 
     * @param orderId 订单数据练习主键
     * @return 结果
     */
    public int deletePracticeOrderByOrderId(Long orderId);
}
