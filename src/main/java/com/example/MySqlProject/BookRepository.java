package com.example.MySqlProject;

//import com.example.MySqlProject.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}