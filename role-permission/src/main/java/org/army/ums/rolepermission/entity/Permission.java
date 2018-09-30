package org.army.ums.rolepermission.entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Permission {

    @Id
    private String permissionCode;

    private String description;

    @ManyToOne
    private ModulePermission modulePermission;

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModulePermission getModulePermission() {
        return modulePermission;
    }

    public void setModulePermission(ModulePermission modulePermission) {
        this.modulePermission = modulePermission;
    }
}
