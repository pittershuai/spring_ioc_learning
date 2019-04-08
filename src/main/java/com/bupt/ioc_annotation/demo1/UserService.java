package com.bupt.ioc_annotation.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

    public String sayHello(String name){
        return "Hello" + name;
    }

    public void eat(){
        System.out.println("eat:"+something);
    }
}
