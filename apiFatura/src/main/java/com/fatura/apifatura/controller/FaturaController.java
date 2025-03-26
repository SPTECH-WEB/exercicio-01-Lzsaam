package com.fatura.apifatura.controller;


import com.fatura.apifatura.model.Fatura;
import com.fatura.apifatura.repository.FaturaRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
private final FaturaRepository faturaRepository;

    public FaturaController(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    @GetMapping
    public List<Fatura> listarFaturas(){
        return faturaRepository.findAll();
    }

    @PostMapping
    public Fatura criarFatura(@Valid @RequestBody Fatura fatura){
        return faturaRepository.save(fatura);
    }


}
