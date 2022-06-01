package classe.nfilho.figurasGeometrica;



/**
 *
 * Classe Retangulo: Crie uma classe que modele um retangulo:
 *
 * Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
 * Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
 * Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local.
 * Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.
 *
 * */
public class Retangulo extends FigurasGeometricas{

    double ladoA, ladoB;

    // Construtor

    public Retangulo(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    // Getter e Setter

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        ladoB = ladoB;
    }

    // Metodos especiais da classe

    public void area(){
        double area = ladoA * ladoB;
        System.out.println("Área: " + area);
    }

    public void perimetro(){
        double perimetro = Math.pow(ladoA, 2) * Math.pow(ladoB, 2);
        System.out.println("Perimetro: " + perimetro);
    }

    public void mostraRetangulo(){
        System.out.println("<=========> RETANGULO <=========>");

        atributoBase();
        System.out.println("Lado A: " + ladoA);
        System.out.println("Lado B: " + ladoB);
        area();
        perimetro();

        System.out.println("<=========> RETANGULO <=========>");
    }
}
