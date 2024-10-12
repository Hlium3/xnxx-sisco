package com.csxnxx.system.mapper;

import java.util.List;
import com.csxnxx.system.domain.PracticeProduct;

/**
 * 产品数据练习Mapper接口
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
public interface PracticeProductMapper 
{
    /**
     * 查询产品数据练习
     * 
     * @param productId 产品数据练习主键
     * @return 产品数据练习
     */
    public PracticeProduct selectPracticeProductByProductId(Long productId);

    /**
     * 查询产品数据练习列表
     * 
     * @param practiceProduct 产品数据练习
     * @return 产品数据练习集合
     */
    public List<PracticeProduct> selectPracticeProductList(PracticeProduct practiceProduct);

    /**
     * 新增产品数据练习
     * 
     * @param practiceProduct 产品数据练习
     * @return 结果
     */
    public int insertPracticeProduct(PracticeProduct practiceProduct);

    /**
     * 修改产品数据练习
     * 
     * @param practiceProduct 产品数据练习
     * @return 结果
     */
    public int updatePracticeProduct(PracticeProduct practiceProduct);

    /**
     * 删除产品数据练习
     * 
     * @param productId 产品数据练习主键
     * @return 结果
     */
    public int deletePracticeProductByProductId(Long productId);

    /**
     * 批量删除产品数据练习
     * 
     * @param productIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePracticeProductByProductIds(Long[] productIds);
}
