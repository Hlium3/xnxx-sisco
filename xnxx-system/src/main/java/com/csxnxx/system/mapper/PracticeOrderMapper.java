package com.csxnxx.system.mapper;

import java.util.List;
import com.csxnxx.system.domain.PracticeOrder;

/**
 * 订单数据练习Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
public interface PracticeOrderMapper 
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
     * 删除订单数据练习
     * 
     * @param orderId 订单数据练习主键
     * @return 结果
     */
    public int deletePracticeOrderByOrderId(Long orderId);

    /**
     * 批量删除订单数据练习
     * 
     * @param orderIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePracticeOrderByOrderIds(Long[] orderIds);
}
