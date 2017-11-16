package com.attendance_manager.domain;

import com.attendance_manager.converter.LocalDateTimeAttributeConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */

@Entity
@Table(name = "individual_time_off")
public class IndividualTimeOff extends AbstractDomain implements Serializable {

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    @Column(name = "start")
    private LocalDateTime start;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    @Column(name = "end")
    private LocalDateTime end;

    @OneToOne
    private TimeOffType reason;

    @OneToOne
    private User user;

    @Column(name = "comment")
    private String comment;

    @Column(name = "disposed", columnDefinition = "BOOLEAN DEFAULT FALSE")
    private Boolean disposed;

    public IndividualTimeOff() {
    }

    public IndividualTimeOff(String ssn,
            LocalDateTime start,
            LocalDateTime end,
            TimeOffType reason, User user, String comment, Boolean disposed) {
        super(ssn);
        this.start = start;
        this.end = end;
        this.reason = reason;
        this.user = user;
        this.comment = comment;
        this.disposed = disposed;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public TimeOffType getReason() {
        return reason;
    }

    public void setReason(TimeOffType reason) {
        this.reason = reason;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getDisposed() {
        return disposed;
    }

    public void setDisposed(Boolean disposed) {
        this.disposed = disposed;
    }
}
