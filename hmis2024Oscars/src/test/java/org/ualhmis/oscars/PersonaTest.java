package org.ualhmis.oscars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonaTest {

    @Test
    public void testGetNombre() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertEquals("Ayoub", persona.getNombre());
    }

    @Test
    public void testGetSexo() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertEquals("Masculino", persona.getSexo());
    }

    @Test
    public void testGetFechaNacimiento() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertEquals("01-01-2002", persona.getFechaNacimiento());
    }

    @Test
    public void testEquals_MNismoObjeto() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertTrue(persona.equals(persona));
    }

    @Test
    public void testEquals_ObjetoNulo() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertFalse(persona.equals(null));
    }

    @Test
    public void testEquals_DiferenteCalse() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertFalse(persona.equals("Not a Persona object"));
    }

    @Test
    public void testEquals_mismosAtrobutos() {
        Persona persona1 = new Persona("Ayoub", "Masculino", "01-01-2002");
        Persona persona2 = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertTrue(persona1.equals(persona2));
    }

    @Test
    public void testEquals_atributosDiferentes() {
        Persona persona1 = new Persona("Ayoub", "Masculino", "01-01-2002");
        Persona persona2 = new Persona("Victor", "Femenino", "02-02-2002");
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_nulo() {
        Persona persona1 = new Persona(null, null, null);
        Persona persona2 = new Persona(null, null, null);
        assertTrue(persona1.equals(persona2));
    }

    @Test
    public void testEquals_Nombre() {
        Persona persona1 = new Persona("Ayoub", null, null);
        Persona persona2 = new Persona("Victor", null, null);
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_DifferentSexo() {
        Persona persona1 = new Persona(null, "Masculino", null);
        Persona persona2 = new Persona(null, "Femenino", null);
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_FechaNacimiento() {
        Persona persona1 = new Persona(null, null, "01-01-2002");
        Persona persona2 = new Persona(null, null, "02-02-1990");
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_NullFechaNacimiento() {
        Persona persona1 = new Persona("Ayoub", "Masculino", null);
        Persona persona2 = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_NullNombre() {
        Persona persona1 = new Persona(null, "Masculino", "01-01-2002");
        Persona persona2 = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testEquals_NullSexo() {
        Persona persona1 = new Persona("Ayoub", null, "01-01-2002");
        Persona persona2 = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertFalse(persona1.equals(persona2));
    }

    @Test
    public void testHashCode_SameObject() {
        Persona persona = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertEquals(persona.hashCode(), persona.hashCode());
    }

    @Test
    public void testHashCode_EqualsObjects() {
        Persona persona1 = new Persona("Ayoub", "Masculino", "01-01-2002");
        Persona persona2 = new Persona("Ayoub", "Masculino", "01-01-2002");
        assertEquals(persona1.hashCode(), persona2.hashCode());
    }


    @Test
    public void testHashCode_nulos() {
        Persona persona = new Persona(null, null, null);
        assertEquals(29791, persona.hashCode());
    }
}

