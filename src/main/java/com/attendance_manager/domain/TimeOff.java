package com.attendance_manager.domain;

import java.time.LocalDateTime;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */
public class TimeOff {

    private LocalDateTime start;
    private LocalDateTime end;
    private TimeOffType reason;
    private User user;
    private String comment;

}
