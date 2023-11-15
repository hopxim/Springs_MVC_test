package com.maxi.service.impl;
import com.maxi.dao.BookDao;
import com.maxi.domain.Book;
import com.maxi.service.BooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BooService{
    @Autowired
    private BookDao bookDao;
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
         return bookDao.getById(id);
    }

    public List<BookDao> getAll() {
        return bookDao.getAll();
    }
}
