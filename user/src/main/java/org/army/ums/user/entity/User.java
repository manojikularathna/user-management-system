package org.army.ums.user.entity;

import org.army.base.common.entity.PrimaryContactInformation;

import java.util.List;

public class User {

    private Long userId;

    private PrimaryContactInformation primaryContactInformation;

    private List<String> roles;

    private String status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public PrimaryContactInformation getPrimaryContactInformation() {
        return primaryContactInformation;
    }

    public void setPrimaryContactInformation(PrimaryContactInformation primaryContactInformation) {
        this.primaryContactInformation = primaryContactInformation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
