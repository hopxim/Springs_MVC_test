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
    public Result save(@RequestBody Book book) {
       boolean flag=booService.save(book);
        return new Result(flag?Code.SAVE_OK:Code.SAVE_ERR,flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
       boolean flag= booService.update(book);
        return new Result(flag?Code.UPDATE_OK:Code.UPDATE_ERR,flag);

    }

    @DeleteMapping({"/{id}"})
    public Result delete(@PathVariable Integer id) {
        boolean flag= booService.delete(id);
        return  new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping({"/{id}"})
    public Result getById(@PathVariable Integer id) {


        Book book=booService.getById(id);
        Integer code=book!=null ? Code.GET_OK:Code.GET_ERR;
        String msg=book!=null?"":"数据查询失败，请重试";
        return new Result(code,book,msg);
    }

    @GetMapping
    public Result getAll() {
        List<Book> books=booService.getAll();
        Integer code=books!=null ? Code.GET_OK:Code.GET_ERR;
        String msg=books!=null?"":"数据查询失败，请重试";

        return new Result(code,books,msg);
    }


}

