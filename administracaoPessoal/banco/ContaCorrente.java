package classe.nfilho.administracaoPessoal.banco;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("<=====> CONTA CORRENTE <=====>");
        super.extratoConta();
        System.out.println("<=====> CONTA CORRENTE <=====>");
    }

}
