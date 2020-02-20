public class AcPro implements AirCondition {

    @Override
    public double lowerTemperature(double temperature, double cubature) {

        return temperature - (2 / cubature);
    }

    @Override
    public String toString() {
        return "PRO";
    }
}
