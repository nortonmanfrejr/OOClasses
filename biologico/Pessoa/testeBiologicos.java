package biologico.Pessoa;

import java.util.*;

public class testeBiologicos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa nfilho = new Pessoa(20, 50, 1.78, "Nicolas");



        boolean vivo = true;

        while(vivo) {
            while (true) {
                System.out.println("Fazer Aniversario? [S/N]");
                String aniversario = sc.next();
                if(aniversario.equalsIgnoreCase("s")) {
                    nfilho.envelhecer();
                    nfilho.emagrecer(2.5);
                } else if (aniversario.equalsIgnoreCase("n")) {
                    System.out.println("Você aproveitou mais tempo do seu ano.");
                    nfilho.engordar(2);
                }

                nfilho.mostraDados();

                if (nfilho.idade == 22) {
                    System.out.println("Você morreu");
                    vivo = false;
                    break;
                }



            }
        }


    }
}
