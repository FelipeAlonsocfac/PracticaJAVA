import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Interfazterminoscondiciones extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1;
    private JCheckBox check1;
    private JButton boton1;

    public Interfazterminoscondiciones(){
        setLayout(null);
        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10, 10, 400 ,30);
        add(label1);

        check1 = new JCheckBox("Acepto");
        check1.setBounds(10, 50, 100, 30);
        check1.addChangeListener(this);
        add(check1);

        boton1 = new JButton("Continuar");
        boton1.setBounds(10, 100, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);   //false porque al iniciar el archivo quiero que este deshabilitado
    }

    public void stateChanged(ChangeEvent eventocambio){
        if(check1.isSelected() == true){
            boton1.setEnabled(true);
        }else boton1.setEnabled(false);

    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == boton1){
            System.exit(0);
        }
    }

    public static void main (String args[]){
        Interfazterminoscondiciones interfaz = new Interfazterminoscondiciones();   
        interfaz.setBounds(0,0,350,200);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setLocationRelativeTo(null);
    }
}