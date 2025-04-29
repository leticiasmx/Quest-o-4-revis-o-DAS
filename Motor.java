public class Motor {
    private int numCilindros;
    private int potencia;

    // Construtor padrão (inicializa com zeros)
    public Motor() {
        this.numCilindros = 0;
        this.potencia = 0;
    }

    // Construtor com argumentos
    public Motor(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    // Método Set() para entrada de dados (SRP: encapsula a lógica de atribuição)
    public void set(int numCilindros, int potencia) {
        this.numCilindros = numCilindros;
        this.potencia = potencia;
    }

    // Método Print() (SRP: só exibe dados)
    public void print() {
        System.out.println("Número de cilindros: " + numCilindros);
        System.out.println("Potência: " + potencia + " HP");
    }
}