package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SCaseDynamicsMapper;
import com.csxnxx.sisco.domain.SCaseDynamics;
import com.csxnxx.sisco.service.ISCaseDynamicsService;

/**
 * 成功案例和资讯动态Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SCaseDynamicsServiceImpl implements ISCaseDynamicsService
{
    @Autowired
    private SCaseDynamicsMapper sCaseDynamicsMapper;

    /**
     * 查询成功案例和资讯动态
     *
     * @param cdId 成功案例和资讯动态主键
     * @return 成功案例和资讯动态
     */
    @Override
    public SCaseDynamics selectSCaseDynamicsByCdId(String cdId)
    {
        return sCaseDynamicsMapper.selectSCaseDynamicsByCdId(cdId);
    }

    /**
     * 查询成功案例和资讯动态列表
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 成功案例和资讯动态
     */
    @Override
    public List<SCaseDynamics> selectSCaseDynamicsList(SCaseDynamics sCaseDynamics)
    {
        return sCaseDynamicsMapper.selectSCaseDynamicsList(sCaseDynamics);
    }

    /**
     * 新增成功案例和资讯动态
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 结果
     */
    @Override
    public int insertSCaseDynamics(SCaseDynamics sCaseDynamics)
    {
        return sCaseDynamicsMapper.insertSCaseDynamics(sCaseDynamics);
    }

    /**
     * 修改成功案例和资讯动态
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 结果
     */
    @Override
    public int updateSCaseDynamics(SCaseDynamics sCaseDynamics)
    {
        return sCaseDynamicsMapper.updateSCaseDynamics(sCaseDynamics);
    }

    /**
     * 批量删除成功案例和资讯动态
     *
     * @param cdIds 需要删除的成功案例和资讯动态主键
     * @return 结果
     */
    @Override
    public int deleteSCaseDynamicsByCdIds(String[] cdIds)
    {
        return sCaseDynamicsMapper.deleteSCaseDynamicsByCdIds(cdIds);
    }

    /**
     * 删除成功案例和资讯动态信息
     *
     * @param cdId 成功案例和资讯动态主键
     * @return 结果
     */
    @Override
    public int deleteSCaseDynamicsByCdId(String cdId)
    {
        return sCaseDynamicsMapper.deleteSCaseDynamicsByCdId(cdId);
    }
}
