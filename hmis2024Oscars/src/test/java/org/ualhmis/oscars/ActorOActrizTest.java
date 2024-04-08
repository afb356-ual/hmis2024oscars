package org.ualhmis.oscars;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class ActorOActrizTest {

    @Test
    void testConstructor() {
        ActorOActriz actorOActriz = new ActorOActriz("Nombre", "M", "2000-01-01");
        assertNotNull(actorOActriz);
    }

}

