package eletronicos.bichinhoVirtual;

public class Tamagushi implements metodosTamagushi{

    protected String nome;
    protected int fome;
    protected int saude;
    protected int idadeTamagushi = 0;

    // Construtor

    public Tamagushi(String nome){
        this.fome = 100;
        this.saude = 30;
        this.idadeTamagushi = 0;
        this.nome = nome;
        humor();
    }

    // Metodos tamagushi

    @Override
    public String alterarNome(String novoNome) {
        this.nome = novoNome;
        return novoNome;
    }

    @Override
    public int fome(int sacies) {
        this.fome = sacies;
        return fome;
    }

    @Override
    public int saude() {
        this.saude = saude;
        return saude;
    }

    @Override
    public int idadeTamagushi() {
        return idadeTamagushi++;
    }

    @Override
    public int humor() {
        int humor = (this.fome + this.saude) / 2;
        return humor;
    }

    @Override
    public void status() {

        System.out.println("<=====> TAMAGUSHI <=====>");
        System.out.printf("Tamagushi: %s%n", this.nome);
        System.out.printf("Idade: %d%n", this.idadeTamagushi);
        System.out.printf("Saude: %d%n", this.saude);
        System.out.printf("Fome: %d%n", this.fome);
        System.out.printf("Humor: %d%n", humor());
    }
}
