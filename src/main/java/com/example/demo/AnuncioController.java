package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/views/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioServiceImpl anuncioService;

    @GetMapping("/")
    public String listarAnuncios(Model model){
        List<Anuncio> listadoAnuncios = anuncioService.listarAnuncios();
        model.addAttribute("producto", "Lista de Anuncios");
        model.addAttribute("anuncios", listadoAnuncios);
        return "/views/anuncios/listar";

    }

    @GetMapping("/createanuncio")
    public String crear(Model model){
        Anuncio anuncio = new Anuncio();
        model.addAttribute("producto", "Formulario: Nuevo anuncio");
        model.addAttribute("anuncio", anuncio);

        return "views/anuncios/create";
    }
   @GetMapping("/buscar/{id}")
   public String buscar(@PathVariable("id") Long idAnuncio){
    anuncioService.buscarAnuncioPorId(idAnuncio);
    return "/anuncio/{id}";
    }








}
