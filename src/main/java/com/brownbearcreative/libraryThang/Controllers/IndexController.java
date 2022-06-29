package com.brownbearcreative.libraryThang.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping
    public String getIndex() {
        return "<h1> index </h1>";
    }
}
