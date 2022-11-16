package com.example.email_service.repositories;

import com.example.email_service.entities.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailsRepository extends JpaRepository<EmailEntity, Integer> {
}
