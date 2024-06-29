package proyectosumarymultiplicar;



import Modelo.Modelo;
import Vista.Vista;
import Controlador.Controlador;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        vista.setVisible(true);
       
    }
}
