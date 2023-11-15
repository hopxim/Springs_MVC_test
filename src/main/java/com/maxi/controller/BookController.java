package com.maxi.controller;

import com.maxi.dao.BookDao;
import com.maxi.domain.Book;
import com.maxi.service.*;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooService booService;
    @PostMapping
    public boolean save(@RequestBody Book book) {
        booService.save(book);
        return true;
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        booService.update(book);
        return true;
    }

    @DeleteMapping({"/{id}"})
    public boolean delete(@PathVariable Integer id) {
        booService.delete(id);
        return true;
    }

    @GetMapping({"/{id}"})
    public Book getById(@PathVariable Integer id) {
        return booService.getById(id);
    }

    @GetMapping
    public List<BookDao> getAll() {
        return booService.getAll();
    }


}

