import javax.swing.*;
import java.awt.event.*;

public class InterfazConJfieldConJarea extends JFrame implements ActionListener{
  
  private JTextField texto1;
  private JTextArea textoarea;
  private JScrollPane scroll;
  private JButton boton1;

  String data = "";

  public InterfazConJfieldConJarea(){
    setLayout(null);
    texto1 = new JTextField();
    texto1.setBounds(10,10,200,30);
    add(texto1);
    
    boton1 = new JButton("Agregar");
    boton1.setBounds(250,10,100,30);
    add(boton1);
    boton1.addActionListener(this);

    textoarea = new JTextArea();
    scroll = new JScrollPane(textoarea);
    scroll.setBounds(10,50,400,300);
    add(scroll);
  }

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1){
      data += texto1.getText() + "\n";  // se añade el texto de textfield y con el "", se cambia de linea en textarea  
      textoarea.setText(data);
      texto1.setText("");
    }
  }

  public static void main (String args[]){
    InterfazConJfieldConJarea interfaz = new InterfazConJfieldConJarea();
    interfaz.setBounds(0,0,540,400);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}