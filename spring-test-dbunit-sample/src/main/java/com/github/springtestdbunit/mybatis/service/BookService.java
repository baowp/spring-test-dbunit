package com.github.springtestdbunit.mybatis.service;

import com.github.springtestdbunit.mybatis.entity.BookEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: baowp
 * Date: 11/27/13
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BookService {

    int insert(BookEntity book);

    List<BookEntity> list();
}
