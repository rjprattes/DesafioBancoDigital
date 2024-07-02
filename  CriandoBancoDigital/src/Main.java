
public class Main {

	public static void main(String[] args) {
		Cliente rogeres = new Cliente();
		rogeres.setNome("Rogeres");
		
		Conta cc = new ContaCorrente(rogeres);
		Conta poupanca = new ContaPoupanca(rogeres);

		cc.depositar(500);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}