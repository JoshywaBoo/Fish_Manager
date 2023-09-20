package model;

import java.util.ArrayList;
import java.util.List;

public class FishManager {
    //Creates an empty list of the <"X"> instances
    List<Fish> fishList;
    List<Double> temperatureList;
    List<Double> waterLevelList;
    List<Double> oxygenLevelList;

    double temperature;
    double waterLevel;
    double oxygenLevel;

    //Constructor
    public FishManager(){
        this.fishList = new ArrayList<Fish>(); //'new List<Fish>()' is an empty list containing ONLY type 'Fish'
        this.temperatureList = new ArrayList<Double>();
        this.waterLevelList = new ArrayList<Double>();
        this.oxygenLevelList = new ArrayList<Double>();
        this.temperature = 0;
        this.waterLevel = 0;
        this.oxygenLevel = 0;
    }

    //Receiving data and appending to the respective lists
    private void receiveData(double temperature, double waterLevel, double oxygenLevel){
        this.temperatureList.add(temperature);
        this.waterLevelList.add(waterLevel);
        this.oxygenLevelList.add(oxygenLevel);
    }

}
