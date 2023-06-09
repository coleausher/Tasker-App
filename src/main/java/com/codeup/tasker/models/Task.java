package com.codeup.tasker.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 60)
    private String taskTitle;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}

