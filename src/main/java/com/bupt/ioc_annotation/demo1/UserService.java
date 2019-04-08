package com.bupt.ioc_annotation.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Spring的Bean管理的注解方式：
 *  * 传统方式需要去XML中配置<bean id="" class=""></bean>
 */

//@Component("userService")
@Service("userService") //效果与用@Component效果一样
public class UserService {
    //对于简单类型使用@value注入
    @Value("米饭")
    private String something;

//    @Autowired //类型注入，即至于UserDao类型相关，与UserDao上的@Repository("userDao")中的userDao名字不相关。改成@Repository("userDao111")也是成功的
//    @Qualifier("userDao")  //与名字相对应，此时要与@Repository("userDao")中的名字对应

    @Resource(name="userDao") //等价于上面两句话
    private UserDao userDao;

    public String sayHello(String name){
        return "Hello" + name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }

    public void save(){
        System.out.println("Service中保存用户...");
        userDao.save();
    }
}
