package Q2;

public class Temperature {

    private double celsius;

    // --- CONSTRUCTOR 1: No-Arg Constructor ---
    public Temperature() {
        celsius = 0.0;
    }

    // --- CONSTRUCTOR 2: Parameterized Constructor ---
    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    // --- GETTER METHOD 1: toCelsius ---
    public double toCelsius() {
        return celsius;
    }

    // --- GETTER METHOD 2: toFahrenheit ---
    public double toFahrenheit() {
        return celsius * 9.0 / 5.0 + 32.0;
    }

    // --- SETTER METHOD 1: setCelsius ---
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // --- SETTER METHOD 2: setFahrenheit ---
    public void setFahrenheit(double fahrenheit) {
        this.celsius = (fahrenheit - 32 ) * 5.0 / 9.0;
    }
}
