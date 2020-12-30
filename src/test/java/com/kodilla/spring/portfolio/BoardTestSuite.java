package com.kodilla.spring.portfolio;
import com.kodilla.spring.library.Library;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;
@SpringBootTest
public class BoardTestSuite {
    @Test
    void test(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");

        //When & Then

        System.out.println("===== Beans list: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ===== Beans list ====");

    }
    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        //When & Then
        Board board=context.getBean(Board.class);
        board.addTask("cos","cos2","cos3");
        board.readTasksList();

    }
}
