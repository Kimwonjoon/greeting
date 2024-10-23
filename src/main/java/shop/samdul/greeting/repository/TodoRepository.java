package shop.samdul.greeting.repository;

import shop.samdul.greeting.entity.TodoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
