package ru.netology.radioman;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data


public class Radio {
    private int currentStation;
    public int minStation = 0;
    public int maxStation = 9;
    private int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;


    public Radio(int amount) {
        maxStation = amount - 1;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation == currentStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }

    }
    public void prevStation() {
        if (minStation == currentStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }


}
