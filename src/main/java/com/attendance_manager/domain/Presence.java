package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */

@Entity
@Table(name = "presence")
public class Presence extends AbstractDomain implements Serializable {

    private LocalDateTime in;
    private LocalDateTime out;
    private User user;
}
