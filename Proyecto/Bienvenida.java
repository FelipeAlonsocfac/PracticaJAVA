import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1;
  public static String texto = "";

  public Bienvenida(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);  //para que al darle al boton "X", cierre la app 
    setTitle("Bienvenido");
    getContentPane().setBackground(new Color(255,0,0));  //el background en rojo
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());  //pone en el icono la imagen que se encuentra en la misma carpeta del proyecto, pero en una carpeta llamada images. la imagen se llama logo y es en formato png

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25,15,300,150);
    add(label1);

    label2 = new JLabel("Sistema de control vacacional");
    label2.setBounds(35,135,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));  //pone la fuente del label, la tipografia en este caso es "andale mono"
    //si se quiere que el texto sea normal, se pone 0, si se quiere en negrita 1, en cursiva 2, negrita y cursiva 3.
    //el 18 es el tamaño del texto
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Andale Mono",1,12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2021 The Cocacola Company");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Andale Mono",1,12));
    label4.setForeground(new Color(255,255,255));
    add(label4);

    textfield1 = new JTextField();
    textfield1.setBounds(45,240,255,25);
    textfield1.setBackground(new Color(224,224,224));
    textfield1.setFont(new Font("Andale Mono",1,14));
    textfield1.setForeground(new Color(255,0,0));
    add(textfield1);    //diseño textfield

    boton1 = new JButton("Ingresar");
    boton1.setBounds(125,280,100,30);
    boton1.setBackground(new Color(255,255,255));
    boton1.setFont(new Font("Andale Mono",1,14));
    boton1.setForeground(new Color(255,0,0));
    boton1.addActionListener(this);
    add(boton1);    //diseño del boton
  }

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1){
      texto = textfield1.getText().trim();//recuperar texto del textfield. el .trim, elimina los espacios
      if(texto.equals("")){//si el texto es vacio
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");

      }
      else {
        Licencia ventanalicencia = new Licencia();  //con esto creo la siguiente ventana, es decir la ventana de licencia
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        this.setVisible(false);  //this para hacer referencia a esta clase
      }
    }
  }

  public static void main (String args[]){
    Bienvenida ventanaBienvenida = new Bienvenida();
    ventanaBienvenida.setBounds(0,0,350,450);
    ventanaBienvenida.setVisible(true);
    ventanaBienvenida.setResizable(false);
    ventanaBienvenida.setLocationRelativeTo(null);
  }
}