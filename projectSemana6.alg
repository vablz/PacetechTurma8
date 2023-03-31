package projectSemana6;

import java.util.Scanner;


public class Main {

  
    public static void main(String[] args) {
        
        
        Scanner leitor = new Scanner(System.in);

        float tempC, tempF, cotacaoDolar, reais, dolares;
        
        int opcaoMenu = 0;
        
        while(opcaoMenu != 5){
              System.out.println("Digite o número correspondente a opção que deseja fazer, por favor.");
              System.out.println("1 - Para converter graus Celsius para Fahrenheit.");
              System.out.println("2 - Para converter graus Fahrenheit para Celsius.");
              System.out.println("3 - Para converter Reais para Dólares.");
              System.out.println("4 - Para converter Dólares para Reais");
              System.out.println("5 - Para sair do programa.");
              System.out.println("");
              opcaoMenu = leitor.nextInt();
            
              switch (opcaoMenu){
                  
                  case 1:
                      System.out.println("Você escolheu converter graus Celsius para graus Fahrenheit.");
                      System.out.println("Diga a temperatura em graus Celsius, por favor.");
                      tempC = leitor.nextFloat();
                      tempF = (float) ((tempC * 1.8) + 32);
                      System.out.println("A temperatura convertida é igual a " + tempF + " graus Fahrenheit.");
                      System.out.println("");
                      break;
                      
                  case 2:
                      System.out.println("Você escolheu converter graus Fahrenheit para graus Celsius.");
                      System.out.println("Diga a temperatura em graus Fahrenheit, por favor.");
                      tempF = leitor.nextFloat();
                      tempC = (float) ((tempF - 32) / 1.8);
                      System.out.println("A temperatura convertida é igual a " + tempC + " graus Celsius.");
                      System.out.println("");
                      break;
                      
                  case 3:
                      System.out.println("Você escolheu converter Reais para Dólares.");
                      System.out.println("Diga quantos reais valem 1 dólar, por favor.");
                      cotacaoDolar = leitor.nextFloat();
                      System.out.println("Diga o valor em real que deseja converter em dólar, por favor.");
                      reais = leitor.nextFloat();
                      dolares = (reais / cotacaoDolar);
                      System.out.println(reais + " reais é igual a " + dolares + " dólares.");
                      System.out.println("");
                      break;
                      
                  case 4:
                      System.out.println("Você escolheu converterDólares para Reais.");
                      System.out.println("Diga quantos reais valem 1 dólar, por favor.");
                      cotacaoDolar = leitor.nextFloat();
                      System.out.println("Diga o valor em dólar que deseja converter em reais, por favor.");
                      dolares = leitor.nextFloat();
                      reais = (dolares * cotacaoDolar);
                      System.out.println(dolares + " dólares é igual a " + reais + " reais.");
                      System.out.println("");
                      break;
                      
                  case 5:
                      System.out.println("Você escolehu sair.");
                      break;
                      
                  default:
                     System.out.println("Opção inválida."); 
                      
              }
        }
        
        
    }
    
}

