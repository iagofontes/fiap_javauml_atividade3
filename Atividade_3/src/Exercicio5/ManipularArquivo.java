package Exercicio5;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ManipularArquivo {

	public boolean gravarmensagem() {
		return false;
	}

	public boolean salvarMensagem(String mensagem) {

		if (!mensagem.isEmpty()) {

			try (

				FileWriter ac = new FileWriter(new File("arquivo_codificado.txt"));
				FileWriter ad = new FileWriter(new File("arquivo_decodificado.txt"));
				PrintWriter outAc = new PrintWriter(ac);
				PrintWriter outDec = new PrintWriter(ad);

			) {
				
				String mensagemCodificada = this.codificarMensagem(mensagem); 
				outAc.print(mensagemCodificada);
				outDec.print(this.decodificarMensagem(mensagemCodificada));
				return true;

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(
						null, 
						"Problemas ao manipular arquivo.", 
						"Problemas", 
						JOptionPane.ERROR_MESSAGE);
			}

		}
		return false;
	}

	private String codificarMensagem(String mensagem) {

		StringBuilder sb = new StringBuilder(mensagem);
		for (int i = 0; i < mensagem.length(); i++) {
			sb.setCharAt(i, this.codificarCaracter(sb.charAt(i)));
		}
		return sb.toString();
	}

	private char codificarCaracter(Character caracter) {
		int ch = caracter.charValue();
		return ((char) (++ch));
	}
	
	private String decodificarMensagem(String mensagem) {

		StringBuilder sb = new StringBuilder(mensagem);
		for (int i = 0; i < mensagem.length(); i++) {
			sb.setCharAt(i, this.decodificarCaracter(sb.charAt(i)));
		}
		return sb.toString();
	}

	private char decodificarCaracter(Character caracter) {
		int ch = caracter.charValue();
		return ((char) (--ch));
	}

}
