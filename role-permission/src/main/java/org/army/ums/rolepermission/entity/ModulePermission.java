package org.army.ums.rolepermission.entity;

import org.army.base.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class ModulePermission extends BaseEntity {

    @Id
    private String moduleCode;

    @OneToMany
    private List<Permission> permissions;

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
