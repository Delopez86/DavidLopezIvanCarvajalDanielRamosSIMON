package co.edu.unbosque.view;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class PanelBoton extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JButton num1;
	private JButton num2;
	private JButton num3;
	private JButton num4;
	
	public static final String NUM1 = "1";
	public static final String NUM2 = "2";
	public static final String NUM3 = "3";
	public static final String NUM4 = "4";
	
	public PanelBoton() {
		setLayout(new GridLayout(2,2));
		
		num1 = new JButton("1");
		num1.setBackground(new Color(212, 172, 13));
		num1.setBorder(new BevelBorder(BevelBorder.RAISED));
		num1.setForeground(Color.BLACK);
		num1.setFont(new Font("Arial", Font.BOLD , 46));
		num1.setActionCommand(NUM1);
		
		num2 = new JButton("2");
		num2.setBackground(new Color(203, 67, 53 ));
		num2.setBorder(new BevelBorder(BevelBorder.RAISED));
		num2.setForeground(Color.BLACK);
		num2.setFont(new Font("Arial", Font.BOLD , 46));
		num2.setActionCommand(NUM2);
		
		num3 = new JButton("3");
		num3.setBackground(new Color(40, 116, 166));
		num3.setBorder(new BevelBorder(BevelBorder.RAISED));
		num3.setForeground(Color.BLACK);
		num3.setFont(new Font("Arial", Font.BOLD , 46));
		num3.setActionCommand(NUM3);
		
		num4 = new JButton("4");
		num4.setBackground(new Color(35, 155, 86));
		num4.setBorder(new BevelBorder(BevelBorder.RAISED));
		num4.setForeground(Color.BLACK);
		num4.setFont(new Font("Arial", Font.BOLD , 46));
		num4.setActionCommand(NUM4);
		
		add(num1);
		add(num2);
		add(num3);
		add(num4);
	}

	public JButton getNum1() {
		return num1;
	}

	public void setNum1(JButton num1) {
		this.num1 = num1;
	}

	public JButton getNum2() {
		return num2;
	}

	public void setNum2(JButton num2) {
		this.num2 = num2;
	}

	public JButton getNum3() {
		return num3;
	}

	public void setNum3(JButton num3) {
		this.num3 = num3;
	}

	public JButton getNum4() {
		return num4;
	}

	public void setNum4(JButton num4) {
		this.num4 = num4;
	}
}
