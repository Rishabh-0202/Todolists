package com.example.todolists.dao;

import com.example.todolists.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface TodoDao extends JpaRepository<Todo,Long> {
}
