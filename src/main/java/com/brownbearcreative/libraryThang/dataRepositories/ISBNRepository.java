package com.brownbearcreative.libraryThang.dataRepositories;

import com.brownbearcreative.libraryThang.Models.ISBN;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISBNRepository extends CrudRepository<ISBN, Integer> {
}
