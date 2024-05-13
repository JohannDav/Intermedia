/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvcjava;

/**
 *
 * @author Usuario
 */
public class Controlador {
    //Creamos las variables privadas
    private Modelo modeloCalculadora;
    private Modelo vistaCalculadora;
    
    //Creamos los contructores
    public Controlador(Modelo modeloCalculadora, Modelo vistaCalculadora) {
        this.modeloCalculadora = modeloCalculadora;
        this.vistaCalculadora = vistaCalculadora;
    }
    
    public void realizarSuma(){
        //Recuperamos los valores get numero1 y el 2
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        //Invocamos el metodo sumar y se l oasignamos a la variable
        int resultado = modeloCalculadora.sumar(num1, num2);
        
        vistaCalculadora.setResultado(resultado);
        
    }
    //Metodo de la resta
    public void realizarResta(){
        //Recuperamos los valores get numero1 y el 2
        int num1 = vistaCalculadora.getNumero1();
        int num2 = vistaCalculadora.getNumero2();
        
        //Invocamos el metodo sumar y se l oasignamos a la variable
        int resultado = modeloCalculadora.restar(num1, num2);
        
        vistaCalculadora.setResultado(resultado);
        
    
}
