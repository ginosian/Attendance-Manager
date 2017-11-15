package com.attendance_manager.domain;

import com.attendance_manager.converter.LocalTimeAttributeConverter;
import com.attendance_manager.domain.types.VacationDisposeType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

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

    @Column(name = "default_working_hours_scheme")
    private WorkingHoursScheme defaultWorkingHoursScheme;

    @Convert(converter = LocalTimeAttributeConverter.class)
    @Column(name = "lunch_start")
    private LocalTime lunchStartTime;

    @Column(name = "lunch_duration")
    private Short lunchDuration;

    @Column(name = "vacation_in_advance_allowed", columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
    private Boolean vacationInAdvanceAllowed;

    @Column(name = "half_day_time_off_allowed", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
    private Boolean halfDayTimeOffAllowed;

    @OneToMany
    private List<TimeOffType> allowedTimeOffTypes;

    public CompanyConfig() {
    }

    public CompanyConfig(String ssn,
            VacationDisposeType vacationDisposeTypeForEmployee,
            VacationDisposeType vacationDisposeTypeForHR,
            WorkingHoursScheme defaultWorkingHoursScheme,
            LocalTime lunchStartTime,
            Short lunchDuration,
            Boolean vacationInAdvanceAllowed,
            Boolean halfDayTimeOffAllowed,
            List<TimeOffType> allowedTimeOffTypes) {
        super(ssn);
        this.vacationDisposeTypeForEmployee = vacationDisposeTypeForEmployee;
        this.vacationDisposeTypeForHR = vacationDisposeTypeForHR;
        this.defaultWorkingHoursScheme = defaultWorkingHoursScheme;
        this.lunchStartTime = lunchStartTime;
        this.lunchDuration = lunchDuration;
        this.vacationInAdvanceAllowed = vacationInAdvanceAllowed;
        this.halfDayTimeOffAllowed = halfDayTimeOffAllowed;
        this.allowedTimeOffTypes = allowedTimeOffTypes;
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

    public WorkingHoursScheme getDefaultWorkingHoursScheme() {
        return defaultWorkingHoursScheme;
    }

    public void setDefaultWorkingHoursScheme(WorkingHoursScheme defaultWorkingHoursScheme) {
        this.defaultWorkingHoursScheme = defaultWorkingHoursScheme;
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

    public Boolean getVacationInAdvanceAllowed() {
        return vacationInAdvanceAllowed;
    }

    public void setVacationInAdvanceAllowed(Boolean vacationInAdvanceAllowed) {
        this.vacationInAdvanceAllowed = vacationInAdvanceAllowed;
    }

    public Boolean getHalfDayTimeOffAllowed() {
        return halfDayTimeOffAllowed;
    }

    public void setHalfDayTimeOffAllowed(Boolean halfDayTimeOffAllowed) {
        this.halfDayTimeOffAllowed = halfDayTimeOffAllowed;
    }

    public List<TimeOffType> getAllowedTimeOffTypes() {
        return allowedTimeOffTypes;
    }

    public void setAllowedTimeOffTypes(List<TimeOffType> allowedTimeOffTypes) {
        this.allowedTimeOffTypes = allowedTimeOffTypes;
    }
}
