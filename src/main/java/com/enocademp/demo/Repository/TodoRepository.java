package com.enocademp.demo.Repository;

import com.enocademp.demo.Model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
}
