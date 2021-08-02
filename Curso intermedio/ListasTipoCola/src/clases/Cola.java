package clases;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo inicioCola, finalCola;
    String Cola = "";  //para saber el contenido de nuestra cola

    public Cola(){
        inicioCola = null;
        finalCola = null;
    }

    //metodo para saber si la cola esta vacia
    public boolean ColaVacia(){
        if (inicioCola == null) {
            return true;
        } else {
            return false;
        }
    }

    //metodo para insertar a la cola
    public void Insertar(int informacion){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        nuevo_nodo.siguiente = null;

        if (ColaVacia()) {
            inicioCola = nuevo_nodo;
            finalCola = nuevo_nodo;
        } else {
            finalCola.siguiente = nuevo_nodo;
            finalCola = nuevo_nodo;
        }
    }

    //metodo para extraer de la cola
    public int Extraer(){
        if (!ColaVacia()) {
            int informacion = inicioCola.informacion;
            if (inicioCola == finalCola){
                inicioCola = null;
            }else {
                inicioCola = inicioCola.siguiente;
            }
            return informacion;
        } else {
            return 0;
        }
    }

    //metodo para mostrar el contenido de la cola
    public void MostrarContenido(){
        Nodo recorrido = inicioCola;
        String ColaInvertida = "";

        while (recorrido != null) {
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena [] = Cola.split(" "); //para invertir la cadena, es necesario el metodo .split(" "); con el espacio en medio de las comillas

        for (int i = cadena.length - 1; i>=0; i--) {
            ColaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, ColaInvertida);
        Cola = "";  
    }
}
