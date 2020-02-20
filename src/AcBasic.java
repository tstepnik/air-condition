public class AcBasic implements AirCondition {

    @Override
    public double lowerTemperature(double temperature, double cubature) {

        return temperature - (1 / cubature);
    }

    @Override
    public String toString() {
        return "BASIC";
    }
}
