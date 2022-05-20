package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
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
}
