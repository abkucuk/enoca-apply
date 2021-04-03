package com.enocademp.demo.service;

import com.enocademp.demo.Model.Todo;
import com.enocademp.demo.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public Todo Save(Todo todo){
        return todoRepository.save(todo);
    }
    public List<Todo> GetAllTodos () {
        return (List<Todo>) todoRepository.findAll();
    }

    public Optional<Todo> GetTodoById(Integer Id){
        return todoRepository.findById(Id);
    }

    public Optional<Todo> Update(Todo newTodo, Integer Id){
        return todoRepository.findById(Id).map(todo -> {
            todo.setSubject(newTodo.getSubject());
            todo.setDescription(newTodo.getDescription());
            return todoRepository.save(newTodo);
        });
    }
    public void DeleteTodo(Integer Id){
        todoRepository.deleteById(Id);
    }

}
