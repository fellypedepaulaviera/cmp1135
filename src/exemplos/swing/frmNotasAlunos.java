package exemplos.swing;

import java.awt.EventQueue;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import exemplos.entidade.EAluno;

public class frmNotasAlunos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7977782361715330798L;

	private JPanel contentPane;
	private JTextField txfNome;
	private TextField txfN1;
	private TextField txfN2;
	private JLabel lblResposta;
	private static frmNotasAlunos frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new frmNotasAlunos();
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
	public frmNotasAlunos() {

		setTitle("Cadastro de Notas de Alunos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMinhaPrimeiraAplicao = new JLabel("Digite as informa\u00E7\u00F5es abaixo:");
		lblMinhaPrimeiraAplicao.setBounds(126, 31, 169, 14);
		contentPane.add(lblMinhaPrimeiraAplicao);

		JButton btnBoto = new JButton("Ok");
		btnBoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = txfNome.getText();
				double n1 = Double.valueOf(txfN1.getText());
				double n2 = Double.valueOf(txfN2.getText());
				EAluno eAluno = new EAluno(1,nome,n1,n2);
				System.out.println(eAluno.toString());
				
				//custom title, warning icon
				JOptionPane.showMessageDialog(frame,
				    eAluno.toString(),
				    "Resultado",
				    JOptionPane.WARNING_MESSAGE);
			}
		});
		
		btnBoto.setBounds(335, 227, 89, 23);
		contentPane.add(btnBoto);

		txfNome = new JTextField();
		txfNome.setBounds(180, 70, 160, 20);
		contentPane.add(txfNome);
		txfNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(126, 76, 46, 14);
		contentPane.add(lblNome);

		lblResposta = new JLabel("Resposta");
		lblResposta.setBounds(126, 211, 61, 14);
		contentPane.add(lblResposta);

		JLabel lblN1 = new JLabel("N1:");
		lblN1.setBounds(126, 121, 46, 14);
		contentPane.add(lblN1);

		JLabel lblN2 = new JLabel("N2:");
		lblN2.setBounds(126, 166, 46, 14);
		contentPane.add(lblN2);

		txfN1 = new TextField();
		txfN1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent tecla) {
				char c = tecla.getKeyChar();
				if ((c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) && !(c >= '0' && c <= '9')) {
					tecla.consume();
				}
			}
		});
		txfN1.setBounds(181, 115, 61, 20);
		contentPane.add(txfN1);

		txfN2 = new TextField();
		txfN2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent tecla) {
				char c = tecla.getKeyChar();
				if ((c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) && !(c >= '0' && c <= '9')) {
					tecla.consume();
				}
			}
		});
		txfN2.setBounds(180, 160, 61, 20);
		contentPane.add(txfN2);
	}
}
