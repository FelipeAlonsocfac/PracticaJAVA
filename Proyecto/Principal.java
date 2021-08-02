import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{
  
    private JMenuBar menubar;
    private JMenu menuOpciones,menuCalcular,menuAcercaDe,menuColorFondo;
    private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
    private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
                   labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
    private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
    private JComboBox comboDepartamento,comboAntiguedad;
    private JScrollPane scrollpane1; 
    private JTextArea textarea1;

    String nombreAdmin = "";  //variable sacada desde la ventana de bienvenida

    public Principal() {
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);  //para que al darle al boton "X", cierre la app 
      setTitle("Pantalla principal");
      getContentPane().setBackground(new Color(255,0,0));
      setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());//pone el icono de cocacola en lugar del de java
      Bienvenida ventanaBienvenida = new Bienvenida();
      nombreAdmin = ventanaBienvenida.texto;

      menubar = new JMenuBar(); //crea barra de menu
      menubar.setBackground(new Color(255, 0, 0));  //color rojp
      setJMenuBar(menubar); //la añade

      menuOpciones = new JMenu("Opciones"); //crea un menu que se llamara opciones
      menuOpciones.setBackground(new Color(255, 0, 0)); //lo pone en rojo
      menuOpciones.setFont(new Font("Andale Mono", 1, 14)); //establece la fuente
      menuOpciones.setForeground(new Color(255, 255, 255)); //fondo color blanco
      menubar.add(menuOpciones);    //añade el menu a la barra

      menuCalcular = new JMenu("Calcular"); //crea un menu llamado calcular
      menuCalcular.setBackground(new Color(255, 0, 0)); //color rojo
      menuCalcular.setFont(new Font("Andale Mono", 1, 14)); //establece la fuente
      menuCalcular.setForeground(new Color(255, 255, 255)); //fondo blanco
      menubar.add(menuCalcular);    //lo añade a la barra de menus

      menuAcercaDe = new JMenu("Acerca de");    //crea un menu llamado acerca de
      menuAcercaDe.setBackground(new Color(255, 0, 0)); //fondo rojo
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14)); //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      menuAcercaDe.setForeground(new Color(255, 255, 255)); //color blanco
      menubar.add(menuAcercaDe);    //lo añade a la barra de menus

      menuColorFondo = new JMenu("Color de fondo"); //crea un menu llamado color de fondo
      menuColorFondo.setFont(new Font("Andale Mono", 1, 14));   //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      menuColorFondo.setForeground(new Color(255, 0, 0));   //color blanco
      menuOpciones.add(menuColorFondo); // lo añade no a la barra de menus sino al menu llamado opciones

      miCalculo = new JMenuItem("Vacaciones");  //crea un menuitem para calcular las vacaciones
      miCalculo.setFont(new Font("Andale Mono", 1, 14));   //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño 
      miCalculo.setForeground(new Color(255, 0, 0));    //fondo blanco
      menuCalcular.add(miCalculo);  //añade el item al menu "menucalcular"
                                    
      // la diff entre añadir un menu dentro de otro menu y añadir un menuitem dentro de un menu es que
      //en el primer caso el menu dentro del menu puede tener varias opciones o varios menuitems, en el segundo caso, va a tener 
      //solo la opcion de menuitem, es decir, un menuitem no puede tener varias opciones dentro

      miCalculo.addActionListener(this);    //le añade un action listener

      //Action listener: usado para botones y menus
      //Change listener: usado para Jcheckbox como el boton de aceptar terminos y condiciones
      //Item listener: usado para combobox osea, cajas con opciones

      miRojo = new JMenuItem("Rojo");   //crea un menuitem para el fondo rojo
      miRojo.setFont(new Font("Andale Mono", 1, 14)); //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miRojo.setForeground(new Color(255, 0, 0));   //color rojo
      menuColorFondo.add(miRojo);   //añade el menutiem a "menucolorfondo"
      miRojo.addActionListener(this);   //añade un actionlistener a este menutiem

      miNegro = new JMenuItem("Negro");  //crea un menuitem para el fondo negro
      miNegro.setFont(new Font("Andale Mono", 1, 14));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miNegro.setForeground(new Color(255, 0, 0));  //color rojo
      menuColorFondo.add(miNegro);  //lo añade al menu "menucolorfondo"
      miNegro.addActionListener(this);  //añade un actionlistener a este menutiem

      miMorado = new JMenuItem("Morado");  //crea un menuitem para el fondo morado
      miMorado.setFont(new Font("Andale Mono", 1, 14));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miMorado.setForeground(new Color(255, 0, 0));  //color rojo
      menuColorFondo.add(miMorado); //lo añade al menu "menucolorfondo"
      miMorado.addActionListener(this);  //añade un actionlistener a este menutiem

      miNuevo = new JMenuItem("Nuevo"); //crea un menuitem para calcular un nuevo trabajador
      miNuevo.setFont(new Font("Andale Mono", 1, 14));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miNuevo.setForeground(new Color(255, 0, 0));  //color rojo
      menuOpciones.add(miNuevo);    //lo añade al menu "menuopciones"
      miNuevo.addActionListener(this);  //añade un actionlistener a este menutiem

      miElCreador = new JMenuItem("El creador");    //añade un menuitem para dar informacion acerca de el creador
      miElCreador.setFont(new Font("Andale Mono", 1, 14));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miElCreador.setForeground(new Color(255, 0, 0));  //color rojo
      menuAcercaDe.add(miElCreador);    //lo añade al menu "menuacercade"
      miElCreador.addActionListener(this);  //añade un actionlistener a este menutiem

      miSalir = new JMenuItem("Salir"); //añade un menuitem para salir o cerrar sesion
      miSalir.setFont(new Font("Andale Mono", 1, 14));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 14 es el tamaño
      miSalir.setForeground(new Color(255, 0, 0));  //color rojo
      menuOpciones.add(miSalir);    //lo añade al menu "menu opciones"
      miSalir.addActionListener(this);  //le añade un actionlistener

      ImageIcon imagen = new ImageIcon("images/logo-coca.png"); //crea un imageicon llamado imagen, lo saca de la carpeta del proyecto/images
      labelLogo = new JLabel(imagen);   //crea un label y le añade una imagen  
      labelLogo.setBounds(5,5,250,100); //lo setea en esas coordenadas
      add(labelLogo);       //y lo añade

      labelBienvenido = new JLabel("Bienvenido, " + nombreAdmin);   //crea un label que diga bienvenido 
      labelBienvenido.setBounds(280,30,300,50);     //lo setea en esas coordenadas
      labelBienvenido.setFont(new Font("Andale Mono", 1, 32));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 32 es el tamaño
      labelBienvenido.setForeground(new Color(255, 255, 255));  //color blanco
      add(labelBienvenido);    //y lo añade

      labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");    //crea un label con ese texto 
      labelTitle.setBounds(45,140,900,25);      //lo setea en esas coordenadas
      labelTitle.setFont(new Font("Andale Mono", 0, 24));   //tipo de fuente, 0 es normal(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 24 es el tamaño
      labelTitle.setForeground(new Color(255, 255, 255));   //color blanco
      add(labelTitle);  //lo añade

      labelNombre = new JLabel("Nombre completo:");     //label de nombre 
      labelNombre.setBounds(25,188,180,25);             //lo setea en esas coordenadas
      labelNombre.setFont(new Font("Andale Mono", 1, 12));  //tipo de fuente, 1 es negrita(0 normal, 1 negrita,2 cursiva, 3 neg y curs), 12 es el tamaño
      labelNombre.setForeground(new Color(255, 255, 255));  //color blanco
      add(labelNombre); //lo añade

      txtNombreTrabajador = new JTextField();   //textfield para el nombre del trabajador
      txtNombreTrabajador.setBounds(25,213,150,25);
      txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtNombreTrabajador); 

      labelAPaterno = new JLabel("Apellido Paterno:");  //label apellido paterno
      labelAPaterno.setBounds(25,248,180,25);
      labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
      labelAPaterno.setForeground(new Color(255, 255, 255));
      add(labelAPaterno);

      txtAPaternoTrabajador = new JTextField(); //textfield para apellido
      txtAPaternoTrabajador.setBounds(25,273,150,25);
      txtAPaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAPaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAPaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtAPaternoTrabajador);

      labelAMaterno = new JLabel("Apellido Materno:");  //label nombre materno
      labelAMaterno.setBounds(25,308,180,25);
      labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
      labelAMaterno.setForeground(new Color(255, 255, 255));
      add(labelAMaterno);

      txtAMaternoTrabajador = new JTextField();     //textfield apellido materno
      txtAMaternoTrabajador.setBounds(25,334,150,25);
      txtAMaternoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtAMaternoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
      txtAMaternoTrabajador.setForeground(new java.awt.Color(255, 0, 0));
      add(txtAMaternoTrabajador);

      labelDepartamento = new JLabel("Selecciona el Departamento:");    //label para departamento en el que trabaja
      labelDepartamento.setBounds(220,188,180,25);
      labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
      labelDepartamento.setForeground(new Color(255, 255, 255));
      add(labelDepartamento);

      
      comboDepartamento = new JComboBox();  //combobox para seleccionar departamento
      comboDepartamento.setBounds(220,213,220,25);
      comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));   //fondo
      comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboDepartamento.setForeground(new java.awt.Color(255, 0, 0));   //color letra
      add(comboDepartamento);   //lo añade
      comboDepartamento.addItem("");    //le añade un item sin nada
      comboDepartamento.addItem("Atencion al Cliente"); //añade item para atencion al cliente
      comboDepartamento.addItem("Departamento de Logistica");   //añade item para logistica
      comboDepartamento.addItem("Departamento de Gerencia");    //añade item para gerencia

      labelAntiguedad = new JLabel("Selecciona la Antiguedad:");  //label antiguedad
      labelAntiguedad.setBounds(220,248,180,25);
      labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
      labelAntiguedad.setForeground(new Color(255, 255, 255));
      add(labelAntiguedad);

      comboAntiguedad = new JComboBox();    //combobox antiguedad
      comboAntiguedad.setBounds(220,273,220,25);
      comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
      comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
      add(comboAntiguedad);
      comboAntiguedad.addItem("");  //opcion default
      comboAntiguedad.addItem("1 año de servicio"); //opcion 1 año
      comboAntiguedad.addItem("2 a 6 años de servicio");    //opcion 2 a 6
      comboAntiguedad.addItem("7 años o mas de servicio");  //opcion 7 o mas

      labelResultado = new JLabel("Resultado del Calculo:");
      labelResultado.setBounds(220,307,180,25);
      labelResultado.setFont(new Font("Andale Mono", 1, 12));
      labelResultado.setForeground(new Color(255, 255, 255));
      add(labelResultado);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224, 224, 224));
      textarea1.setFont(new Font("Andale Mono", 1, 11));
      textarea1.setForeground(new Color(255, 0, 0));
      textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(220,333,385,90);
      add(scrollpane1); 

      labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
      labelfooter.setBounds(135,445,500,30);
      labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
      labelfooter.setForeground(new java.awt.Color(255, 255, 255));
      add(labelfooter);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miCalculo) {   //SI SE selecciona el boton de calcular, que coja las opciones seleccionadas
   	        String nombreTrabajador = txtNombreTrabajador.getText();
            String AP = txtAPaternoTrabajador.getText();
            String AM = txtAMaternoTrabajador.getText();
            String Departamento = comboDepartamento.getSelectedItem().toString();
            String Antiguedad = comboAntiguedad.getSelectedItem().toString(); 
            if(nombreTrabajador.equals("") || AP.equals("") || AM.equals("") || Departamento.equals("") || Antiguedad.equals("")){
                JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");

            }
            else{
                if(Departamento.equals("Atencion al Cliente")){
                    
                    if(Antiguedad.equals("1 año de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 6 dias de vacaciones");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 14 dias de vacaciones");
                    }
                    if(Antiguedad.equals("7 años o mas de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 20 dias de vacaciones");
                    }
                }
                if(Departamento.equals("Departamento de Logistica")){
                    
                    if(Antiguedad.equals("1 año de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 7 dias de vacaciones");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " + 
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 15 dias de vacaciones");
                    }
                    if(Antiguedad.equals("7 años o mas de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 22 dias de vacaciones");
                    }
                }
                if(Departamento.equals("Departamento de Gerencia")){
                    
                    if(Antiguedad.equals("1 año de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 10 dias de vacaciones");
                    }
                    if(Antiguedad.equals("2 a 6 años de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 20 dias de vacaciones");
                    }
                    if(Antiguedad.equals("7 años o mas de servicio")){
                        textarea1.setText("\n    El trabajador " + nombreTrabajador + " " +
                        AP + " " + AM + "\n    quien labora en " + Departamento + " con " +
                        Antiguedad + "\n    recibe 30 dias de vacaciones");
                    }
                }
            }
        }
        if (e.getSource() == miRojo){
            getContentPane().setBackground(new Color (255,0,0));
        }
        if (e.getSource() == miNegro){
            getContentPane().setBackground(new Color (0,0,0));
        }
	    if (e.getSource() == miMorado){
            getContentPane().setBackground(new Color (51,0,51));
        }
        if (e.getSource() == miNuevo){	
            txtNombreTrabajador.setText("");
            txtAPaternoTrabajador.setText("");        
            txtAMaternoTrabajador.setText(""); 
            comboDepartamento.setSelectedItem(0);
            comboAntiguedad.setSelectedItem(0);
            textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
        }

	    if (e.getSource() == miSalir){
            Bienvenida ventanaBienvenida = new Bienvenida();
            ventanaBienvenida.setBounds(0,0,350,450);
            ventanaBienvenida.setVisible(true);
            ventanaBienvenida.setResizable(false);
            ventanaBienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
	    }
        if (e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null, "Felipe Alonso");
        }
    }

    public static void main(String args[]) {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);
    } 
}