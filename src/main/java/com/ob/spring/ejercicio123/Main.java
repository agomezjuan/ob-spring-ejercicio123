package com.ob.spring.ejercicio123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) context.getBean("Saludo");
        Saludo saludo2 = (Saludo) context.getBean("Saludo");

        saludo.imprimirSaludo();
        saludo2.imprimirSaludo();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
