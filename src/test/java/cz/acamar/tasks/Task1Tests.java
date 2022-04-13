package cz.acamar.tasks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Tests {

    private Task1 task1 = new Task1();

    @ParameterizedTest
    @MethodSource("stringsAndLastWordLength")
    void test_lastWordLength(String str, int lastWordLength) {
        assertEquals(lastWordLength, task1.lengthOfLastWord(str));
    }

    private static Stream<Arguments> stringsAndLastWordLength() {
        return Stream.of(
                Arguments.of("Hello world", 5),
                Arguments.of("   fly me   to   the moon  ", 4),
                Arguments.of("William Shakespeare was an English   playwright", 10),
                Arguments.of("", 0),
                Arguments.of(" ", 0),
                Arguments.of(" hi \n world", 5),
                Arguments.of(" hi \n world2022", 9),
                Arguments.of(" hi \n world 2022", 4),
                Arguments.of(null, 0),
                Arguments.of("!@#$%^&**()-=+", 0),
                Arguments.of("also the_word", 8)
        );
    }
}
