package br.com.schoolar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "disciplina")
public class Disciplina {

    @Id
    private String nome;
    private String id;
}
