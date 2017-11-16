package com.attendance_manager.model;

import com.attendance_manager.domain.TimeOffType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

public class EmployeeDetails implements Serializable {

    private Long employeeId;
    private String employeeName;
    private LocalDate joinDate;
    private LocalDate leaveDate;
    private Map<TimeOffType, Long> overallTimeOff;
    private Map<TimeOffType, Long> overallDisposedTimeOff;
    private Long vacationLeftFromOutdated;
    private Long vacationLeftFromIndate;
    private Long overallVacationFromOutdated;
    private Long overallVacationFromIndate;
    private Long overallVacationGranted;
    private Long overallDisposableVacationTaken;

    public EmployeeDetails() {
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Map<TimeOffType, Long> getOverallTimeOff() {
        return overallTimeOff;
    }

    public void setOverallTimeOff(Map<TimeOffType, Long> overallTimeOff) {
        this.overallTimeOff = overallTimeOff;
    }

    public Map<TimeOffType, Long> getOverallDisposedTimeOff() {
        return overallDisposedTimeOff;
    }

    public void setOverallDisposedTimeOff(Map<TimeOffType, Long> overallDisposedTimeOff) {
        this.overallDisposedTimeOff = overallDisposedTimeOff;
    }

    public Long getVacationLeftFromOutdated() {
        return vacationLeftFromOutdated;
    }

    public void setVacationLeftFromOutdated(Long vacationLeftFromOutdated) {
        this.vacationLeftFromOutdated = vacationLeftFromOutdated;
    }

    public Long getVacationLeftFromIndate() {
        return vacationLeftFromIndate;
    }

    public void setVacationLeftFromIndate(Long vacationLeftFromIndate) {
        this.vacationLeftFromIndate = vacationLeftFromIndate;
    }

    public Long getOverallVacationFromOutdated() {
        return overallVacationFromOutdated;
    }

    public void setOverallVacationFromOutdated(Long overallVacationFromOutdated) {
        this.overallVacationFromOutdated = overallVacationFromOutdated;
    }

    public Long getOverallVacationFromIndate() {
        return overallVacationFromIndate;
    }

    public void setOverallVacationFromIndate(Long overallVacationFromIndate) {
        this.overallVacationFromIndate = overallVacationFromIndate;
    }

    public Long getOverallVacationGranted() {
        return overallVacationGranted;
    }

    public void setOverallVacationGranted(Long overallVacationGranted) {
        this.overallVacationGranted = overallVacationGranted;
    }

    public Long getOverallDisposableVacationTaken() {
        return overallDisposableVacationTaken;
    }

    public void setOverallDisposableVacationTaken(Long overallDisposableVacationTaken) {
        this.overallDisposableVacationTaken = overallDisposableVacationTaken;
    }
}
