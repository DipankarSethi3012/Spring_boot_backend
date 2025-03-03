package com.dipankar.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    private static final String FROM_EMAIL = "dipankarsethi3012@gmail.com"; // Set your sender email

    public void sendVerificationOtpEmail(String userEmail, String otp, String subject, String text) throws MessagingException {
        System.out.println("Here we are in send verification service");
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, false); // false for plain text emails

            helper.setFrom(FROM_EMAIL);  // Set sender email
            helper.setTo(userEmail);
            helper.setSubject(subject);
            helper.setText(text + otp, false);  // Use false to send plain text, true for HTML

            javaMailSender.send(mimeMessage);
            System.out.println("Email sent successfully to: " + userEmail);
        } catch (MailException e) {
            throw new MailSendException("Failed to send email: " + e.getMessage());
        }
    }
}
