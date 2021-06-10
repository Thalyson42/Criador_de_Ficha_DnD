package Janelas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import CriadorDeFicha.AtribuirHabilidades;
import CriadorDeFicha.Classes;
import CriadorDeFicha.Equipamentos;
import CriadorDeFicha.Idiomas;
import CriadorDeFicha.Magias;
import CriadorDeFicha.Proficiencia;
import br.com.uninassau.jdbc.modelo.FichaDoPersonagem;

import javax.swing.JLabel;
import javax.swing.SwingConstants;



import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1060, 763);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(29, 0, 29, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 221, 291, 459);
		contentPane.add(lblNewLabel);
		
		JButton criar_ficha = new JButton("Criar Ficha Do Personagem");
		criar_ficha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FichaDoPersonagem ficha = new FichaDoPersonagem();
				Proficiencia proficiencia = new Proficiencia();
				Equipamentos equips = new Equipamentos();
				Magias magias = new Magias();
				Idiomas idiomas = new Idiomas();
				AtribuirHabilidades atribuirHabilidades = new AtribuirHabilidades();
				Classes classes = new Classes();
				classes.salvarFicha(ficha);
				classes.setEquips(equips);
				classes.setProficiencia(proficiencia);
				classes.setMagias(magias);
				classes.setIdiomas(idiomas);
				classes.setAtribuirHabilidades(atribuirHabilidades);
				
				EscolherRacaJanela criarficha = new EscolherRacaJanela(classes);
				criarficha.setVisible(true);
				setVisible(false);
			}
		});
		criar_ficha.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		criar_ficha.setForeground(Color.BLACK);
		criar_ficha.setBackground(Color.LIGHT_GRAY);
		criar_ficha.setBounds(400, 251, 238, 48);
		contentPane.add(criar_ficha);
		
		JButton view_ficha = new JButton("Visualizar Ficha Do Personagem");
		view_ficha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VisualizarFichaJanela visualizarficha = new VisualizarFichaJanela();
				visualizarficha.setVisible(true);
				setVisible(false);
				
			}
		});
		view_ficha.setForeground(Color.BLACK);
		view_ficha.setBackground(Color.LIGHT_GRAY);
		view_ficha.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		view_ficha.setBounds(400, 328, 238, 48);
		contentPane.add(view_ficha);
		
		JButton sair = new JButton("Sair");
		sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				System.exit(1);
			}
		});
		sair.setBackground(Color.LIGHT_GRAY);
		sair.setFont(new Font("Monotype Corsiva", Font.BOLD, 19));
		sair.setBounds(400, 405, 238, 48);
		contentPane.add(sair);
	}
}
