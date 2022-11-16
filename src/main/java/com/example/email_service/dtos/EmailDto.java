package com.example.email_service.dtos;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors
public class EmailDto {

    private int emailId;
    private String usersEmail;
    private String message;
}
