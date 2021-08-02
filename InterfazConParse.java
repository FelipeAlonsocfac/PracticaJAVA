import javax.swing.*;
import java.awt.event.*;

public class InterfazConParse extends JFrame implements ActionListener{
  
  private JTextField texto1, texto2;
  private JLabel etiqueta1, etiqueta2, etiqueta3;
  private JButton boton_sumar;
  
  public InterfazConParse(){
    setLayout(null);
    etiqueta1 = new JLabel("Valor 1:");
    etiqueta1.setBounds(50,5,100,30);
    add(etiqueta1);
    etiqueta2 = new JLabel("Valor 2:");
    etiqueta2.setBounds(50,35,100,30);
    add(etiqueta2);
    etiqueta3 = new JLabel("Resultado:");
    etiqueta3.setBounds(120,80,100,30);
    add(etiqueta3);
    
    
    texto1 = new JTextField();
    texto1.setBounds(120,10,150,20);
    add(texto1);
    texto2 = new JTextField();
    texto2.setBounds(120,40,150,20);
    add(texto2); 

    boton_sumar = new JButton("Sumar");
    boton_sumar.setBounds(10,80,100,30);
    add(boton_sumar);
    boton_sumar.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton_sumar){
      int valor1 = 0, valor2 = 0, resultado = 0;
      
      valor1 = Integer.parseInt(texto1.getText());  //si fuera para pasar a float, seria Float.parseFloat();
      valor2 = Integer.parseInt(texto2.getText());
      resultado = valor1 + valor2;

      etiqueta3.setText("Resultado: " + resultado);
    }
  }

  public static void main (String args[]){
    InterfazConParse interfaz = new InterfazConParse();
    interfaz.setBounds(0,0,300,150);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}