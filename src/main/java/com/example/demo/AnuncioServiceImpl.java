package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnuncioServiceImpl{
@Autowired
private final AnuncioRepository anuncioRepository;

    public AnuncioServiceImpl(AnuncioRepository anuncioRepository) {
        this.anuncioRepository = anuncioRepository;
    }

    public List<Anuncio> listarAnuncios() {
        return anuncioRepository.findAll();
    }

    public Optional<Anuncio> buscarAnuncioPorId(Long id) {
        return anuncioRepository.findById(id);
    }

    public Anuncio create(Anuncio anuncio){
        return anuncioRepository.save(anuncio);
    }
}
