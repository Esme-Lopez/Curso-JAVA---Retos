public class Main {
    public static void main(String[] args){
        Usuario u = new Usuario("Esmeralda", 500.0);

        //Accedemos al nombre (metodo público)
        System.out.println("Usuario: "+u.getNombre());

        //Accedemos al saldo usando método getter
        System.out.println("Saldo inicial: $"+u.getSaldo());

        //Usamos un metodo publico para modificar el saldo
        u.depositar(250.0);
        System.out.println("Saldo después del depósito: $"+u.getSaldo());

        //USO DEL MODIFICADOR protected CON HERENCIA
        Empleado emp = new Empleado();
        emp.mostrarNacionalidad();
    }
}
