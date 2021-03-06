package com.attendance_manager.repository;

import com.attendance_manager.domain.PasswordResetToken;

/**
 * @author Marta Ginosyan
 * Date: 11/14/17
 */
public interface PasswordResetTokenRepository extends BaseRepository<PasswordResetToken> {

    PasswordResetToken findPasswordResetTokenByToken(String token);
}
