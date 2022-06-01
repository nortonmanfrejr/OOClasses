package classe.nfilho.figurasGeometrica;

/**
 *
 * Classe Bola: Crie uma classe que modele uma bola:
 *
 * Atributos: Cor, circunferência, material
 * Métodos: trocaCor e mostraCor
 *
 * */


public class Bola extends FigurasGeometricas{

    private double circunferencia;


    // Construtor bola
    public Bola(String cor, String material, double circunferencia) {
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }


    // Getters and Setters


    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    // Metodos especiais da classe
    public void mostraBola(){
        System.out.println("<=========> BOLA <=========>");

        atributoBase();
        System.out.println("Circunferencia: " + circunferencia);

        System.out.println("<=========> BOLA <=========>");
    }

}
