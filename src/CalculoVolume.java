public class CalculoVolume {
   private double raio;

   private double altura;

   public CalculoVolume (double raio, double altura){
       this.raio = raio;
       this.altura = altura;
   }

    public double volume_lata(){
       return 3.14159*raio*raio*altura;
   }
}
