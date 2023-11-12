package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanTest {

    @Test
    void parseTest() {
        Human human1 = new Human(new String [] {"28281", "Aahan", "Male", "15.05.1970", "I", "4800"});
        Human human2 = new Human(28281,
                "Aahan",
                "Male",
                "15.05.1970",
                new Division('I'),
                4800);

        Assertions.assertEquals(human1, human2);
    }
}
