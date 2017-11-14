package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */

@Entity
@Table(name = "individual_time_off")
public class IndividualTimeOff extends AbstractDomain implements Serializable {

    private LocalDateTime start;
    private LocalDateTime end;
    private TimeOffType reason;
    private User user;
    private String comment;

}
