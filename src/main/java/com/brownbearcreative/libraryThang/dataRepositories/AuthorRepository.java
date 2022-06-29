package com.brownbearcreative.libraryThang.dataRepositories;
import com.brownbearcreative.libraryThang.Models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
