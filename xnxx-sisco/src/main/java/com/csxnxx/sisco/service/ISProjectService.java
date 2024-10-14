package com.csxnxx.sisco.service;

import java.util.List;
import com.csxnxx.sisco.domain.SProject;

/**
 * 项目管理Service接口
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public interface ISProjectService
{
    /**
     * 查询项目管理
     *
     * @param projectId 项目管理主键
     * @return 项目管理
     */
    public SProject selectSProjectByProjectId(String projectId);

    /**
     * 查询项目管理列表
     *
     * @param sProject 项目管理
     * @return 项目管理集合
     */
    public List<SProject> selectSProjectList(SProject sProject);

    /**
     * 新增项目管理
     *
     * @param sProject 项目管理
     * @return 结果
     */
    public int insertSProject(SProject sProject);

    /**
     * 修改项目管理
     *
     * @param sProject 项目管理
     * @return 结果
     */
    public int updateSProject(SProject sProject);

    /**
     * 批量删除项目管理
     *
     * @param projectIds 需要删除的项目管理主键集合
     * @return 结果
     */
    public int deleteSProjectByProjectIds(String[] projectIds);

    /**
     * 删除项目管理信息
     *
     * @param projectId 项目管理主键
     * @return 结果
     */
    public int deleteSProjectByProjectId(String projectId);
}
