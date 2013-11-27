package com.github.springtestdbunit.mybatis;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * Created with IntelliJ IDEA.
 * User: baowp
 * Date: 11/27/13
 * Time: 5:59 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration//(locations = "/spring/spring-context.xml")
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, DbUnitTestExecutionListener.class})
public class MockitoContextTests extends
        AbstractTransactionalJUnit4SpringContextTests {

    @Before
    public void mockitoInitialBefore() {
        MockitoAnnotations.initMocks(this);
    }
}
