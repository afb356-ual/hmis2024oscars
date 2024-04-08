package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

class PeliculaTest {

    @Test
    void testConstructor() {
        Director director = new Director("James Cameron", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);
        assertNotNull(pelicula);
    }

    @Test
    void testActoresSecundarios() {
        Director director = new Director("James Cameron", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);

        Actor actor = new Actor("Chris Hemsworth", "M", "1980-01-01");
        pelicula.addActorSecundario(actor);

        List<Actor> actoresSecundarios = pelicula.getActoresSecundarios();
        assertEquals(1, actoresSecundarios.size());
        assertEquals("Chris Hemsworth", actoresSecundarios.get(0).getNombre());
    }

    @Test
    void testActricesSecundarias() {
        Director director = new Director("James Cameron", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);

        Actriz actriz = new Actriz("Jennifer Lawrence", "F", "1980-01-01");
        pelicula.addActrizSecundaria(actriz);

        List<Actriz> actricesSecundarias = pelicula.getActricesSecundarias();
        assertEquals(1, actricesSecundarias.size());
        assertEquals("Jennifer Lawrence", actricesSecundarias.get(0).getNombre());
    }

    @Test
    void testGetTitulo() {
        Director director = new Director("Director", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);
        assertEquals("Nemo", pelicula.getTitulo());
    }

    @Test
    void testGetDirector() {
        Director director = new Director("James Cameron", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);
        assertEquals(director, pelicula.getDirector());
    }

    @Test
    void testGetActorProtagonista() {
        Director director = new Director("Director", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);
        Actor actor = new Actor("Chris Hemsworth", "M", "1980-01-01");
        pelicula.setActorProtagonista(actor);
        assertEquals(actor, pelicula.getActorProtagonista());
    }

    @Test
    void testGetActrizProtagonista() {
        Director director = new Director("James Cameron", "M", "1970-01-01");
        Pelicula pelicula = new Pelicula("Nemo", director);
        Actriz actriz = new Actriz("Jennifer Lawrence", "F", "1980-01-01");
        pelicula.setActrizProtagonista(actriz);
        assertEquals(actriz, pelicula.getActrizProtagonista());
    }

}

