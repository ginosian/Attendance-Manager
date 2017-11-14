package com.attendance_manager.service;

import com.attendance_manager.domain.Authority;
import com.attendance_manager.domain.PasswordResetToken;
import com.attendance_manager.domain.VerificationToken;
import com.attendance_manager.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/**
 * @author Marta Ginosyan
 * Date: 11/14/17
 */
public interface UserService extends UserDetailsService {

    User findUserByUsername(String username);

    Authority findByRole(String role);

    User save(User user);

    User approveUser(Long id);

    VerificationToken getVerificationToken(String token);

    VerificationToken saveVerificationToken(VerificationToken verificationToken);

    PasswordResetToken getPasswordResetToken(String token);

    void savePasswordResetToken(PasswordResetToken passwordResetToken);

    List<User> findAllEmployees();

    User findById(Long id);
}
