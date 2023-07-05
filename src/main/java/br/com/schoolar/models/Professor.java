package br.com.schoolar.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "professor")
public class Professor {

    @Id
    private String materia;
    private String nome;
    private String idadedenascimento;
    private String endereco;
    private String email;
    private String telefone;
    private String especializacao;
    private String formacaoacademica;
    private String disciplinaslecionadas;
    private String saladeaula;
    private String horariodetrabalho;


}
