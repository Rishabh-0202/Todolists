package com.example.todolists.service;

import com.example.todolists.entities.Todo;

import java.util.List;

public interface TodoService {
    public List<Todo> getTodos();



    public Todo addtodo(Todo todo);

    public Todo updatetodo(Todo todo);

    public void deletetodo(Long Id);
}
