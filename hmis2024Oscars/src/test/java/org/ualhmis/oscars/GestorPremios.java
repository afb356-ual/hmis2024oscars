package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GestorPremiosTest {

    private GestorPremios gestorPremios;
    private Pelicula pelicula;
    private Director director;

    @BeforeEach
    void setUp() {
        gestorPremios = new GestorPremios();
        director = new Director("Director", "M", "1970-01-01");
        pelicula = new Pelicula("Título", director);
    }

    @Test
    void testCrearPremio() {
        gestorPremios.crearPremio("Mejor Película");
        Map<String, Premio> premios = gestorPremios.getPremios();
        assertTrue(premios.containsKey("Mejor Película"));
        assertNotNull(premios.get("Mejor Película"));
    }

    @Test
    void testNominarPeliculaExistente() {
        gestorPremios.crearPremio("Mejor Película");
        gestorPremios.nominarPelicula("Mejor Película", pelicula);
        Premio premio = gestorPremios.getPremios().get("Mejor Película");
        assertEquals(1, premio.getNominadas().size());
        assertEquals(pelicula, premio.getNominadas().get(0));
    }

    @Test
    void testNominarPeliculaNoExistente() {
        gestorPremios.nominarPelicula("Mejor Película", pelicula);
        assertEquals(0, gestorPremios.getPremios().size());
    }

    @Test
    void testAsignarGanadoraExistente() {
        gestorPremios.crearPremio("Mejor Película");
        gestorPremios.nominarPelicula("Mejor Película", pelicula);
        gestorPremios.asignarGanadora("Mejor Película", pelicula);
        assertEquals(pelicula, gestorPremios.getPremios().get("Mejor Película").getGanadora());
    }

    @Test
    void testAsignarGanadoraNoExistente() {
        gestorPremios.asignarGanadora("Mejor Película", pelicula);
        assertEquals(0, gestorPremios.getPremios().size());
    }
}
