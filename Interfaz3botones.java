import javax.swing.*;   	//JLabels
import java.awt.event.*; 	//para los eventos

public class Interfaz3botones extends JFrame implements ActionListener{	//extends JFrame es para crear interfaz grafica e implements ActionListener es para crear los eventos de esa interfaz, como cerrarlos
  
  private JButton boton1, boton2, boton3, boton_cerrar;
  private JLabel etiqueta;

  public Interfaz3botones(){
    
    setLayout(null);  //crear o poner nuestros componentes a traves de coordenadas. es obligatorio.
    boton_cerrar = new JButton("Close");
    boton1 = new JButton("1");
    boton2 = new JButton("2");
    boton3 = new JButton("3");
    boton_cerrar.setBounds(300, 250, 100, 30);    //para elegir en que parte de la ventana se pone este boton (#pix a la der, # pix abajo, ancho, alto)
    boton1.setBounds(10, 100, 90, 30);
    boton2.setBounds(110, 100, 90, 30);
    boton3.setBounds(210, 100, 90, 30);
    add(boton_cerrar);	//para añadirlo a la interfaz
    add(boton1);
    add(boton2);
    add(boton3);
    boton_cerrar.addActionListener(this);	//estar a la espera del evento que se genera en el boton_cerrar
    boton1.addActionListener(this);
    boton2.addActionListener(this);
    boton3.addActionListener(this);

    etiqueta = new JLabel("En espera...");
    etiqueta.setBounds(10,10,300,30);
    add(etiqueta);
  } 
  
  public void actionPerformed(ActionEvent evento){	//cuando el usuario presiona el boton, se va a generar un evento y ese evento debe ser guardado en algun lugar
    
    if (evento.getSource() == boton_cerrar){  //getSource, es de la clase Actionevent y contiene el objeto donde se genero el evento. Recupera el evento que se guardo en el espacio en memoria
      System.exit(0);
    }
    else if (evento.getSource() == boton1){  //getSource, es de la clase Actionevent y contiene el objeto donde se genero el evento. Recupera el evento que se guardo en el espacio en memoria
      etiqueta.setText("Has presionado el boton 1");
    }
    else if (evento.getSource() == boton2){  //getSource, es de la clase Actionevent y contiene el objeto donde se genero el evento. Recupera el evento que se guardo en el espacio en memoria
      etiqueta.setText("Has presionado el boton 2");
    }
    else if (evento.getSource() == boton3){  //getSource, es de la clase Actionevent y contiene el objeto donde se genero el evento. Recupera el evento que se guardo en el espacio en memoria
      etiqueta.setText("Has presionado el boton 3");
    }

  }
  
  public static void main (String args[]){
    Interfaz3botones interfaz = new Interfaz3botones();

    interfaz.setBounds(0,0,700,400);
    interfaz.setVisible(true);
    interfaz.setResizable(true);
    interfaz.setLocationRelativeTo(null);
  }
}
