package com.bupt.ioc_annotation.demo1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Spring的Bean管理的注解方式：
 *  * 传统方式需要去XML中配置<bean id="" class=""></bean>
 */

//@Component("userService")
@Service("userService") //效果与用@Component效果一样
public class UserService {
    public String sayHello(String name){
        return "Hello" + name;
    }
}
