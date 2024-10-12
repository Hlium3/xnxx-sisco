package com.csxnxx.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.csxnxx.common.annotation.Excel;
import com.csxnxx.common.core.domain.BaseEntity;

/**
 * 客户数据练习对象 practice_user
 *
 * @author ruoyi
 * @date 2024-09-24
 */
public class PracticeUser extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 客户ID
     */
    private Long userId;

    /**
     * 客户名称
     */
    @Excel(name = "客户名称")
    private String name;

    /**
     * 性别
     */
    @Excel(name = "性别")
    private String gender;

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("userId", getUserId())
                .append("name", getName())
                .append("gender", getGender())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
