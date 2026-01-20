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

        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        Vehicle veh1 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is : "+veh.getName());
        System.out.println("Vehicle name from Spring Context is : "+veh1.getName());

    }
}
