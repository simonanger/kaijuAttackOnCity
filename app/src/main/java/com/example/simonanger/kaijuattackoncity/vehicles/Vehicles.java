package com.example.simonanger.kaijuattackoncity.vehicles;

/**
 * Created by simonanger on 06/09/2017.
 */

public abstract class Vehicles {
    String type;
    int healthValue;

    public Vehicles(String type, int healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }
}
