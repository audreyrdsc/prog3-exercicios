class Contador {
	static int pointer;
	
	public Contador() {
		Contador.pointer++;
	}
	
	public static void exibirContador() {
		System.out.println("Contador: " + pointer);
	}
	
	public static void zerar() {
		Contador.pointer = 0;
	}
	
	public static void incrementar() {
		Contador.pointer++;
	}
	
	public static void decrementar() {
		Contador.pointer--;
	}
	
	

}


class Principal {

        public static void main(String[] args) {

			System.out.println("Início do Contador");
Contador.exibirContador();

            Contador.incrementar();
Contador.exibirContador();

            Contador.zerar();
Contador.exibirContador();

            Contador.incrementar();
            Contador.incrementar();
            Contador.incrementar();
Contador.exibirContador();

            Contador contador1 = new Contador();
Contador.exibirContador();
            Contador contador2 = new Contador();
Contador.exibirContador();
            Contador contador3 = new Contador();
Contador.exibirContador();
			System.out.println("Fim da contagem...");
    }
}