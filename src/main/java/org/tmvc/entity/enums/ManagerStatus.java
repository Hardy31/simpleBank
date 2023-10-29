package org.tmvc.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;



public enum ManagerStatus {
    ACTIVE,
    NOT_ACTIVE,
    ON_VACATION,
    SICK_LEAVE,
    BUSINESS_TRIP,
    PENSION,
    DISMISSED,

}
