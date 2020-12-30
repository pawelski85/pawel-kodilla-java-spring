package com.kodilla.spring.portfolio;

import com.kodilla.spring.library.LibraryDbController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(){
        return new Board();
    }
    @Bean
    public TaskList taskListController() {
        return new TaskList();
    }

}
