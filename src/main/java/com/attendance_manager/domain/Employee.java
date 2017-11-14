package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */

@Entity
@Table(name = "employee")
public class Employee  extends User implements Serializable {

    private WorkingHours workingHours;
    private List<Attendance> attendances;
    private List<IndividualTimeOff> individualTimeOffs;
    private List<IndividualTimeOff> disposedIndividualTimeOff;

}
