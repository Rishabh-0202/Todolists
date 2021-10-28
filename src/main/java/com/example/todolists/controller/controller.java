package com.example.todolists.controller;

import com.example.todolists.entities.Todo;
import com.example.todolists.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private TodoService todoservice;
    @GetMapping("/show")
    public List<Todo> getTodos()
    {
        return this.todoservice.getTodos();
    }




    @PostMapping("/addTask")
    public Todo addTodo(@RequestBody Todo todo)
    {
        return this.todoservice.addtodo(todo);
    }


    @PutMapping("/update")
    public  Todo updateTodo(@RequestBody Todo todo)
    {
        return this.todoservice.updatetodo(todo);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<HttpStatus> deleteTodo(@PathVariable Long Id) {

        try {
            this.todoservice.deletetodo(Id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
