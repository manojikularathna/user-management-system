package org.army.ums.masterdata.entity;

import org.army.base.common.entity.BaseEntity;
import org.army.base.common.entity.PrimaryContactInformation;

import javax.persistence.*;

@Entity
public class Branch extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long branchId;

    private String branchCode;

    private String description;

    @Embedded
    private PrimaryContactInformation primaryContactInformation;

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrimaryContactInformation getPrimaryContactInformation() {
        return primaryContactInformation;
    }

    public void setPrimaryContactInformation(PrimaryContactInformation primaryContactInformation) {
        this.primaryContactInformation = primaryContactInformation;
    }
}
