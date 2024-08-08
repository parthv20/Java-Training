package com.example.beehyv.ASSESMENT_TASK2.Service;

import com.example.beehyv.ASSESMENT_TASK2.Request.BookREquest;
import com.example.beehyv.ASSESMENT_TASK2.Repositry.AuthorRepo;
import com.example.beehyv.ASSESMENT_TASK2.Repositry.PublisherRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.beehyv.ASSESMENT_TASK2.model.Author;
import com.example.beehyv.ASSESMENT_TASK2.model.Book;
import com.example.beehyv.ASSESMENT_TASK2.model.Publisher;
import com.example.beehyv.ASSESMENT_TASK2.Repositry.BookRepo;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepository;
//
//    @Autowired
//  //  private AuthorService authorService;

    @Autowired
    private AuthorRepo authorRepo;

    @Autowired
    private PublisherRepo publisherRepo;


    public Book getBookById(int bookId) {

        System.out.println(bookId);
        return bookRepository.findById(bookId).orElse(new Book());
    }

    public Book addBook(BookREquest req) {


        String authorName=req.getAuthorName();
        String publisherName=req.getPublisherName();

        System.out.println(authorName);

        if((authorRepo.findByName(authorName).isEmpty())){
            Author author=new Author();
            author.setName(authorName);
            authorRepo.save(author);
        }
        if(publisherRepo.findByName(publisherName).isEmpty()){
            Publisher publisher=new Publisher();
            publisher.setName(publisherName);
            publisherRepo.save(publisher);
        }

        Book book=new Book();
        book.setTitle(req.getTitle());
        book.setPublicationYear(req.getPublicationYear());

        Author auth=authorRepo.findByName(authorName).get(0);
        Publisher pub=publisherRepo.findByName(publisherName).get(0);

        book.setAuthor(auth);
        book.setPublisher(pub);
        System.out.println(book);

       return bookRepository.save(book);

    }
}