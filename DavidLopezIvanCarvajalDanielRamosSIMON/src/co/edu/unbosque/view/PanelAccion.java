package co.edu.unbosque.view;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class PanelAccion extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JButton terminar;
	private JButton butIniciar;
	private JButton ayuda;
	public static final String AYUDA = "AYUDA";
	public static final String INICIAR = "INICIAR";
	public static final String TERMINAR = "TERMINAR";
	
	public PanelAccion() {
		setLayout(new FlowLayout());
		butIniciar = new JButton("  Iniciar  ");
		butIniciar.setActionCommand(INICIAR);
		butIniciar.setBackground(new Color(66, 73, 73 ));
		butIniciar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		butIniciar.setForeground(Color.WHITE);
		butIniciar.setFont(new Font("Arial", Font.BOLD , 25));
		add(butIniciar);
		
		terminar = new JButton(" Terminar ");
		terminar.setActionCommand(TERMINAR);
		terminar.setBackground(new Color(66, 73, 73 ));
		terminar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		terminar.setForeground(Color.WHITE);
		terminar.setFont(new Font("Arial", Font.BOLD , 25));
		add(terminar);
		
		ayuda = new JButton("  Ayuda  ");
		ayuda.setActionCommand(AYUDA);
		ayuda.setBackground(new Color(66, 73, 73 ));
		ayuda.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		ayuda.setForeground(Color.WHITE);
		ayuda.setFont(new Font("Arial", Font.BOLD , 25));
		add(ayuda);
	}

	public JButton getTerminar() {
		return terminar;
	}

	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}

	public JButton getButIniciar() {
		return butIniciar;
	}

	public void setButIniciar(JButton butIniciar) {
		this.butIniciar = butIniciar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getAyuda() {
		return ayuda;
	}

	public void setAyuda(JButton ayuda) {
		this.ayuda = ayuda;
	}	
	
	
}
