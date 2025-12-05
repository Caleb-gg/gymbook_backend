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
@Table(name = "UserExercises")
public class UserExercises {
    @Id
    @Column(name = "userExerciseId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userExerciseID;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "exerciseName")
    private String exerciseName;

    @Column(name = "exerciseBodyPart")
    private String exerciseBodyPart;
}
