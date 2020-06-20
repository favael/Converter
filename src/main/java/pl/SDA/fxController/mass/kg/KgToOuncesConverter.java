package pl.SDA.fxController.mass.kg;

public class KgToOuncesConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * 35.274;
    }
}
