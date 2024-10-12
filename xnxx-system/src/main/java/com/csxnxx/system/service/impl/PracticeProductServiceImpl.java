package com.csxnxx.system.service.impl;

import java.util.List;
import com.csxnxx.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.system.mapper.PracticeProductMapper;
import com.csxnxx.system.domain.PracticeProduct;
import com.csxnxx.system.service.IPracticeProductService;

/**
 * 产品数据练习Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-09-24
 */
@Service
public class PracticeProductServiceImpl implements IPracticeProductService 
{
    @Autowired
    private PracticeProductMapper practiceProductMapper;

    /**
     * 查询产品数据练习
     * 
     * @param productId 产品数据练习主键
     * @return 产品数据练习
     */
    @Override
    public PracticeProduct selectPracticeProductByProductId(Long productId)
    {
        return practiceProductMapper.selectPracticeProductByProductId(productId);
    }

    /**
     * 查询产品数据练习列表
     * 
     * @param practiceProduct 产品数据练习
     * @return 产品数据练习
     */
    @Override
    public List<PracticeProduct> selectPracticeProductList(PracticeProduct practiceProduct)
    {
        return practiceProductMapper.selectPracticeProductList(practiceProduct);
    }

    /**
     * 新增产品数据练习
     * 
     * @param practiceProduct 产品数据练习
     * @return 结果
     */
    @Override
    public int insertPracticeProduct(PracticeProduct practiceProduct)
    {
        practiceProduct.setCreateTime(DateUtils.getNowDate());
        return practiceProductMapper.insertPracticeProduct(practiceProduct);
    }

    /**
     * 修改产品数据练习
     * 
     * @param practiceProduct 产品数据练习
     * @return 结果
     */
    @Override
    public int updatePracticeProduct(PracticeProduct practiceProduct)
    {
        practiceProduct.setUpdateTime(DateUtils.getNowDate());
        return practiceProductMapper.updatePracticeProduct(practiceProduct);
    }

    /**
     * 批量删除产品数据练习
     * 
     * @param productIds 需要删除的产品数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeProductByProductIds(Long[] productIds)
    {
        return practiceProductMapper.deletePracticeProductByProductIds(productIds);
    }

    /**
     * 删除产品数据练习信息
     * 
     * @param productId 产品数据练习主键
     * @return 结果
     */
    @Override
    public int deletePracticeProductByProductId(Long productId)
    {
        return practiceProductMapper.deletePracticeProductByProductId(productId);
    }
}
