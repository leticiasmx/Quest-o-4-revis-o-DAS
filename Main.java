public class Main {
    public static void main(String[] args) {
        CarroPasseio carro = new CarroPasseio(
            1500, 300, 10000.0f,  // Veiculo (peso, velMax, preco)
            3, 250,                // Motor (cilindros, potencia)
            "Azul Mariho", "Fusion"      // Atributos específicos
        );
        carro.print();
    }
}