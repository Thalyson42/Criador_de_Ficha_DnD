package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.Classes;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class EscolherClasse extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JComboBox comboBox;

//	private static final String nomes [] = {"Anao", "Elfo", "Halfling", "Humano", "Draconato", "Gnomo", "Meio_elfo", "Meio_orc", "Tiefling"};
//	private static final String imagens [] = {"/img/anao.png", "/img/elfo.png", "/img/halfling.png", "/img/humano.png", "/img/draconato.png", "/img/gnomo.png", "/img/meio_elfo.png", "/img/meio_orc.png", "/img/tiefling.png"};
//	private final Icon icones[] = {
//			new ImageIcon(getClass().getResource(imagens[0])),
//			new ImageIcon(getClass().getResource(imagens[1])),
//			new ImageIcon(getClass().getResource(imagens[2])),
//			new ImageIcon(getClass().getResource(imagens[3])),
//			new ImageIcon(getClass().getResource(imagens[4])),
//			new ImageIcon(getClass().getResource(imagens[5])),
//			new ImageIcon(getClass().getResource(imagens[6])),
//			new ImageIcon(getClass().getResource(imagens[7])),
//			new ImageIcon(getClass().getResource(imagens[8]))
//	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolherClasse frame = new EscolherClasse(null);
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
	public EscolherClasse(Classes classe) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 483, 178, 36);
		panel.add(comboBox);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(20, 457, 119, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(369, 619, 105, 36);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 11, 499, 644);
		panel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(20, 619, 105, 36);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-604, -12, 1650, 699);
		panel.add(lblNewLabel);
	}
}
