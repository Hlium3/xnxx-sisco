package com.csxnxx.sisco.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 项目阶段管理对象 s_project_stage
 *
 * @author ruoyi
 * @date 2024-10-12
 */
public class SProjectStage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private String stageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String projectId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String parentTypeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String typeId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal planTaskTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal actualTaskTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal usedTaskTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal schedule;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private BigDecimal delay;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long state;

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

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String executionContext;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String stageName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date beginDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date endDate;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String isSort;

    public void setStageId(String stageId)
    {
        this.stageId = stageId;
    }

    public String getStageId()
    {
        return stageId;
    }
    public void setProjectId(String projectId)
    {
        this.projectId = projectId;
    }

    public String getProjectId()
    {
        return projectId;
    }
    public void setParentTypeId(String parentTypeId)
    {
        this.parentTypeId = parentTypeId;
    }

    public String getParentTypeId()
    {
        return parentTypeId;
    }
    public void setTypeId(String typeId)
    {
        this.typeId = typeId;
    }

    public String getTypeId()
    {
        return typeId;
    }
    public void setPlanTaskTime(BigDecimal planTaskTime)
    {
        this.planTaskTime = planTaskTime;
    }

    public BigDecimal getPlanTaskTime()
    {
        return planTaskTime;
    }
    public void setActualTaskTime(BigDecimal actualTaskTime)
    {
        this.actualTaskTime = actualTaskTime;
    }

    public BigDecimal getActualTaskTime()
    {
        return actualTaskTime;
    }
    public void setUsedTaskTime(BigDecimal usedTaskTime)
    {
        this.usedTaskTime = usedTaskTime;
    }

    public BigDecimal getUsedTaskTime()
    {
        return usedTaskTime;
    }
    public void setSchedule(BigDecimal schedule)
    {
        this.schedule = schedule;
    }

    public BigDecimal getSchedule()
    {
        return schedule;
    }
    public void setDelay(BigDecimal delay)
    {
        this.delay = delay;
    }

    public BigDecimal getDelay()
    {
        return delay;
    }
    public void setState(Long state)
    {
        this.state = state;
    }

    public Long getState()
    {
        return state;
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
    public void setExecutionContext(String executionContext)
    {
        this.executionContext = executionContext;
    }

    public String getExecutionContext()
    {
        return executionContext;
    }
    public void setStageName(String stageName)
    {
        this.stageName = stageName;
    }

    public String getStageName()
    {
        return stageName;
    }
    public void setBeginDate(Date beginDate)
    {
        this.beginDate = beginDate;
    }

    public Date getBeginDate()
    {
        return beginDate;
    }
    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }
    public void setIsSort(String isSort)
    {
        this.isSort = isSort;
    }

    public String getIsSort()
    {
        return isSort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stageId", getStageId())
            .append("projectId", getProjectId())
            .append("parentTypeId", getParentTypeId())
            .append("typeId", getTypeId())
            .append("planTaskTime", getPlanTaskTime())
            .append("actualTaskTime", getActualTaskTime())
            .append("usedTaskTime", getUsedTaskTime())
            .append("schedule", getSchedule())
            .append("delay", getDelay())
            .append("state", getState())
            .append("createDate", getCreateDate())
            .append("createUserCode", getCreateUserCode())
            .append("lastModifyDate", getLastModifyDate())
            .append("lastModifyUserCode", getLastModifyUserCode())
            .append("versionId", getVersionId())
            .append("executionContext", getExecutionContext())
            .append("stageName", getStageName())
            .append("beginDate", getBeginDate())
            .append("endDate", getEndDate())
            .append("isSort", getIsSort())
            .toString();
    }
}
