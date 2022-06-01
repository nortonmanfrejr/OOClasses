package biologico.Pessoa;

/**
 *
 * Classe Pessoa: Crie uma classe que modele uma pessoa:
 *
 * Atributos: nome, idade, peso e altura
 * Métodos: Envelhercer, engordar, emagrecer, crescer.
 * Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm.
 *
 * */

public class Pessoa implements metodosBiologicos{

    // Atributos

    protected int idade;
    protected double peso;
    protected double altura;
    protected String nome;

    // Construtor
    public Pessoa(int idade, double peso, double altura, String nome){
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    // Getter e Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //  Metodos especiais Pessoa


    @Override
    public double crescer(){
        return this.altura += 0.05;
    }

    @Override
    public int envelhecer() {
        if(idade < 21){
            crescer();
        }
        return this.idade++ ;
    }

    @Override
    public double emagrecer(double peso) {
        return this.peso -= peso;
    }

    @Override
    public double engordar(double peso) {
        return this.peso += peso;
    }

    public void mostraDados(){
        System.out.println("<=========> " + getNome() + " <=========>");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("<=========> " + getNome() + " <=========>");
    }
}

