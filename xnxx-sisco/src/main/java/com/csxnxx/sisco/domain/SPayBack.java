package com.csxnxx.sisco.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 s_pay_back
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SPayBack extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String id;

    /** 项目id */
    @Excel(name = "项目id")
    private String projectId;

    /** 款项名称(存数据字典的code) */
    @Excel(name = "款项名称(存数据字典的code)")
    private String backCode;

    /** 发票金额 */
    @Excel(name = "发票金额")
    private Long invoiceNum;

    /** 发票时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发票时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date invoiceTime;

    /** 回款金额 */
    @Excel(name = "回款金额")
    private Long backNum;

    /** 回款类型 */
    @Excel(name = "回款类型")
    private String backType;

    /** 回款日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "回款日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date backTime;

    /** 归属 */
    @Excel(name = "归属")
    private String attribution;

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
    public void setBackCode(String backCode)
    {
        this.backCode = backCode;
    }

    public String getBackCode()
    {
        return backCode;
    }
    public void setInvoiceNum(Long invoiceNum)
    {
        this.invoiceNum = invoiceNum;
    }

    public Long getInvoiceNum()
    {
        return invoiceNum;
    }
    public void setInvoiceTime(Date invoiceTime)
    {
        this.invoiceTime = invoiceTime;
    }

    public Date getInvoiceTime()
    {
        return invoiceTime;
    }
    public void setBackNum(Long backNum)
    {
        this.backNum = backNum;
    }

    public Long getBackNum()
    {
        return backNum;
    }
    public void setBackType(String backType)
    {
        this.backType = backType;
    }

    public String getBackType()
    {
        return backType;
    }
    public void setBackTime(Date backTime)
    {
        this.backTime = backTime;
    }

    public Date getBackTime()
    {
        return backTime;
    }
    public void setAttribution(String attribution)
    {
        this.attribution = attribution;
    }

    public String getAttribution()
    {
        return attribution;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("projectId", getProjectId())
            .append("backCode", getBackCode())
            .append("invoiceNum", getInvoiceNum())
            .append("invoiceTime", getInvoiceTime())
            .append("backNum", getBackNum())
            .append("backType", getBackType())
            .append("backTime", getBackTime())
            .append("attribution", getAttribution())
            .append("remark", getRemark())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .toString();
    }
}
