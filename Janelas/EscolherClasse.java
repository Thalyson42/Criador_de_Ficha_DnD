package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Backgrounds.Antecedentes;
import Classes.ChosingClass;
import CriadorDeFicha.Classes;
import CriadorDeFicha.Equipamentos;
import CriadorDeFicha.Idiomas;
import CriadorDeFicha.Proficiencia;
import jdbc.modelo.FichaDoPersonagem;

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
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class EscolherClasse extends JFrame implements ChosingClass{
		
	private int max_selections = 0;
	private int selectionCounter = 0;
	
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JTextField txtEscolhaUmaClasse;
	private JButton btnNewButton;
	private JLabel background;
	private JTextArea areatext;
	private CheckBoxHandler manipulador;
	private JCheckBox[] checkList;
	private JComboBox<String> chooseClass;
	private JComboBox<String> equips1;
	private JComboBox<String> equips2;
	private JComboBox<String> equips3;
	private JRadioButton[] chooseEquips;
	private radioButtonHandlerGP1 rbhGroup1;
	private radioButtonHandlerGP2 rbhGroup2;

	
//	private List<String> p = Arrays.asList("Acrobacia", "Adestrar Animais", "Arcanismo", "Atletismo", "Enganação", "História", "Intuição", "Intimidação", "Investigação", "Medicina", "Natereza", "Percepção", "Atuação", "Persuasão", "Religião", "Prestidigitação", "Furtividade", "Sobrevivência");
	private JButton btnNewButton_2;
	private ButtonGroup[] buttonGroup;
//	private ButtonGroup buttonGroup_1;

	
	private static final String nomes [] = {"Barbaro", "Bardo", "Bruxo", "Clerigo", "Druida", "Feiticeiro", "Guerreiro", "Ladino", "Mago", "Monge", "Paladino", "Patrulheiro"};
//	private static final String imagens [] = {"/img/barbaro.jpg", "/img/bardo.jpg", "/img/bruxo.jpg", "/img/clerigo.jpg", "/img/druida.jpg", "/img/feiticeiro.jpg", "/img/guerreiro.jpg", "/img/ladino.jpg", "/img/mago.jpg", "/img/monge.jpg", "/img/paladino.jpg", "/img/patrulheiro.jpg"};
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
//	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {			
					Antecedentes antecedentes = new Antecedentes();
					Idiomas idiomas = new Idiomas();
					Equipamentos equips = new Equipamentos();
					Proficiencia prof = new Proficiencia();
					FichaDoPersonagem ficha = new FichaDoPersonagem();
					Classes.salvarFicha(ficha);
					Classes.setProficiencia(prof);
					Classes.setIdiomas(idiomas);
					Classes.setAntecedens(antecedentes);
					Classes.setEquips(equips);
					EscolherClasse frame = new EscolherClasse();
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
			
			try {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					equips1.setEnabled(true);
					
				}else {
					equips1.setEnabled(false);
				}
				
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
			
		}
		
	}
	
	class radioButtonHandlerGP2 implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {

			try {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					equips2.setEnabled(true);
				}else {
					equips2.setEnabled(false);
				}
				
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
			
		}
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public EscolherClasse() {
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
		tabbedPane.setEnabledAt(0, false);
		
		chooseClass = new JComboBox<String>(nomes);
		chooseClass.setMaximumRowCount(nomes.length);
		chooseClass.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
				//	background.setIcon(icones[chooseClass.getSelectedIndex()]);
					areatext.setText(ChosingClass.getDescriptionClass(chooseClass.getSelectedIndex()));
				}
			}
		});
		chooseClass.setBounds(20, 483, 178, 36);
		panel.add(chooseClass);
		
		txtEscolhaUmaClasse = new JTextField();
		txtEscolhaUmaClasse.setText("Escolha uma classe");
		txtEscolhaUmaClasse.setEditable(false);
		txtEscolhaUmaClasse.setBounds(20, 457, 119, 20);
		panel.add(txtEscolhaUmaClasse);
		txtEscolhaUmaClasse.setColumns(10);
		
		btnNewButton = new JButton("AVAN\u00C7AR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClasseSelecionada(chooseClass.getItemAt(chooseClass.getSelectedIndex()));
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton.setBounds(369, 619, 105, 36);
		panel.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 11, 499, 644);
		panel.add(scrollPane);
		
		areatext = new JTextArea();
		areatext.setText(ChosingClass.getDescriptionClass(0));
		areatext.setEditable(false);
		scrollPane.setViewportView(areatext);
		
		background = new JLabel("/img/barbaro.jpg");
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
				salvaClasse(chooseClass.getItemAt(chooseClass.getSelectedIndex()));
					setVisible(false);
					AtributosJanela atributosJanele = new AtributosJanela();
					atributosJanele.setVisible(true);
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
		
	}
	
	public void ClasseSelecionada(String classe) {
		aba2equipamentos(classe);
		
		switch(classe) {
		case "Barbaro":
			pericias(barbaro.getPericiasList(), 2);
		break;
		
		case "Bardo":
			pericias(bardo.getPericiasList(), 3);
		break;
		
		case "Bruxo":
			pericias(bruxo.getPericiasList(), 2);
		break;
		
		case "Clerigo":
			pericias(clerigo.getPericiasList(), 2);
		break;
		
		case "Druida":
			pericias(druida.getPericiasList(), 2);
		break;
		
		case "Feiticeiro":
			pericias(feiticeiro.getPericiasList(), 2);
		break;
		
		case "Guerreiro":
			pericias(guerreiro.getPericiasList(), 2);
		break;
		
		case "Ladino":
			pericias(guerreiro.getPericiasList(), 4);
		break;
		
		case "Mago":
			pericias(mago.getPericiasList(), 2);
		break;
		
		case "Monge":
			pericias(monge.getPericiasList(), 2);
		break;
		
		case "Paladino":
			pericias(paladino.getPericiasList(), 2);
		break;
		
		case "Patrulheiro":
			pericias(patrulheiro.getPericiasList(), 3);
		break;
		
		}
	}
	
	public void aba2equipamentos(String classe) {
		String[] nameRadioButton;
		String[] nameAction;
		String[] equipaments;
		String[] equipaments2;
		int lengthButtonGroup = 0;
		switch(classe) {
		case "Barbaro":
			equipaments = Classes.getEquips().getArmasMarciaisCAC().toArray(new String[Classes.getEquips().getArmasMarciaisCAC().size()]);
			equipaments2 = Classes.getEquips().getArmasSimplesCAC().toArray(new String[Classes.getEquips().getArmasSimplesCAC().size()]);
			nameRadioButton = new String[] {"Um Machado Grande", "Qualquer Arma Marcial Corpo-A-Corpo", "Dois Machados de Mão", "Qualquer Arma Simples"};
			nameAction = new String[] {"Grande Machado", "", "(2) Machado de Mão", ""};
			lengthButtonGroup = 2;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
			equips2 = new JComboBox<String>(equipaments2);
			equips2.setBounds(589, 247, 342, 34);
			equips2.setEnabled(false);
			panel_1.add(equips2);
		break;
		
		case "Bardo": 
			nameRadioButton = new String[] {"Rapieira", "Espada Longa", "Qualquer Arma Simples", "Pacote de Diplomata", "Pacote de Artista", "lute", "Qualquer outro instrumento musical"};
			nameAction = new String[] {"Rapieira", "Espada Longa", "", "Pacote de Diplomata", "Pacote de Artista", "Lute", ""};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			String[] instrumento_musical = Classes.getEquips().getInstrumentoMusical().toArray(new String[Classes.getEquips().getInstrumentoMusical().size()]);
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
			equips2 = new JComboBox<String>(instrumento_musical);
			equips2.setBounds(589, 361, 342, 34);
			equips2.setEnabled(false);
			panel_1.add(equips2);	
		
		break;
		
		case "Bruxo":
			nameRadioButton = new String[] {"Uma besta leve e 20 Virotes", "Qualquer Arma Simples", "Bolsa de componentes", "Foco arcano", "Pacote de Estudioso", "Pacote de Explorador"};
			nameAction = new String[] {"Besta leve", "", "Bolsa de componentes", "Foco arcano", "Pacote de Estudioso", "Pacote de Explorador"};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
			equips2 = new JComboBox<String>(equipaments);
			equips2.setBounds(589, 361, 342, 34);
			panel_1.add(equips2);
		break;
		
		case "Clerigo":
			//corrigir
			nameRadioButton = new String[] {"Uma maça", "Um martelo de guerra", "Brunea", "Armadura de couro", "Cota de malha", "Uma besta leve e 20 virotes", "Qualquer arma simples", "Pacote de Sacerdote", "Pacote de Aventureiro"};
			nameAction = new String[] {"Uma maça", "Um martelo de guerra", "Brunea", "Armadura de couro", "Cota de malha", "Uma besta leve e 20 virotes", "", "Pacote de Sacerdote", "Pacote de Aventureiro"};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			lengthButtonGroup = 4;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 308, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
		break;
		
		case "Druida":
			nameRadioButton = new String[] {"Um escudo de madeira", "Qualquer arma simples", "Uma cimitarra", "Qualquer arma corpo-a-corpo simples", "Pacote de Estudioso", "Pacote de Explorador"};
			nameAction = new String[] {"Um escudo de madeira", "", "Uma cimitarra", "", "Pacote de Estudioso", "Pacote de Explorador"};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			equipaments2 = Classes.getEquips().getArmasSimplesCAC().toArray(new String[Classes.getEquips().getArmasSimplesCAC().size()]);
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
			equips2 = new JComboBox<String>(equipaments2);
			equips2.setBounds(589, 247, 342, 34);
			equips2.setEnabled(false);
			panel_1.add(equips2);
		break;
		
		case "Feiticeiro":
			nameRadioButton = new String[] {"Uma besta leve e 20 virotes", "Qualquer arma simples", "Uma bolsa de componentes", "Um foco arcano", "Pacote de Explorador", "Pacote de Aventureiro"};
			nameAction = new String[] {"Uma besta leve e 20 virotes", "", "Uma bolsa de componentes", "Um foco arcano", "Pacote de Explorador", "Pacote de Aventureiro"};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
		break;
		
		case "Guerreiro":
			//corrigir
			nameRadioButton = new String[] {"Cota de malha", "Gibão de peles, Arco longo e 20 flechas", "Uma arma marcial e um escudo", "Duas armas marciais", "Uma besta leve e 20 virotes", "Dois machados de arremesso", "Pacote de Aventureiro", "Pacote de Explorador"};
			nameAction = new String[] {"Cota de malha", "Gibão de peles", "Escudo", "", "Besta leve", "Machados de Arremesso (2)", "Pacote de Aventureiro", "Pacote de Explorador"};
			equipaments = Classes.getEquips().getArmasMarciais().toArray(new String[Classes.getEquips().getArmasMarciais().size()]);
			equipaments2 = Classes.getEquips().getArmasMarciais().toArray(new String[Classes.getEquips().getArmasMarciais().size()]);
			lengthButtonGroup = 4;

			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
			equips2 = new JComboBox<String>(equipaments2);
			equips2.setBounds(589, 121, 342, 34);
			equips2.setEnabled(false);
			panel_1.add(equips2);
		break;
		
		case "Ladino":
			nameRadioButton = new String[] {"Rapieira", "Espada longa", "Arco curto e uma aljava com 20 flechas", "Espada curta", "Pacote de Assaltante", "Pacote de Aventureiro", "Pacote de Explorador"};
			nameAction = new String[] {"Rapieira", "Espada longa", "Arco curto", "Espada curta", "Pacote de Assaltante", "Pacote de Aventureiro", "Pacote de Explorador"};
			lengthButtonGroup = 3;

			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
		break;
		
		case "Mago":
			nameRadioButton = new String[] {"Bordão", "Adaga", "Bolsa de componentes", "Foco arcano", "Pacote de Estudioso", "Pacote de Explorador"};
			nameAction = new String[] {"Bordão", "Adaga", "Bolsa de componentes", "Foco arcano", "Pacote de Estudioso", "Pacote de Explorador"};
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
		break;
		
		case "Monge":
			nameRadioButton = new String[] {"Espada curta", "Qualquer arma simples", "Pacote de Explorador", "Pacote de Aventureiro"};
			nameAction = new String[] {"Espada curta", "", "Pacote de Explorador", "Pacote de Aventureiro"};
			equipaments = Classes.getEquips().getArmasSimples().toArray(new String[Classes.getEquips().getArmasSimples().size()]);
			lengthButtonGroup = 2;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips1 = new JComboBox<String>(equipaments);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
		break;
		
		case "Paladino":
			nameRadioButton = new String[] {"Uma arma marcial e um escudo", "Duas armas marciais", "Cinco azagais", "Qualquer arma simples corpo-a-corpo", "Pacote de Sacerdote", "Pacote de Aventureiro"};
			nameAction = new String[] {"Escudo", "", "Cinco azagais", "", "Pacote de Sacerdote", "Pacote de Aventureiro"};
			equipaments = Classes.getEquips().getArmasMarciais().toArray(new String[Classes.getEquips().getArmasMarciais().size()]);
			equipaments2 = Classes.getEquips().getArmasMarciais().toArray(new String[Classes.getEquips().getArmasMarciais().size()]);
			String[] equipaments3 = Classes.getEquips().getArmasSimplesCAC().toArray(new String[Classes.getEquips().getArmasSimplesCAC().size()]);
			lengthButtonGroup = 3;
			
			autoGenerateJRadioButton(nameRadioButton, nameAction, lengthButtonGroup);
			
			equips3 = new JComboBox<String>(equipaments);
			equips3.setBounds(589, 121, 342, 34);
			panel_1.add(equips3);
			
			equips2 = new JComboBox<String>(equipaments2);
			equips2.setBounds(589, 121, 342, 34);
			equips2.setEnabled(false);
			panel_1.add(equips2);
			
			equips1 = new JComboBox<String>(equipaments3);
			equips1.setBounds(589, 121, 342, 34);
			equips1.setEnabled(false);
			panel_1.add(equips1);
			
		break;
		
		case "Patrulheiro":
			
		break;
		}
	}
	
	public void autoGenerateJRadioButton(String[] nameButton, String[] nameAction, int lengthButtonGroup) {
		chooseEquips = new JRadioButton[nameButton.length];
		rbhGroup1 = new radioButtonHandlerGP1();
		rbhGroup2 = new radioButtonHandlerGP2();
		buttonGroup = new ButtonGroup[lengthButtonGroup];
		
		for(int i = 0; i < buttonGroup.length; i++) {
			buttonGroup[i] = new ButtonGroup();
		}
		
		for(int i = 0; i < chooseEquips.length; i++){
			chooseEquips[i] = new JRadioButton(nameButton[i]);
			chooseEquips[i].setActionCommand(nameAction[i]);
			chooseEquips[i].setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
			autoAddJRadioButtonListener(i, chooseClass.getItemAt(chooseClass.getSelectedIndex()));
			autoGenerateJRadioButtonBounds(i, chooseClass.getItemAt(chooseClass.getSelectedIndex()));
			panel_1.add(chooseEquips[i]);
		}
	}
	
	public void autoAddJRadioButtonListener(int pos, String classe) {
		switch(classe) {
		case "Barbaro":
			
			if(pos == 0) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 2) {
				buttonGroup[1].add(chooseEquips[pos]);
			}
			
			if(pos == 1){
				chooseEquips[pos].addItemListener(rbhGroup1);
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 3) {
				chooseEquips[pos].addItemListener(rbhGroup2);
				buttonGroup[1].add(chooseEquips[pos]);
			}
			
		break;
		
		case "Bardo":
			
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 2) {
				buttonGroup[0].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos > 2 && pos <= 4){
				buttonGroup[1].add(chooseEquips[pos]);
			}else if(pos == 5) {
				buttonGroup[2].add(chooseEquips[pos]);
			}else {
				buttonGroup[2].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup2);
			}
			
		break;
		
		case "Bruxo":
			if(pos == 0) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 1) {
				buttonGroup[0].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos > 1 && pos <= 3){
				buttonGroup[1].add(chooseEquips[pos]);
			}else{
				buttonGroup[2].add(chooseEquips[pos]);
			}
		break;
		
		case "Clerigo":
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos > 1 && pos < 5) {
				buttonGroup[1].add(chooseEquips[pos]);
			}else if(pos == 5) {
				buttonGroup[2].add(chooseEquips[pos]);
			}else if(pos == 6) {
				buttonGroup[2].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else {
				buttonGroup[3].add(chooseEquips[pos]);
			}
		break;
		
		case "Druida":
			if(pos == 0) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 1) {
				buttonGroup[0].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos == 2) {
				buttonGroup[1].add(chooseEquips[pos]);
			}else if(pos == 3) {
				buttonGroup[1].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup2);
			}else {
				buttonGroup[2].add(chooseEquips[pos]);
			}
		break;
		
		case "Feiticeiro":
			if(pos == 0) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 1) {
				buttonGroup[0].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos > 1 && pos < 4) {
				buttonGroup[1].add(chooseEquips[pos]);
			}else {
				buttonGroup[2].add(chooseEquips[pos]);
			}
		break;
		
		case "Guerreiro":
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos == 2) {
				buttonGroup[1].add(chooseEquips[pos]);
			}else if(pos == 3) {
				buttonGroup[1].add(chooseEquips[pos]);
				chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos > 3 && pos < 6) {
				buttonGroup[2].add(chooseEquips[pos]);
			}else {
				buttonGroup[3].add(chooseEquips[pos]);
			}
		break;
		
		case "Ladino": case "Mago":
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
			}else if(pos > 1 && pos < 4) {
				buttonGroup[1].add(chooseEquips[pos]);
			}else {
				buttonGroup[2].add(chooseEquips[pos]);
			}
		break;
		
		case "Monge":
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
				if(pos == 1)
					chooseEquips[pos].addItemListener(rbhGroup1);
			}else {
				buttonGroup[1].add(chooseEquips[pos]);
			}
		break;
		
		case "Paladino":
			if(pos <= 1) {
				buttonGroup[0].add(chooseEquips[pos]);
				if(pos == 1)
					chooseEquips[pos].addItemListener(rbhGroup1);
			}else if(pos > 1 && pos < 4) {
				buttonGroup[1].add(chooseEquips[pos]);
				if(pos == 3)
					chooseEquips[pos].addItemListener(rbhGroup2);
			}else {
				buttonGroup[2].add(chooseEquips[pos]);
			}
		break;
		
		case "Patrulheiro":
		break;
		}
	}
	
	public void autoGenerateJRadioButtonBounds(int pos, String selectedClass) {
	
		switch(pos) {
		case 0:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[0].setBounds(550, 78, 100, 23);
			}else {
				chooseEquips[0].setBounds(550, 78, 200, 23);				
			}
		break;
		
		case 1:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[1].setBounds(700, 78, 150, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[1].setBounds(850, 78, 180, 23);	
			}else {
				chooseEquips[1].setBounds(793, 78, 255, 23);
			}
		break;
		
		case 2:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[2].setBounds(865, 78, 178, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[2].setBounds(550, 169, 100, 23);	
			}else {
				chooseEquips[2].setBounds(546, 199, 178, 23);	
			}
		break;
		
		case 3:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[3].setBounds(550, 199, 150, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[3].setBounds(675, 169, 150, 23);
			}else {
				chooseEquips[3].setBounds(793, 199, 255, 23);	
			}
		break;
		
		case 4:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[4].setBounds(865, 199, 255, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[4].setBounds(850, 169, 255, 23);
			}else if(selectedClass.equals("Druida")) {
				chooseEquips[4].setBounds(550, 322, 200, 23);	
			}else {
				chooseEquips[4].setBounds(550, 282, 200, 23);	
			}
		break;
		
		case 5:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[5].setBounds(600, 282, 100, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[5].setBounds(550, 262, 200, 23);	
			}else if(selectedClass.equals("Druida")) {
				chooseEquips[5].setBounds(793, 322, 200, 23);	
			}else {
				chooseEquips[5].setBounds(793, 282, 200, 23);	
			}
		break;
		
		case 6:
			if(selectedClass.equals("Bardo")) {
				chooseEquips[6].setBounds(825, 282, 255, 23);
			}else if(selectedClass.equals("Clerigo")) {
				chooseEquips[6].setBounds(850, 262, 180, 23);	
			}else {
				chooseEquips[6].setBounds(793, 282, 255, 23);	
			}
		break;
		
		case 7:
			chooseEquips[7].setBounds(550, 370, 255, 23);	
		break;
		
		case 8:
			chooseEquips[8].setBounds(850, 370, 255, 23);
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
		
	public void salvaClasse(String classe) {
		for(int i = 0; i < checkList.length; i++) {
			if (checkList[i].isSelected())
				Classes.getProficiencia().aplicandoPericia(checkList[i].getText());
		}
		
		ButtonModel b;
		String t;
		switch(classe) {
		case "Barbaro":
	
			if(!equips1.isEnabled()) {
				b = buttonGroup[0].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
				
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			if(!equips2.isEnabled()) {
				b = buttonGroup[1].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips2.getItemAt(equips2.getSelectedIndex()));
			}
			
			barbaro.setBarbaro();
		break;
		
		case "Bardo":
			
			if(!equips1.isEnabled()) {
				b = buttonGroup[0].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			b = buttonGroup[1].getSelection();
			t = b.getActionCommand();
			Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));

			if(!equips1.isEnabled()) {
				b = buttonGroup[2].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips2.getItemAt(equips2.getSelectedIndex()));
			}
			
			bardo.setBardo();
		break;
		
		case "Bruxo":

			if(!equips1.isEnabled()) {
				b = buttonGroup[0].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			b = buttonGroup[1].getSelection();
			t = b.getActionCommand();
			Classes.getFicha().setEquipamentos(t);//corrigir
			
			b = buttonGroup[2].getSelection();
			t = b.getActionCommand();
			Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
			
			//corrigir
			Classes.getFicha().setEquipamentos("Armadura de couro");
			Classes.getFicha().setEquipamentos("Adagas (2)");
			bruxo.setBruxo();
		break;
		
		case "Clerigo":

			for(int i = 0; i < 4; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				if(i < 2) {
					Classes.getFicha().setEquipamentos(t);//corrigir						
				}else if(i == 3) {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));			
				}
			}
			
			if(!equips1.isEnabled()) {
				b = buttonGroup[2].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			Classes.getFicha().setEquipamentos("Escudo");
			Classes.getFicha().setEquipamentos("Símbolo sagrado");
			clerigo.setClerigo();
		break;
		
		case "Druida":

			if(!equips1.isEnabled()) {
				b = buttonGroup[0].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
				
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			if(!equips2.isEnabled()) {
				b = buttonGroup[1].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
			}else {
				Classes.getFicha().setEquipamentos(equips2.getItemAt(equips2.getSelectedIndex()));
			}
			
			b = buttonGroup[2].getSelection();
			t = b.getActionCommand();
			Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
			
			Classes.getFicha().setEquipamentos("Armadura de couro");
			Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes("Pacote de Aventureiro"));
			Classes.getFicha().setEquipamentos("Foco Druídico");
			druida.setDruida();
		break;
		
		case "Feiticeiro":
			if(!equips1.isEnabled()) {
				b = buttonGroup[0].getSelection();
				t = b.getActionCommand();
				Classes.getFicha().setEquipamentos(t);
				
			}else {
				Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
			}
			
			for(int i = 0; i < 3; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				if(i == 1) {
					Classes.getFicha().setEquipamentos(t);//corrigir						
				}else if(i == 2) {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));			
				}
			}
			feiticeiro.setFeiticeiro();
		break;
		
		case "Guerreiro":
			for(int i = 0; i < buttonGroup.length; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				
				if(i == 0) {
					
					if(t.equals("Gibão de peles")) {
						Classes.getFicha().setEquipamentos(t);
						Classes.getFicha().setEquipamentos("Arco longo");
						Classes.getFicha().setEquipamentos("Flechas (20)");
					}else {
						Classes.getFicha().setEquipamentos(t);
					}
					
				}else if(i == 1) {
					
					if(!equips2.isEnabled()) {
						Classes.getFicha().setEquipamentos(t);
						Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
						
					}else {
						Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
						Classes.getFicha().setEquipamentos(equips2.getItemAt(equips2.getSelectedIndex()));
					}
					
				}else if(i == 2) {
					
					if(t.equals("Besta leve")) {
						Classes.getFicha().setEquipamentos(t);
						Classes.getFicha().setEquipamentos("Virotes (20)");
					}else {
						Classes.getFicha().setEquipamentos(t);
					}
					
				}else {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
				}
				
			}
			guerreiro.setGuerreiro();
		break;
		
		case "Ladino":
			for(int i = 0; i < buttonGroup.length; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				
				if(i == 1 || i == 2) {
					
					if(t.equals("Arco curto")) {
						Classes.getFicha().setEquipamentos(t);
						Classes.getFicha().setEquipamentos("Aljava");
						Classes.getFicha().setEquipamentos("Flechas (20)");
					}else {
						Classes.getFicha().setEquipamentos(t);
					}
					
				}else {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
				}
			}
			ladino.setLadino();
		break;
		
		case "Mago":
			for(int i = 0; i < buttonGroup.length; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				
				if(i == 2) {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
				}else {
					Classes.getFicha().setEquipamentos(t);
				}
			}
			mago.setMago();
		break;
		
		case "Monge":
			for(int i = 0; i < buttonGroup.length; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				
				if(i == 0) {
					if(!equips1.isEnabled()) {
						Classes.getFicha().setEquipamentos(t);
					}else {
						Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
					}
					
				}else {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
				}
				
			}
			monge.setMonge();
		break;
		
		case "Paladino":
			for(int i = 0; i < buttonGroup.length; i++) {
				b = buttonGroup[i].getSelection();
				t = b.getActionCommand();
				
				if(i == 0) {
					
					if(!equips1.isEnabled()) {
						Classes.getFicha().setEquipamentos(equips3.getItemAt(equips3.getSelectedIndex()));
						Classes.getFicha().setEquipamentos(t);
					}else {
						Classes.getFicha().setEquipamentos(equips3.getItemAt(equips3.getSelectedIndex()));
						Classes.getFicha().setEquipamentos(equips1.getItemAt(equips1.getSelectedIndex()));
					}
					
				}else if (i == 1) {
					
					if(!equips2.isEnabled()) {
						Classes.getFicha().setEquipamentos(t);
					}else {
						Classes.getFicha().setEquipamentos(equips2.getItemAt(equips2.getSelectedIndex()));
					}
					
				}else {
					Classes.getFicha().setEquipamentos(Classes.getEquips().confirmarPacotes(t));
				}
				
			}
			paladino.setPaladino();
		break;
		}
	}
}
