package com.enocademp.demo.Controller;

import com.enocademp.demo.Model.Todo;
import com.enocademp.demo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/todo")
    List<Todo> all(){
        return todoService.GetAllTodos();
    }
    @GetMapping("/todo/{id}")
    Optional<Todo> GetTodoById(@PathVariable("id") Integer Id){
        return todoService.GetTodoById(Id);
    }
    @PostMapping("/todo")
    Todo Save(@RequestBody Todo todo){
        return todoService.Save(todo);
    }
    @PutMapping("/todo/{id}")
    Optional<Todo> Update(@PathVariable("id") Integer Id,@RequestBody Todo newTodo){
        return todoService.Update(newTodo,Id);
    }
    @DeleteMapping("/todo/{id}")
    void DeleteTodo (@PathVariable("id") Integer Id){
        todoService.DeleteTodo(Id);
    }
}
