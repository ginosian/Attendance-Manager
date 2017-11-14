package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */
@Entity
@Table(name = "time_off_reason")
public class TimeOffType extends AbstractDomain implements Serializable {

    private String title;
    private Boolean paid;
    private Boolean disposableFromVacation;
    private Boolean isActive;

}
