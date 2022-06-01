package classe.nfilho.figurasGeometrica;


public abstract class FigurasGeometricas implements Metodos{

    protected String cor;
    protected String material;



    // Construtor

    public FigurasGeometricas(){
        this.cor = cor;
        this.material = material;
    }
    // Getters e Setters

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor(){
        return cor;
    }

    public String getMaterial(){
        return material;
    }


    // Metodos

    public void trocaCor(String cor){
        this.cor = cor;
    }


    @Override
    public void mudarCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mudarMaterial(String material) {
        this.material = material;
    }


    @Override
    public void atributoBase() {
        System.out.println("Material: " + getMaterial());
        System.out.println("Cor: " + getCor());
    }
}
