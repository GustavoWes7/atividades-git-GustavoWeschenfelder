package atividades;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Aluno: Gustavo Weschenfelder");
        System.out.println("Curso: Programacao Java");
        System.out.println("Atividades de Git e GitHub");
        
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(5,10));
        
        double[] notas = {7.5, 8.0, 9.5};
        System.out.println("Media: " + calc.media(notas));
        
        System.out.println(calc.saudacao("Gustavo"));
    }
    
}
