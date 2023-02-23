package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "Valid value, 5, 5",
            "Boundary value, -1, 0",
            "Boundary value, 0, 0",
            "Boundary value, 1, 1",
            "Boundary value, 8, 8",
            "Boundary value, 9, 9",
            "Boundary value, 10, 0",
            "Invalid value, 18, 0",
            "Invalid value, -9, 0"

    })
    public void setCurrentStation(String nameTest, int currentStation, int expectedStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }


    @ParameterizedTest
    @CsvSource({
            "Valid value, 5, 6",
            "Boundary value, 0, 1",
            "Boundary value, 1, 2",
            "Boundary value, 8, 9",
            "Boundary value, 9, 0",

    })

    public void setNextStation(String nameTest, int currentStation, int expectedStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }

    @ParameterizedTest
    @CsvSource({
            "Valid value, 5, 4",
            "Boundary value, 0, 9",
            "Boundary value, 1, 0",
            "Boundary value, 8, 7",
            "Boundary value, 9, 8",
    })
    public void setPrevStation(String nameTest, int currentStation, int expectedStation) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        Assertions.assertEquals(radio.getCurrentStation(), expectedStation);
    }

    @ParameterizedTest
    @CsvSource({
            "Valid value, 5, 6",
            "Boundary value, 0, 1",
            "Boundary value, 1, 2",
            "Boundary value, 9, 10",
            "Boundary value, 10, 10",

    })

    public void setIncreaseVolume(String nameTest, int currentVolume, int expectedVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseVolume();
        Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
    }

    @ParameterizedTest
    @CsvSource({
            "Valid value, 5, 4",
            "Boundary value, 0, 0",
            "Boundary value, 1, 0",
            "Boundary value, 10, 9",
            "Boundary value, 9, 8",
    })
    public void setDecreaseVolume(String nameTest, int currentVolume, int expectedVolume) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseVolume();
        Assertions.assertEquals(radio.getCurrentVolume(), expectedVolume);
    }
}
