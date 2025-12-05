package com.github.calebgg.gymbook_backend.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Sets")
public class Sets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long setId;

    @ManyToOne
    @JoinColumn(name = "workoutExerciseId")
    private WorkoutExercises workoutExercises;

    @Column(name = "setNumber")
    private int setNumber;

    @Column(name = "reps")
    private int reps;

    @Column(name = "weight")
    private double weight;

    @Column(name = "date")
    private OffsetDateTime date;
}
