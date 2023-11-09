import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Escolha qual cálculo deseja fazer: 1- Temperatura em Celsius\n 2- Quantidade Azulejos\n 3- Cálculo Volume da Lata\n 4- Calcular massa\n ");
     int escolha = input.nextInt();

      switch (escolha) {
          case 1:
              System.out.println("Insira a temperatura em Celsius para converter em outras unidades de temperatura:\t ");

              double celsius = input.nextDouble();

              Calculo calculo_total = new Calculo(celsius);

              System.out.println("Temperatura em Fahreinheit: " + calculo_total.celsiusParafah() + "°" + "(F)");
              System.out.println("Temperatura em Kelvin: " + calculo_total.celsiusParaKel() + "°" + "(K)");
              System.out.println("Temperatura em Rankine: " + calculo_total.celsiusParaRankine() + "°" + "(Ra)");
              System.out.println("Temperatura em Réamur: " + calculo_total.celsiusParaReamur() + "°" + "(Re)");
              break;

          case 2:
              System.out.print("Digite a altura da parede (hp): ");
              double hp = input.nextDouble();

              System.out.print("Digite a largura da parede (lp): ");
              double lp = input.nextDouble();

              System.out.print("Digite a altura do azulejo (ha): ");
              double ha = input.nextDouble();

              System.out.print("Digite a largura do azulejo (la): ");
              double la = input.nextDouble();

              QuantidadeAzulejos quantidadeAzulejos = new QuantidadeAzulejos(hp, lp, ha, la);

              System.out.println("A quantidade de azulejos necessarios e: " + quantidadeAzulejos.calculo_azul());
              break;

          case 3:
              System.out.println("Calcular o volume de uma lata de óleo.\n");

              System.out.println("Insira o raio(diametro) da lata de óleo: ");
              double raio = input.nextDouble();

              System.out.println("Insira a altura da lata de óleo: ");
              double altura = input.nextDouble();

              CalculoVolume calculoVolume = new CalculoVolume(raio,altura);

              System.out.println("O volume da lata de óleo é: " + calculoVolume.volume_lata());
              break;
          case 4:
              System.out.println("Coloque o valor da massa: ");
              double massa = input.nextDouble();

              System.out.println("Coloque a altura em metros: ");
              double alt = input.nextDouble();

              System.out.println("Digite o tempo em segundos: ");
              double seg = input.nextDouble();

               QuantidadeCavalos cavalos = new QuantidadeCavalos(massa,alt,seg);

              System.out.println("Quantidades de cavalos para levantar a massa é: " + cavalos.calculoCavalos());
      }
 }
}