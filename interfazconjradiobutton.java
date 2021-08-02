import javax.swing.*;
import javax.swing.event.*;

public class Interfazconjradiobutton extends JFrame implements ChangeListener{
    
    private JRadioButton radio1, radio2, radio3;    //opciones que se van a tener           
    private ButtonGroup bg;                     //grupo de las opciones que se van a tener
    
    public Interfazconjradiobutton(){
        setLayout(null);
        bg = new ButtonGroup();
        radio1 = new JRadioButton("640*480");
        radio1.setBounds(10, 20, 100, 30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1); //añadir radiobutton al grupo bg
        
        radio2 = new JRadioButton("800*600");
        radio2.setBounds(10, 70, 100, 30);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);

        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(10, 120, 100, 30);
        radio3.addChangeListener(this);
        add(radio3);
        bg.add(radio3);
    }

    public void stateChanged(ChangeEvent evento_jradiobutton){
        if(radio1.isSelected()){
            setSize(640, 480);
        }
        if(radio2.isSelected()){
            setSize(800, 600);
        }
        if(radio3.isSelected()  ){
            setSize(1024, 768);
        }
    }

    public static void main (String args[]){
        Interfazconjradiobutton interfaz = new Interfazconjradiobutton();
        interfaz.setBounds(0, 0, 350, 230);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
    }
}
