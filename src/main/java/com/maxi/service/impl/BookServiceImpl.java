package com.maxi.service.impl;
import com.maxi.controller.Code;
import com.maxi.dao.BookDao;
import com.maxi.domain.Book;
import com.maxi.exception.BusinessException;
import com.maxi.exception.SystemException;
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
        //模拟业务异常，包装成自定义异常
        if(id<0){
            throw new BusinessException(Code.BUSINESS_ERR,"你别给我乱改URL噢");
        }
        //模拟系统异常，将可能出现的异常进行包装，转换成自定义异常
        // try{
        //     int i=1/0;
        // }catch (Exception e){
        //     throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!");
        // }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }


}
