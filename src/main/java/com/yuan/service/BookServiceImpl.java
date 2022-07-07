package com.yuan.service;

import com.yuan.dao.BookMapper;
import com.yuan.pojo.Books;


import java.util.List;

/**
 * @ClassName: BookServiceImpl
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/7/5-15:27
 * @Version: 1.0
 */
public class BookServiceImpl implements BookService{

    //service调dao层：组合Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
