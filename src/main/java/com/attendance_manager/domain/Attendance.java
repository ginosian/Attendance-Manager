package com.attendance_manager.domain;

import com.attendance_manager.converter.LocalDateTimeAttributeConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "attendance")
public class Attendance extends AbstractDomain implements Serializable {

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    @Column(name = "in")
    private LocalDate in;

    @Convert(converter = LocalDateTimeAttributeConverter.class)
    @Column(name = "out")
    private LocalDate out;
}
