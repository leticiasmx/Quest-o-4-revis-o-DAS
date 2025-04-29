public class CarroPasseio extends Carro {
	private Motor motor;
	private String cor;
	private String modelo;
	
	public CarroPasseio() { 
		super();
		this.motor = new Motor();
		this.cor = " ";
		this.modelo = " ";
		
		}
    public CarroPasseio(int Peso, int VelocMax, float Preco, 
            int numCilindros, int potencia, 
            String cor, String modelo) {
    		super(Peso, VelocMax, Preco);
    		this.motor = new Motor(numCilindros, potencia);
    		this.cor = cor;
    		this.modelo = modelo;
		
	}
    public void set(int peso, int velocMax, float preco, 
            int numCilindros, int potencia, 
            String cor, String modelo) {
    		super.set(peso, velocMax, preco);  // Atualiza atributos de Veiculo
    		motor.set(numCilindros, potencia);  // Atualiza Motor
    		this.cor = cor;
    		this.modelo = modelo;
		
    }
    
    @Override
    public void print() {
        System.out.println("=== Dados do Carro de Passeio ===");
        super.print();  // Mostra atributos de Veiculo
        motor.print();  // Mostra atributos de Motor
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
    }
}
