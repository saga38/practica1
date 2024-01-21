package Observer;

public class WeatherWarning implements Observador{
    private final int threshold;

    public WeatherWarning(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(int temperature) {
        if (temperature > threshold) {
            System.out.println("¡Alerta meteorológica! La temperatura ha superado el umbral de " + threshold + " grados Celsius");
        }
    }
}
