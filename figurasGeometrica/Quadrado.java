package classe.nfilho.figurasGeometrica;


/**
 *
 * Classe Quadrado: Crie uma classe que modele um quadrado:
 *
 * Atributos: Tamanho do lado
 * Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área;
 *
 * */
public class Quadrado extends FigurasGeometricas{

    private double lado;

    // Construtor Quadrado

    public Quadrado(String cor, String material, double lado){
        this.cor = cor;
        this.material = material;
        this.lado = lado;
    }
    // Getter e Setter


    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    // Metodos especiais da classe

    public void alterarLado(double lado){
        this.lado = lado;
    }

    public void mostraQuadrado(){
        System.out.println("<=========> QUADRADO <=========>");

        atributoBase();
        System.out.println("Lados:" + lado);
        areaQuadrado();

        System.out.println("<=========> QUADRADO <=========>");
    }

    private void areaQuadrado(){
        System.out.println("Área = " + (lado * lado));
    }
}
