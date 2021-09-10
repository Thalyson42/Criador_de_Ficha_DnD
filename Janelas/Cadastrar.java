package Janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdbc.dao.UsuarioDAO;
import jdbc.modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JPasswordField passwordField;
	private JTextField tfNome;
	private JTextField tfEmail;
	private JTextField tfSexo;
	private JTextField tfIdade;
	private JTextField tfTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar(null);
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
	public Cadastrar(Usuario usuario) {
		setResizable(false);
		setTitle("Cadastrar");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 772, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USU\u00C1RIO");
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 29, 110, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SENHA");
		lblNewLabel_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_1.setBounds(10, 102, 110, 39);
		contentPane.add(lblNewLabel_1);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(98, 38, 180, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 111, 180, 20);
		contentPane.add(passwordField);
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		tfNome.setBounds(98, 178, 180, 20);
		contentPane.add(tfNome);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNome.setBounds(10, 169, 110, 39);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel_1_1 = new JLabel("IDADE");
		lblNewLabel_1_1.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(10, 242, 110, 39);
		contentPane.add(lblNewLabel_1_1);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(98, 317, 180, 20);
		contentPane.add(tfEmail);
		
		JLabel lblEmail = new JLabel("E-MAIL");
		lblEmail.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblEmail.setBounds(10, 308, 110, 39);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_1_2 = new JLabel("TELEFONE");
		lblNewLabel_1_2.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(10, 381, 110, 39);
		contentPane.add(lblNewLabel_1_2);
		
		tfSexo = new JTextField();
		tfSexo.setColumns(10);
		tfSexo.setBounds(98, 453, 180, 20);
		contentPane.add(tfSexo);
		
		JLabel lblSexo = new JLabel("SEXO");
		lblSexo.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblSexo.setBounds(10, 444, 110, 39);
		contentPane.add(lblSexo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(333, 56, 411, 396);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JLabel lblDescrio = new JLabel("DESCRI\u00C7\u00C3O");
		lblDescrio.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescrio.setFont(new Font("Monotype Corsiva", Font.BOLD, 17));
		lblDescrio.setBounds(465, 11, 110, 39);
		contentPane.add(lblDescrio);
		
		tfIdade = new JTextField();
		tfIdade.setColumns(10);
		tfIdade.setBounds(98, 251, 180, 20);
		contentPane.add(tfIdade);
		
		tfTelefone = new JTextField();
		tfTelefone.setColumns(10);
		tfTelefone.setBounds(98, 390, 180, 20);
		contentPane.add(tfTelefone);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Monotype Corsiva", Font.BOLD, 16));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UsuarioDAO usuariodao = new UsuarioDAO();
					
					PreparedStatement stmt = usuariodao.getConexao().prepareStatement("SELECT * FROM usuario WHERE login='"+tfUsuario.getText()+"'");
					ResultSet res = stmt.executeQuery();
					
					if(res.next()) {
						JOptionPane.showMessageDialog(null, "Nome de usuario já existe!");
					}else {
						usuario.setLogin(tfUsuario.getText());
						usuario.setSenha(new String(passwordField.getPassword()));
						usuario.setNome(tfNome.getText());
						usuario.setIdade(tfIdade.getText());
						usuario.setEmail(tfEmail.getText());
						usuario.setTelefone(tfTelefone.getText());
						usuario.setSexo(tfSexo.getText());
						usuario.setDescricao_usuario(textArea.getText());
						usuariodao.salvarUser(usuario);
						usuariodao.salvarPerfil(usuario);
						JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
						setVisible(false);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		btnCadastrar.setBounds(580, 463, 146, 31);
		contentPane.add(btnCadastrar);
		

	}
}
