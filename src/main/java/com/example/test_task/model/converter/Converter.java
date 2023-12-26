package com.example.test_task.model.converter;

import com.example.test_task.model.user.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class Converter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    private String type;
    private String input;
    private String output;
    private LocalDateTime created;

    public Converter(User user, String type, String input, String output, LocalDateTime created) {
        this.user = user;
        this.type = type;
        this.input = input;
        this.output = output;
        this.created = created;
    }
}
