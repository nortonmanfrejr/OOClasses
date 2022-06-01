package eletronicos.Televisao;

public class Televisao implements metodosTelevisao{


    protected int canais;
    protected boolean atividade = false;
    protected int volume = 0;
    protected String marca;
    // Construtor

    public Televisao(String marca){
        this.marca = marca;
        this.canais = 10;
        this.volume = 30;
        this.atividade = isAtividade();
    }

    // getts e setts


    public String getMarca() {
        return marca;
    }

    public int getCanais() {
        return canais;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isAtividade() {
        return atividade;
    }
    // Metodos especiais da classe


    @Override
    public void aumentarVolume(int volume) {
        if(volume > 100){
            System.out.println("Limite maximo de audio atingido");
        } else {
            this.volume = volume++;
        }
    }

    @Override
    public void abaixarVolume(int volume) {
        if(volume < 0){
            System.out.println("Limite minimo de audio atingido");
        } else {
            this.volume = volume--;
        }
    }

    @Override
    public void mudarCanal(int canal) {
        this.canais = canal;

    }

    @Override
    public void power() {
        if(atividade == true){
            atividade = false;
        } else {
            atividade = true;
        }
    }

    @Override
    public void imprimirControle() {
        System.out.println("Ligar e Desligar = power();");
        System.out.println("Mudar de Canal = mudarCanal();");
        System.out.println("Aumentar Volume = aumentarVolume();");
        System.out.println("Abaixar Volume = abaixarVolume();");
    }

    @Override
    public void statusTelevisao() {

        System.out.println("=====\n\n\n=====");
        System.out.printf("Marca Televisão: %s%n", this.getMarca());
        System.out.printf("Canal: %d%n", this.getCanais());
        System.out.printf("Volume: %d%n", this.getVolume());
        if(atividade == false) {
            System.out.println("Status: Desligada");
        } else {
            System.out.println("Status: Ligada");
        }
        System.out.println("=====\n\n\n=====");
    }

}
