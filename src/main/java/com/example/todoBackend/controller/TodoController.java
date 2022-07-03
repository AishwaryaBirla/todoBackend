package com.example.todoBackend.controller;

import com.example.todoBackend.entity.Todo;
import com.example.todoBackend.repository.TodoRepository;
import com.example.todoBackend.service.TodoServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @GetMapping("/")
    public ModelAndView index(){
        logger.debug("request to GET index");
        ModelAndView modelAndView= new ModelAndView("index");
        return modelAndView;
    }

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping
    public List<Todo> findAll(){
        return todoRepository.findAll();
    }

    @Autowired
    private TodoServices todoServices;

    @GetMapping(value = "/todo")
    public List<Todo> getTodo() {
        return  this.todoServices.getTodo();

    }


}
