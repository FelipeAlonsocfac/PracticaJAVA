import javax.swing.*;

public class Swing_jlabel extends JFrame{
  
  private JLabel etiqueta;
  private JLabel etiqueta2;

  
  public Swing_jlabel(){
    setLayout(null);
    etiqueta = new JLabel("Interfaz grafica");
    etiqueta.setBounds(10,20,300,30);
    add(etiqueta);
    etiqueta2 = new JLabel("Version 1.0"); //ponerle nombre a la etiqueta
    etiqueta2.setBounds(10,100,100,30);  // setBounds(#pixeles a la derecha, #pixeles hacia abajo, ancho y alto)
    add(etiqueta2);
  }
  
  public static void main (String args[]){
    Swing_jlabel interfaz1 = new Swing_jlabel();
    interfaz1.setBounds(0,0,300, 200);
    interfaz1.setResizable(true);
    interfaz1.setVisible(true);
    interfaz1.setLocationRelativeTo(null);
    
  }
}