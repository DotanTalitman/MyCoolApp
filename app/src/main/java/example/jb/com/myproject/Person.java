package example.jb.com.myproject;

import java.io.Serializable;

/**
 * Created by Android on 28/12/2017.
 */

public class Person implements Serializable {

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
