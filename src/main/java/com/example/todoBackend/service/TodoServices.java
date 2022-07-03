package com.example.todoBackend.service;

import com.example.todoBackend.entity.Todo;
import com.example.todoBackend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServices {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodo(){
        List<Todo> todoList = new ArrayList<>();
        todoRepository.findAll().forEach(todo -> todoList.add(todo));
        return todoList;
    }
}
