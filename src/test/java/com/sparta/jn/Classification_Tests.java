package com.sparta.jn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Given that someone is **under 12** return U, PG films are available")
    void givenAgeIsUnder12ReturnUandPG() {
        Assertions.assertEquals("U, PG films are available."
                , FilmClassifications.availableClassifications(11));
    }

    @Test
    @DisplayName("Given that someone is **under 15** return U, PG, 12A and 12 films are available")
    void givenAgeIsUnder15ReturnUPG1212A() {
        Assertions.assertEquals("U, PG, 12 & 12A films are available.",
                FilmClassifications.availableClassifications(14));
    }

    @Test
    @DisplayName("Given that someone is **under 18** return U, PG, 12A, 12 and 15 films are available")
    void givenAgeIsUnder18ReturnUPG1212A15() {
        Assertions.assertEquals("U, PG, 12, 12A & 15 films are available.",
                FilmClassifications.availableClassifications(17));
    }

    @Test
    @DisplayName("If someone is **over 18** return All films are available")
    void givenAgeIsOver18ReturnAllFilms() {
        Assertions.assertEquals("All films are available.",
                FilmClassifications.availableClassifications(19));
    }

    //All tests passed

}
