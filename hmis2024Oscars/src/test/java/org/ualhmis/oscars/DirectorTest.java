package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class DirectorTest {

    @Test
    void testConstructor() {
        Director director = new Director("James Cameron", "M", "2000-01-01");
        assertNotNull(director);
    }

}

