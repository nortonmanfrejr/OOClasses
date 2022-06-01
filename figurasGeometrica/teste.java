package classe.nfilho.figurasGeometrica;

public class teste {

    public static void main(String[] args){

        Bola bola = new Bola("Amarelo", "Madeira", 1.5);
        bola.mostraBola();

        Quadrado quadrado = new Quadrado("-", "-",13);
        quadrado.mostraQuadrado();

        Retangulo retangulo = new Retangulo(2, 3 );
        retangulo.mostraRetangulo();

    }
}
