
package projetoSemana7;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        float salarioAnual;
        
               
        Empregado empregado1 = new Empregado(); 
        Empregado empregado2 = new Empregado(); 
        
        System.out.print("Digite o primeiro nome do primeiro funcion�rio: ");
        empregado1.setPrimeiroNome(leitor.next());
        
        System.out.print("Digite o segundo nome do primeiro funcion�rio: ");
        empregado1.setSegundoNome(leitor.next());
        
        System.out.print("Digite o sal�rio mensal do primeiro funcion�rio: ");
        empregado1.setSalario(leitor.nextFloat());
        
        System.out.println(" ");
        
        System.out.print("Digite o primeiro nome do segundo funcion�rio: ");
        empregado2.setPrimeiroNome(leitor.next());
        
        System.out.print("Digite o segundo nome do segundo funcion�rio: ");
        empregado2.setSegundoNome(leitor.next());
        
        System.out.print("Digite o sal�rio mensal do segundo funcion�rio: ");
        empregado2.setSalario(leitor.nextFloat());
        
        salarioAnual = (empregado1.getSalario() * 12);
        System.out.println("O sal�rio anual do primeiro funcion�rio � de " + salarioAnual + " reais");
        
        System.out.println(empregado1.getPrimeiroNome() + " " + empregado1.getSegundoNome() +  " acaba de ganhar um aumento de 10%!");
        
        System.out.println("Agora o sal�rio mensal do primeiro funcion�rio � de: " + empregado1.aumentarSalario() + " reais.");
        
        salarioAnual = (empregado1.aumentarSalario() * 12);
        System.out.println("Agora o sal�rio anual do primeiro funcion�rio � de " + salarioAnual + " reais");

        System.out.println(" ");
        
        salarioAnual = (empregado2.getSalario() * 12);
        System.out.println("O sal�rio anual do segundo funcion�rio � de " + salarioAnual + " reais");
        
        System.out.println(empregado2.getPrimeiroNome() + " " + empregado2.getSegundoNome() +  " acaba de ganhar um aumento de 10%!");
        
        System.out.println("Agora o sal�rio mensal do segundo funcion�rio � de: " + empregado2.aumentarSalario() + " reais.");
        
        salarioAnual = (empregado2.aumentarSalario() * 12);
        System.out.println("Agora o sal�rio anual do segundo funcion�rio � de " + salarioAnual + " reais");
        
    }
    
}
