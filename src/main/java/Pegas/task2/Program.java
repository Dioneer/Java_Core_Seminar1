package Pegas.task2;

import Pegas.models.Employee;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Program {
    private final static Random random = new Random();
    public static void main(String[] args) throws SQLException {
        System.out.println("Start task 2");
        Employee employee1 = Employee.create();
        System.out.println(employee1);
        String url = "jdbc:mysql://employees-db:3307/";
        String user = "root";
        String password= "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        createTable(connection);
        System.out.println("Create table successfully");
        int count = random.nextInt(5,11);
        for(int i=0; i<count; i++){
            insertData(connection, Employee.create());
        }
    }

    private static void insertData(Connection connection, Employee employee) {
        String insert = "Insert into knight(name, age) values(?,?);";
        try(PreparedStatement preparedStatement = connection.prepareStatement(insert)){
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setInt(1, employee.getAge());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTable = "create table if not exists knight(id serial, name varchar(100), age int); ";
        try(PreparedStatement preparedStatement = connection.prepareStatement(createTable)){
            preparedStatement.execute();
        }
    }
    private static Collection<Employee> readData(Connection connection) throws SQLException {
        List<Employee> list = new ArrayList<>();
        String readData = "select * from knight";
        try(PreparedStatement preparedStatement = connection.prepareStatement(readData)){
           ResultSet resultSet = preparedStatement.executeQuery();
           while (resultSet.next()){
               int id = resultSet.getInt("id");
               String name = resultSet.getString("name");
               int age = resultSet.getInt("age");
               list.add(new Employee(id,name,age));
           }
        }
        return list;
    }
}
