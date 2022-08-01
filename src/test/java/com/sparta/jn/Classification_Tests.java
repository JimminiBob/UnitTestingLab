package com.sparta.jn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Classification_Tests {
    @Test
    @DisplayName("Given that someone is **under 12** return U, PG and 12 films are available")
    void givenAgeIsUnder12ReturnUPG12() {
        Assertions.assertEquals("U, PG & 12 films are available."
                , FilmClassifications.availableClassifications(11));
    }

    @Test
    @DisplayName("Given that someone is **under 15** return U, PG and 12 films are available")
    void givenAgeIsUnder15ReturnUPG1215() {
        Assertions.assertEquals("U, PG, 12 & 15 films are available."
                , FilmClassifications.availableClassifications(14));
    }

}
