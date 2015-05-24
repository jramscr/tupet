package views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import views.admin.*;
import views.adopter.*;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField inputEmail;
	private JTextField inputPassword;
	private final JButton buttonEnter = new JButton("Ingresar");

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Ingresar TUPET");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmRegistrarUsuario = new JMenuItem("Registrar Usuario");
                mntmRegistrarUsuario.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Signup register_user = new Signup();
                        register_user.setVisible(true);
                    }
                });
		mnArchivo.add(mntmRegistrarUsuario);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
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
		
		inputEmail = new JTextField();
		inputEmail.setHorizontalAlignment(SwingConstants.CENTER);
		inputEmail.setText("correo");
		inputEmail.setToolTipText("correo");
		inputEmail.setBounds(154, 75, 134, 28);
		contentPane.add(inputEmail);
		inputEmail.setColumns(10);
		
		inputPassword = new JTextField();
		inputPassword.setHorizontalAlignment(SwingConstants.CENTER);
		inputPassword.setToolTipText("contraseña");
		inputPassword.setText("contraseña");
		inputPassword.setColumns(10);
		inputPassword.setBounds(154, 115, 134, 28);
		contentPane.add(inputPassword);
		buttonEnter.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
                            //If user exists.
				if(true){
                                    //If user is and admin
                                    if(false){
                                        Configuration configuration = new Configuration();
                                        configuration.setVisible(true);
                                    //If user is not an admin
                                    }else{
                                        Application application = new Application();
                                        application.setVisible(true);
                                    }
				}else{
                                    JOptionPane.showMessageDialog(null, "No existe el Usuario");
				}
			}
		});
		buttonEnter.setBounds(154, 151, 134, 29);
		contentPane.add(buttonEnter);
	}
}
