public class Principal {

    public static void main (String[] args){

        Metodo metodos = new Metodo();

        metodos.mostrarBienvenida(); //Se realiza la llamada al metodo

        metodos.mostrarSuma(16,39);

        int suma = metodos.obtenerSuma(5,7);
        System.out.println("Resultado: "+suma);

        int x = 10;
        metodos.duplicar(x);
        System.out.println("Fuera del método "+ x); // x no cambia

        Metodo.Persona persona = new Metodo.Persona("Esmeralda");
        System.out.println("Nombre actualizado: "+persona.nombre);

        metodos.saludar();
        metodos.saludar("Esmeralda");
    }
}
