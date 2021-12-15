
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		luizAdolfo.setNome("Luiz Adolfo");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(200);
		cc.transferir(200, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
