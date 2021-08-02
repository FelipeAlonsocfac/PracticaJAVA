package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila { //asignar el comportamiento de una lista tipo pila al programa
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String Lista = "";

    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    //metodo para conocer si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;    //si es nulo, nos retorna un true si no es nulo retorna un false
    }

    //metodo para insertar nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);   //creo un nuevo Nodo, con el valor que se recibe
        nuevo_nodo.siguiente = UltimoValorIngresado;    //el apuntador al siguiente nodo va a apuntar al ultimo nodo actual
        UltimoValorIngresado = nuevo_nodo;  //ahora, ya que se añadio un nuevo nodo entonces el ultimo nodo actual va a ser el nodo que acabamos de crear
        tamano++;   //y aumento el tamaño
    }
    //metodo para eliminar un nodo de la pila
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }

    //metodo para conocer el ultimo valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    //metodo para conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }

    //metodo para vaciar la pila
    public void VaciarPila(){
        while (!PilaVacia()) {
            EliminarNodo();
        }
    }
    //metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while(recorrido != null){
            Lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
