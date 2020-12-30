package com.kodilla.spring.portfolio;

import com.kodilla.spring.library.LibraryDbController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.WeakHashMap;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {

        return new Board(toDoList(),inProgressList(),doneList());
    }
    @Bean
    public TaskList toDoList(){
        return new TaskList();

    }
    @Bean
    public TaskList inProgressList(){
        return new TaskList();
    }
    @Bean
    public TaskList doneList(){
        return new TaskList();
    }


}
