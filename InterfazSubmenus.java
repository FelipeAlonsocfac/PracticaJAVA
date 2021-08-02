import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazSubmenus extends JFrame implements ActionListener{
  
  private JMenuBar menubar;  //solo se puede tener un jmenubar
  private JMenu menu1;
  private JMenuItem menuitem1, menuitem2, menuitem3;  //ejemplo, en el bloc serian los items dentro de archivo, edicion, formato, etc.
  
  public InterfazSubmenus(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);
    
    menu1 = new JMenu("Opciones");
    menubar.add(menu1);  //añadir el menu llamado menu1 dentro de la barra 
    
    menuitem1 = new JMenuItem("Rojo");
    menuitem1.addActionListener(this);
    menu1.add(menuitem1);

    menuitem2 = new JMenuItem("Verde");
    menuitem2.addActionListener(this);
    menu1.add(menuitem2);

    menuitem3 = new JMenuItem("Azul");
    menuitem3.addActionListener(this);
    menu1.add(menuitem3);
  }
  public void actionPerformed(ActionEvent evento){
    Container fondo = this.getContentPane();
    
    if(evento.getSource() == menuitem1){
      fondo.setBackground(new Color(255,0,0));
    } 
    if(evento.getSource() == menuitem2){
      fondo.setBackground(new Color(0,255,0));
    } 
    if(evento.getSource() == menuitem3){
      fondo.setBackground(new Color(0,0,255));
    } 
  } 
  
  public static void main (String args[]){
    InterfazSubmenus interfaz = new InterfazSubmenus();
    interfaz.setBounds(0,0,400,300);
    interfaz.setVisible(true);
    interfaz.setLocationRelativeTo(null); 
  } 
}