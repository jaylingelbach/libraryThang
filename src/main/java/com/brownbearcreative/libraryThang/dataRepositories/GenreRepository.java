package com.brownbearcreative.libraryThang.dataRepositories;

import com.brownbearcreative.libraryThang.Models.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
