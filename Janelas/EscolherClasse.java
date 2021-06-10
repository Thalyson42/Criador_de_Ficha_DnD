package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.Barbaro;
import CriadorDeFicha.Bardo;
import CriadorDeFicha.Bruxo;
import CriadorDeFicha.Classes;
import CriadorDeFicha.Clerigo;
import CriadorDeFicha.Druida;
import CriadorDeFicha.Feiticeiro;
import CriadorDeFicha.Guerreiro;
import CriadorDeFicha.Ladino;
import CriadorDeFicha.Mago;
import CriadorDeFicha.Monge;
import CriadorDeFicha.Paladino;
import CriadorDeFicha.Patrulheiro;

import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class EscolherClasse extends JFrame {
	
	private Barbaro barbaro = new Barbaro();
	private Bardo bardo = new Bardo();
	private Bruxo bruxo = new Bruxo();
	private Clerigo clerigo = new Clerigo();
	private Druida druida = new Druida();
	private Feiticeiro feiticeiro = new Feiticeiro();
	private Guerreiro guerreiro = new Guerreiro();
	private Ladino ladino = new Ladino();
	private Mago mago = new Mago();
	private Monge monge = new Monge();
	private Paladino paladino = new Paladino();
	private Patrulheiro patrulheiro = new Patrulheiro();
	
	private JPanel contentPane;
	private JTextField txtEscolhaUmaClasse;
	private JPanel panel;
	private JComboBox<String> comboBox;
	private JButton btnNewButton;
	private JLabel background;
	private JTextArea areatext;
	private JPanel panel_1;
	private CheckBoxHandler manipulador;
	private JCheckBox[] checkList;
	private int max_selections = 0;
	private int selectionCounter = 0;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private radioButtonHandlerGP1 rbhGroup1;
	private radioButtonHandlerGP2 rbhGroup2;
	private boolean radioGroup_1;
	private boolean radioGroup_2;
	
//	private List<String> p = Arrays.asList("Acrobacia", "Adestrar Animais", "Arcanismo", "Atletismo", "Enganação", "História", "Intuição", "Intimidação", "Investigação", "Medicina", "Natereza", "Percepção", "Atuação", "Persuasão", "Religião", "Prestidigitação", "Furtividade", "Sobrevivência");
	private JButton btnNewButton_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	
	

	private static final String nomes [] = {"Barbaro", "Bardo", "Bruxo", "Clerigo", "Druida", "Feiticeiro", "Guerreiro", "Ladino", "Mago", "Monge", "Paladino", "Patrulheiro"};
//	private static final String imagens [] = {"/img/barbaro.png", "/img/bardo.png", "/img/bruxo.png", "/img/clerigo.png", "/img/druida.png", "/img/feiticeiro.png", "/img/guerreiro.png", "/img/ladino.png", "/img/mago.png", "/img/monge.png", "/img/paladino.png", "/img/patrulheiro.png"};
//	private final Icon icones[] = {
//			new ImageIcon(getClass().getResource(imagens[0])),
//			new ImageIcon(getClass().getResource(imagens[1])),
//			new ImageIcon(getClass().getResource(imagens[2])),
//			new ImageIcon(getClass().getResource(imagens[3])),
//			new ImageIcon(getClass().getResource(imagens[4])),
//			new ImageIcon(getClass().getResource(imagens[5])),
//			new ImageIcon(getClass().getResource(imagens[6])),
//			new ImageIcon(getClass().getResource(imagens[7])),
//			new ImageIcon(getClass().getResource(imagens[8])),
//			new ImageIcon(getClass().getResource(imagens[9])),
//			new ImageIcon(getClass().getResource(imagens[10])),
//			new ImageIcon(getClass().getResource(imagens[11]))
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

	class CheckBoxHandler implements ItemListener {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			JCheckBox source = (JCheckBox) e.getSource();
			
			if(source.isSelected()) {
				selectionCounter++;
				if (selectionCounter == max_selections)
					for (JCheckBox box: checkList)
						if (!box.isSelected())
							box.setEnabled(false);
			} else {
				selectionCounter--;
				if (selectionCounter < max_selections)
					for (JCheckBox box: checkList)
						box.setEnabled(true);
			}
			
		}
	}
	

	class radioButtonHandlerGP1 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton source = (JRadioButton) e.getSource();
			
			if(source.isSelected()) {
				radioGroup_1 = true;
				comboBox_1.setEnabled(false);
				
			}else {
				radioGroup_1 = false;
				comboBox_1.setEnabled(true);
			}
			
		}
		
	}
	
	class radioButtonHandlerGP2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			JRadioButton source = (JRadioButton) e.getSource();
			
			if(source.isSelected()) {
				radioGroup_2 = true;
				comboBox_2.setEnabled(false);
			}else {
				radioGroup_2 = false;
				comboBox_2.setEnabled(true);
			}
			
		}
		
	}
	/**
	 * Create the frame.
	 */
	public EscolherClasse(Classes classe) {
		setTitle("Criando classe");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		panel = new JPanel();
		tabbedPane.addTab("Classe", null, panel, null);
		panel.setLayout(null);
		
		comboBox = new JComboBox<String>(nomes);
		comboBox.setMaximumRowCount(9);
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
				//	background.setIcon(icones[comboBox.getSelectedIndex()]);
					atualizarAreaText(comboBox.getItemAt(comboBox.getSelectedIndex()));
				}
			}
		});
		comboBox.setBounds(20, 483, 178, 36);
		panel.add(comboBox);
		
		txtEscolhaUmaClasse = new JTextField();
		txtEscolhaUmaClasse.setText("Escolha uma classe");
		txtEscolhaUmaClasse.setEditable(false);
		txtEscolhaUmaClasse.setBounds(20, 457, 119, 20);
		panel.add(txtEscolhaUmaClasse);
		txtEscolhaUmaClasse.setColumns(10);
		
		btnNewButton = new JButton("AVAN\u00C7AR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClasseSelecionada(comboBox.getItemAt(comboBox.getSelectedIndex()), classe);
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(369, 619, 105, 36);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 11, 499, 644);
		panel.add(scrollPane);
		
		areatext = new JTextArea();
		atualizarAreaText("Barbaro");
		areatext.setEditable(false);
		scrollPane.setViewportView(areatext);
		
		background = new JLabel("New label");
		background.setBounds(-604, -12, 1650, 699);
		panel.add(background);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		tabbedPane.setEnabledAt(1, false);
		panel_1.setLayout(null);
		
		btnNewButton_2 = new JButton("Avançar");
		btnNewButton_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					for(int i = 0; i < checkList.length; i++) {
						if (checkList[i].isSelected())
							classe.getProficiencia().aplicandoPericia(checkList[i].getText());
					}
					if(!comboBox_1.isEnabled() && radioGroup_1) {
						ButtonModel b = buttonGroup.getSelection();
						String t = b.getActionCommand();
						classe.getFicha().setEquipamentos(t);
					}else {
						classe.getFicha().setEquipamentos(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()));
					}
					
					if(!comboBox_2.isEnabled() && radioGroup_2) {
						ButtonModel b = buttonGroup.getSelection();
						String t = b.getActionCommand();
						classe.getFicha().setEquipamentos(t);
					}else {
						classe.getFicha().setEquipamentos(comboBox_2.getItemAt(comboBox_2.getSelectedIndex()));
					}
			}
		});
		btnNewButton_2.setBounds(935, 630, 113, 44);
		panel_1.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("PERICIAS");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel.setBounds(107, 24, 101, 27);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EQUIPAMENTOS");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_1.setBounds(677, 27, 155, 20);
		panel_1.add(lblNewLabel_1);
				
		manipulador = new CheckBoxHandler();
		rbhGroup1 = new radioButtonHandlerGP1();
		rbhGroup2 = new radioButtonHandlerGP2();
		
	}
	
	
	public void ClasseSelecionada(String classe, Classes equips) {
		equips.getEquips().iniciaAllarmas();

		switch(classe) {
		case "Barbaro":
			List<String> equips2 = Arrays.asList("Adaga", "Azagaia", "Bordão", "Clava Grande", "Foice Curta", "Lança", "Maça", "Machadinha", "Martelo Leve", "Porrete", "Arco Curto", "Besta leve", "Dardo", "Funda");
			pericias(barbaro.getPericiasList(), 2);
			aba2equipamentos("Barbaro", equips.getEquips().getArmas_marciais_CAC(), equips2);
		break;
		
		case "Bardo":
			
		break;
		
		case "Bruxo":
		break;
		
		case "Clerigo":
		break;
		
		case "Druida":
		break;
		
		case "Feiticeiro":
		break;
		
		case "Guerreiro":
		break;
		
		case "Ladino":
		break;
		
		case "Mago":
		break;
		
		case "Monge":
		break;
		
		case "Paladino":
		break;
		
		case "Patrulheiro":
		break;
		
		}
	}
	
	public void aba2equipamentos(String classe, List<String> equipamentos, List<String> equipamentos2) {
		String[] equips = equipamentos.toArray(new String[equipamentos.size()]);
		String[] equips2 = equipamentos.toArray(new String[equipamentos.size()]);
		switch(classe) {
		case "Barbaro":
			rdbtnNewRadioButton = new JRadioButton("Um Machado Grande");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
			rdbtnNewRadioButton.setBounds(546, 78, 178, 23);
			rdbtnNewRadioButton.setActionCommand("Grande Machado");
			rdbtnNewRadioButton.addItemListener(rbhGroup1);
			panel_1.add(rdbtnNewRadioButton);
			
			rdbtnNewRadioButton_1 = new JRadioButton("Qualquer Arma Marcial Corpo-A-Corpo");
			buttonGroup.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
			rdbtnNewRadioButton_1.setBounds(793, 78, 255, 23);
			panel_1.add(rdbtnNewRadioButton_1);
			
			comboBox_1 = new JComboBox<String>(equips);
			comboBox_1.setBounds(589, 121, 342, 34);
			comboBox_1.setEnabled(false);
			panel_1.add(comboBox_1);
			
			rdbtnNewRadioButton_2 = new JRadioButton("Dois Machados De M\u00E3o");
			buttonGroup_1.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
			rdbtnNewRadioButton_2.setBounds(546, 199, 178, 23);
			rdbtnNewRadioButton_2.setActionCommand("(2) Machados de Mão");
			rdbtnNewRadioButton_2.addItemListener(rbhGroup2);
			panel_1.add(rdbtnNewRadioButton_2);
			
			rdbtnNewRadioButton_3 = new JRadioButton("Qualquer Arma Simples");
			buttonGroup_1.add(rdbtnNewRadioButton_3);
			rdbtnNewRadioButton_3.setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
			rdbtnNewRadioButton_3.setBounds(793, 199, 255, 23);
			panel_1.add(rdbtnNewRadioButton_3);
			
			comboBox_2 = new JComboBox<String>(equips2);
			comboBox_2.setBounds(589, 247, 342, 34);
			comboBox_2.setEnabled(false);
			panel_1.add(comboBox_2);
		break;
		}
	}
	
	public void pericias(List<String> pericias, int max_selections) {
		this.max_selections = max_selections;
		checkList = new JCheckBox[pericias.size()];
		for(int i =0; i < pericias.size(); i++) {
			checkList[i] = new JCheckBox(pericias.get(i));
			checkList[i].setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
			checkBoxBounds(i);
			checkList[i].addItemListener(manipulador);
			panel_1.add(checkList[i]);
		}
		
	}
	
	public void checkBoxBounds(int i) {
		switch(i) {
		case 0:
			checkList[i].setBounds(45, 93, 136, 23);
		break;
		
		case 1:
			checkList[i].setBounds(45, 130, 136, 23);
		break;
		
		case 2:
			checkList[i].setBounds(45, 170, 136, 23);
		break;
		
		case 3:
			checkList[i].setBounds(45, 210, 136, 23);
		break;
		
		case 4:
			checkList[i].setBounds(45, 250, 136, 23);
		break;
		
		case 5:
			checkList[i].setBounds(45, 290, 136, 23);
		break;
		
		case 6:
			checkList[i].setBounds(45, 330, 136, 23);
		break;
		
		case 7:
			checkList[i].setBounds(45, 370, 136, 23);
		break;
		
		case 8:
			checkList[i].setBounds(45, 410, 136, 23);
		break;
		
		case 9:
			checkList[i].setBounds(222, 93, 136, 23);
		break;
		
		case 10:
			checkList[i].setBounds(222, 130, 136, 23);
		break;
		
		case 11:
			checkList[i].setBounds(222, 170, 136, 23);
		break;
		
		case 12:
			checkList[i].setBounds(222, 210, 136, 23);
		break;
		
		case 13:
			checkList[i].setBounds(222, 250, 136, 23);
		break;
		
		case 14:
			checkList[i].setBounds(222, 290, 136, 23);
		break;
		
		case 15:
			checkList[i].setBounds(222, 330, 136, 23);
		break;
		
		case 16:
			checkList[i].setBounds(222, 370, 136, 23);
		break;
		
		case 17:
			checkList[i].setBounds(222, 410, 136, 23);
		break;
		}
	}
		
	public void atualizarAreaText(String classes) {

		switch(classes) {
		case "Barbaro":
			areatext.setText(barbaro.barbaroDescricao());
			areatext.append(barbaro.barbaroCaracteristicasClasse());
			areatext.append(barbaro.barbaroTabela());
		break;
		
		case "Bardo":
			areatext.setText(bardo.bardoDescricao());
			areatext.append(bardo.bardoCaracteristicas());
		break;
		
		case "Bruxo":
			areatext.setText(bruxo.bruxoDescricao());
			areatext.append(bruxo.bruxoCaracteristicas());
		break;
		
		case "Clerigo":
			areatext.setText(clerigo.clerigoDescricao());
			areatext.append(clerigo.clerigoCaracteristicasClasse());
		break;
		
		case "Druida":
			areatext.setText(druida.druidaDescricao());
			areatext.append(druida.CaracteristicasClasse());
		break;
		
		case "Feiticeiro":
			areatext.setText(feiticeiro.feiticeiroDescricao());
			areatext.append(feiticeiro.caracteristicasClasse());
		break;
		
		case "Guerreiro":
			areatext.setText(guerreiro.guerreiroDescricao());
			areatext.append(guerreiro.guerreiroCaracteristicas());
		break;
		
		case "Ladino":
			areatext.setText(ladino.ladinoDescricao());
			areatext.append(ladino.ladinoCaracteristicas());
		break;
		
		case "Mago":
			areatext.setText(mago.magoDescricao());
			areatext.append(mago.magoCaracteristicas());
		break;
		
		case "Monge":
			areatext.setText(monge.mongeDescricao());
			areatext.append(monge.mongeCaracteristicas());
		break;
		
		case "Paladino":
			areatext.setText(paladino.paladinoDescricao());
			areatext.append(paladino.paladinoCaracteristicas());
		break;
		
		case "Patrulheiro":
			areatext.setText(patrulheiro.patrulheiroDescricao());
			areatext.append(patrulheiro.patrulheiroCaracteristicas());
		break;
		
		}
	}
}
