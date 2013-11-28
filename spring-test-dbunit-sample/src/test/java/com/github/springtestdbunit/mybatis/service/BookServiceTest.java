package com.github.springtestdbunit.mybatis.service;

import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.mybatis.TransactionalContextTests;
import com.github.springtestdbunit.mybatis.entity.BookEntity;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: baowp
 * Date: 11/27/13
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(inheritLocations = false)
//(locations = "classpath:com/github/springtestdbunit/mybatis/service/BookServiceTest2-context.xml")
//or locations = "BookServiceTest2-context.xml
public class BookServiceTest extends TransactionalContextTests {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private BookService bookService;

    @Test
    @DatabaseSetup("book.xml")
    public void testList() {
        List<BookEntity> list = bookService.list();
        logger.info(list.size() + "");
        assertEquals(list.size(), 1);
    }
}
