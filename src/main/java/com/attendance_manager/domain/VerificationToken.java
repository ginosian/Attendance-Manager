package com.attendance_manager.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Marta Ginosyan
 * Date: 10/22/17
 */
@Entity
@Table(name = "verification_token")
public class VerificationToken extends AbstractDomain {
}
