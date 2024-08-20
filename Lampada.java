class Lampada {
	public String 	marca;
    public double 	voltagem;
    public String 	tipo;
    public String 	modelo;
    public String 	cor;
    public double 	preco;
    public int 		garantia;
	public boolean	ligada;
	
	
	public Lampada(	String marca, 
					double voltagem,
					String tipo,
					String modelo,
					String cor,
					double preco,
					int garantia,
					boolean	ligada) {
						this.marca = marca;
						this.voltagem = voltagem;
						this.tipo = tipo;
						this.modelo = modelo;
						this.cor = cor;
						this.preco = preco;
						this.garantia = garantia;
						this.ligada = ligada;
					}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void exibirStatus() {
		if (ligada) {
			System.out.println("Lâmpada ligada!");
		} else {
			System.out.println("Lâmpada desligada!");
		}
	}
	
	public void mudarStatus() {
			ligada = !ligada;
			System.out.println("Novo Status: ");
			exibirStatus();
	}
}

class Principal {
	public static void main(String[] args) {
		
		Lampada lamp	= new Lampada(	"General Electric",
										127.0,
										"Incandescente",
										"Bulbo de vidro",
										"Amarela",
										15.60,
										2,
										true);
		
		System.out.println("Marca: " 		+ lamp.marca 	 +
						   " | Voltagem: "	+ lamp.voltagem +
						   " | Tipo: " 		+ lamp.tipo 	 +
						   " | Modelo: " 		+ lamp.modelo 	 +
						   " | Cor: "			+ lamp.cor 	 +
						   " | Preço: "		+ lamp.preco 	 +
						   " | Garantia: "	+ lamp.garantia);
		
		lamp.exibirStatus();
		lamp.mudarStatus();
	}
}