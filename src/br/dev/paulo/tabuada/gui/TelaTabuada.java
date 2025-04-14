package br.dev.paulo.tabuada.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.dev.paulo.tabuada.model.Tabuada;

public class TelaTabuada {
	
	private JTextField txtMultiplicando;
	private JLabel labelMultiplicando;
	private JLabel labelMenor;
	private JTextField txtMenor;
	private JLabel labelMaior;
	private JTextField txtMaior;
	private JButton btnCalcular;
	private JButton btnLimpar;
	private JLabel labelResultado;
	private JScrollPane scrollTabuada;
	private JList listaTabuada;
	
	private Font labels = new Font("Arial", Font.PLAIN, 20);
	private Color labelsColor = new Color(255, 64, 128);
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		// Definir o tamanho da tela 
		//através de um objeto Dimension
		Dimension tamanho = new Dimension();
		tamanho.setSize(345 , 600);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);
		
		//criar JLAbel e um JTextField para o multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setFont(labels);
		
		labelMultiplicando.setText("Valor do Multiplicando");
		labelMultiplicando.setBounds(50, 40, 150, 30);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setHorizontalAlignment(JTextField.RIGHT);
		txtMultiplicando.setBounds(210, 40, 70, 30);
		
		//criar JLAbel e um JTextField para o Menor Multiplicador
		labelMenor = new JLabel();
		labelMenor.setText("Multiplicador Menor");
		labelMenor.setBounds(50, 80, 150, 30);
		
		txtMenor = new JTextField();
		txtMenor.setHorizontalAlignment(JTextField.RIGHT);
		txtMenor.setBounds(210, 85, 70, 30);
		
		//criar JLAbel e um JTextField para o Maior Multiplicador
		labelMaior = new JLabel();
		labelMaior.setText("Multiplicador Maior");
		labelMaior.setBounds(50, 125, 150, 30);
		
		txtMaior = new JTextField();
		txtMaior.setHorizontalAlignment(JTextField.RIGHT);
		txtMaior.setBounds(210, 130, 70, 30);
		
		//criar JLButton para o calcular
		btnCalcular = new JButton();
		
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(50, 180, 105, 30);
		
		//criar JLButton para o limpar
		btnLimpar = new JButton();
		btnLimpar.setText("Limpar");
		btnLimpar.setBounds(175, 180, 105, 30);
		
		// JLabel Resultado
		labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(50, 220, 200, 30);
		
		// Criando Lista que exibirá a tabuada
		listaTabuada = new JList();
		
		// Criando o painel de rolagem
		scrollTabuada = new JScrollPane(listaTabuada);
		scrollTabuada.setBounds(50, 260, 230, 200);
		
	
		
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(labelMultiplicando);
		tela.getContentPane().add(labelMenor);
		tela.getContentPane().add(txtMenor);
		tela.getContentPane().add(labelMaior);
		tela.getContentPane().add(txtMaior);
		tela.getContentPane().add(btnCalcular);
		tela.getContentPane().add(btnLimpar);
		tela.getContentPane().add(labelResultado);
		tela.getContentPane().add(scrollTabuada);
		
		// adicionar um ouvinte de ação (Listener) ao botão calcular
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				labelResultado.setText("Tabuada do " + txtMultiplicando.getText() + ":");
				Tabuada tabuada = new Tabuada();
				
				double multiplicando = Double.parseDouble(txtMultiplicando.getText());
				double menor = Double.parseDouble(txtMenor.getText());
				double maior = Double.parseDouble(txtMaior.getText());
				
				
				tabuada.setMultiplicando(multiplicando);
				tabuada.setMenorMultiplicador(menor);
				tabuada.setMaiorMultiplicador(multiplicando);
				
				String[] resultado = tabuada.exibirTabuada()
;				
				listaTabuada.setListData(resultado);
				
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				txtMultiplicando.setText(null); 
				txtMenor.setText(null); 
				txtMaior.setText(null); 
				txtMultiplicando.requestFocus();
				listaTabuada.setListData(new String[0]);
				
			}
		});
		
		// Tornar a tela visível deverá ser a última linha deste método
		tela.setVisible(true);
	}
	
}
