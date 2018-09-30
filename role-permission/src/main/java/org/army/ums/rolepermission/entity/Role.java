package org.army.ums.rolepermission.entity;

import org.army.base.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Role extends BaseEntity {

    @Id
    private String roleCode;

    private List<Permission> permissions;

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
