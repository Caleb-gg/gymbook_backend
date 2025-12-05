package com.github.calebgg.gymbook_backend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Exercises")
public class Exercises {
    @Id
    @Column(name = "exerciseID" )
    private UUID exerciseID;

    @Column(name = "exerciseName")
    private String name;

    @Column(name = "bodyPart")
    private String bodyPart;

    @Column(name = "imageUrl")
    private String imageUrl;
}
