public class Principal {
    public static void main(String[] args){

        //DOS OBJETOS DE TIPO ENTRADA
        Entrada entrada1 = new Entrada("Slime Rancher 2",312);
        Entrada entrada2 = new Entrada("A Minecraft Movie",29);


        //MOSTRAR INFORMACIÓN
        System.out.println("--Entradas Registradas--");
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        //ENTRADA USANDO RECORD
        Entrada_Record entrada3 = new Entrada_Record("Pusheen",135);
        entrada3.mostrarInformacion();

    }

}
