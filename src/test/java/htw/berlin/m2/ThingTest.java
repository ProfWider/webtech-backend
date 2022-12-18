package htw.berlin.m2;

import htw.berlin.Thing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class ThingTest {

        @Test
        void testToString() {
            //Eingabedaten
            String name = "Ding";
            String owner = "wider@htw-berlin.de";
            int price = 99;

            //"System under test" aufsetzen
            Thing thing = new Thing(name, price, owner);
            thing.setId(42L);

            //Erwartetes Ergebnis
            String expected = "Thing{id=42, name='Ding', price=99}";

            //Tatsächliches Ergebnis
            String actual = thing.toString();

            //Vergleich
            assertEquals(expected, actual);
        }
    }


