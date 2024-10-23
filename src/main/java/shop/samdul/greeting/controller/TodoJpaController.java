package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import shop.samdul.greeting.service.TodoService;
import shop.samdul.greeting.entity.TodoEntity;

import java.util.List;

@RestController
@RequestMapping("/jpatodos")
public class TodoJpaController{

    private final TodoJpaService todojpaService;

    @Autowired
    public TodoJpaController(TodoJpaService todoJpaService) {
        this.todojpaService = todoJpaService;
    }

    @GetMapping
    public List<TodoEntity> list() {
        return todoJpaService.getAllTodos();
    }

    @GetMapping("/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity r = todoJpaService.getTodoById(id);
        return r;
    }

    //C - INSERT
    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todoEntity) {
        return todoJpaService.createTodo(todoEntity);
    }

    //U - UPDATE
    @PutMapping("/{id}")
    public void updateTodo(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        todoJpaService.updateTodo(id, todoEntity);
    }

    //D - DELTE
    @DeleteMapping("/{id}")
    public void updateTodo(@PathVariable Integer id) {
        todoJpaService.deleteTodoById(id);
    }
}