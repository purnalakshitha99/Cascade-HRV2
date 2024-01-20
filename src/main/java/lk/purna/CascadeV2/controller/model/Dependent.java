package lk.purna.CascadeV2.controller.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "dependents")
@Data
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Employee employee;
}
