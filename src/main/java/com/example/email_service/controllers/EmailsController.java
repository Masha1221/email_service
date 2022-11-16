package com.example.email_service.controllers;


import com.example.email_service.dtos.EmailDto;
import com.example.email_service.services.EmailsServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
public class EmailsController {

    private final EmailsServiceImpl emailsService;

    @PostMapping("/emails")
    void sendEmail(@RequestBody EmailDto emailDto) {
        emailsService.createEmail(emailDto);
        log.info("Hello");
    }
}

