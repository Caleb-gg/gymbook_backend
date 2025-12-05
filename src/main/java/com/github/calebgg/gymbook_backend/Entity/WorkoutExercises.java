package com.github.calebgg.gymbook_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "WorkoutExercises")
public class WorkoutExercises {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workoutExerciseId;

    @ManyToOne
    @JoinColumn(name = "workoutId")
    private Workouts workouts;

    @ManyToOne
    @JoinColumn(name = "exerciseId" )
    private Exercises exercises;

    @ManyToOne
    @JoinColumn(name = "userExerciseId")
    private UserExercises userExercises;
}
