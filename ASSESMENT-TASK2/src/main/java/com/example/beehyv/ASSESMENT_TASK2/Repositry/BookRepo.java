package com.example.beehyv.ASSESMENT_TASK2.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.beehyv.ASSESMENT_TASK2.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {
}