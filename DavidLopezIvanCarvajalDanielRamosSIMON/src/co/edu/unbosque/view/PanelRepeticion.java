package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelRepeticion extends JPanel{

	private static final long serialVersionUID = 1L;

	private JLabel numero;
	private JLabel pos0;
	private JLabel pos1;
	private JLabel pos2;
	private JLabel pos3;

	public PanelRepeticion() {
		FlowLayout layout = new FlowLayout();
		layout.setHgap(70);
		setLayout(layout);
		
		numero = new JLabel("Numero:");
		numero.setFont(new Font("Arial", Font.BOLD , 30));
		numero.setForeground(Color.BLACK);
		
		pos0 = new JLabel("0");
		pos0.setFont(new Font("Arial", Font.BOLD, 30));
		pos0.setForeground(new Color(247, 246, 220));
		
		pos1 = new JLabel("0");
		pos1.setFont(new Font("Arial", Font.BOLD, 30));
		pos1.setForeground(new Color(247, 246, 220));
		
		pos2 = new JLabel("0");
		pos2.setFont(new Font("Arial", Font.BOLD, 30));
		pos2.setForeground(new Color(247, 246, 220));
		
		pos3 = new JLabel("0");
		pos3.setFont(new Font("Arial", Font.BOLD, 30));
		pos3.setForeground(new Color(247, 246, 220));
			
		add(numero);
		add(pos0);
		add(pos1);
		add(pos2);
		add(pos3);

	}
	
	public JLabel getNumero() {
		return numero;
	}

	public void setNumero(JLabel numero) {
		this.numero = numero;
	}

	public JLabel getPos0() {
		return pos0;
	}

	public void setPos0(JLabel pos0) {
		this.pos0 = pos0;
	}

	public JLabel getPos1() {
		return pos1;
	}

	public void setPos1(JLabel pos1) {
		this.pos1 = pos1;
	}

	public JLabel getPos2() {
		return pos2;
	}

	public void setPos2(JLabel pos2) {
		this.pos2 = pos2;
	}

	public JLabel getPos3() {
		return pos3;
	}

	public void setPos3(JLabel pos3) {
		this.pos3 = pos3;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
