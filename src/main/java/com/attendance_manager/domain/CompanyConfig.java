package com.attendance_manager.domain;

import com.attendance_manager.domain.types.VacationDisposeType;
import com.attendance_manager.domain.types.WorkingHoursScheme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalTime;

/**
 * @author Marta Ginosyan
 * Date: 11/14/17
 */
@Entity
@Table(name = "company_config")
public class CompanyConfig extends AbstractDomain implements Serializable {

    @Column(name = "vacation_dispose_type_for_employee")
    private VacationDisposeType vacationDisposeTypeForEmployee;
    @Column(name = "vacation_dispose_type_for_hr")
    private VacationDisposeType vacationDisposeTypeForHR;
    @Column(name = "working_hours_scheme")
    private WorkingHoursScheme workingHoursScheme;
    @Column(name = "lunch_start_time")
    private LocalTime lunchStartTime;
    @Column(name = "lunch_duration")
    private Short lunchDuration;
    @Column(name = "vacation_in_advance_allowed", columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
    private Boolean vacationInAdvaceAllowed;
    @Column(name = "half_day_time_off_allowed", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
    private Boolean halfDayTimeOffAllowed;

    public CompanyConfig() {
    }

    public CompanyConfig(VacationDisposeType vacationDisposeTypeForEmployee,
            VacationDisposeType vacationDisposeTypeForHR,
            WorkingHoursScheme workingHoursScheme,
            LocalTime lunchStartTime,
            Short lunchDuration,
            Boolean vacationInAdvaceAllowed, Boolean halfDayTimeOffAllowed) {
        this.vacationDisposeTypeForEmployee = vacationDisposeTypeForEmployee;
        this.vacationDisposeTypeForHR = vacationDisposeTypeForHR;
        this.workingHoursScheme = workingHoursScheme;
        this.lunchStartTime = lunchStartTime;
        this.lunchDuration = lunchDuration;
        this.vacationInAdvaceAllowed = vacationInAdvaceAllowed;
        this.halfDayTimeOffAllowed = halfDayTimeOffAllowed;
    }

    public VacationDisposeType getVacationDisposeTypeForEmployee() {
        return vacationDisposeTypeForEmployee;
    }

    public void setVacationDisposeTypeForEmployee(VacationDisposeType vacationDisposeTypeForEmployee) {
        this.vacationDisposeTypeForEmployee = vacationDisposeTypeForEmployee;
    }

    public VacationDisposeType getVacationDisposeTypeForHR() {
        return vacationDisposeTypeForHR;
    }

    public void setVacationDisposeTypeForHR(VacationDisposeType vacationDisposeTypeForHR) {
        this.vacationDisposeTypeForHR = vacationDisposeTypeForHR;
    }

    public WorkingHoursScheme getWorkingHoursScheme() {
        return workingHoursScheme;
    }

    public void setWorkingHoursScheme(WorkingHoursScheme workingHoursScheme) {
        this.workingHoursScheme = workingHoursScheme;
    }

    public LocalTime getLunchStartTime() {
        return lunchStartTime;
    }

    public void setLunchStartTime(LocalTime lunchStartTime) {
        this.lunchStartTime = lunchStartTime;
    }

    public Short getLunchDuration() {
        return lunchDuration;
    }

    public void setLunchDuration(Short lunchDuration) {
        this.lunchDuration = lunchDuration;
    }

    public Boolean getVacationInAdvaceAllowed() {
        return vacationInAdvaceAllowed;
    }

    public void setVacationInAdvaceAllowed(Boolean vacationInAdvaceAllowed) {
        this.vacationInAdvaceAllowed = vacationInAdvaceAllowed;
    }

    public Boolean getHalfDayTimeOffAllowed() {
        return halfDayTimeOffAllowed;
    }

    public void setHalfDayTimeOffAllowed(Boolean halfDayTimeOffAllowed) {
        this.halfDayTimeOffAllowed = halfDayTimeOffAllowed;
    }
}
