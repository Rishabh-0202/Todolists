package com.example.todolists.service;

import com.example.todolists.dao.TodoDao;
import com.example.todolists.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoDao todoDao;
    List<Todo> list;

    @Override
    public List<Todo> getTodos() {
        return todoDao.findAll();
    }



    @Override
    public Todo addtodo(Todo todo) {
        return todoDao.save(todo);
    }

    @Override
    public Todo updatetodo(Todo todo) {
        return todoDao.save(todo);
    }

    @Override
    public void deletetodo(Long Id) {
     Todo eeny= todoDao.getOne(Id);
     todoDao.delete(eeny);
    }
}
