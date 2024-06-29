package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    Modelo modelo;
    Vista vista;
    
    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.buttonMultiplicar.addActionListener(this);
        this.vista.buttonSumar.addActionListener(this);
        
    }
    
                                    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.setNumero1Producto(Integer.parseInt(vista.txtNumero1.getText()));
        modelo.setNumero2Producto(Integer.parseInt(vista.txtNumero2.getText()));
        modelo.setNumero1Suma(Integer.parseInt(vista.txtNumero1.getText()));
        modelo.setNumero2Suma(Integer.parseInt(vista.txtNumero2.getText()));
        modelo.multiplicar();
        modelo.sumar();
        if(e.getSource() == vista.buttonMultiplicar){
            vista.txtResultado.setText(String.valueOf(modelo.getResultadoProducto()));
        }
        if(e.getSource() == vista.buttonSumar){
            vista.txtResultado.setText(String.valueOf(modelo.getResultadoSuma()));
        }
    }
}