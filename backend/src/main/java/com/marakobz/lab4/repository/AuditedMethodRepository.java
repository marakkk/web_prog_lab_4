package com.marakobz.lab4.repository;

import com.marakobz.lab4.domain.AuditedMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditedMethodRepository extends JpaRepository<AuditedMethod, Integer> {
}
