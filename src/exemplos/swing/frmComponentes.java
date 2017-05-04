package exemplos.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class frmComponentes extends JFrame {

	private JPanel contentPane;
	private JTextField txtTextfield;
	private JPasswordField pwdJpasswordfield;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmComponentes frame = new frmComponentes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmComponentes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabelEtiqueta = new JLabel("Label - Etiqueta - Texto");
		lblLabelEtiqueta.setBounds(29, 37, 158, 14);
		contentPane.add(lblLabelEtiqueta);
		
		txtTextfield = new JTextField();
		txtTextfield.setText("TextField");
		txtTextfield.setBounds(29, 62, 86, 20);
		contentPane.add(txtTextfield);
		txtTextfield.setColumns(10);
		
		JButton btnBoto = new JButton("Bot\u00E3o");
		btnBoto.setBounds(29, 93, 89, 23);
		contentPane.add(btnBoto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecao 1", "Selecao 2", "Selecao 3"}));
		comboBox.setBounds(29, 134, 86, 20);
		contentPane.add(comboBox);
		
		JCheckBox chckbxJcheckbox = new JCheckBox("JCheckBox");
		chckbxJcheckbox.setBounds(29, 176, 97, 23);
		contentPane.add(chckbxJcheckbox);
		
		JRadioButton rdbtnJradiobutton = new JRadioButton("JRadioButton");
		rdbtnJradiobutton.setBounds(29, 216, 109, 23);
		contentPane.add(rdbtnJradiobutton);
		
		JTextArea txtrJtextarea = new JTextArea();
		txtrJtextarea.setText("JTextArea");
		txtrJtextarea.setBounds(165, 60, 177, 94);
		contentPane.add(txtrJtextarea);
		
		pwdJpasswordfield = new JPasswordField();
		pwdJpasswordfield.setText("JPasswordField");
		pwdJpasswordfield.setBounds(165, 177, 177, 20);
		contentPane.add(pwdJpasswordfield);
		
		String dados[][] = {{"Heider","985371673"}};
		String colunas[] = {"Nome","Telefone"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(382, 253, 216, -189);
		contentPane.add(scrollPane);
		
		table = new JTable(dados,colunas);
		contentPane.add(table);
		table.setBounds(382, 62, 227, 146);
		

	}
}
