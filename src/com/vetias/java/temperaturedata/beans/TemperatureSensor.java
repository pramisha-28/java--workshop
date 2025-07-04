package src.com.vetias.java.temperaturedata.beans;

public class TemperatureSensor implements Sensor {
    private float temperature;
    public TemperatureSensor (float aTemperature) {
        temperature =aTemperature;
    }
    public float getreading(){
        return temperature;

    }

    }



    

