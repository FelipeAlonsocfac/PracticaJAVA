import javax.swing.*;

public class Interfazcontextodearea extends JFrame{
  
  private JTextField texto1;  //textfield normal, solo 1 linea
  private JTextArea textoarea1;  //textarea, varias lineas para que el usuario escriba
  
  public Interfazcontextodearea(){
    setLayout(null);
    texto1 = new JTextField();
    texto1.setBounds(10,10,200,30);
    add(texto1);

    textoarea1 = new JTextArea();
    textoarea1.setBounds(10,50,400,300);
    add(textoarea1);
  }

  public static void main (String args[]){
    Interfazcontextodearea interfaz = new Interfazcontextodearea();
    interfaz.setBounds(0,0,540,400);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}