public class Metodo {

    //Metodo sin parámetros y sin retornos
    public void mostrarBienvenida(){
        System.out.println("Bienvenido al sistema c:");
    }

    //Metodo con parametros y sin retorno
    public void mostrarSuma(int a, int b){
        int resultado = a+b;
        System.out.println("La suma es: "+resultado);
    }

    //Metodo con parametros y con retorno
    public int obtenerSuma(int a, int b){
        return a+b;
    }

    //Paso por valor (tipos primitivos)
    public void duplicar(int numero){
        numero = numero * 2;
        System.out.println("Dentro del método: "+numero);
    }

    //Paso por referencia (objetos)
    public static class Persona{
        String nombre;

        public Persona(String nombre){
            this.nombre = nombre;
        }
    }

    public void cambiarNombre(Persona p){
        p.nombre = "Nuevo nombre";
    }

    //Sobrecarga de métodos
    public void saludar(){
        System.out.println("Holii");
    }

    public void saludar(String nombre){
        System.out.println("Holaa "+nombre);
    }
}
