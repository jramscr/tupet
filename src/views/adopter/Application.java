package views.adopter;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Application extends JFrame {

	private final JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Create the frame.
	 */
	public Application() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 800, 456);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Mascotas en Adopción", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblListaMascotasEn = new JLabel("Lista mascotas en adopción");
		lblListaMascotasEn.setBounds(6, 6, 192, 16);
		panel_3.add(lblListaMascotasEn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 35, 192, 369);
		panel_3.add(scrollPane);
		
		JList<?> list = new JList<>();
		scrollPane.setViewportView(list);
		
		JLabel lblFotomascota = new JLabel("Fotos / Datos de la Mascota");
		lblFotomascota.setEnabled(false);
		lblFotomascota.setBackground(SystemColor.desktop);
		lblFotomascota.setHorizontalAlignment(SwingConstants.CENTER);
		lblFotomascota.setBounds(210, 35, 563, 330);
		panel_3.add(lblFotomascota);
		
		JButton btnFavoritos = new JButton("Favoritos");
		btnFavoritos.setBounds(210, 375, 88, 29);
		panel_3.add(btnFavoritos);
		
		JButton btnAdoptar = new JButton("Adoptar");
		btnAdoptar.setBounds(656, 375, 117, 29);
		panel_3.add(btnAdoptar);
		
		JButton btnMsDetalles = new JButton("Más detalles");
		btnMsDetalles.setBounds(527, 375, 117, 29);
		panel_3.add(btnMsDetalles);
		
		JButton btnFb = new JButton("FB");
		btnFb.setBounds(300, 375, 51, 29);
		panel_3.add(btnFb);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Últimas Adopciones", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Lista mascotas en adopción");
		label.setBounds(6, 6, 192, 16);
		panel.add(label);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 35, 192, 369);
		panel.add(scrollPane_1);
		
		JLabel label_1 = new JLabel("Fotos / Datos de la Mascota");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setEnabled(false);
		label_1.setBackground(Color.GREEN);
		label_1.setBounds(210, 35, 563, 330);
		panel.add(label_1);
		
		JButton btnDenunciarAdoptante = new JButton("Denunciar adoptante");
		btnDenunciarAdoptante.setBounds(610, 375, 163, 29);
		panel.add(btnDenunciarAdoptante);
		
		JButton button_2 = new JButton("Más detalles");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(306, 375, 117, 29);
		panel.add(button_2);
		
		JButton btnPerfilAdoptante = new JButton("Perfil Adoptante");
		btnPerfilAdoptante.setBounds(435, 375, 163, 29);
		panel.add(btnPerfilAdoptante);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Lista Negra de Usuarios", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblListaNegraDe = new JLabel("Lista negra de usuarios");
		lblListaNegraDe.setBounds(6, 6, 192, 16);
		panel_1.add(lblListaNegraDe);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 35, 192, 369);
		panel_1.add(scrollPane_2);
		
		JLabel lblDatosDelUsuario = new JLabel("Datos del usuario");
		lblDatosDelUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDelUsuario.setEnabled(false);
		lblDatosDelUsuario.setBackground(Color.GREEN);
		lblDatosDelUsuario.setBounds(210, 35, 563, 369);
		panel_1.add(lblDatosDelUsuario);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Mi Perfil", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblMiFoto = new JLabel("Mi foto");
		lblMiFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMiFoto.setBounds(6, 34, 301, 276);
		panel_2.add(lblMiFoto);
		
		JButton btnCargarFoto = new JButton("Cargar foto");
		btnCargarFoto.setBounds(103, 329, 117, 29);
		panel_2.add(btnCargarFoto);
		
		JLabel lblMisDatos = new JLabel("Mis datos");
		lblMisDatos.setBounds(319, 6, 454, 16);
		panel_2.add(lblMisDatos);
		
		textField = new JTextField();
		textField.setBounds(319, 34, 454, 36);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(319, 82, 454, 36);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(319, 130, 454, 36);
		panel_2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(319, 178, 454, 36);
		panel_2.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(319, 226, 454, 36);
		panel_2.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(319, 274, 454, 36);
		panel_2.add(textField_5);
		
		JButton btnActualizarDatos = new JButton("Actualizar datos");
		btnActualizarDatos.setBounds(633, 354, 140, 36);
		panel_2.add(btnActualizarDatos);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Registrar rescatado", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblDatosDeMascota = new JLabel("Datos de mascota rescatada");
		lblDatosDeMascota.setBounds(6, 6, 196, 16);
		panel_4.add(lblDatosDeMascota);
		
		JLabel lblNewLabel = new JLabel("Foto Mascota");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 34, 196, 161);
		panel_4.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cargar foto");
		btnNewButton.setBounds(6, 197, 196, 39);
		panel_4.add(btnNewButton);
		
		textField_6 = new JTextField();
		textField_6.setBounds(222, 6, 268, 39);
		panel_4.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(502, 6, 271, 39);
		panel_4.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(222, 57, 268, 39);
		panel_4.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(502, 57, 271, 39);
		panel_4.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(222, 108, 268, 39);
		panel_4.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(502, 108, 271, 39);
		panel_4.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(222, 159, 268, 39);
		panel_4.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(502, 159, 271, 39);
		panel_4.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(222, 211, 268, 39);
		panel_4.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(502, 211, 271, 39);
		panel_4.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(222, 262, 268, 39);
		panel_4.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(502, 262, 271, 39);
		panel_4.add(textField_17);
		
		JButton btnRegistrarRescatado = new JButton("Registrar rescatado");
		btnRegistrarRescatado.setBounds(577, 365, 196, 39);
		panel_4.add(btnRegistrarRescatado);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Mis rescatados", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblMisRescatados = new JLabel("Mis rescatados");
		lblMisRescatados.setBounds(6, 6, 281, 16);
		panel_5.add(lblMisRescatados);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(6, 33, 281, 371);
		panel_5.add(scrollPane_3);
		
		JList<?> list_1 = new JList<Object>();
		scrollPane_3.setViewportView(list_1);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(301, 64, 139, 46);
		panel_5.add(btnActualizar);
		
		JButton btnDarEnAdopcin = new JButton("Dar en adopción");
		btnDarEnAdopcin.setBounds(301, 122, 139, 46);
		panel_5.add(btnDarEnAdopcin);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setBounds(459, 31, 314, 198);
		panel_5.add(lblFoto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(459, 254, 314, 26);
		panel_5.add(lblNombre);
		
		JLabel lblRaza = new JLabel("Raza");
		lblRaza.setBounds(459, 292, 314, 26);
		panel_5.add(lblRaza);
	}
}
