package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Scanner;

import Janelas.Tela;

import java.io.IOException;

import br.com.uninassau.jdbc.modelo.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Usuario usuario = new Usuario();

		Classes classes = new Classes();
		
		Tela telaLogin = new Tela(usuario, classes);
		telaLogin.setVisible(true);
	}
	
}
