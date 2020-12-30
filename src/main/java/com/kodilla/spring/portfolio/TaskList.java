package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public class TaskList {
    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();

    }
    public void addTask(String string){
        this.tasks.add(string);
    }
    public List<String> getList(){
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
