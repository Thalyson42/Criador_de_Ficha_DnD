package CriadorDeFicha;

import java.util.ArrayList;
import java.util.Scanner;

import Janelas.Tela;

import java.io.IOException;

import br.com.uninassau.jdbc.modelo.*;
public class Main {

	public static void main(String[] args) throws IOException {
		
		Antecedentes antecedentes = new Antecedentes();
		Idiomas idiomas = new Idiomas();
		Equipamentos equips = new Equipamentos();
		Proficiencia prof = new Proficiencia();
		Classes.setProficiencia(prof);
		Classes.setIdiomas(idiomas);
		Classes.setAntecedens(antecedentes);
		Classes.setEquips(equips);
		
		Usuario usuario = new Usuario();
		Tela telaLogin = new Tela(usuario);
		telaLogin.setVisible(true);
	}
	
}
