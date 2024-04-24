/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Calculadora extends JFrame implements ActionListener{
    private JTextField numField1, numField2, resultField;
    private JButton sumButton, subtractButton, multiplyButton, divideButton;
    
    
    
    public Calculadora(){
        //configurar la ventana principal
        setTitle("Calculadora");
        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2));
        
        //Crear los campos de texto y botones
        numField1 = new JTextField();
        numField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);//Para que el resultado no sea editado
        
        sumButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        
        
        //Agregar los componentes a la ventana 
        add(new JLabel("Número 1:"));
        add(numField1);
        add(new JLabel("Número 2"));
        add(numField2);
        add(new JLabel("Resultado"));
        add(resultField);
        add(sumButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        
        
        //Agregar los escuchadores de eventos a los botones
        sumButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(numField1.getText());
        double num2 = Double.parseDouble(numField2.getText());
        double result = 0.0;
        
        if(e.getSource() == sumButton){
            result = num1 + num2;
        } else if(e.getSource() == subtractButton){
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton){
            result = num1 * num2;
        } else if(e.getSource() == divideButton){
            if (num2 != 0){
                result = num1 / num2;
            } else{
                JOptionPane.showMessageDialog(this, "error: Division por cero", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        resultField.setText(String.valueOf(result));        
        
    }
    
    public static void main(String [] args){
        Calculadora calc = new Calculadora();
        calc.setVisible(true);
    }
    
    
    
}
