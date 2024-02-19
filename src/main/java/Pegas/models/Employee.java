package Pegas.models;

import java.util.Random;

public class Employee {
    private static final Random random = new Random();
    private static final  String[] names = new String[]{"Gosha", "Tosha", "Kilm"};
    private int id;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public static Employee create(){
        return  new Employee(names[random.nextInt(names.length)], random.nextInt(20,26));
    }
    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
