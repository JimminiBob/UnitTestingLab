package com.sparta.jn.UnitTestingLab;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class Classification_Tests {
    @Test
    @DisplayName("Given that someone is **under 12** return U, PG and 12 films are available")
    void givenAgeIsUnder12ReturnUPG12() {
        Assertions.assertEquals(11, "U, PG & 12 films are available.");
    }

    @Test
    @DisplayName("Given that someone is **under 15** return U, PG and 12 films are available")
    void givenAgeIsUnder15ReturnUPG1215() {
        Assertions.assertEquals(14, "U, PG, 12 & 15 films are available.");
    }

}
