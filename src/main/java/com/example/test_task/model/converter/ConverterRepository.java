package com.example.test_task.model.converter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConverterRepository extends JpaRepository<Converter, Long> {
}
