package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is : " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicle1 = context.getBean("audiVehicle",Vehicle.class);
        Vehicle vehicle2 = context.getBean("hondaVehicle",Vehicle.class);
        Vehicle vehicle3 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is : "+vehicle1.getName());
        System.out.println("Vehicle name from Spring Context is : "+vehicle2.getName());
        System.out.println("Vehicle name from Spring Context is : "+vehicle3.getName());

    }
}
