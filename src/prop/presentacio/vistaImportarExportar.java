package prop.presentacio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class vistaImportarExportar extends JFrame {
	private CtrlPresentacio cp;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaImportarExportar frame = new vistaImportarExportar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public void mostrarVista() {
		this.setVisible(true);
	}

	public vistaImportarExportar(CtrlPresentacio cpgeneral) {
		cp = cpgeneral;
		inicialitzarComponents();
	}
	/**
	 * Create the frame.
	 */
	public void inicialitzarComponents() {
		setResizable(false);
		setTitle("Importar/Exportar Dades\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnImportar = new JTextPane();
		txtpnImportar.setBackground(UIManager.getColor("Button.background"));
		txtpnImportar.setEditable(false);
		txtpnImportar.setText("Importar:");
		txtpnImportar.setBounds(110, 173, 63, 21);
		contentPane.add(txtpnImportar);
		
		JTextPane txtpnE = new JTextPane();
		txtpnE.setBackground(UIManager.getColor("Button.background"));
		txtpnE.setEditable(false);
		txtpnE.setText("Exportar:");
		txtpnE.setBounds(110, 221, 63, 21);
		contentPane.add(txtpnE);
		
		textField = new JTextField();
		textField.setBounds(199, 173, 199, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 221, 199, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//vistaMenuPrincipal pancat = new vistaMenuPrincipal();
				//pancat.setVisible(true);
				//dispose();
				cp.mostraPrincipal();
			}
		});
		button.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/flecha.png")));
		button.setBounds(10, 416, 65, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cp.importar(textField.getText());
			}
		});
		button_1.setIcon(new ImageIcon(vistaModificarNomCat.class.getResource("/prop/icons/tick.png")));
		button_1.setBounds(559, 416, 65, 35);
		contentPane.add(button_1);
		
		JButton btnImportar = new JButton("");
		btnImportar.setIcon(new ImageIcon(vistaImportarExportar.class.getResource("/prop/icons/Flaticon_32527.png")));
		btnImportar.addActionListener(new ActionListener() { //boto importar
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jfile = new JFileChooser();
				jfile.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int value = jfile.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION){
					File file = jfile.getSelectedFile();
					textField.setText(file.getAbsolutePath().toString());
				}
			}
		});
		btnImportar.setBounds(412, 170, 95, 25);
		contentPane.add(btnImportar);
		
		JButton btnExportar = new JButton("");
		btnExportar.setIcon(new ImageIcon(vistaImportarExportar.class.getResource("/prop/icons/Flaticon_32527.png")));
		btnExportar.addActionListener(new ActionListener() { //boto exportar
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfile2 = new JFileChooser();
				jfile2.setAcceptAllFileFilterUsed(false);
				jfile2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int value = jfile2.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					File file2 = jfile2.getSelectedFile();
					textField_1.setText(file2.getAbsolutePath().toString());
				}
			}
		});
		btnExportar.setBounds(412, 217, 95, 25);
		contentPane.add(btnExportar);
	}
}
