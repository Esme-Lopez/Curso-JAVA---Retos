public class Usuario {

    private String nombre;
    private double saldo; //No debe accederse directamente

    public Usuario(String nombre, double saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }

    //Metodo publicos para acceder a atributos privados (Getters)
    public String getNombre(){
        return nombre;
    }

    public double getSaldo(){
        return saldo;
    }

    //Metodo publico para modificar el saldo (Deposito)
    public void depositar(double monto){
        saldo += monto;
    }
}
