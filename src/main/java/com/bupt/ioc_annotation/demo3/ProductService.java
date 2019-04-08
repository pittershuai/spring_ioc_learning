package com.bupt.ioc_annotation.demo3;

import javax.annotation.Resource;

public class ProductService {
    //这是注解与xml配合的方式，name在xml文件中配置。（以前是在CategoryDao 头顶上用@Component配置）
    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;


    public void save(){
        System.out.println("ProductService的save方法执行了...");
        categoryDao.save();
        productDao.save();
    }
}
