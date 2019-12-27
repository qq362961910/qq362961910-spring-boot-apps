package com.study.security.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    public BaseEntity() {
    }

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
