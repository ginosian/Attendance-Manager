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

}
