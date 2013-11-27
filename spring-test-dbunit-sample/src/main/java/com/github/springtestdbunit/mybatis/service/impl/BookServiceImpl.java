package com.github.springtestdbunit.mybatis.service.impl;

import com.github.springtestdbunit.mybatis.entity.BookEntity;
import com.github.springtestdbunit.mybatis.persistence.BookMapper;
import com.github.springtestdbunit.mybatis.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: baowp
 * Date: 11/27/13
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookMapper bookMapper;

    public List<BookEntity> list() {
        return bookMapper.list();
    }
}
