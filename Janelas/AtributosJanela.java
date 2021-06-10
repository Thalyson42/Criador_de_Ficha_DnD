package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import CriadorDeFicha.Classes;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class AtributosJanela extends JFrame {

	private JPanel contentPane;
	private JFormattedTextField[] formattedTextField;
	private ArrayList<Integer> atributos = new ArrayList<Integer>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtributosJanela frame = new AtributosJanela(null);
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
	public AtributosJanela(Classes classe) {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 865, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ROLL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[0].setText(Integer.toString(atr));
			}
		});
		btnNewButton.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton.setBounds(22, 291, 85, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ROLL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[1].setText(Integer.toString(atr));
			}
		});
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton_1.setBounds(165, 291, 75, 34);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Distribuir Pontos De Atributos");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblNewLabel.setBounds(315, 11, 282, 87);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FOR\u00C7A");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_1.setBounds(33, 117, 68, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESTREZA");
		lblNewLabel_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_2.setBounds(156, 117, 102, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONSTITUI\u00C7\u00C3O");
		lblNewLabel_3.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		lblNewLabel_3.setBounds(287, 117, 135, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("INTELIG\u00CANCIA");
		lblNewLabel_4.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		lblNewLabel_4.setBounds(432, 117, 120, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("SABEDORIA");
		lblNewLabel_5.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_5.setBounds(588, 117, 102, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CARISMA");
		lblNewLabel_6.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_6.setBounds(728, 117, 89, 23);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton_2 = new JButton("ROLL");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[2].setText(Integer.toString(atr));
			}
		});
		btnNewButton_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton_2.setBounds(301, 291, 75, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ROLL");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[3].setText(Integer.toString(atr));
			}
		});
		btnNewButton_3.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton_3.setBounds(447, 291, 75, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ROLL");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[4].setText(Integer.toString(atr));
			}
		});
		btnNewButton_4.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton_4.setBounds(597, 291, 75, 34);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("ROLL");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int atr = classe.getAtribuirHabilidades().setSorte();
				formattedTextField[5].setText(Integer.toString(atr));
			}
		});
		btnNewButton_5.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnNewButton_5.setBounds(728, 291, 75, 34);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("AVAN\u00C7AR");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < formattedTextField.length; i++) 
					atributos.add(Integer.valueOf(formattedTextField[i].getText()));
				
				classe.getAtribuirHabilidades().setAtributo(atributos);
				AntecedentesJanela antecedentesJanela = new AntecedentesJanela(classe);
				setVisible(false);
				antecedentesJanela.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btnNewButton_6.setBounds(694, 420, 120, 46);
		contentPane.add(btnNewButton_6);
		
		formattedTextfield();
	}
	
	public void formattedTextfield() {
		List<String> atributos = Arrays.asList("Força", "Destreza", "Constituição", "Inteligência", "Sabedoria", "Carisma");
		formattedTextField = new JFormattedTextField[atributos.size()];
		for(int i =0; i < formattedTextField.length; i++) {
			formattedTextField[i] = new JFormattedTextField(createFormatter("##"));
			formattedTextField[i].setHorizontalAlignment(SwingConstants.CENTER);
			formattedTextField[i].setFont(new Font("Monotype Corsiva", Font.PLAIN, 22));
			formattedTextBounds(i);
			contentPane.add(formattedTextField[i]);
		}
	}
	
	public void formattedTextBounds(int i) {
		switch(i) {
		case 0:
			formattedTextField[i].setBounds(22, 171, 79, 82);
		break;
		
		case 1:
			formattedTextField[i].setBounds(165, 171, 79, 82);
		break;
		
		case 2:
			formattedTextField[i].setBounds(297, 171, 79, 82);
		break;
		
		case 3:
			formattedTextField[i].setBounds(443, 171, 79, 82);
		break;
		
		case 4:
			formattedTextField[i].setBounds(593, 171, 79, 82);
		break;
		
		case 5:
			formattedTextField[i].setBounds(724, 171, 79, 82);
		break;
		}
	}
	
	public MaskFormatter createFormatter(String s) {
		MaskFormatter formatter = null;
		try {
			formatter = new MaskFormatter(s);
		} catch (java.text.ParseException exc) {
			//
		}
		return formatter;
	}
	
}
