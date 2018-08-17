package Exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		ManipularArquivo ma = new ManipularArquivo();
		String message = JOptionPane.showInputDialog("Digite a mensagem a codificar: ");
		if(message.isEmpty()) {
			System.out.println("Mensagem inválida.");
			return;
		}
		if(ma.salvarMensagem(message)) {
			System.out.println("Mensagem codificada com sucesso.");
		} else {
			System.out.println("Problemas ao manipular mensagem.");
		}
	}

}
