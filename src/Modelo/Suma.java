/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Suma {
    int numero1;
    int numero2;
    int resultado;
    
    
    public int getNumero1(){
        return numero1;
    }
    
    
    public int getNumero2(){
        return numero2;
        
    }
    
    public void setNumero1(int numero){
        this.numero1 = numero;
    }
    
    
    public void setNumero2(int numero){
        this.numero2 = numero;
    }
    
    public void setResultado(int numero){
        this.resultado=numero;
    }
    
    public int getResultado(){
        return resultado;
    }
    
    
    
    
    public int sumar(){
        this.resultado = numero1 + numero2;
        
        return resultado;
        
    }
    
    
    
    
    
    
    
         
    
    
    
}
