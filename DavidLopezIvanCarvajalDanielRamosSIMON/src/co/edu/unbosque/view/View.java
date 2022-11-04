package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.Controller;

public class View extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private PanelRepeticion panelRepeticion;
	private PanelBoton panelBoton;
	private PanelAccion panelAccion;

	public View(Controller control) {
		
		setSize(600,600);
		setResizable(false); 
		setTitle("SIMON"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setLayout( new BorderLayout() );
		
		panelRepeticion = new PanelRepeticion();
		panelRepeticion.setBackground(new Color(247, 246, 220 ));
		panelRepeticion.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		add(panelRepeticion, BorderLayout.NORTH);
		
		panelBoton = new PanelBoton();
		panelBoton.setBackground(new Color(247, 246, 220));
		panelBoton.setBorder(BorderFactory.createEmptyBorder(70, 130, 80, 130));
		add(panelBoton, BorderLayout.CENTER);
		
		panelAccion = new PanelAccion();
		panelAccion.setBackground(new Color(247, 246, 220));
		panelAccion.setBorder(BorderFactory.createEmptyBorder(0, 0, 60, 0));
		add(panelAccion, BorderLayout.SOUTH);
		
		panelBoton.getNum1().addActionListener(control);
		panelBoton.getNum2().addActionListener(control);
		panelBoton.getNum3().addActionListener(control);
		panelBoton.getNum4().addActionListener(control);
		panelAccion.getButIniciar().addActionListener(control);
		panelAccion.getTerminar().addActionListener(control);
		panelAccion.getAyuda().addActionListener(control);
		}
	
	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	public PanelRepeticion getPanelRepeticion() {
		return panelRepeticion;
	}

	public void setPanelRepeticion(PanelRepeticion panelRepeticion) {
		this.panelRepeticion = panelRepeticion;
	}

	public PanelBoton getPanelBoton() {
		return panelBoton;
	}

	public void setPanelBoton(PanelBoton panelBoton) {
		this.panelBoton = panelBoton;
	}

	public PanelAccion getTerminar() {
		return panelAccion;
	}

	public void setTerminar(PanelAccion terminar) {
		this.panelAccion = terminar;
	}
}
