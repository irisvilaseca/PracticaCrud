package com.example.demo;

import java.util.List;

public interface IAnuncioService {
    public List<Anuncio>listarAnuncios();

    public Anuncio buscarAnuncioPorId(Long id);
}
