package com.csxnxx.sisco.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 客户管理对象 s_client
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SClient extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String clientId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String companyName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String companyCode;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String tel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String linkman;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String businessPrincipal;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String technicalPrincipal;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date signingDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isUse;

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

    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getClientId()
    {
        return clientId;
    }
    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getCompanyName()
    {
        return companyName;
    }
    public void setCompanyCode(String companyCode)
    {
        this.companyCode = companyCode;
    }

    public String getCompanyCode()
    {
        return companyCode;
    }
    public void setTel(String tel)
    {
        this.tel = tel;
    }

    public String getTel()
    {
        return tel;
    }
    public void setLinkman(String linkman)
    {
        this.linkman = linkman;
    }

    public String getLinkman()
    {
        return linkman;
    }
    public void setBusinessPrincipal(String businessPrincipal)
    {
        this.businessPrincipal = businessPrincipal;
    }

    public String getBusinessPrincipal()
    {
        return businessPrincipal;
    }
    public void setTechnicalPrincipal(String technicalPrincipal)
    {
        this.technicalPrincipal = technicalPrincipal;
    }

    public String getTechnicalPrincipal()
    {
        return technicalPrincipal;
    }
    public void setSigningDate(Date signingDate)
    {
        this.signingDate = signingDate;
    }

    public Date getSigningDate()
    {
        return signingDate;
    }
    public void setIsUse(Long isUse)
    {
        this.isUse = isUse;
    }

    public Long getIsUse()
    {
        return isUse;
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
            .append("clientId", getClientId())
            .append("companyName", getCompanyName())
            .append("companyCode", getCompanyCode())
            .append("tel", getTel())
            .append("linkman", getLinkman())
            .append("businessPrincipal", getBusinessPrincipal())
            .append("technicalPrincipal", getTechnicalPrincipal())
            .append("signingDate", getSigningDate())
            .append("isUse", getIsUse())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .append("versionId", getVersionId())
            .toString();
    }
}
