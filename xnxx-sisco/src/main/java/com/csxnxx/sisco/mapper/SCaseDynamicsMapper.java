package com.csxnxx.sisco.mapper;

import java.util.List;
import com.csxnxx.sisco.domain.SCaseDynamics;

/**
 * 成功案例和资讯动态Mapper接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface SCaseDynamicsMapper
{
    /**
     * 查询成功案例和资讯动态
     *
     * @param cdId 成功案例和资讯动态主键
     * @return 成功案例和资讯动态
     */
    public SCaseDynamics selectSCaseDynamicsByCdId(String cdId);

    /**
     * 查询成功案例和资讯动态列表
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 成功案例和资讯动态集合
     */
    public List<SCaseDynamics> selectSCaseDynamicsList(SCaseDynamics sCaseDynamics);

    /**
     * 新增成功案例和资讯动态
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 结果
     */
    public int insertSCaseDynamics(SCaseDynamics sCaseDynamics);

    /**
     * 修改成功案例和资讯动态
     *
     * @param sCaseDynamics 成功案例和资讯动态
     * @return 结果
     */
    public int updateSCaseDynamics(SCaseDynamics sCaseDynamics);

    /**
     * 删除成功案例和资讯动态
     *
     * @param cdId 成功案例和资讯动态主键
     * @return 结果
     */
    public int deleteSCaseDynamicsByCdId(String cdId);

    /**
     * 批量删除成功案例和资讯动态
     *
     * @param cdIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSCaseDynamicsByCdIds(String[] cdIds);
}
