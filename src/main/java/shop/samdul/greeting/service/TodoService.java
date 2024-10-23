package shop.samdul.greeting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.samdul.greeting.entity.TodoEntity;
import shop.samdul.greeting.mapper.TodoMapper;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    TodoMapper todoMapper;

    public List<TodoEntity> getTools() {
        System.out.println("[service] findAll");
        List<TodoEntity> todos = todoMapper.findAll();
        System.out.println("[todos]:" + todos.size());
        return todos;
    }
}
