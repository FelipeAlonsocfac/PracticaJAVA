import javax.swing.*;   	//JLabels
import java.awt.event.*; 	//para los eventos

public class InterfazConEvento extends JFrame implements ActionListener{	//extends JFrame es para crear interfaz grafica e implements ActionListener es para crear los eventos de esa interfaz, como cerrarlos
  
  JButton boton_cerrar;
  
  public InterfazConEvento(){
    
    setLayout(null);  //crear o poner nuestros componentes a traves de coordenadas. es obligatorio.
    boton_cerrar = new JButton("Close");
    boton_cerrar.setBounds(300, 250, 100, 30);    //para elegir en que parte de la ventana se pone este boton (#pix a la der, # pix abajo, ancho, alto)
    add(boton_cerrar);	//para añadirlo a la interfaz
    boton_cerrar.addActionListener(this);	//estar a la espera del evento que se genera en el boton_cerrar
  } 
  
  public void actionPerformed(ActionEvent evento_cerrar){	//cuando el usuario presiona el boton, se va a generar un evento y ese evento debe ser guardado en algun lugar
    
    if (evento_cerrar.getSource() == boton_cerrar){  //getSource, es de la clase Actionevent y contiene el objeto donde se genero el evento. Recupera el evento que se guardo en el espacio en memoria
      System.exit(0);
    }
  }
  
  public static void main (String args[]){
    InterfazConEvento interfaz = new InterfazConEvento();

    interfaz.setBounds(0,0,450,350);
    interfaz.setVisible(true);
    interfaz.setResizable(true);
    interfaz.setLocationRelativeTo(null);
  }
}
