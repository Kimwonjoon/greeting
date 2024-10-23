package shop.samdul.greeting.entity;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import jakarta.persistence.*;

@Entity
@Table(name = "todo_jpa")
@Setter
@Getter
@ToString
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // key 값이라는 뜻
    private Integer id;
    @Column(nullable = false)
    private String subject;
    @Column(nullable = false)
    private String body;
    private Boolean completed;
}