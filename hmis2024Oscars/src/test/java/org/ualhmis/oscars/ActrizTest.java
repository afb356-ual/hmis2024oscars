package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ActrizTest {

    @Test
    void testConstructor() {
        Actriz actriz = new Actriz("Nombre", "F", "2000-01-01");
        assertNotNull(actriz);
    }

}


