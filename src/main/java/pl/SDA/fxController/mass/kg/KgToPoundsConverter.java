package pl.SDA.fxController.mass.kg;

public class KgToPoundsConverter implements Converter {
    @Override
    public double convert(double value) {
        return value * 2.2046;
    }
}
