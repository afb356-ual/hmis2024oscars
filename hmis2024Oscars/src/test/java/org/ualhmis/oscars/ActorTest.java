package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ActorTest {

    @Test
    void testConstructor() {
        Actor actor = new Actor("Nombre", "M", "2000-01-01");
        assertNotNull(actor);
    }

}

