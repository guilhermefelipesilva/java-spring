package com.guireis.cursomc.service;

import java.util.Optional;

import com.guireis.cursomc.domain.Categoria;
import com.guireis.cursomc.repositories.CategoriaRepository;
import com.guireis.cursomc.service.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado id: " + id + ", tipo: " + Categoria.class.getName()));
    }
}
