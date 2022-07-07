package com.yuan.dao;

import com.yuan.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName: BookMapper
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/7/4-20:31
 * @Version: 1.0
 */
public interface BookMapper {

    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(@Param("bookID") int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(@Param("bookID") int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

}
