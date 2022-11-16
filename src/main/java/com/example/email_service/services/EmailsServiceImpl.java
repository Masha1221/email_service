package com.example.email_service.services;

import com.example.email_service.dtos.EmailDto;
import com.example.email_service.entities.EmailEntity;
import com.example.email_service.repositories.EmailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailsServiceImpl implements EmailsService {

    private final EmailsRepository emailsRepository;

    @Override
    public void createEmail(EmailDto emailDto) {
        EmailEntity emailEntity = new EmailEntity();
        emailEntity.setUsersEmail(emailDto.getUsersEmail());
        emailEntity.setMessage(emailDto.getMessage());
        emailsRepository.save(emailEntity);
    }
}

