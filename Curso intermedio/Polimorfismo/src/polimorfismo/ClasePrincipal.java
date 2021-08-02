package polimorfismo;

public class ClasePrincipal {
    public static void main(String[] args) {
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija(); //ya que la clase operaciones_clasepadre es abstracta, podemos crear un objeto llamado mensajero_suma
        //de la clase operaciones_clase padre pero que se comporte como suma_clasehija debido a la abstraccion.
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Operaciones();
        mensajero_Suma.MostrarResultado();

        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija(); //ya que la clase operaciones_clasepadre es abstracta, podemos crear un objeto llamado mensajero_suma
        //de la clase operaciones_clase padre pero que se comporte como suma_clasehija debido a la abstraccion.
        mensajero_Resta.PedirDatos();
        mensajero_Resta.Operaciones();
        mensajero_Resta.MostrarResultado();
    }
}
