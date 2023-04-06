/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoSemana7;

/**
 *
 * @author Usuario
 */
public class Empregado {
    
    String primeiroNome;
    String segundoNome;
    float salario;
    float aumentoSalario;
    
    public Empregado() { 
        
}
    
    public float aumentarSalario() {
        
    aumentoSalario =  (salario * 1.1f);
            
    return aumentoSalario; 
    
}

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
