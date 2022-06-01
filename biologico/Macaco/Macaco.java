package biologico.Macaco;

import java.util.*;

public class Macaco implements metodosMacacos {


    protected String nome;
    protected String dieta = "Herbívaro";
    protected List<String> bucho;
    

    // Construtor

    public Macaco(String nome){
        this.nome = nome;
        this.bucho = new ArrayList<String>();
    }

    // GETTS e SETTS


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Metodos
    @Override
    public void comer(String comida){
        bucho.add(comida);
    }

    @Override
    public void comer(Macaco cMacaco){
        bucho.add(cMacaco.getNome());
        System.out.printf("Você devorou %s, ele era um companheiro de espécie.%nVocê desbloqueou o ramo Canibalismo.%n", cMacaco.getNome());
        dieta = "Canibal";
    }

    @Override
    public void digerir() {
        if(!bucho.isEmpty()){
            bucho.remove(0);
        } else {
            System.out.printf("Não tem oque digerir.");
        }

    }

    @Override
    public void digerir(String comida){
        if(!bucho.isEmpty()){
            if(bucho.contains(comida)){
                bucho.remove(comida);
            } else {
                System.out.printf("%s não comeu %s.", this.getNome(), comida);
            }
        }
    }

    @Override
    public void verBucho() {

        System.out.printf("<-----------------> BUCHO %s <----------------->%n", this.getNome().toUpperCase());
        System.out.println("__________________\nID  |  ALIMENTO |\n__________________");
        if(!bucho.isEmpty()){
            for(int i = 0; i < bucho.size(); i++){
                if(i == bucho.size() - 1){
                    System.out.printf("%d   |%9s  |%n", i, bucho.get(i));
                } else {
                    System.out.printf("%d   |%9s  |%n", i, bucho.get(i));
                }
            }
        }
        else {
            System.out.printf("%s esta de bucho vazio.", this.getNome());
        }
        System.out.println("<-----------------> BUCHO <----------------->");
    }

    public void statusMacaco(){


        System.out.printf("<-----------------> MACACO %s <----------------->%n", this.getNome().toUpperCase());

        System.out.printf("Nome do espécie: %s%n", this.nome);
        System.out.printf("Refeições para digerir: %d%n", bucho.size());
        System.out.printf("Dieta: %s%n", this.dieta);

        System.out.println("<-----------------> MACACO <----------------->");


    }

}
