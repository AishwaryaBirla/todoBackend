package com.example.todoBackend.controller;

import com.example.todoBackend.entity.TodoItem;
import com.example.todoBackend.service.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class TodoController {

    private final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to GET index");
        ModelAndView modelAndView= new ModelAndView("index");
        return modelAndView;
    }

    @Autowired
    private Services services;

    @GetMapping(value = "/todo")
    public List<TodoItem> getTodos() {

        return  this.services.getTodoItem();

    }


}
