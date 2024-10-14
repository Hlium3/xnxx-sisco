package com.csxnxx.sisco.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 月标准工时对象 s_manday
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SManday extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private String mandayId;

    /** 年份 */
    @Excel(name = "年份")
    private Long year;

    /** 月份 */
    @Excel(name = "月份")
    private Long month;

    /** 月标准工时（天） */
    @Excel(name = "月标准工时", readConverterExp = "天=")
    private BigDecimal manday;

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

    /** 中级的工资标准 */
    @Excel(name = "中级的工资标准")
    private BigDecimal midWage;

    /** 管理系数 */
    @Excel(name = "管理系数")
    private BigDecimal manageRatio;

    public void setMandayId(String mandayId)
    {
        this.mandayId = mandayId;
    }

    public String getMandayId()
    {
        return mandayId;
    }
    public void setYear(Long year)
    {
        this.year = year;
    }

    public Long getYear()
    {
        return year;
    }
    public void setMonth(Long month)
    {
        this.month = month;
    }

    public Long getMonth()
    {
        return month;
    }
    public void setManday(BigDecimal manday)
    {
        this.manday = manday;
    }

    public BigDecimal getManday()
    {
        return manday;
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
    public void setMidWage(BigDecimal midWage)
    {
        this.midWage = midWage;
    }

    public BigDecimal getMidWage()
    {
        return midWage;
    }
    public void setManageRatio(BigDecimal manageRatio)
    {
        this.manageRatio = manageRatio;
    }

    public BigDecimal getManageRatio()
    {
        return manageRatio;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("mandayId", getMandayId())
            .append("year", getYear())
            .append("month", getMonth())
            .append("manday", getManday())
            .append("remark", getRemark())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .append("midWage", getMidWage())
            .append("manageRatio", getManageRatio())
            .toString();
    }
}
