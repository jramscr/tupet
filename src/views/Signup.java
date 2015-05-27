package views;

import application.User;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class Signup extends JFrame {

	private JPanel contentPane;
	private final JTextField txtNombre = new JTextField();
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtDireccin;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JMenu mnArchivo;
	private JMenuItem mntmIngresar;
	private JMenuItem mntmSalir;

	/**
	 * Create the frame.
	 */
	public Signup() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setLocationRelativeTo(null);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmIngresar = new JMenuItem("Ingresar");
		mnArchivo.add(mntmIngresar);
		
		mntmSalir = new JMenuItem("Salir");
                mntmSalir.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
		});
		mnArchivo.add(mntmSalir);
                
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(166, 6, 127, 29);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setColumns(10);
		txtApellido.setBounds(313, 6, 127, 29);
		contentPane.add(txtApellido);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(166, 41, 274, 29);
		contentPane.add(txtCorreo);
		
		txtDireccin = new JTextField();
		txtDireccin.setText("Dirección");
		txtDireccin.setColumns(10);
		txtDireccin.setBounds(166, 76, 274, 29);
		contentPane.add(txtDireccin);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Contraseña");
		passwordField.setBounds(166, 115, 127, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("Confirmar contraseña");
		passwordField_1.setBounds(313, 115, 127, 28);
		contentPane.add(passwordField_1);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setEnabled(false);
		lblFoto.setBackground(Color.BLUE);
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setBounds(16, 6, 138, 131);
		contentPane.add(lblFoto);
		
		JButton btnCargarFoto = new JButton("Cargar foto");
		btnCargarFoto.setBounds(16, 149, 117, 29);
		contentPane.add(btnCargarFoto);
		
		JButton btnRegistrarUsuario = new JButton("Registrar Usuario");
		btnRegistrarUsuario.setBounds(306, 221, 138, 29);
		contentPane.add(btnRegistrarUsuario);
                btnRegistrarUsuario.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        User signup = new User();
                        boolean commit = signup.createUser("Adoptante", "Jesus", "Ramos", "jramscr@gmail.com", "12345678", "500 mts al sur de la escuela de la soledad", "c://asfdsfds/asdasf", "password");
                        if (commit == true){
                            JOptionPane.showMessageDialog(null, "Se creo el usuario de manera existosa!!");
                        }
                    }
		});
	}
}
