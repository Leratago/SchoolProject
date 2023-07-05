package br.com.schoolar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
public class Aluno {

    @Id
    private String matricula;
    private String nome;
    private String endereco;
    private String turma;
    private String cpf;
    private String idade;



}
