package com.csxnxx.sisco.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csxnxx.sisco.mapper.SProjectMapper;
import com.csxnxx.sisco.domain.SProject;
import com.csxnxx.sisco.service.ISProjectService;

/**
 * 项目管理Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-12
 */
@Service
public class SProjectServiceImpl implements ISProjectService
{
    @Autowired
    private SProjectMapper sProjectMapper;

    /**
     * 查询项目管理
     *
     * @param projectId 项目管理主键
     * @return 项目管理
     */
    @Override
    public SProject selectSProjectByProjectId(String projectId)
    {
        return sProjectMapper.selectSProjectByProjectId(projectId);
    }

    /**
     * 查询项目管理列表
     *
     * @param sProject 项目管理
     * @return 项目管理
     */
    @Override
    public List<SProject> selectSProjectList(SProject sProject)
    {
        return sProjectMapper.selectSProjectList(sProject);
    }

    /**
     * 新增项目管理
     *
     * @param sProject 项目管理
     * @return 结果
     */
    @Override
    public int insertSProject(SProject sProject)
    {
        return sProjectMapper.insertSProject(sProject);
    }

    /**
     * 修改项目管理
     *
     * @param sProject 项目管理
     * @return 结果
     */
    @Override
    public int updateSProject(SProject sProject)
    {
        return sProjectMapper.updateSProject(sProject);
    }

    /**
     * 批量删除项目管理
     *
     * @param projectIds 需要删除的项目管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectByProjectIds(String[] projectIds)
    {
        return sProjectMapper.deleteSProjectByProjectIds(projectIds);
    }

    /**
     * 删除项目管理信息
     *
     * @param projectId 项目管理主键
     * @return 结果
     */
    @Override
    public int deleteSProjectByProjectId(String projectId)
    {
        return sProjectMapper.deleteSProjectByProjectId(projectId);
    }
}
