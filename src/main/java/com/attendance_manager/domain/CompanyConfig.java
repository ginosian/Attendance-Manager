package com.attendance_manager.domain;

import com.attendance_manager.converter.LocalTimeAttributeConverter;
import com.attendance_manager.domain.types.VacationDisposeType;

import javax.persistence.Column;
import javax.persistence.Convert;
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

    @Column(name = "default_working_hours_scheme")
    private WorkingHoursScheme defaultWorkingHoursScheme;

    @Column(name = "vacation_per_month")
    private Double vacationPerMonth;

    @Column(name = "valid_vacation_period")
    private Integer validVacationPeriod;

    @Convert(converter = LocalTimeAttributeConverter.class)
    @Column(name = "lunch_start")
    private LocalTime lunchStartTime;

    @Column(name = "lunch_duration")
    private Short lunchDuration;

    @Column(name = "vacation_in_advance_allowed", columnDefinition = "BOOLEAN DEFAULT TRUE", nullable = false)
    private Boolean vacationInAdvanceAllowed;

    @Column(name = "half_day_time_off_allowed", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
    private Boolean halfDayTimeOffAllowed;

    public CompanyConfig() {
    }

    public CompanyConfig(String ssn,
            VacationDisposeType vacationDisposeTypeForEmployee,
            VacationDisposeType vacationDisposeTypeForHR,
            WorkingHoursScheme defaultWorkingHoursScheme,
            Double vacationPerMonth,
            Integer validVacationPeriod,
            LocalTime lunchStartTime,
            Short lunchDuration,
            Boolean vacationInAdvanceAllowed,
            Boolean halfDayTimeOffAllowed) {
        super(ssn);
        this.vacationDisposeTypeForEmployee = vacationDisposeTypeForEmployee;
        this.vacationDisposeTypeForHR = vacationDisposeTypeForHR;
        this.defaultWorkingHoursScheme = defaultWorkingHoursScheme;
        this.vacationPerMonth = vacationPerMonth;
        this.validVacationPeriod = validVacationPeriod;
        this.lunchStartTime = lunchStartTime;
        this.lunchDuration = lunchDuration;
        this.vacationInAdvanceAllowed = vacationInAdvanceAllowed;
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

    public Double getVacationPerMonth() {
        return vacationPerMonth;
    }

    public void setVacationPerMonth(Double vacationPerMonth) {
        this.vacationPerMonth = vacationPerMonth;
    }

    public Integer getValidVacationPeriod() {
        return validVacationPeriod;
    }

    public void setValidVacationPeriod(Integer validVacationPeriod) {
        this.validVacationPeriod = validVacationPeriod;
    }
}
