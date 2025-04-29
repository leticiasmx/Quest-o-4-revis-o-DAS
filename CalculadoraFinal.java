public class CalculadoraFinal {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        
        // Testes da Calculadora Básica
        System.out.println("\n=== Operações Básicas ===");
        System.out.println("5 + 3 = " + calc.somar(5, 3));         
        System.out.println("5 - 3 = " + calc.subtrair(5, 3));      
        System.out.println("5 * 3 = " + calc.multiplicar(5, 3));  
        System.out.println("5 / 3 = " + calc.dividir(5, 3));      
        
        // Testes da Calculadora Científica
        System.out.println("\n=== Operações Científicas ===");
        System.out.println("Raiz quadrada de 25 = " + calc.raizQuadrada(25));  
        System.out.println("8^0 = " + calc.potencia(8, 0));
        System.out.println("2^-3 = " + calc.potencia(2, -3));             
    }
}
