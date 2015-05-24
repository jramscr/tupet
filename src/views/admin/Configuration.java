package views.admin;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Configuration extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public Configuration() {
		setTitle("Tablero administración TUPET");
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
		tabbedPane.setBounds(0, 0, 800, 456);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Configuraciones", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 779, 410);
		panel_1.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("Tipo Mascota", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblListaDeTipos = new JLabel("Lista de Tipos");
		lblListaDeTipos.setBounds(6, 6, 360, 16);
		panel.add(lblListaDeTipos);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(6, 34, 360, 324);
		panel.add(scrollPane_8);
		
		JList<?> list_8 = new JList<Object>();
		scrollPane_8.setViewportView(list_8);
		
		textField = new JTextField();
		textField.setBounds(388, 33, 235, 38);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.setBounds(635, 34, 117, 38);
		panel.add(btnInsertar);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setBounds(388, 114, 117, 38);
		panel.add(btnEliminar_1);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_1.addTab("Raza Mascota", null, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel label_2 = new JLabel("Lista de Tipos");
		label_2.setBounds(6, 6, 360, 16);
		panel_6.add(label_2);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(6, 34, 360, 324);
		panel_6.add(scrollPane_9);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(388, 33, 235, 38);
		panel_6.add(textField_1);
		
		JButton button_6 = new JButton("Insertar");
		button_6.setBounds(635, 34, 117, 38);
		panel_6.add(button_6);
		
		JButton button_7 = new JButton("Eliminar");
		button_7.setBounds(388, 171, 117, 38);
		panel_6.add(button_7);
		
		JComboBox<?> comboBox = new JComboBox<Object>();
		comboBox.setBounds(388, 72, 235, 47);
		panel_6.add(comboBox);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_1.addTab("Preguntas Adopción", null, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel label_3 = new JLabel("Lista de Tipos");
		label_3.setBounds(6, 6, 360, 16);
		panel_7.add(label_3);
		
		JScrollPane scrollPane_10 = new JScrollPane();
		scrollPane_10.setBounds(6, 34, 360, 324);
		panel_7.add(scrollPane_10);
		
		JButton button_8 = new JButton("Insertar");
		button_8.setBounds(635, 34, 117, 38);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("Eliminar");
		button_9.setBounds(388, 250, 117, 38);
		panel_7.add(button_9);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setBounds(388, 34, 241, 203);
		panel_7.add(scrollPane_11);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		scrollPane_11.setViewportView(textArea);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_1.addTab("Preguntas Predicción", null, panel_8, null);
		panel_8.setLayout(null);
		
		JLabel label_4 = new JLabel("Lista de Tipos");
		label_4.setBounds(6, 6, 360, 16);
		panel_8.add(label_4);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(6, 34, 360, 324);
		panel_8.add(scrollPane_12);
		
		JButton button_10 = new JButton("Insertar");
		button_10.setBounds(635, 34, 117, 38);
		panel_8.add(button_10);
		
		JButton button_11 = new JButton("Eliminar");
		button_11.setBounds(388, 250, 117, 38);
		panel_8.add(button_11);
		
		JScrollPane scrollPane_13 = new JScrollPane();
		scrollPane_13.setBounds(388, 34, 241, 203);
		panel_8.add(scrollPane_13);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Usuarios", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnAgregarALa = new JButton("Agregar a la lista Negra >>");
		btnAgregarALa.setBounds(295, 77, 200, 52);
		panel_2.add(btnAgregarALa);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 6, 273, 398);
		panel_2.add(scrollPane);
		
		JList<?> list = new JList<Object>();
		scrollPane.setViewportView(list);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(507, 6, 266, 398);
		panel_2.add(scrollPane_1);
		
		JList<?> list_1 = new JList<Object>();
		scrollPane_1.setViewportView(list_1);
		
		JButton button = new JButton("<< Remover de lista negra");
		button.setBounds(295, 141, 200, 52);
		panel_2.add(button);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(295, 206, 200, 52);
		panel_2.add(btnSalvar);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Mascotas", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 38, 288, 366);
		panel_3.add(scrollPane_2);
		
		JList<?> list_2 = new JList<Object>();
		scrollPane_2.setViewportView(list_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(485, 38, 288, 366);
		panel_3.add(scrollPane_3);
		
		JList<?> list_3 = new JList<Object>();
		scrollPane_3.setViewportView(list_3);
		
		JLabel lblltimasMascotasAdoptadas = new JLabel("Últimas Mascotas Adoptadas");
		lblltimasMascotasAdoptadas.setBounds(6, 10, 288, 16);
		panel_3.add(lblltimasMascotasAdoptadas);
		
		JLabel lblMascotasSinAdoptar = new JLabel("Mascotas sin Adoptar");
		lblMascotasSinAdoptar.setBounds(485, 10, 288, 16);
		panel_3.add(lblMascotasSinAdoptar);
		
		JButton btnVer = new JButton("Ver");
		btnVer.setBounds(306, 185, 167, 36);
		panel_3.add(btnVer);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Formulario Adopción", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(485, 38, 288, 366);
		panel_4.add(scrollPane_4);
		
		JList<?> list_4 = new JList<Object>();
		scrollPane_4.setViewportView(list_4);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(6, 38, 288, 366);
		panel_4.add(scrollPane_5);
		
		JList<?> list_5 = new JList<Object>();
		scrollPane_5.setRowHeaderView(list_5);
		
		JLabel lblPreguntasFormulario = new JLabel("Preguntas activas");
		lblPreguntasFormulario.setBounds(485, 6, 288, 16);
		panel_4.add(lblPreguntasFormulario);
		
		JLabel lblPreguntas = new JLabel("Preguntas disponibles");
		lblPreguntas.setBounds(6, 6, 288, 16);
		panel_4.add(lblPreguntas);
		
		JButton btnAgregar = new JButton("Agregar >>");
		btnAgregar.setBounds(304, 67, 167, 36);
		panel_4.add(btnAgregar);
		
		JButton button_1 = new JButton("<< Remover");
		button_1.setBounds(306, 115, 167, 36);
		panel_4.add(button_1);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(306, 163, 167, 36);
		panel_4.add(btnEliminar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(306, 211, 167, 36);
		panel_4.add(btnGuardar);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Formulario Predicción", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(485, 38, 288, 366);
		panel_5.add(scrollPane_6);
		
		JList<?> list_7 = new JList<Object>();
		scrollPane_6.setViewportView(list_7);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(6, 38, 288, 366);
		panel_5.add(scrollPane_7);
		
		JList<?> list_6 = new JList<Object>();
		scrollPane_7.setViewportView(list_6);
		
		JLabel label = new JLabel("Preguntas activas");
		label.setBounds(485, 6, 288, 16);
		panel_5.add(label);
		
		JLabel label_1 = new JLabel("Preguntas disponibles");
		label_1.setBounds(6, 6, 288, 16);
		panel_5.add(label_1);
		
		JButton button_2 = new JButton("Agregar >>");
		button_2.setBounds(305, 95, 167, 36);
		panel_5.add(button_2);
		
		JButton button_3 = new JButton("<< Remover");
		button_3.setBounds(305, 141, 167, 36);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("Eliminar");
		button_4.setBounds(306, 185, 167, 36);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("Guardar");
		button_5.setBounds(306, 229, 167, 36);
		panel_5.add(button_5);
	}
}
