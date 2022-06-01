package eletronicos.Televisao;
;

import classe.nfilho.administracaoPessoal.banco.Conta;
import classe.nfilho.administracaoPessoal.banco.ContaCorrente;

import java.util.Scanner;
public class rodarTelevisao {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        Televisao tv = new Televisao("AOC");

        tv.statusTelevisao();

        while (true) {

            tv.imprimirControle();

            System.out.println("========================");
            String comando = sc.next();

            if(comando.equalsIgnoreCase("power")){
                if(tv.isAtividade() == true) { // Televisão ligada
                    tv.power();
                    System.out.println("TV Ligada");

                }  else {

                    // Televisão desligada
                    tv.power();
                }

                System.out.println("========================");
                tv.mudarCanal(13);
                tv.statusTelevisao();

            }
        }

    }
}
