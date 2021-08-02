import javax.swing.*;

public class InterfazConScroll extends JFrame{
  
  private JTextField texto1;
  private JScrollPane scroll;
  private JTextArea texto_area;

  public InterfazConScroll(){
    setLayout(null);
    texto1 = new JTextField();
    texto1.setBounds(10,10,200,30);
    add(texto1);

    texto_area = new JTextArea();
    scroll = new JScrollPane(texto_area);
    scroll.setBounds(10,50,400,300);
    add(scroll);
  }

  public static void main (String args[]){
    InterfazConScroll interfaz = new InterfazConScroll();
    interfaz.setBounds(0,0,540,400);    
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}