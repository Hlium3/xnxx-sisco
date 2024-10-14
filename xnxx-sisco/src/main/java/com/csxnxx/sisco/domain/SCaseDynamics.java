package com.csxnxx.sisco.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 成功案例和资讯动态对象 s_case_dynamics
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SCaseDynamics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String cdId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date cdTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdContent;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long cdType;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdRemake;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdAttachmentPath;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdAttachmentName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdLabel;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdProjectProfile;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdOfficialWebsite;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String cdVersionInformation;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long cdChanneliType;

    public void setCdId(String cdId)
    {
        this.cdId = cdId;
    }

    public String getCdId()
    {
        return cdId;
    }
    public void setCdName(String cdName)
    {
        this.cdName = cdName;
    }

    public String getCdName()
    {
        return cdName;
    }
    public void setCdTime(Date cdTime)
    {
        this.cdTime = cdTime;
    }

    public Date getCdTime()
    {
        return cdTime;
    }
    public void setCdContent(String cdContent)
    {
        this.cdContent = cdContent;
    }

    public String getCdContent()
    {
        return cdContent;
    }
    public void setCdType(Long cdType)
    {
        this.cdType = cdType;
    }

    public Long getCdType()
    {
        return cdType;
    }
    public void setCdRemake(String cdRemake)
    {
        this.cdRemake = cdRemake;
    }

    public String getCdRemake()
    {
        return cdRemake;
    }
    public void setCdAttachmentPath(String cdAttachmentPath)
    {
        this.cdAttachmentPath = cdAttachmentPath;
    }

    public String getCdAttachmentPath()
    {
        return cdAttachmentPath;
    }
    public void setCdAttachmentName(String cdAttachmentName)
    {
        this.cdAttachmentName = cdAttachmentName;
    }

    public String getCdAttachmentName()
    {
        return cdAttachmentName;
    }
    public void setCdLabel(String cdLabel)
    {
        this.cdLabel = cdLabel;
    }

    public String getCdLabel()
    {
        return cdLabel;
    }
    public void setCdProjectProfile(String cdProjectProfile)
    {
        this.cdProjectProfile = cdProjectProfile;
    }

    public String getCdProjectProfile()
    {
        return cdProjectProfile;
    }
    public void setCdOfficialWebsite(String cdOfficialWebsite)
    {
        this.cdOfficialWebsite = cdOfficialWebsite;
    }

    public String getCdOfficialWebsite()
    {
        return cdOfficialWebsite;
    }
    public void setCdVersionInformation(String cdVersionInformation)
    {
        this.cdVersionInformation = cdVersionInformation;
    }

    public String getCdVersionInformation()
    {
        return cdVersionInformation;
    }
    public void setCdChanneliType(Long cdChanneliType)
    {
        this.cdChanneliType = cdChanneliType;
    }

    public Long getCdChanneliType()
    {
        return cdChanneliType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cdId", getCdId())
            .append("cdName", getCdName())
            .append("cdTime", getCdTime())
            .append("cdContent", getCdContent())
            .append("cdType", getCdType())
            .append("cdRemake", getCdRemake())
            .append("cdAttachmentPath", getCdAttachmentPath())
            .append("cdAttachmentName", getCdAttachmentName())
            .append("cdLabel", getCdLabel())
            .append("cdProjectProfile", getCdProjectProfile())
            .append("cdOfficialWebsite", getCdOfficialWebsite())
            .append("cdVersionInformation", getCdVersionInformation())
            .append("cdChanneliType", getCdChanneliType())
            .toString();
    }
}
