package com.csxnxx.sisco.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 项目管理对象 s_project
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SProject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String projectId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String clientId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long isUse;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date finishTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date startTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectLog;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date acceptance;

    /** 质保期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "质保期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date warrantyPeriod;

    /** 附件 */
    @Excel(name = "附件")
    private String attachmentPath;

    /** 附件名称 */
    @Excel(name = "附件名称")
    private String attachmentName;

    /** 项目状态 */
    @Excel(name = "项目状态")
    private String projectStatus;

    /** 已回款 */
    @Excel(name = "已回款")
    private Long alreadyPayBack;

    /** 未回款 */
    @Excel(name = "未回款")
    private Long notPayBack;

    /** 坏账 */
    @Excel(name = "坏账")
    private Long badDebt;

    /** 评估工期(人日) */
    @Excel(name = "评估工期(人日)")
    private BigDecimal planMandays;

    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectId()
    {
        return projectId;
    }
    public void setClientId(String clientId)
    {
        this.clientId = clientId;
    }

    public String getClientId()
    {
        return clientId;
    }
    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public String getProjectName()
    {
        return projectName;
    }
    public void setIsUse(Long isUse)
    {
        this.isUse = isUse;
    }

    public Long getIsUse()
    {
        return isUse;
    }
    public void setFinishTime(Date finishTime)
    {
        this.finishTime = finishTime;
    }

    public Date getFinishTime()
    {
        return finishTime;
    }
    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public Date getStartTime()
    {
        return startTime;
    }
    public void setProjectLog(String projectLog)
    {
        this.projectLog = projectLog;
    }

    public String getProjectLog()
    {
        return projectLog;
    }
    public void setAcceptance(Date acceptance)
    {
        this.acceptance = acceptance;
    }

    public Date getAcceptance()
    {
        return acceptance;
    }
    public void setWarrantyPeriod(Date warrantyPeriod)
    {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Date getWarrantyPeriod()
    {
        return warrantyPeriod;
    }
    public void setAttachmentPath(String attachmentPath)
    {
        this.attachmentPath = attachmentPath;
    }

    public String getAttachmentPath()
    {
        return attachmentPath;
    }
    public void setAttachmentName(String attachmentName)
    {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentName()
    {
        return attachmentName;
    }
    public void setProjectStatus(String projectStatus)
    {
        this.projectStatus = projectStatus;
    }

    public String getProjectStatus()
    {
        return projectStatus;
    }
    public void setAlreadyPayBack(Long alreadyPayBack)
    {
        this.alreadyPayBack = alreadyPayBack;
    }

    public Long getAlreadyPayBack()
    {
        return alreadyPayBack;
    }
    public void setNotPayBack(Long notPayBack)
    {
        this.notPayBack = notPayBack;
    }

    public Long getNotPayBack()
    {
        return notPayBack;
    }
    public void setBadDebt(Long badDebt)
    {
        this.badDebt = badDebt;
    }

    public Long getBadDebt()
    {
        return badDebt;
    }
    public void setPlanMandays(BigDecimal planMandays)
    {
        this.planMandays = planMandays;
    }

    public BigDecimal getPlanMandays()
    {
        return planMandays;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("projectId", getProjectId())
            .append("clientId", getClientId())
            .append("projectName", getProjectName())
            .append("isUse", getIsUse())
            .append("finishTime", getFinishTime())
            .append("startTime", getStartTime())
            .append("projectLog", getProjectLog())
            .append("acceptance", getAcceptance())
            .append("warrantyPeriod", getWarrantyPeriod())
            .append("attachmentPath", getAttachmentPath())
            .append("attachmentName", getAttachmentName())
            .append("projectStatus", getProjectStatus())
            .append("alreadyPayBack", getAlreadyPayBack())
            .append("notPayBack", getNotPayBack())
            .append("badDebt", getBadDebt())
            .append("planMandays", getPlanMandays())
            .toString();
    }
}
