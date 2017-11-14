package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */
@Entity
@Table(name = "time_off_reason")
public class TimeOffReason extends AbstractDomain{

    private String title;
    private Boolean paid;
    private Boolean disposedFromVacation;

}
