package com.attendance_manager.domain;

import java.io.Serializable;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */
public class Employee  extends User implements Serializable {

    private WorkingHoursCalculationType workingHoursCalculationType;
}
