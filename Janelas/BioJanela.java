package Janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.Classes;
import CriadorDeFicha.MostrarFicha;
import br.com.uninassau.jdbc.dao.FichaDoPersonagemDAO;
import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;
import br.com.uninassau.jdbc.modelo.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;

public class BioJanela extends JFrame {

	private JPanel contentPane;
	private JTextField tfPele;
	private JTextField tfCabelo;
	private JTextField tfOlhos;
	private JTextField tfPeso;
	private JTextField tfAltura;
	private JTextField tfIdade;
	private JTextField tfNomePersonagem;
	private JLabel lblPersonagem;
	private JLabel lblIdade;
	private JLabel lblAltura;
	private JLabel lblPeso;
	private JLabel lblOlhoscor;
	private JLabel lblCabelo;
	private JLabel lblPele;
	private JButton btnFinalizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BioJanela frame = new BioJanela();
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
	public BioJanela() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfPele = new JTextField();
		tfPele.setBounds(426, 650, 204, 31);
		contentPane.add(tfPele);
		tfPele.setColumns(10);
		
		tfCabelo = new JTextField();
		tfCabelo.setColumns(10);
		tfCabelo.setBounds(426, 550, 204, 31);
		contentPane.add(tfCabelo);
		
		tfOlhos = new JTextField();
		tfOlhos.setColumns(10);
		tfOlhos.setBounds(426, 450, 204, 31);
		contentPane.add(tfOlhos);
		
		tfPeso = new JTextField();
		tfPeso.setColumns(10);
		tfPeso.setBounds(426, 350, 204, 31);
		contentPane.add(tfPeso);
		
		tfAltura = new JTextField();
		tfAltura.setColumns(10);
		tfAltura.setBounds(426, 250, 204, 31);
		contentPane.add(tfAltura);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(426, 160, 204, 31);
		contentPane.add(tfIdade);
		
		tfNomePersonagem = new JTextField();
		tfNomePersonagem.setColumns(10);
		tfNomePersonagem.setBounds(426, 70, 204, 31);
		contentPane.add(tfNomePersonagem);
		
		lblPersonagem = new JLabel("NOME DO PERSONAGEM");
		lblPersonagem.setBackground(new Color(0, 0, 0));
		lblPersonagem.setForeground(new Color(0, 0, 0));
		lblPersonagem.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblPersonagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonagem.setBounds(426, 26, 204, 14);
		contentPane.add(lblPersonagem);
		
		lblIdade = new JLabel("IDADE");
		lblIdade.setForeground(new Color(0, 0, 0));
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblIdade.setBounds(426, 122, 204, 14);
		contentPane.add(lblIdade);
		
		lblAltura = new JLabel("ALTURA");
		lblAltura.setForeground(new Color(0, 0, 0));
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblAltura.setBounds(426, 217, 204, 14);
		contentPane.add(lblAltura);
		
		lblPeso = new JLabel("PESO");
		lblPeso.setForeground(new Color(0, 0, 0));
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblPeso.setBounds(426, 309, 204, 14);
		contentPane.add(lblPeso);
		
		lblOlhoscor = new JLabel("OLHOS (cor)");
		lblOlhoscor.setForeground(new Color(0, 0, 0));
		lblOlhoscor.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlhoscor.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblOlhoscor.setBounds(426, 409, 204, 14);
		contentPane.add(lblOlhoscor);
		
		lblCabelo = new JLabel("CABELO");
		lblCabelo.setForeground(new Color(0, 0, 0));
		lblCabelo.setHorizontalAlignment(SwingConstants.CENTER);
		lblCabelo.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblCabelo.setBounds(426, 509, 204, 14);
		contentPane.add(lblCabelo);
		
		lblPele = new JLabel("PELE");
		lblPele.setForeground(new Color(0, 0, 0));
		lblPele.setHorizontalAlignment(SwingConstants.CENTER);
		lblPele.setFont(new Font("Monotype Corsiva", Font.BOLD, 18));
		lblPele.setBounds(426, 606, 204, 14);
		contentPane.add(lblPele);
		
		btnFinalizar = new JButton("FINALIZAR");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Classes.getFicha().setNome_personagem(tfNomePersonagem.getText());
				Classes.getFicha().setIdade(tfIdade.getText());
				Classes.getFicha().setAltura(tfAltura.getText());
				Classes.getFicha().setPeso(tfPeso.getText());
				Classes.getFicha().setOlhos(tfOlhos.getText());
				Classes.getFicha().setCabelo(tfCabelo.getText());
				Classes.getFicha().setPele(tfPele.getText());
				
				JOptionPane.showMessageDialog(null, "Ficha Criada!");
				Menu menu = new Menu();
				Usuario usuario = new Usuario();
				usuario.setPersonagem(Classes.getFicha());
				salvarPersonagem(usuario);
				setVisible(false);
				menu.setVisible(true);
			}
		});
		btnFinalizar.setFont(new Font("Monotype Corsiva", Font.BOLD, 15));
		btnFinalizar.setBounds(916, 650, 117, 31);
		contentPane.add(btnFinalizar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(BioJanela.class.getResource("/img/background.jpg")));
		lblNewLabel.setBounds(-523, 0, 1650, 699);
		contentPane.add(lblNewLabel);
	}
	
	public void salvarPersonagem (Usuario usuario) {
		try {
			FichaDoPersonagemDAO personagemDAO = new FichaDoPersonagemDAO();
			
			personagemDAO.salvarPersonagem(usuario, 0);
			personagemDAO.salvarBio(usuario, 0);
			personagemDAO.salvarCaracteristicas(usuario, 0);
			personagemDAO.salvarPericias(usuario, 0);
			personagemDAO.salvarAtributos(usuario, 0);
			personagemDAO.salvarTeste_resistencia(usuario, 0);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getTracos_personalidade().size(); c++)
					personagemDAO.salvarTracosPersonalidade(usuario, 0, c);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getProfi_ferramentas_peri().size(); c++)
					personagemDAO.salvarFerramentas_pericias(usuario, 0, c);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getEquipamentos().size(); c++)
					personagemDAO.salvarEquipamentos(usuario, 0, c);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getIdiomas().size(); c++)
					personagemDAO.salvarIdioma(usuario, 0, c);
			personagemDAO.salvarConfirmarTesteResistencia(usuario, 0);
			personagemDAO.salvarConfirmarPericias(usuario, 0);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getTracosraciais().size(); c++)
					personagemDAO.salvarTracosRaciais(usuario, 0, c);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getClassefeats().size(); c++)
					personagemDAO.salvarClasseFeats(usuario, 0, c);
			for(int i = 0; i < usuario.getPersonagem().size(); i++)
				for(int c = 0; c < usuario.getPersonagem().get(i).getProfi_equips().size(); c++)
					personagemDAO.salvarProfiEquips(usuario, 0, c);
			personagemDAO.salvarAtributosModificadores(usuario, 0);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
