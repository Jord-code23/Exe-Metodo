public class QuantidadeCavalos {
    private double massa;

    private double alt;

    private double seg;

    public QuantidadeCavalos(double massa, double alt, double seg){
        this.massa= massa;
        this.alt = alt;
        this.seg = seg;

    }
    public double calculoCavalos(){
        return (massa*alt/seg) / 745.69;
    }
}
