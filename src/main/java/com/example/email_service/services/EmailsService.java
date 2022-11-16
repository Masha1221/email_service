package com.example.email_service.services;

import com.example.email_service.dtos.EmailDto;

public interface EmailsService {

    void createEmail(EmailDto emailDto);
}
