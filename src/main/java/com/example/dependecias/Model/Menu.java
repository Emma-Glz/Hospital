package com.example.dependecias.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)//nos ayuda a compararlos por el valor y no por su referencia

public class Menu {
    @Id
    @EqualsAndHashCode.Include
    private Integer idMenu;

    @Column(nullable = false,length = 20)
    private String name;

    @Column(nullable = false,length = 30)
    private String url;

    @Column(nullable = false,length = 20)
    private String icono;

}
