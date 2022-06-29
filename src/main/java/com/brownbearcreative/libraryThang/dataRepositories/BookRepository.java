package com.brownbearcreative.libraryThang.dataRepositories;

import com.brownbearcreative.libraryThang.Models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
