package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.Antecedentes;
import CriadorDeFicha.Classes;
import CriadorDeFicha.Equipamentos;
import CriadorDeFicha.Idiomas;
import CriadorDeFicha.Proficiencia;
import Janelas.EscolherClasse.CheckBoxHandler;
import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class AntecedentesJanela extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> cbAntecedentes;
	private JComboBox<String> cbPersonalidade;
	private JComboBox<String> cbIdeal;
	private JComboBox<String> cbVinculo;
	private JComboBox<String> cbDefeito;
	private JComboBox<String> cbFerramentaArtesaoProf;
	private JComboBox<String> cbFerramentaArtesaoEquip;
	private JComboBox<String> cbInstrumentoMusicalProf;
	private JComboBox<String> cbInstrumentoMusicalEquip;
	private JComboBox<String> cbEquipamentoCharlataoProf;
	private JTabbedPane tabbedPane;
	private JTextArea textAreaAntecedentes;
	private JLabel lblNewLabel_1;
	private JLabel lblIdioma;
	private JLabel lblProf;
	private JLabel lblEquip;
	private int max_selections;
	private JCheckBox[] checkList;
	private JPanel panel_1;
	private int selectionCounter;
	private CheckBoxHandler manipulador;
	private JPanel panel_2;
	private JScrollPane[] spCbCaracters = new JScrollPane[4];;
	
	private static final String nomes [] = {"Acólito", "Artesão de guilda", "Artista", "Charlatão", "Criminoso", "Eremita", "Forasteiro", "Herói do Povo", "Marinheiro", "Nobre", "Órfão", "Sábio", "Soldado"};
//	private static final String imagens [] = {"/img/Acolito.png", "/img/Artesão de guilda.png", "/img/Artista.png", "/img/Charlatão.png", "/img/Criminoso.png", "/img/Eremita.png", "/img/Forasteiro.png", "/img/Heroi do Povo.png", "/img/Marinheiro.png", "/img/Nobre.png", "/img/Orfão.png", "/img/Sabio.", "/img/Soldado.png"};
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
					Antecedentes antecedentes = new Antecedentes();
					Classes classe = new Classes();
					Idiomas idiomas = new Idiomas();
					Equipamentos equips = new Equipamentos();
					FichaDoPersonagem ficha = new FichaDoPersonagem();
					Proficiencia prof = new Proficiencia();
					classe.setProficiencia(prof);
					classe.setIdiomas(idiomas);
					classe.salvarFicha(ficha);
					classe.setAntecedens(antecedentes);
					classe.setEquips(equips);
					AntecedentesJanela frame = new AntecedentesJanela(classe);
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

	/**
	 * Create the frame.
	 */
	public AntecedentesJanela(Classes classe) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 775);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		tabbedPane.setEnabled(false);
		
		JButton btnAvancar = new JButton("AVAN\u00C7AR");
		btnAvancar.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btnAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selecionarAntecedente(cbAntecedentes.getItemAt(cbAntecedentes.getSelectedIndex()), classe);
			}
		});
		btnAvancar.setBounds(348, 619, 126, 36);
		panel.add(btnAvancar);
		
		cbAntecedentes = new JComboBox<String>(nomes);
		cbAntecedentes.setFont(new Font("Monotype Corsiva", Font.PLAIN, 16));
		cbAntecedentes.setMaximumRowCount(nomes.length);
		cbAntecedentes.setBounds(20, 483, 237, 36);
		cbAntecedentes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
			//		lblNewLabel_1.setIcon(icones[subRacaSelecionada(comboBox.getItemAt(comboBox.getSelectedIndex()))]);
					textAreaAntecedentes.setText(classe.getAntecedentes().descricaoAntecedente(cbAntecedentes.getSelectedIndex()));
				}
			}
		});
		panel.add(cbAntecedentes);
		
		JLabel lblEscolherAntecedente = new JLabel("Escolha um Antecedente");
		lblEscolherAntecedente.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblEscolherAntecedente.setBounds(20, 449, 195, 28);
		panel.add(lblEscolherAntecedente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 11, 499, 644);
		panel.add(scrollPane);
		
		textAreaAntecedentes = new JTextArea(classe.getAntecedentes().descricaoAntecedente(0));
		textAreaAntecedentes.setEditable(false);
		textAreaAntecedentes.setFont(new Font("Monotype Corsiva", Font.PLAIN, 18));
		scrollPane.setViewportView(textAreaAntecedentes);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-604, -12, 1650, 699);
		panel.add(lblNewLabel_1);
		
		manipulador = new CheckBoxHandler();
		
		panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		tabbedPane.setEnabledAt(1, false);
		
		JButton btnNewButton_1 = new JButton("AVAN\u00C7AR");
		btnNewButton_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caracteristicas(cbAntecedentes.getItemAt(cbAntecedentes.getSelectedIndex()), classe);
				tabbedPane.setSelectedIndex(2);
			}
		});
		btnNewButton_1.setBounds(873, 628, 121, 35);
		panel_1.add(btnNewButton_1);
		
		panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
			
		JLabel lblTraco_personalidade = new JLabel("Tra\u00E7o De Personalidade");
		lblTraco_personalidade.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblTraco_personalidade.setBounds(63, 104, 201, 26);
		panel_2.add(lblTraco_personalidade);
		
		JLabel lblIdeal = new JLabel("Ideal");
		lblIdeal.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblIdeal.setBounds(63, 223, 66, 26);
		panel_2.add(lblIdeal);
		
		JLabel lblVinculo = new JLabel("V\u00EDnculo");
		lblVinculo.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblVinculo.setBounds(63, 359, 66, 26);
		panel_2.add(lblVinculo);
		
		JLabel lblDefeito = new JLabel("Defeito");
		lblDefeito.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblDefeito.setBounds(63, 478, 66, 26);
		panel_2.add(lblDefeito);
		
		JLabel lblCaracteristicas = new JLabel("CARACTER\u00CDSTICAS ");
		lblCaracteristicas.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblCaracteristicas.setHorizontalAlignment(SwingConstants.CENTER);
		lblCaracteristicas.setBounds(322, 11, 322, 37);
		panel_2.add(lblCaracteristicas);
		
		JButton btRoll = new JButton("ROLL");
		btRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbPersonalidade.setSelectedIndex(classe.getAntecedentes().getTIVD(8));
			}
		});
		btRoll.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btRoll.setBounds(455, 158, 89, 26);
		panel_2.add(btRoll);
		
		JButton btRoll_2 = new JButton("ROLL");
		btRoll_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbIdeal.setSelectedIndex(classe.getAntecedentes().getTIVD(6));
			}
		});
		btRoll_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btRoll_2.setBounds(455, 286, 89, 26);
		panel_2.add(btRoll_2);
		
		JButton btRoll_3 = new JButton("ROLL");
		btRoll_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbVinculo.setSelectedIndex(classe.getAntecedentes().getTIVD(6));
			}
		});
		btRoll_3.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btRoll_3.setBounds(455, 415, 89, 26);
		panel_2.add(btRoll_3);
		
		JButton btRoll_4 = new JButton("ROLL");
		btRoll_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbDefeito.setSelectedIndex(classe.getAntecedentes().getTIVD(6));
			}
		});
		btRoll_4.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btRoll_4.setBounds(455, 535, 89, 26);
		panel_2.add(btRoll_4);
		
		JButton btAvancar = new JButton("AVAN\u00C7AR");
		btAvancar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salvarAntecedente(cbAntecedentes.getItemAt(cbAntecedentes.getSelectedIndex()), classe);
				BioJanela bioJanela = new BioJanela(classe);
				setVisible(false);
				bioJanela.setVisible(true);
			}
		});
		btAvancar.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		btAvancar.setBounds(872, 629, 138, 37);
		panel_2.add(btAvancar);
		tabbedPane.setEnabledAt(2, false);
	}
	
	public void selecionarAntecedente(String antecedente, Classes listaIdioma) {
		switch(antecedente) {
		case "Acólito": case "Sábio":
			idiomas(listaIdioma.getIdiomas().verificarIdiomas(listaIdioma.getFicha().getIdiomas()), 2);
			tabbedPane.setSelectedIndex(1);
		break;
		
		case "Artesão de guilda": 
			idiomas(listaIdioma.getIdiomas().verificarIdiomas(listaIdioma.getFicha().getIdiomas()), 1);
			ferramentaArtesao(listaIdioma);
			tabbedPane.setSelectedIndex(1);
		
		break;
		
		case "Eremita": case "Nobre":
			idiomas(listaIdioma.getIdiomas().verificarIdiomas(listaIdioma.getFicha().getIdiomas()), 1);
			tabbedPane.setSelectedIndex(1);
		break;
		
		case "Forasteiro": 
			idiomas(listaIdioma.getIdiomas().verificarIdiomas(listaIdioma.getFicha().getIdiomas()), 1);
			instrumentoMusical(listaIdioma);
			tabbedPane.setSelectedIndex(1);
		break;
		
		case "Criminoso": case "Órfão": case "Soldado": case "Marinheiro":
			caracteristicas(antecedente, listaIdioma);
			tabbedPane.setSelectedIndex(2);
		break;
		
		case "Herói do Povo":
			ferramentaArtesao(listaIdioma);
			tabbedPane.setSelectedIndex(1);
		break;
		
		case "Artista":
			instrumentoMusical(listaIdioma);
			tabbedPane.setSelectedIndex(1);
		break;
		
		case "Charlatão":
			equipamentoCharlatao(listaIdioma);
			tabbedPane.setSelectedIndex(1);
		break;
		}
		
	}
	
	public void salvarAntecedente(String antecedente,Classes classe) {
		switch(antecedente) {
		case "Criminoso": case "Órfão": case "Soldado": case "Marinheiro":
			svPIVD(classe, antecedente);
		break;
		
		case "Acólito": case "Nobre": case "Sábio": case "Eremita":
			for(int i = 0; i < checkList.length; i++)
				if(checkList[i].isSelected())
					classe.getFicha().setIdiomas(checkList[i].getText());
			
			svPIVD(classe, antecedente);
		break;
		
		case "Artesão de guilda":
			for(int i = 0; i < checkList.length; i++)
				if(checkList[i].isSelected())
					classe.getFicha().setIdiomas(checkList[i].getText());
			
			classe.getFicha().setProfi_ferramentas_peri(cbFerramentaArtesaoProf.getItemAt(cbFerramentaArtesaoProf.getSelectedIndex()));
			classe.getFicha().setEquipamentos(cbFerramentaArtesaoEquip.getItemAt(cbFerramentaArtesaoEquip.getSelectedIndex()));
			
			svPIVD(classe, antecedente);
		break;
		
		case "Herói do Povo":
			classe.getFicha().setProfi_ferramentas_peri(cbFerramentaArtesaoProf.getItemAt(cbFerramentaArtesaoProf.getSelectedIndex()));
			classe.getFicha().setEquipamentos(cbFerramentaArtesaoEquip.getItemAt(cbFerramentaArtesaoEquip.getSelectedIndex()));
			
			svPIVD(classe, antecedente);
		break;
		
		case "Forasteiro":
			for(int i = 0; i < checkList.length; i++)
				if(checkList[i].isSelected())
					classe.getFicha().setIdiomas(checkList[i].getText());
			
			classe.getFicha().setProfi_ferramentas_peri(cbInstrumentoMusicalProf.getItemAt(cbInstrumentoMusicalProf.getSelectedIndex()));
			
			svPIVD(classe, antecedente);
		break;
		
		case "Artista":
			classe.getFicha().setProfi_ferramentas_peri(cbInstrumentoMusicalProf.getItemAt(cbInstrumentoMusicalProf.getSelectedIndex()));
			classe.getFicha().setEquipamentos(cbInstrumentoMusicalEquip.getItemAt(cbInstrumentoMusicalEquip.getSelectedIndex()));
			
			svPIVD(classe, antecedente);
		break;
		
		case "Charlatão":
			classe.getFicha().setEquipamentos(cbEquipamentoCharlataoProf.getItemAt(cbEquipamentoCharlataoProf.getSelectedIndex()));
			
			svPIVD(classe, antecedente);
		break;
		}
	}
	
	public void svPIVD(Classes classe, String antecedente) {
		classe.getFicha().setTracos_personalidade(cbPersonalidade.getItemAt(cbPersonalidade.getSelectedIndex()));
		classe.getFicha().setIdeal(cbIdeal.getItemAt(cbIdeal.getSelectedIndex()));
		classe.getFicha().setVinculo(cbVinculo.getItemAt(cbVinculo.getSelectedIndex()));
		classe.getFicha().setDefeito(cbDefeito.getItemAt(cbDefeito.getSelectedIndex()));
		classe.getAntecedentes().setAntecedente(antecedente);
	}
	
	public void idiomas(ArrayList<String> idiomas, int max_selections) {
		lblIdioma = new JLabel("IDIOMAS");
		lblIdioma.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblIdioma.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdioma.setBounds(44, 30, 258, 35);
		panel_1.add(lblIdioma);
		
		
		this.selectionCounter = 0;
		this.max_selections = max_selections;
		checkList = new JCheckBox[idiomas.size()];
		for(int i =0; i < idiomas.size(); i++) {
			checkList[i] = new JCheckBox(idiomas.get(i));
			checkList[i].setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
			checkBoxBounds(i);
			checkList[i].addItemListener(manipulador);
			panel_1.add(checkList[i]);
		}
		
	}
	
	public void equipamentoCharlatao(Classes equipCharlatao) {
		String[] equipamento_charlatao = convertCaracter(equipCharlatao.getEquips().getFerramentaArtesao());
		
		lblEquip = new JLabel("Equipamento Charlatão");
		lblEquip.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblEquip.setHorizontalAlignment(SwingConstants.CENTER);
		lblEquip.setBounds(550, 84, 325, 35);
		panel_1.add(lblEquip);
		
		cbEquipamentoCharlataoProf = new JComboBox<String>(equipamento_charlatao);
		cbEquipamentoCharlataoProf.setMaximumRowCount(equipamento_charlatao.length);
		cbEquipamentoCharlataoProf.setBounds(550, 153, 355, 45);
		panel_1.add(cbEquipamentoCharlataoProf);
	}
	
	public void instrumentoMusical(Classes instrumentoMusical) {
		String[] instrumento_musical = convertCaracter(instrumentoMusical.getEquips().getInstrumentoMusical());
		
		if(cbAntecedentes.getItemAt(cbAntecedentes.getSelectedIndex()).equals("Forasteiro")) {
			lblProf = new JLabel("Proficiência Intrumento Musical");
			lblProf.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblProf.setHorizontalAlignment(SwingConstants.CENTER);
			lblProf.setBounds(550, 84, 325, 35);
			panel_1.add(lblProf);
			
			cbInstrumentoMusicalProf = new JComboBox<String>(instrumento_musical);
			cbInstrumentoMusicalProf.setMaximumRowCount(instrumento_musical.length);
			cbInstrumentoMusicalProf.setBounds(550, 153, 355, 45);
			panel_1.add(cbInstrumentoMusicalProf);
			
		}else {
			lblProf = new JLabel("Proficiência Intrumento Musical");
			lblProf.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblProf.setHorizontalAlignment(SwingConstants.CENTER);
			lblProf.setBounds(550, 84, 325, 35);
			panel_1.add(lblProf);
			
			cbInstrumentoMusicalProf = new JComboBox<String>(instrumento_musical);
			cbInstrumentoMusicalProf.setMaximumRowCount(instrumento_musical.length);
			cbInstrumentoMusicalProf.setBounds(550, 153, 355, 45);
			panel_1.add(cbInstrumentoMusicalProf);
			
			lblProf = new JLabel("Intrumento Musical");
			lblProf.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
			lblProf.setHorizontalAlignment(SwingConstants.CENTER);
			lblProf.setBounds(550, 225, 325, 35);
			panel_1.add(lblProf);
			
			cbInstrumentoMusicalEquip = new JComboBox<String>(instrumento_musical);
			cbInstrumentoMusicalEquip.setMaximumRowCount(instrumento_musical.length);
			cbInstrumentoMusicalEquip.setBounds(550, 279, 355, 45);
			panel_1.add(cbInstrumentoMusicalEquip);
		}
	}
	
	public void ferramentaArtesao(Classes ferrArtesao) {
		String[] ferramenta_artesao = convertCaracter(ferrArtesao.getEquips().getFerramentaArtesao());
		
		lblProf = new JLabel("Proficiência Ferramenta de Artesão");
		lblProf.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblProf.setHorizontalAlignment(SwingConstants.CENTER);
		lblProf.setBounds(550, 84, 325, 35);
		panel_1.add(lblProf);
		
		cbFerramentaArtesaoProf = new JComboBox<String>(ferramenta_artesao);
		cbFerramentaArtesaoProf.setMaximumRowCount(ferramenta_artesao.length);
		cbFerramentaArtesaoProf.setBounds(550, 153, 355, 45);
		panel_1.add(cbFerramentaArtesaoProf);
		
		lblProf = new JLabel("Ferramenta de Artesão");
		lblProf.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		lblProf.setHorizontalAlignment(SwingConstants.CENTER);
		lblProf.setBounds(550, 225, 325, 35);
		panel_1.add(lblProf);
		
		cbFerramentaArtesaoEquip = new JComboBox<String>(ferramenta_artesao);
		cbFerramentaArtesaoEquip.setMaximumRowCount(ferramenta_artesao.length);
		cbFerramentaArtesaoEquip.setBounds(550, 279, 355, 45);
		panel_1.add(cbFerramentaArtesaoEquip);
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

	public String[] convertCaracter(List<String> caracterList) {
		String[] array = new String[caracterList.size()];

		for(int i = 0; i < array.length; i++) 
			array[i] = caracterList.get(i);
		
		return array;
	}
	
	
	public void caracteristicas(String antecedente, Classes caracteristicas) {
		String[] personalidade = convertCaracter(caracteristicas.getAntecedentes().getTraco(antecedente));
		String[] ideal = convertCaracter(caracteristicas.getAntecedentes().getIdeal(antecedente));
		String[] vinculo = convertCaracter(caracteristicas.getAntecedentes().getVinculo(antecedente));
		String[] defeito = convertCaracter(caracteristicas.getAntecedentes().getDefeito(antecedente));
		
		spCbCaracters[0] = new JScrollPane();
		cbPersonalidade = new JComboBox<String>(personalidade);
		cbPersonalidade.setMaximumRowCount(personalidade.length);
		spCbCaracters[0].setBounds(63, 153, 355, 45);
		spCbCaracters[0].setViewportView(cbPersonalidade);
		panel_2.add(spCbCaracters[0]);
		
		spCbCaracters[1] = new JScrollPane();
		cbIdeal = new JComboBox<String>(ideal);
		cbIdeal.setMaximumRowCount(ideal.length);
		spCbCaracters[1].setBounds(63, 279, 355, 45);
		spCbCaracters[1].setViewportView(cbIdeal);
		panel_2.add(spCbCaracters[1]);
		
		spCbCaracters[2] = new JScrollPane();
		cbVinculo = new JComboBox<String>(vinculo);
		cbVinculo.setMaximumRowCount(vinculo.length);
		spCbCaracters[2].setBounds(63, 408, 355, 45);
		spCbCaracters[2].setViewportView(cbVinculo);
		panel_2.add(spCbCaracters[2]);
		
		spCbCaracters[3] = new JScrollPane();
		cbDefeito = new JComboBox<String>(defeito);
		cbDefeito.setMaximumRowCount(defeito.length);
		spCbCaracters[3].setBounds(63, 528, 355, 45);
		spCbCaracters[3].setViewportView(cbDefeito);
		panel_2.add(spCbCaracters[3]);
	}
}
