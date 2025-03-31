package br.dev.paulo.tabuada.gui;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criaTela() {
		
		JFrame tela = new JFrame();
		
		// Definir o tamanho da tela 
		// atráves de um objeto dimensão 
		
	    Dimension tamanho = new Dimension();
		tamanho.setSize(500, 700);
		
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		// Criar um JLabel
		
		JLabel labelmultiplicando = new JLabel();
		labelmultiplicando.setText("Valor do multiplicando");
		labelmultiplicando.setBounds(50, 40, 150, 30);
		
		// Criar um Jtextfield
		JTextField txtmultiplicando = new JTextField();
		txtmultiplicando.setBounds(202, 40, 60, 30);
		txtmultiplicando.setText("multiplicando");
		
		tela.getContentPane().add(txtmultiplicando);
		tela.getContentPane().add(labelmultiplicando);

	}

}
