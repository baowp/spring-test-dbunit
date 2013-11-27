package com.github.springtestdbunit.mybatis.service;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.mybatis.entity.BookEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class})
public class BookServiceTest {

    private Logger logger= LoggerFactory.getLogger(getClass());
    @Resource
    private BookService bookService;

    @Test
    public void testList() {
        List<BookEntity> list = bookService.list();
        logger.info(list.size()+"");
        assertEquals(list.size(), 1);
    }
}
