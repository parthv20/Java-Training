package com.example.beehyv.ASSESMENT_TASK2.Repositry;


import com.example.beehyv.ASSESMENT_TASK2.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
   List<Author> findByName(String name);
}