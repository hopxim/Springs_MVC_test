package com.maxi.service;

import com.maxi.config.SpringConfig;
import com.maxi.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BooService booService;
    @Test
    public void testGetById(){
        Book book =booService.getById(1);
        System.out.println(book);
    }
    @Test
    public void testGetAll(){
        List<Book> all =booService.getAll();
        System.out.println(all);
    }
}
