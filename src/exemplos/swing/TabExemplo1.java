package exemplos.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class TabExemplo1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8060008189977542072L;
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabExemplo1 frame = new TabExemplo1();
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
	public TabExemplo1() {

		String[] nomesColunas = { "Primeiro Nome", "Ultimo Nome", "Esporte", "# no Ano", "Vegetariano" };

		Object[][] dadosTabela = { 
					{ "Kathy", "Smith", "Snowboarding", new Integer(5), new Boolean(false) },
					{ "John", "Doe", "Rowing", new Integer(3), new Boolean(true) },
					{ "Sue", "Black", "Knitting", new Integer(2), new Boolean(false) },
					{ "Jane", "White", "Speed reading", new Integer(20), new Boolean(true) },
					{ "Joe", "Brown", "Pool", new Integer(10), new Boolean(false) } 
				};

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 11, 391, 239);
		contentPane.add(scrollPane);

		table = new JTable(dadosTabela, nomesColunas);
		scrollPane.setViewportView(table);
	}

}
