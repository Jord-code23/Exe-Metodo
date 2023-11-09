public class QuantidadeAzulejos {
    private double hp;

    private double lp;

    private double ha;

    private double la;

    public QuantidadeAzulejos(double hp, double lp, double ha, double la ){
        this.hp = hp;
        this.lp = lp;
        this.ha = ha;
        this.la = la;
    }

    public double calculo_azul (){
        return (hp * lp) / (ha * la);
    }
}
