package org.army.ums.masterdata.entity;

import org.army.base.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module extends BaseEntity {

    @Id
    private String code;

    private String name;

    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
