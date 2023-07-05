package br.com.schoolar.controllers;

import br.com.schoolar.models.Professor;
import br.com.schoolar.repositories.ProfessorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    private final ProfessorRepository professorRepository;

    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping
    public List<Professor> listarProfessor() {
        return professorRepository.findAll();
    }

    @PostMapping
    public Professor criarProfessor(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
}
