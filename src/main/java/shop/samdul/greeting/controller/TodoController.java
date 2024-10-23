package shop.samdul.greeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.service.TodoService;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/list")
    public List<TodoEntity> list() {
            System.out.println("[Controller]");
            List<TodoEntity> r = todoService.getTodos();
            return r;
    }

    @GetMapping("/todos/{id}")
    public TodoEntity find(@PathVariable Integer id) {
        TodoEntity r = todoService.findById(id);
        return r;
    }
}
