package com.email.controller;

import com.email.mail.MailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kaiser Ahmed on 3/13/2017.
 */
@Controller
public class MailController {

    @Autowired
    private MailClient mailClient;

    //http://localhost:8080/index
    @RequestMapping(value="/sendmail", method= RequestMethod.GET)
    @ResponseBody
    public String mail() {

        //given
        String recipient = "kaiserahmed.isu@gmail.com";
        String message = "Test message content";
        //when
        mailClient.prepareAndSend(recipient, message);
        return "Mail Sent successfully!";
    }

}
