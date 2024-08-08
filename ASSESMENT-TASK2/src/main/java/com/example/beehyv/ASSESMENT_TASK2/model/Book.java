package com.example.beehyv.ASSESMENT_TASK2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private int publicationYear;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisherId")
    private Publisher publisher;



}