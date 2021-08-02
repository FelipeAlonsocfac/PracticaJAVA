import javax.swing.*;
import java.awt.event.*;

public class Interfazusuario extends JFrame implements ActionListener{
  
  private JTextField texto1;
  private JLabel etiqueta;
  private JButton boton_aceptar;

  public Interfazusuario(){
    setLayout(null);
    etiqueta = new JLabel("Usuario:");
    etiqueta.setBounds(10,10,100,30);
    add(etiqueta);

    texto1 = new JTextField();
    texto1.setBounds(120,17,150,20);
    add(texto1);
   
    boton_aceptar = new JButton("Aceptar");
    boton_aceptar.setBounds(10,80,100,30);
    add(boton_aceptar);
    boton_aceptar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton_aceptar){
      String texto = texto1.getText();
      setTitle(texto);
    }
  }

  public static void main (String args[]){
    Interfazusuario interfaz = new Interfazusuario();
    interfaz.setBounds(0,0,300,150);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}