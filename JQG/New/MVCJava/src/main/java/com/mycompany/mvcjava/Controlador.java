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
    //creamos nuestras variables privadas
    private Modelo modeloCalculadora;
    private Vista vistaCalculadora;
    
    //creamos los constructores
    public Controlador(Modelo modeloCalculadora, Vista vistaCalculadora) {
        this.modeloCalculadora = modeloCalculadora;
        this.vistaCalculadora = vistaCalculadora;
    }
    
  public void realizarSuma(){
  //aqui recuperamos los valores del getnumero1 y getnumero2
      int num1 = vistaCalculadora.getNumero1();
      int num2 = vistaCalculadora.getNumero2();
      
      //invocamos el metodo sumar y se lo asignamos a la variable
      int resultado =modeloCalculadora.sumar(num1,num2);
      
      
      vistaCalculadora.SetResultado(resultado);
  }
     public void realizarResta(){
  //aqui recuperamos los valores del getnumero1 y getnumero2
      int num1 = vistaCalculadora.getNumero1();
      int num2 = vistaCalculadora.getNumero2();
      
      //invocamos el metodo sumar y se lo asignamos a la variable
      int resultado =modeloCalculadora.restar(num1,num2);
      
      
      vistaCalculadora.SetResultado(resultado);
  }
     public void realizarMultiplicacion(){
  //aqui recuperamos los valores del getnumero1 y getnumero2
      int num1 = vistaCalculadora.getNumero1();
      int num2 = vistaCalculadora.getNumero2();
      
      //invocamos el metodo sumar y se lo asignamos a la variable
      int resultado =modeloCalculadora.multiplicar(num1,num2);
      
      
      vistaCalculadora.SetResultado(resultado);
  }
     
     public void realizarDivision(){
  //aqui recuperamos los valores del getnumero1 y getnumero2
      int num1 = vistaCalculadora.getNumero1();
      int num2 = vistaCalculadora.getNumero2();
      
      //invocamos el metodo sumar y se lo asignamos a la variable
      int resultado =modeloCalculadora.dividir(num1,num2);
      
      
      vistaCalculadora.SetResultado(resultado);
  }
   
}
