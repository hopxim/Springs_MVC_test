package com.maxi.service;

import com.maxi.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface BooService {
   /*
    *保存
    * @parm book
    * @return
    */
    public boolean save(Book book);
    /*
     *修改
     * @parm book
     * @return
     */
    public boolean update(Book book);
    /*
     *按id删除
     * @parm book
     * @return
     */
    public boolean delete(Integer id);
    /*
     *按id查询
     * @parm book
     * @return
     */
    public Book getById(Integer id);
    /*
     *查询全部
     * @return
     */
    public List<Book> getAll();
}
