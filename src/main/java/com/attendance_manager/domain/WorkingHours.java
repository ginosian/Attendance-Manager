package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalTime;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */

@Entity
@Table(name = "working_hours")
public class WorkingHours extends AbstractDomain implements Serializable {
    private LocalTime inTime;
    private LocalTime outTime;
}
