package atividades;

public class Calculadora {
    
    public double somar(double a, double b){
        return a + b;
    }
    
    public double media (double[] valores){
        if(valores == null || valores.length == 0){
            return 0;
        }
        
        double soma = 0;
        
        for(double v : valores){
            soma += v;
        }
        
        return soma / valores.length;
    }
}
