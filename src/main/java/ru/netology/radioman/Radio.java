package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentStation;
    public int minStation = 0;
    public int maxStation = 9;
    private int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;
    
    public Radio() {
    }

    public Radio(int currentStation, int minStation, int maxStation, int currentVolume, int minVolume, int maxVolume) {
        this.currentStation = currentStation;
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getMinStation() {
        return this.minStation;
    }

    public int getMaxStation() {
        return this.maxStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getMinVolume() {
        return this.minVolume;
    }

    public int getMaxVolume() {
        return this.maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        this.currentStation = currentStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Radio)) {
            return false;
        } else {
            Radio other = (Radio)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getMinStation() != other.getMinStation()) {
                return false;
            } else if (this.getMaxStation() != other.getMaxStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else if (this.getMinVolume() != other.getMinVolume()) {
                return false;
            } else {
                return this.getMaxVolume() == other.getMaxVolume();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getMinStation();
        result = result * 59 + this.getMaxStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getMinVolume();
        result = result * 59 + this.getMaxVolume();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentStation();
        return "Radio(currentStation=" + var10000 + ", minStation=" + this.getMinStation() + ", maxStation=" + this.getMaxStation() + ", currentVolume=" + this.getCurrentVolume() + ", minVolume=" + this.getMinVolume() + ", maxVolume=" + this.getMaxVolume() + ")";
    }



}
