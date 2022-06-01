package classe.nfilho.administracaoPessoal.banco;

public class testeContas {

    public static void main(String[] args){


        Cliente jose = new Cliente();

        jose.setNome("José");

        Conta cc = new ContaCorrente(jose);
        cc.depositar(1450);

        cc.imprimirExtrato();

        cc.alterarCliente("norton");

        cc.imprimirExtrato();



    }
}
