class ContaCorrente {
	public int numero;
	public String nome;
	public double saldo;
	public double limiteEspecial;
	public boolean especial;
	public String banco;
	
	public ContaCorrente(int numero,
						 String nome,
						 double saldo,
						 double limiteEspecial,
						 boolean especial,
						 String banco) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteEspecial = limiteEspecial;
		this.especial = especial;
		this.banco = banco;
	}
	
	public void consultaSaldo() {
		System.out.println("\nSaldo atual: " + this.saldo);
		if(saldo < 0) {
			double chequeEspecial = saldo;
			System.out.println("Seu limite é de R$ " + limiteEspecial);
			//System.out.println("Uso do cheque especial: R$ " + saldo);
			System.out.println("Saldo do cheque especial: R$ " + (limiteEspecial));
		} else {
			System.out.println("Conta com saldo positivo: R$ " + saldo);
		}
	}
	
	public void deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado de R$ " + valor);
			consultaSaldo();
		} else {
			System.out.println("Valor depositado é negativo. Operação cancelada!");
			consultaSaldo();
		}
	}
	
	public boolean saque(double valorSaque) {
		if (saldo >= valorSaque) {
			saldo -= valorSaque;
			System.out.println("Laço 1");
			consultaSaldo();
			return true;
		} else {
			double limite = limiteEspecial + saldo;
			if (limite >= valorSaque) {
				saldo -= valorSaque;
				limiteEspecial += saldo;
				consultaSaldo();
				return true;
			} else {
				System.out.println("Saldo e limite são insuficientes para saque...");
				return false;
			}
			//return false;
		}
	
	}
	
	//String tipo = especial ? "Especial" : "Comum";
	
	public void exibeConta() {
		System.out.println("Banco: " 	+ banco 	+
						   " Número: " 	+ numero	+
						   " Cliente: " + nome		+
						   " Tipo: " 	+ especial	+
						   " Saldo: "	+ saldo		+
						   " Limite: " 	+ limiteEspecial);
	}
	
}

class Principal {
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente(37654,
											 "João da Silva",
											 1500,
											 5000,
											 true,
											 "Banco do Brasil S/A");
		
		c1.consultaSaldo();
		c1.deposito(-1000);
		c1.saque(8000);
		
	}

}