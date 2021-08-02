package lista_tipo_pila;

public class Nodo {
    int informacion;    //informacion del nodo
    Nodo siguiente;     //el apuntador al siguiente nodo

    public Nodo(int valor){
        informacion = valor;
        siguiente = null;
    }
}
