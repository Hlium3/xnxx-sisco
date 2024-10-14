package com.csxnxx.sisco.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 项目阶段类型对象 s_project_stage_type
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SProjectStageType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String stageTypeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String parentId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stageName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isUse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String user;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String role;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long orderBy;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createUserCode;

    /** 最后修改时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastModifyDate;

    /** 最后修改人 */
    @Excel(name = "最后修改人")
    private String lastModifyUserCode;

    /** 版本 */
    @Excel(name = "版本")
    private Long versionId;

    public void setStageTypeId(String stageTypeId)
    {
        this.stageTypeId = stageTypeId;
    }

    public String getStageTypeId()
    {
        return stageTypeId;
    }
    public void setParentId(String parentId)
    {
        this.parentId = parentId;
    }

    public String getParentId()
    {
        return parentId;
    }
    public void setStageName(String stageName)
    {
        this.stageName = stageName;
    }

    public String getStageName()
    {
        return stageName;
    }
    public void setIsUse(Long isUse)
    {
        this.isUse = isUse;
    }

    public Long getIsUse()
    {
        return isUse;
    }
    public void setUser(String user)
    {
        this.user = user;
    }

    public String getUser()
    {
        return user;
    }
    public void setRole(String role)
    {
        this.role = role;
    }

    public String getRole()
    {
        return role;
    }
    public void setOrderBy(Long orderBy)
    {
        this.orderBy = orderBy;
    }

    public Long getOrderBy()
    {
        return orderBy;
    }
    public void setCreateDate(Date createDate)
    {
        this.createDate = createDate;
    }

    public Date getCreateDate()
    {
        return createDate;
    }
    public void setCreateUserCode(String createUserCode)
    {
        this.createUserCode = createUserCode;
    }

    public String getCreateUserCode()
    {
        return createUserCode;
    }
    public void setLastModifyDate(Date lastModifyDate)
    {
        this.lastModifyDate = lastModifyDate;
    }

    public Date getLastModifyDate()
    {
        return lastModifyDate;
    }
    public void setLastModifyUserCode(String lastModifyUserCode)
    {
        this.lastModifyUserCode = lastModifyUserCode;
    }

    public String getLastModifyUserCode()
    {
        return lastModifyUserCode;
    }
    public void setVersionId(Long versionId)
    {
        this.versionId = versionId;
    }

    public Long getVersionId()
    {
        return versionId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stageTypeId", getStageTypeId())
            .append("parentId", getParentId())
            .append("stageName", getStageName())
            .append("isUse", getIsUse())
            .append("user", getUser())
            .append("role", getRole())
            .append("orderBy", getOrderBy())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .append("versionId", getVersionId())
            .toString();
    }
}
