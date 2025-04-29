public class CalculadoraCientifica extends Calculadora {
    
    public double raizQuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Não existe raiz real de número negativo");
        }
        
        double precisao = 0.00001;
        double estimativa = a;
        double diferenca;
        
        do {
            double estimativaAnterior = estimativa;
            estimativa = (estimativa + a / estimativa) / 2.0;
            diferenca = estimativa - estimativaAnterior;
        } while (diferenca > precisao || -diferenca > precisao); 
        
        return estimativa;
    }
    
    public double potencia(double base, int expoente) {
        if (expoente == 0) return 1;
        
        double resultado = 1;
        boolean expoenteNegativo = expoente < 0;
        
        if (expoenteNegativo) {
            expoente = -expoente;
        }
        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
        return expoenteNegativo ? 1 / resultado : resultado;
    }
}
