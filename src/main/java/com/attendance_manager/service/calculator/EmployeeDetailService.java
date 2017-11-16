package com.attendance_manager.service.calculator;

import com.attendance_manager.domain.IndividualTimeOff;
import com.attendance_manager.model.EmployeeDetails;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeDetailService {

    EmployeeDetails calculateDetailsTimeOffsDisposedFromOutdatedVacation(
            Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod);

    EmployeeDetails calculateDetailsTimeOffsDisposedFromIndateVacation(
            Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod);

    EmployeeDetails calculateDetailsTimeOffsDisposedBalanced(
            Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod);
}
