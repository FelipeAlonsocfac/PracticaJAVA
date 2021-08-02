//JComboBox deja agregar listas desplegables a las interfaces
import javax.swing.*;
import java.awt.event.*;

public class InterfazConComboBox extends JFrame implements ItemListener{
  
  private JComboBox combo1;
  
  public InterfazConComboBox (){
    setLayout(null);
    combo1 = new JComboBox();
    combo1.setBounds(10,10,80,20);
    add(combo1);
    
    combo1.addItem("rojo");	//AÑADE UN OBJETO
    combo1.addItem("verde");
    combo1.addItem("azul");
    combo1.addItem("amarillo");
    combo1.addItem("negro");
    combo1.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent evento_item){
    if(evento_item.getSource() == combo1){
      String seleccion = combo1.getSelectedItem().toString();
      setTitle(seleccion);
    }
  }

  public static void main (String args[]){
    InterfazConComboBox interfaz = new InterfazConComboBox();
    interfaz.setBounds(0,0,200,150);
    interfaz.setVisible(true);
    interfaz.setResizable(false);
    interfaz.setLocationRelativeTo(null);
  }
}