import javax.swing.*; 
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox check1;
    private JButton boton1, boton2;
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    String nombre = ""; //el nombre que se cogera de la clase bienvenida

    public Licencia(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //para que al darle al boton "X", cierre la app 
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
        Bienvenida ventanaBienvenida = new Bienvenida();  //se crea un objeto del tipo de la clase. en este caso se quiere coger el texto de la clase bienvenida
        nombre = ventanaBienvenida.texto;
        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(215,5,200,30);
        label1.setFont(new Font("Andale mono",0,9));
        label1.setForeground(new Color(0,0,0));
        add(label1);

        textarea1 = new JTextArea();
        textarea1.setEditable(false);  //para que el usuario no pueda editar el texto del jtextarea
        textarea1.setFont(new Font("Andale mono",0,9));
        textarea1.setText("\n\n          TERMINOS Y CONDICIONES\n\n" + 
                            "*AGREGAR AQUI LOS TERMINOS Y CONDICIONES");
        scrollpane1 = new JScrollPane(textarea1);   //el texto del scrollpane va a ser el que se ponga en el textarea 
        scrollpane1.setBounds(10,40,575,200);   //las dimensiones se le dan es al scrollpane
        add(scrollpane1);

        check1 = new JCheckBox("Yo, " +  nombre +", acepto");
        check1.setBounds(10,250,300,30);
        check1.addChangeListener(this);
        add(check1);
        
        boton1 = new JButton("Continuar");
        boton1.setBounds(10,290,100,30);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(120,290,100,30);
        boton2.addActionListener(this);
        boton2.setEnabled(true);
        add(boton2);

        ImageIcon imagen = new ImageIcon("Images/coca-cola.png");
        label2 = new JLabel(imagen);        //añadir imagen al jlabel
        label2.setBounds(315,135,300,300);
        add(label2);
    }

    public void stateChanged(ChangeEvent evento){   //para el jcheckbox
        if (check1.isSelected()==true) {    //si se aceptan los terminos, que se habilite el boton de continuar y se deshabilite el de no acepto
            boton1.setEnabled(true);
            boton2.setEnabled(false);
        }
        else {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        
        }  // si no, que no se habilite
    }

    public void actionPerformed(ActionEvent evento){    //para los botones
        if(evento.getSource() == boton1){//si se presiona el boton1, que se vaya a la siguiente interfaz
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBounds(0,0,640,535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        }else if (evento.getSource() == boton2){    //si se presiona el 2, que se vaya a la anterior
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }

    }
    public static void main(String args[]) {
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
    }
}