public class Veiculo {
	private int Peso;
	private int VelocMax;
	private float Preco;
	
	public Veiculo() {
		this.Peso = 0;
		this.VelocMax = 0;
		this.Preco = 0;	
	}
	public Veiculo(int peso, int velocMax, float preco) {
		this.Peso = peso;
		this.VelocMax = velocMax;
		this.Preco = preco;
	}
	public void set(int Peso, int VelocMax, float Preco) {
		this.Peso = Peso;
		this.VelocMax = VelocMax;
		this.Preco = Preco;
	}
	public void print() {
        System.out.println("Peso do carro: " + Peso );
        System.out.println("Velocidade Máxima: " + VelocMax);
        System.out.println("Preço do carro: " + Preco);
    }

}
