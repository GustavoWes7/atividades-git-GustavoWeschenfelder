package atividades;

public class Calculadora {
    
    public double somar(double a, double b){
        return a + b;
    }
    
    public double media (double[] valores){
        
        double soma = 0;
        
        for(double v : valores){
            soma += v;
        }
        
        return soma / valores.length;
    }
}
