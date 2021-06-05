package Janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.uninassau.jdbc.dao.UsuarioDAO;
import br.com.uninassau.jdbc.modelo.Usuario;

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

public class Cadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

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
		setBounds(100, 100, 350, 271);
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
		
		textField = new JTextField();
		textField.setBounds(98, 38, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("CADASTRAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UsuarioDAO usuariodao = new UsuarioDAO();
					
					PreparedStatement stmt = usuariodao.getConexao().prepareStatement("SELECT * FROM usuario WHERE login='"+textField.getText()+"'");
					ResultSet res = stmt.executeQuery();
					
					if(res.next()) {
						JOptionPane.showMessageDialog(null, "Nome de usuario já existe!");
					}else {
						usuario.setLogin(textField.getText());
						usuario.setSenha(new String(passwordField.getPassword()));
						usuariodao.salvarUser(usuario);
						JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!");
						setVisible(false);
						
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		});
		btnNewButton.setBounds(209, 181, 110, 31);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(98, 111, 180, 20);
		contentPane.add(passwordField);
	}

}
