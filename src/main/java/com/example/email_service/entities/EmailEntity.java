package com.example.email_service.entities;


import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Accessors(chain = true)
@Data
@Table(name = "emails")
public class EmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emailId",nullable = false)
    private String emailId;

    @Column(name = "usersEmail",nullable = false)
    private String usersEmail;

    @Column(name = "message",nullable = false)
    private String message;
}
