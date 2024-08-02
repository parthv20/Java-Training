package com.example.beehyv.ASSESMENT_TASK2.Repositry;


import com.example.beehyv.ASSESMENT_TASK2.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Long> {
    Author findByName(String name);
}