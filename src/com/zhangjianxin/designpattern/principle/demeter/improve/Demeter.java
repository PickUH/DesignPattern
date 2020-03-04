package com.zhangjianxin.designpattern.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则（最少知道原则）
 *
 * 1.一个对象应该对其他对象保持最少的了解
 *
 * 2.类与类的关系越密切，耦合性越大
 *
 * 3.某个类中的成员变量。方法参数，方法返回值中出现的类为直接的朋友，局部变量不是，最好避免陌生的类以局部变量出现在类的内部
 *
 * @Author: zhangjianxin
 * @Create: 2019-07-14 18:40
 * @Version V1.0
 **/
public class Demeter {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();

        schoolManager.printAllEmployee(new CollegeManager());
    }
}

//学校总部员工类
class Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


//学院的员工类
class CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}


//管理学院员工的管理类
class CollegeManager {
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee() {
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了10个员工到 list
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee(){
        //获取到学院员工
        List<CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------学院员工------------");
        for (CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校管理类

//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee不方法参数，返回值，而是作为局部变量出现 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class SchoolManager {
    //返回学校总部的员工
    public List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();

        for (int i = 0; i < 5; i++) { //这里我们增加了5个员工到 list
            Employee emp = new Employee();
            emp.setId("学校总部员工id= " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(CollegeManager sub) {

        //分析问题
        sub.printEmployee();

        //获取到学校总部员工
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
