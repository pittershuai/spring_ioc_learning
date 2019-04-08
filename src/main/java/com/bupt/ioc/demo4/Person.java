package com.bupt.ioc.demo4;

public class Person {
    private String name;
    private String age;
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name +"  "+ "age:"+age + "  " +"cat" + cat;
    }
}
