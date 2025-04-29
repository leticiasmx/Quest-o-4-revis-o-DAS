public class Caminhao extends Veiculo {
    private Motor motor;  // Composição (não herança)
    private double toneladasCargaMax;
    private int alturaMax;
    private int comprimento;

    // Construtor padrão (inicializa com zeros)
    public Caminhao() {
        super();  // Chama construtor padrão de Veiculo
        this.motor = new Motor();
        this.toneladasCargaMax = 0.0;
        this.alturaMax = 0;
        this.comprimento = 0;
    }

    // Construtor completo
    public Caminhao(int Peso, int VelocMax, float Preco,
                    int numCilindros, int potencia,
                    double toneladasCargaMax, int alturaMax, int comprimento) {
        super(Peso, VelocMax, Preco);  // Herda de Veiculo
        this.motor = new Motor(numCilindros, potencia);
        this.toneladasCargaMax = toneladasCargaMax;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    // Setters (encapsulamento)
    public void set(int Peso, int VelocMax, float Preco,
                   int numCilindros, int potencia,
                   double toneladasCargaMax, int alturaMax, int comprimento) {
        super.set(Peso, VelocMax, Preco);  // Atualiza Veiculo
        motor.set(numCilindros, potencia); // Atualiza Motor
        this.toneladasCargaMax = toneladasCargaMax;
        this.alturaMax = alturaMax;
        this.comprimento = comprimento;
    }

    // Getters
    public double getToneladasCargaMax() {
        return toneladasCargaMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    // Print
    @Override
    public void print() {
        System.out.println("=== Dados do Caminhão ===");
        super.print();  // Atributos de Veiculo
        motor.print();  // Atributos de Motor
        System.out.println("Carga Máxima (ton): " + toneladasCargaMax);
        System.out.println("Altura Máxima (cm): " + alturaMax);
        System.out.println("Comprimento (cm): " + comprimento);
    }
}
