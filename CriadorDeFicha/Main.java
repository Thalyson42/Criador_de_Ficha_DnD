package CriadorDeFicha;

import Backgrounds.Antecedentes;
import Janelas.Tela;
import jdbc.modelo.*;

import java.io.IOException;
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
