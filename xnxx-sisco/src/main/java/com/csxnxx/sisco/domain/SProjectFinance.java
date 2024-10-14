package com.csxnxx.sisco.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 s_project_finance
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SProjectFinance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键Id */
    private String id;

    /** 项目Id */
    @Excel(name = "项目Id")
    private String projectId;

    /** 报销人 */
    @Excel(name = "报销人")
    private String userName;

    /** 金额 */
    @Excel(name = "金额")
    private Long amount;

    /** 发生时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发生时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date occurTime;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
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

    /** 费用类别 */
    @Excel(name = "费用类别")
    private String costType;

    /** 报销人id */
    @Excel(name = "报销人id")
    private String staffId;

    /** 部门code */
    @Excel(name = "部门code")
    private String orgCode;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectId()
    {
        return projectId;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserName()
    {
        return userName;
    }
    public void setAmount(Long amount)
    {
        this.amount = amount;
    }

    public Long getAmount()
    {
        return amount;
    }
    public void setOccurTime(Date occurTime)
    {
        this.occurTime = occurTime;
    }

    public Date getOccurTime()
    {
        return occurTime;
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
    public void setCostType(String costType)
    {
        this.costType = costType;
    }

    public String getCostType()
    {
        return costType;
    }
    public void setStaffId(String staffId)
    {
        this.staffId = staffId;
    }

    public String getStaffId()
    {
        return staffId;
    }
    public void setOrgCode(String orgCode)
    {
        this.orgCode = orgCode;
    }

    public String getOrgCode()
    {
        return orgCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectId", getProjectId())
            .append("userName", getUserName())
            .append("amount", getAmount())
            .append("occurTime", getOccurTime())
            .append("remark", getRemark())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .append("costType", getCostType())
            .append("staffId", getStaffId())
            .append("orgCode", getOrgCode())
            .toString();
    }
}
