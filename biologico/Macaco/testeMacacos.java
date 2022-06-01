package biologico.Macaco;

public class testeMacacos {

    public static void main(String[] args){

        Macaco mc1 = new Macaco("Cesar");
        Macaco mc2 = new Macaco("Everton");

        mc1.comer("Maça");
        mc1.comer("Avestruz");
        mc1.comer("chocolate");
        mc1.comer(mc2);
        mc1.verBucho();

        mc1.statusMacaco();
    }
}
