package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;



    public Board(TaskList toDoList,TaskList inProgressList,TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList=inProgressList;
        this.doneList=doneList;
    }

    public void addTask(String string1,String string2, String string3 ) {
        this.toDoList.addTask(string1);
        this.inProgressList.addTask(string2);
        this.doneList.addTask(string3);

    }
    public void readTasksList(){
        System.out.println("Reading "+toDoList.getList()+inProgressList.getList()+doneList.getList());
    }


}
