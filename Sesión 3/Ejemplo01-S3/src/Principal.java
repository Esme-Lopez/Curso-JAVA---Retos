public class Principal {
    public static void main(String[] args) {

        //Uso de atributo final : Accedemos al nombre del sistema definido como constante
        System.out.println("Sistema: " + Proyecto.NOMBRE_SISTEMA);

        //Creación de objetos: Instanciamos dos proyectos con datos reales
        Proyecto p1 = new Proyecto("Sitio Web Corporativo", "Cliente A", 12, true);
        Proyecto p2 = new Proyecto("Aplicación Móvil", "Cliente B", 20, true);

        //Uso de métodos: Mostramos los detalles de cada proyecto
        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
        System.out.println();

        //Simulamos el cierre de un proyecto
        p1.cerrarProyecto();

        //Mostramos nuevamente los datos del proyecto cerrado
        System.out.println();
        p1.mostrarInformacion();

        //Uso de atributo stactic: Total de proyectos creados
        System.out.println("\n Total de proyectos creados: "+Proyecto.totalProyectos);
    }
}
