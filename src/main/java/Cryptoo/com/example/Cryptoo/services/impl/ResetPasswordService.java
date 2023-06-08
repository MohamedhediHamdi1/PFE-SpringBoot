package Cryptoo.com.example.Cryptoo.services.impl;

import Cryptoo.com.example.Cryptoo.entities.ResetPasswordEntity;
import Cryptoo.com.example.Cryptoo.repositories.Passwordrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class ResetPasswordService {

    @Autowired
    Passwordrepository passwordrepository;

    @Scheduled(fixedRate = 5000)
    public void check_time(){
        Long count =passwordrepository.count();
        for(int i=1;i<count+1;i++){
            ResetPasswordEntity pass=passwordrepository.findById((long) i);
            if(pass.getTime()>0){
                pass.setTime(pass.getTime()-5);
                passwordrepository.save(pass);
            }
            LocalTime currentTimeInGMT = LocalTime.now(ZoneId.of("GMT"));
            String formattedTime = currentTimeInGMT.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(formattedTime.contains("00:00:1")){
                passwordrepository.delete(pass);
            }
        }
    }

    @Autowired
    private JavaMailSender mailSender;

    public void sendVerificationCode(String to, String verificationCode) throws MessagingException {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject("Verification code");
        message.setText("Your verification code is: " + verificationCode);
        mailSender.send(message);
    }

}
