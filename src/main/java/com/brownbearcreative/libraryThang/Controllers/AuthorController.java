package com.brownbearcreative.libraryThang.Controllers;

import com.brownbearcreative.libraryThang.dataRepositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/author")
public class AuthorController {
    @Autowired
    private AuthorRepository authorRepository;
}
