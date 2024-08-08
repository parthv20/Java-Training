package com.example.beehyv.ASSESMENT_TASK2.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.beehyv.ASSESMENT_TASK2.model.Publisher;

import java.util.List;

public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
    List<Publisher> findByName(String name);
}