package Modelo;

public class Modelo {
    private Suma suma;
    private Multiplicacion producto;
    
    
    public Modelo(){
        this.suma = new Suma();
        this.producto = new Multiplicacion();
    }
    
    
    public void setNumero1Producto(int numero1Producto) {
        producto.setNumero1(numero1Producto);
    }
    
    public void setNumero2Producto(int numero2Producto) {
        producto.setNumero2(numero2Producto);
    }
    
    public void multiplicar() {
        producto.multiplicar();
        
    }
    
    public int getResultadoProducto(){
        return producto.getResultado();
    }
    
    public void setNumero1Suma(int numero){
        suma.setNumero1(numero);
    }
    
    public void setNumero2Suma(int numero){
        suma.setNumero2(numero);
    }
    
    
    public void sumar(){
        suma.sumar();
    }
    
    public int getResultadoSuma(){
        return suma.getResultado();
    }
    
    
    
    
}