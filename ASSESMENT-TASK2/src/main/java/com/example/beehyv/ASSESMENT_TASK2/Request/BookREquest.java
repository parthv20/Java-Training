package com.example.beehyv.ASSESMENT_TASK2.Request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookREquest {
     String title;
     int publicationYear;
     String authorName;
     String publisherName;


}
