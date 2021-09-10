package Janelas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.Classes;
import Races.ChosingRace;
import jdbc.modelo.FichaDoPersonagem;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class EscolherRacaJanela extends JFrame implements ChosingRace{

	private JPanel contentPane2;
	private JPanel panel_1;
	private JTextField txtButton;
	private JTextField txtEscolhaUmaSubraa;
	private JLabel background;
	private JLabel background2;
	private JTextArea areatext;
	private JTextArea areatext2;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	
	private JTextField txtEscolhaUmIdioma;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private static final String subRacaNomes [] = {"anao_da_colina", "anao_da_montanha", "alto_elfo", "elfo_da_floresta", "drow", "halfling_pes_leves", "halfling_robusto", "gnomo_da_floresta", "gnomo_das_rochas"};
	private static final String subImagens [] = {"/img/anao_da_colina.jpg", "/img/anao_da_montanha.jpg", "/img/alto_elfo.jpg", "/img/elfo_da_floresta.jpg", "/img/drow.jpg", "/img/halfling_pes_leves.jpg", "/img/halfling_robusto.jpg", "/img/gnomo_da_floresta.jpg", "/img/gnomo_das_rochas.jpg"};
	private final Icon icones2[] = {
			new ImageIcon(getClass().getResource(subImagens[0])),
			new ImageIcon(getClass().getResource(subImagens[1])),
			new ImageIcon(getClass().getResource(subImagens[2])),
			new ImageIcon(getClass().getResource(subImagens[3])),
			new ImageIcon(getClass().getResource(subImagens[4])),
			new ImageIcon(getClass().getResource(subImagens[5])),
			new ImageIcon(getClass().getResource(subImagens[6])),
			new ImageIcon(getClass().getResource(subImagens[7])),
			new ImageIcon(getClass().getResource(subImagens[8]))
	};
	private static final String nomes [] = {"Anao", "Elfo", "Halfling", "Humano", "Draconato", "Gnomo", "Meio_elfo", "Meio_orc", "Tiefling"};
	private static final String imagens [] = {"/img/anao.jpg", "/img/elfo.jpg", "/img/halfling.jpg", "/img/humano.jpg", "/img/draconato.jpg", "/img/gnomo.jpg", "/img/meio_elfo.jpg", "/img/meio_orc.jpg", "/img/tiefling.jpg"};
	private final Icon icones[] = {
			new ImageIcon(getClass().getResource(imagens[0])),
			new ImageIcon(getClass().getResource(imagens[1])),
			new ImageIcon(getClass().getResource(imagens[2])),
			new ImageIcon(getClass().getResource(imagens[3])),
			new ImageIcon(getClass().getResource(imagens[4])),
			new ImageIcon(getClass().getResource(imagens[5])),
			new ImageIcon(getClass().getResource(imagens[6])),
			new ImageIcon(getClass().getResource(imagens[7])),
			new ImageIcon(getClass().getResource(imagens[8]))
	};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EscolherRacaJanela frame = new EscolherRacaJanela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	public class JRadioButtonAction implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//	}

	/**
	 * Create the frame.
	 */
	public EscolherRacaJanela() {
		setResizable(false);
		setForeground(SystemColor.text);
		setFont(null);
		setBackground(SystemColor.text);
		setTitle("Criando Raça");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 755);
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane2 = new GroupLayout(contentPane2);
		gl_contentPane2.setHorizontalGroup(
			gl_contentPane2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane2.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane2.setVerticalGroup(
			gl_contentPane2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane2.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Raça", null, panel, null);
		
		JButton btnNewButton = new JButton("AVAN\u00C7AR");
		
		class ButtonHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(nomes[comboBox.getSelectedIndex()].equals("Anao") || nomes[comboBox.getSelectedIndex()].equals("Elfo") 
					|| nomes[comboBox.getSelectedIndex()].equals("Halfling") || nomes[comboBox.getSelectedIndex()].equals("Gnomo")) {
					comboBox_1.setModel(subRacaCombobox(nomes[comboBox.getSelectedIndex()]));
					tabbedPane.setSelectedIndex(1);
					
				}else if(nomes[comboBox.getSelectedIndex()].equals("Meio_elfo") || nomes[comboBox.getSelectedIndex()].equals("Humano")) {
					tabbedPane.setSelectedIndex(2);
				}else {
					setVisible(false);
					EscolherClasse escolherClasse = new EscolherClasse();
					ChosingRace.setRaca(comboBox.getItemAt(comboBox.getSelectedIndex()));
					escolherClasse.setVisible(true);
				}
			}
		}
		ButtonHandler buttonhandler = new ButtonHandler();
		
		btnNewButton.addActionListener(buttonhandler);
		btnNewButton.setBounds(369, 619, 105, 36);
		
		JButton btnNewButton_1 = new JButton("SAIR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				setVisible(false);
				menu.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(20, 619, 105, 36);
		
		comboBox = new JComboBox<String>(nomes);
		comboBox.setMaximumRowCount(9);
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					background.setIcon(icones[comboBox.getSelectedIndex()]);
					areatext.setText(ChosingRace.getDescricaoRaca(comboBox.getSelectedIndex()));
				}
			}
		});
		comboBox.setBounds(20, 483, 178, 36);
		
		txtButton = new JTextField();
		txtButton.setEditable(false);
		txtButton.setText("Escolha uma ra\u00E7a.");
		txtButton.setBounds(20, 457, 119, 20);
		txtButton.setColumns(10);
		panel.setLayout(null);
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);
		panel.add(txtButton);
		panel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(537, 11, 499, 644);
		panel.add(scrollPane);
		
		areatext = new JTextArea(ChosingRace.getDescricaoRaca(0));
		areatext.setBackground(new Color(255, 153, 51));
		areatext.setEditable(false);
		scrollPane.setViewportView(areatext);
		
		background = new JLabel();
		background.setIcon(new ImageIcon(EscolherRacaJanela.class.getResource("/img/anao.jpg")));
		background.setBounds(-604, -12, 1650, 699);
		panel.add(background);
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Sub-Raça", null, panel_1, null);
		
		txtEscolhaUmaSubraa = new JTextField();
		txtEscolhaUmaSubraa.setEditable(false);
		txtEscolhaUmaSubraa.setText("Escolha uma sub-ra\u00E7a");
		txtEscolhaUmaSubraa.setBounds(20, 457, 119, 20);
		txtEscolhaUmaSubraa.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("AVAN\u00C7AR");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(subRacaNomes[subRacaSelecionada(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()))].equals("alto_elfo")) {
					tabbedPane.setSelectedIndex(2);
				}else {
					EscolherClasse escolherClasse = new EscolherClasse();
					ChosingRace.setRaca(comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex());
					setVisible(false);
					escolherClasse.setVisible(true);					
				}
			}
		});
		btnNewButton_2.setBounds(369, 619, 105, 36);
		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					background2.setIcon(icones2[subRacaSelecionada(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()))]);
					areatext2.setText(ChosingRace.getDescricaoSubRaca(comboBox.getItemAt(comboBox.getSelectedIndex()), comboBox_1.getSelectedIndex()));
				}
			}
		});
		comboBox_1.setBounds(20, 483, 178, 36);
		background2 = new JLabel("New label");
		background2.setBounds(-604, -12, 1650, 699);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(537, 11, 499, 644);
		panel_1.add(scrollPane_1);
		
		areatext2 = new JTextArea();
		areatext2.setBackground(new Color(255, 153, 51));
		areatext2.setEditable(false);
		scrollPane_1.setViewportView(areatext2);
		panel_1.add(txtEscolhaUmaSubraa);
		panel_1.add(btnNewButton_2);
		panel_1.add(comboBox_1);
		panel_1.add(background2);
		contentPane2.setLayout(gl_contentPane2);
		tabbedPane.setEnabledAt(1, false);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("An\u00E3o");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(72, 108, 109, 23);
		rdbtnNewRadioButton.setActionCommand("Anão");
		panel_2.add(rdbtnNewRadioButton);
		
		txtEscolhaUmIdioma = new JTextField();
		txtEscolhaUmIdioma.setEditable(false);
		txtEscolhaUmIdioma.setText("Escolha um idioma");
		txtEscolhaUmIdioma.setBounds(10, 11, 120, 29);
		panel_2.add(txtEscolhaUmIdioma);
		txtEscolhaUmIdioma.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Comum");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(72, 134, 109, 23);
		rdbtnNewRadioButton_1.setActionCommand("Comum");
		panel_2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\u00C9lfico");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(72, 160, 109, 23);
		rdbtnNewRadioButton_2.setActionCommand("Élfico");
		panel_2.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Gigante");
		buttonGroup.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(72, 186, 109, 23);
		rdbtnNewRadioButton_3.setActionCommand("Gigante");
		panel_2.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Goblin");
		buttonGroup.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(72, 212, 109, 23);
		rdbtnNewRadioButton_4.setActionCommand("Goblin");
		panel_2.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Halfling");
		buttonGroup.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(72, 238, 109, 23);
		rdbtnNewRadioButton_5.setActionCommand("Halfling");
		panel_2.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Orc");
		buttonGroup.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(72, 264, 109, 23);
		rdbtnNewRadioButton_6.setActionCommand("Orc");
		panel_2.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Abissal");
		buttonGroup.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(72, 369, 109, 23);
		rdbtnNewRadioButton_7.setActionCommand("Abissal");
		panel_2.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Celestial");
		buttonGroup.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setBounds(72, 395, 109, 23);
		rdbtnNewRadioButton_8.setActionCommand("Celestial");
		panel_2.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("Dialeto Subterr\u00E2neo");
		buttonGroup.add(rdbtnNewRadioButton_9);
		rdbtnNewRadioButton_9.setBounds(72, 421, 147, 23);
		rdbtnNewRadioButton_9.setActionCommand("Dialeto Subterrâneo");
		panel_2.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("Drac\u00F4nico");
		buttonGroup.add(rdbtnNewRadioButton_10);
		rdbtnNewRadioButton_10.setBounds(72, 447, 109, 23);
		rdbtnNewRadioButton_10.setActionCommand("Dracônico");
		panel_2.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("Infernal");
		buttonGroup.add(rdbtnNewRadioButton_11);
		rdbtnNewRadioButton_11.setBounds(72, 473, 109, 23);
		rdbtnNewRadioButton_11.setActionCommand("Infernal");
		panel_2.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Primordial");
		buttonGroup.add(rdbtnNewRadioButton_12);
		rdbtnNewRadioButton_12.setBounds(72, 499, 109, 23);
		rdbtnNewRadioButton_12.setActionCommand("Primordial");
		panel_2.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("Silvestre");
		buttonGroup.add(rdbtnNewRadioButton_13);
		rdbtnNewRadioButton_13.setBounds(72, 525, 109, 23);
		rdbtnNewRadioButton_13.setActionCommand("Silvestre");
		panel_2.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("Subcomum");
		buttonGroup.add(rdbtnNewRadioButton_14);
		rdbtnNewRadioButton_14.setBounds(72, 551, 109, 23);
		rdbtnNewRadioButton_14.setActionCommand("Subcomum");
		panel_2.add(rdbtnNewRadioButton_14);

	
		JButton btnNewButton_3 = new JButton("AVAN\u00C7AR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(subRacaNomes[subRacaSelecionada(comboBox_1.getItemAt(comboBox_1.getSelectedIndex()))].equals("alto_elfo")) {
					ButtonModel b = buttonGroup.getSelection();
					String t = b.getActionCommand();
					ChosingRace.setRaca(comboBox.getSelectedIndex(), comboBox_1.getSelectedIndex());
					Classes.getFicha().setIdiomas(t);
					EscolherClasse escolherClasseJanela = new EscolherClasse();
					setVisible(false);
					escolherClasseJanela.setVisible(true);
					
				}else {
					ButtonModel b = buttonGroup.getSelection();
					String t = b.getActionCommand();
					ChosingRace.setRaca(comboBox.getItemAt(comboBox.getSelectedIndex()));
					Classes.getFicha().setIdiomas(t);
					EscolherClasse escolherClasseJanela = new EscolherClasse();
					setVisible(false);
					escolherClasseJanela.setVisible(true);
				}
				
			}
		});
		btnNewButton_3.setBounds(916, 616, 89, 23);
		tabbedPane.setEnabledAt(2, false);
		panel_2.add(btnNewButton_3);
		
	}
	
	public ComboBoxModel<String> subRacaCombobox(String raca) {
		DefaultComboBoxModel<String> model;
		switch(raca) {
		case "Anao":
			String subRacaAnao [] = {subRacaNomes[0], subRacaNomes[1]};
			model = new DefaultComboBoxModel<String>(subRacaAnao);
			return model;
			
		case "Elfo":
			String subRacaElfo [] = {subRacaNomes[2], subRacaNomes[3], subRacaNomes[4]};
			model = new DefaultComboBoxModel<String>(subRacaElfo);
			return model;
			
		case "Halfling":
			String subRacaHalfling [] = {subRacaNomes[5], subRacaNomes[6]};
			model = new DefaultComboBoxModel<String>(subRacaHalfling);
			return model;
			
		case "Gnomo":
			String subRacaGnomo [] = {subRacaNomes[7], subRacaNomes[8]};
			model = new DefaultComboBoxModel<String>(subRacaGnomo);
			return model;
		}
		return model = new DefaultComboBoxModel<String>();
	}
	
	public int subRacaSelecionada(String subraca) {
		switch(subraca) {
		case "anao_da_colina":
			return 0;
			
		case "anao_da_montanha":
			return 1;
			
		case "alto_elfo":
			return 2;
			
		case "elfo_da_floresta":
			return 3;
			
		case "drow":
			return 4;
			
		case "halfling_pes_leves":
			return 5;
			
		case "halfling_robusto":
			return 6;
			
		case "gnomo_da_floresta":
			return 7;
			
		case "gnomo_das_rochas":
			return 8;
			
		}
		return 0;
	}
}
