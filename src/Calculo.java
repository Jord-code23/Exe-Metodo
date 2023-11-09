public class Calculo {
    private double celsius ;

    public Calculo (double celsius){
        this.celsius = celsius;
    }

    public double celsiusParafah() {
        return celsius * 1.8 + 32;
    }
    public double celsiusParaKel() {
        return celsius + 273.15;
    }
    public double celsiusParaReamur() {
        return celsius * 0.8;
    }

    public double celsiusParaRankine() {
        return celsius * 1.8 + 32 + 459.67;
    }
}
