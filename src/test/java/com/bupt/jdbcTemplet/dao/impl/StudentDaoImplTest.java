package com.bupt.jdbcTemplet.dao.impl; 

import com.bupt.jdbcTemplet.dao.StudentDao;
import com.bupt.jdbcTemplet.entity.Student;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/** 
* StudentDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>04/09/2019</pre> 
* @version 1.0 
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jdbcTemplet.xml")
public class StudentDaoImplTest {

    @Resource(name = "StudentDao")
    StudentDao studentDao;

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: insert(Student stu) 
* 
*/ 
@Test
public void testInsert() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(Student stu) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(int id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: select(int id) 
* 
*/ 
@Test
public void testSelect() throws Exception { 
//TODO: Test goes here...
    Student student = studentDao.select(1);
    System.out.println(student);
} 

/** 
* 
* Method: selectAll() 
* 
*/ 
@Test
public void testSelectAll() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: mapRow(ResultSet resultSet, int i) 
* 
*/ 
@Test
public void testMapRow() throws Exception { 
//TODO: Test goes here... 
} 


} 
