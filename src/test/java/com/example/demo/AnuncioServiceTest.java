package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AnuncioServiceTest {
    @Mock
    private AnuncioRepository anuncioRepositoryMock;
    private AnuncioServiceImpl anuncioServiceUnderTest;

    @BeforeEach
    void setUp() {
        anuncioServiceUnderTest = new AnuncioServiceImpl(anuncioRepositoryMock);
    }
    @Test
    void puedoListarTodosLosAnuncios(){
    anuncioServiceUnderTest.listarAnuncios();
    verify(anuncioRepositoryMock).findAll();
    }
   @Test
   void puedoObtenerAnuncioPorId(){
    anuncioServiceUnderTest.buscarAnuncioPorId(1L);
       ArgumentCaptor<Long>anuncioIdArgumentCaptor = ArgumentCaptor.forClass(Long.class);
    verify(anuncioRepositoryMock).findById(anuncioIdArgumentCaptor.capture());
    Long capturedAnuncioId = anuncioIdArgumentCaptor.getValue();
    assertThat(capturedAnuncioId).isEqualTo(1L);
   };
    @Test
    void puedoCrearUnAnuncio(){
    Anuncio anuncio = new Anuncio(

    );
    }
}
