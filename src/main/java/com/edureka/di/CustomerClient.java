package com.edureka.di;

import com.edureka.di.inheritance.ContractEmployee;
import com.edureka.di.inheritance.Employee;
import com.edureka.di.innerBeans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {
    public static void main(String[] args) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml","bean-inheritance.xml");

        //Module1
       /* Customer customer1 = context.getBean("customer", Customer.class);
        //System.out.println(customer1.getAddressList());
        //Customer customer2 = context.getBean("customer", Customer.class);

        //demonstrating the scope
       // System.out.println(customer1 == customer2);

        // shutdown the container
        //((AbstractApplicationContext)context).registerShutdownHook();*/

       //Module2
        /*Employee employee = context.getBean("contractEmployee", ContractEmployee.class);
        System.out.println(employee.getName());*/

        // inner bean
        //Student student = context.getBean("student", Student.class);
        //Student returnStudent = student.getStudentMapper().map(null);
       // System.out.println(returnStudent);
    }

}