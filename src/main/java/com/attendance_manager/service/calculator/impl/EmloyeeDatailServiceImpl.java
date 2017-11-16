package com.attendance_manager.service.calculator.impl;

import com.attendance_manager.domain.IndividualTimeOff;
import com.attendance_manager.domain.TimeOffType;
import com.attendance_manager.model.EmployeeDetails;
import com.attendance_manager.service.calculator.EmployeeDetailService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class EmloyeeDatailServiceImpl implements EmployeeDetailService {

    @Override
    public EmployeeDetails calculateDetailsTimeOffsDisposedFromOutdatedVacation(
            Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod) {

        EmployeeDetails employeeDetails = new EmployeeDetails();
        Map<TimeOffType, Long> overallTimeOff = summarizeTimeOff(timeOffs);
        Map<TimeOffType, Long> overallDisposedTimeOff = summarizeDisposedTimeOff(timeOffs);
        Long overAllDisposableVacationTaken = calculateOverAllDisposableVacationTaken(overallTimeOff);
        Long overallVacationFromOutdated = calculateOverallVacationFromOutdated(joined, leaved, vacationPerMonth, validVacationPeriod);
        Long overallVacationFromIndate = calculateOverallVacationFromIndate(joined, leaved, vacationPerMonth, validVacationPeriod);
        Long overallVacationGranted = calculateOverallVacationGranted(joined, leaved, vacationPerMonth, validVacationPeriod);

        employeeDetails.setEmployeeId(employeeId);
        employeeDetails.setEmployeeName(employeeName);
        employeeDetails.setJoinDate(joined);
        employeeDetails.setLeaveDate(leaved);
        employeeDetails.setOverallTimeOff(overallTimeOff);
        employeeDetails.setOverallDisposedTimeOff(overallDisposedTimeOff);
//        employeeDetails.setVacationLeftFromOutdated(vacationLeftFromOutdated);
//        employeeDetails.setVacationLeftFromIndate(vacationLeftFromIndate);
        employeeDetails.setOverallVacationFromOutdated(overallVacationFromOutdated);
        employeeDetails.setOverallVacationFromIndate(overallVacationFromIndate);
        employeeDetails.setOverallVacationGranted(overallVacationGranted);
        employeeDetails.setOverallDisposableVacationTaken(overAllDisposableVacationTaken);
        return employeeDetails;
    }

    @Override
    public EmployeeDetails calculateDetailsTimeOffsDisposedFromIndateVacation(Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod) {
        return null;
    }

    @Override
    public EmployeeDetails calculateDetailsTimeOffsDisposedBalanced(Long employeeId,
            String employeeName,
            LocalDate joined,
            LocalDate leaved,
            List<IndividualTimeOff> timeOffs,
            Double vacationPerMonth,
            Integer validVacationPeriod) {
        return null;
    }

    private Map<TimeOffType, Long> summarizeTimeOff(List<IndividualTimeOff> timeOffs) {
        Map<TimeOffType, Long> summarizedTimeOffs = new HashMap<>();
        timeOffs.forEach(individualTimeOff
                -> summarizedTimeOffs.put(individualTimeOff.getReason(),ChronoUnit.DAYS.between(individualTimeOff.getStart(), individualTimeOff.getEnd())));
        return summarizedTimeOffs;
    }

    private Map<TimeOffType, Long> summarizeDisposedTimeOff(List<IndividualTimeOff> timeOffs) {
        Map<TimeOffType, Long> summarizedTimeOffs = new HashMap<>();
        timeOffs.stream()
                .filter(IndividualTimeOff::getDisposed)
                .forEachOrdered(individualTimeOff -> {
                    summarizedTimeOffs.put(individualTimeOff.getReason(),ChronoUnit.DAYS.between(individualTimeOff.getStart(), individualTimeOff.getEnd()));
                });
        return summarizedTimeOffs;
    }

    private Long calculateOverAllDisposableVacationTaken(Map<TimeOffType, Long> timeOffs){
        long overAllDisposableVacationTaken = 0;

        for(Map.Entry pair : timeOffs.entrySet()){
            if(((TimeOffType)pair.getKey()).getDisposableFromVacation()) overAllDisposableVacationTaken += (Long)pair.getValue();
        }
        return overAllDisposableVacationTaken;
    }

    private Long calculateOverallVacationFromOutdated(LocalDate startDate, LocalDate endDate, Double vacationPerMonth, Integer validVacationPeriod){
        if(endDate == null) endDate = LocalDate.now();
        Long workDurationMonths = ChronoUnit.MONTHS.between(startDate, endDate);
        if (workDurationMonths <= validVacationPeriod) return 0L;
        Long workDurationFromOutDatedMonths = workDurationMonths - validVacationPeriod;
        Double result = Double.parseDouble(workDurationFromOutDatedMonths.toString()) * vacationPerMonth;
        return Long.parseLong(result.toString());
    }

    private Long calculateOverallVacationFromIndate(LocalDate startDate, LocalDate endDate, Double vacationPerMonth, Integer validVacationPeriod){
        if(endDate == null) endDate = LocalDate.now();
        Long workDurationMonths = ChronoUnit.MONTHS.between(startDate, endDate);
        if (workDurationMonths > validVacationPeriod) {
            Double result = Double.parseDouble(validVacationPeriod.toString()) * vacationPerMonth;
            return Long.parseLong(result.toString());
        } else {
            Double result = Double.parseDouble(workDurationMonths.toString()) * vacationPerMonth;
            return Long.parseLong(result.toString());
        }
    }

    private Long calculateOverallVacationGranted(LocalDate startDate, LocalDate endDate, Double vacationPerMonth, Integer validVacationPeriod){
        if(endDate == null) endDate = LocalDate.now();
        Long workDurationMonths = ChronoUnit.MONTHS.between(startDate, endDate);
        Double result = Double.parseDouble(workDurationMonths.toString()) * vacationPerMonth;
        return Long.parseLong(result.toString());
    }
}
