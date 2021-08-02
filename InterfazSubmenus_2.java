import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazSubmenus_2 extends JFrame implements ActionListener{
  
  private JMenuBar menubar;
  private JMenu menu1, menu2, menu3;
  private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4;

  public InterfazSubmenus_2(){
    setLayout(null);
    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Tamaño de la ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3);

    menuitem1 = new JMenuItem("300*200");
    menu2.add(menuitem1);
    menuitem1.addActionListener(this);

    menuitem2 = new JMenuItem("640*800");
    menu2.add(menuitem2);
    menuitem2.addActionListener(this);
    
    menuitem3 = new JMenuItem("Rojo");
    menu3.add(menuitem3);
    menuitem3.addActionListener(this);

    menuitem4 = new JMenuItem("Verde");
    menu3.add(menuitem4);
    menuitem4.addActionListener(this);
  }

  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == menuitem1){
      setSize(300,200);
    }
    if(evento.getSource() == menuitem2){
        setSize(640,480);
    }
    if(evento.getSource() == menuitem3){
      getContentPane().setBackground(new Color(255,0,0));
    }
    if(evento.getSource() == menuitem4){
        getContentPane().setBackground(new Color(0,255,0));
    }
  }

  public static void main (String args[]){
    InterfazSubmenus_2 interfaz = new InterfazSubmenus_2();
    interfaz.setBounds(0,0,300,200);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}