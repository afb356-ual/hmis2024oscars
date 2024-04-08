package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

class PremioTest {

    @Test
    void testConstructor() {
        Premio premio = new Premio("Premio");
        assertNotNull(premio);
    }

    @Test
    void testNominadas() {
        Premio premio = new Premio("Premio");

        Director director = new Director("Director", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Título", director);
        premio.addNominada(pelicula);

        List<Pelicula> nominadas = premio.getNominadas();
        assertEquals(1, nominadas.size());
        assertEquals("Título", nominadas.get(0).getTitulo());
    }
    
    @Test
    void testGetNombre() {
        Premio premio = new Premio("Ayoub");
        assertEquals("Ayoub", premio.getNombre());
    }
    
    @Test
    void testGanadora() {
        Premio premio = new Premio("Premio");

        Director director = new Director("Director", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Título", director);
        premio.setGanadora(pelicula);

        assertEquals("Título", premio.getGanadora().getTitulo());
    }

}

