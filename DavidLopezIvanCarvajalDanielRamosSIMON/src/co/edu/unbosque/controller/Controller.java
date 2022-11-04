package co.edu.unbosque.controller;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;


import co.edu.unbosque.model.EnlaceNumeros;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View vista;
	private EnlaceNumeros num;
	
	public Controller() {
		num = new EnlaceNumeros();
		vista = new View(this);
        vista.setVisible(true); 
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		
		if(e.getActionCommand().equals("INICIAR")) {
			
		    agregarNumeros();
		    
			TimerTask timerTask = new TimerTask() {
				
				@Override
				public void run() {
	
					vista.getPanelRepeticion().getPos0().setForeground(new Color(247, 246, 220));
					vista.getPanelRepeticion().getPos1().setForeground(new Color(247, 246, 220));
					vista.getPanelRepeticion().getPos2().setForeground(new Color(247, 246, 220));
					vista.getPanelRepeticion().getPos3().setForeground(new Color(247, 246, 220));
				}
			};
			
			Timer timer = new Timer();
			timer.schedule(timerTask, 1200);
		}
		
		if(e.getActionCommand().equals("1") || e.getActionCommand().equals("2") || e.getActionCommand().equals("3")|| e.getActionCommand().equals("4")) { 
		String a = e.getActionCommand();		
		num.getCn().organizar(a);
		}

		if(e.getActionCommand().equals("AYUDA")) {
			vista.mostrarInformacion("Presione INICIAR para poder ver en la parte superior la secuencia de numeros a digitar, "+"\n"+
		                             "tiene intentos indefinidos, si falla en su intento solo presione de nuevo INICIAR."+"\n"+"\n"+
					                 "Presione TERMINAR para verificar su intento.");
		}
		
        if(e.getActionCommand().equals("TERMINAR")) {
        	if(num.getCn().getCadena().equals("")==false){
        	if (num.getCn().getCadena().equals(asignarRepeticion())) {
        		vista.mostrarInformacion("Secuencia exitosa!");
        	}else {
        		vista.mostrarInformacion("Fallaste!");
        	}
		}else {
        	vista.mostrarInformacion("Digite la secuencia");
        }
        }
	}
	
	public void agregarNumeros() {
		num.getCn().setCadena("");
		vista.getPanelRepeticion().getPos0().setText(num.getCn().generarCadena());
	    vista.getPanelRepeticion().getPos1().setText(num.getCn().generarCadena());
	    vista.getPanelRepeticion().getPos2().setText(num.getCn().generarCadena());
	    vista.getPanelRepeticion().getPos3().setText(num.getCn().generarCadena());

		vista.getPanelRepeticion().getPos0().setForeground(Color.BLACK);
		vista.getPanelRepeticion().getPos1().setForeground(Color.BLACK);
		vista.getPanelRepeticion().getPos2().setForeground(Color.BLACK);
		vista.getPanelRepeticion().getPos3().setForeground(Color.BLACK);
	}
	
	public String asignarRepeticion() {
		String union = "";
		String cadenaRepeticion1 = vista.getPanelRepeticion().getPos0().getText();
		String cadenaRepeticion2 = vista.getPanelRepeticion().getPos1().getText();
		String cadenaRepeticion3 = vista.getPanelRepeticion().getPos2().getText();
		String cadenaRepeticion4 = vista.getPanelRepeticion().getPos3().getText();
		union = cadenaRepeticion1+cadenaRepeticion2+cadenaRepeticion3+cadenaRepeticion4;
		
		return union;
	}



		
	
	
	
	
}

