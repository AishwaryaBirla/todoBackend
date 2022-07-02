package com.example.todoBackend.repository;

import com.example.todoBackend.entity.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem,Long> {
}
