
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-jdbcTemplet.xml")
public class TestJDBCTemplet {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testExecute(){
        jdbcTemplate.execute("create table user1(id int,name varchar(20))");
    }

    @Test
    public void testUpdate(){
        String sql = "insert into student(name,sex) values(?,?)";
        jdbcTemplate.update(sql,new Object[]{"张飞","男"});
    }

    @Test
    public void testUpdate2(){
        String sql = "update student set sex=? where id=?";
        jdbcTemplate.update(sql,"女",1);
    }

    @Test
    public void testBatchUpdate(){
        String[] sqls={
                "insert into student(name,sex) values('关羽','女')",
                "insert into student(name,sex) values('刘备','男')",
                "update student set sex='女' where id=2001"
        };
        jdbcTemplate.batchUpdate(sqls);
    }

    @Test
    public void testBatchUpdate2(){
        String sql = "insert into selection(student,course) values(?,?)";
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{1,1001});
        list.add(new Object[]{2,1003});
        jdbcTemplate.batchUpdate(sql,list);
    }
}
