import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFRAME extends JFrame{
	
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, 
	b11, b12, b13, b14, b15, b16;
	JLabel l1,l2, l3, l4, l5, l6, l7, l8, l9, l10, 
	l11, l12, l13, l14, l15, l16, la, ls, l17, l18 ,l19, 
	l20, l21, l22, l23, l25, l26, l27, l28, l29; 	
	JTextField t1, t2, t3, t4, t5, t6, t7, t8; 
	int w; 
	String n1, n2;
	Wind windo = new Wind(); 
	
	public JFRAME(String e){  
		super(e);
		setLayout(new FlowLayout());		
		b1 = new JButton("Конверт. 10 >>> 2");
		b2 = new JButton("Конверт. 10 >>> 8");
		b3 = new JButton("Конверт. 10 >>> 16");	
		b4 = new JButton("Конверт. 2 >>> 10");
		b5 = new JButton("Конверт. 2 >>> 8");
		b6 = new JButton("Конверт. 2 >>> 16");		
		b7 = new JButton("Конверт. 8 >>> 2");
		b8 = new JButton("Конверт. 8 >>> 10");
		b9 = new JButton("Конверт. 8 >>> 16");		
		b10= new JButton("Конверт. 16 >>> 2");
		b11= new JButton("Конверт. 16 >>> 10");
		b12= new JButton("Конверт. 16 >>> 8");
		b13 = new JButton("Очистить поля");
		b14 = new JButton("Очистить поля");
		b15 = new JButton("Очистить поля");
		b16 = new JButton("Очистить поля");
		
		l1 = new JLabel("Введите свое число сюда >");
		l2 = new JLabel("");
		la = new JLabel("");
		ls = new JLabel("");
		l3 = new JLabel(" *** Конвертер чотирьох систем счисления *** ");
		l4 = new JLabel("Конвертация из десятичной системы в 2-ю,8-ю,16-ю.");
		l5 = new JLabel("Конвертация из двоичной системы в 10-ю,8-ю,16-ю.");
		l6 = new JLabel("Конвертация из восьмеричной системы в 2-ю,10-ю,16-ю.");
		l7 = new JLabel("Конвертация из шестнадцатеричной системы в 2-ю,10-ю,8-ю.");
		l8 = new JLabel("");
		l9 = new JLabel("= ");
		l10 = new JLabel("= ");
		l11 = new JLabel("= ");
		l12 = new JLabel("");
		l13 = new JLabel("= ");
		l14 = new JLabel("Введите свое число сюда >");
		l15 = new JLabel("Введите свое число сюда >");
		l16 = new JLabel("Введите свое число сюда >");
		l17 = new JLabel("Введите свое число сюда >");
		l18 = new JLabel("Введите свое число сюда >");
		l19 = new JLabel("Введите свое число сюда >");
		l20 = new JLabel("__________________________________________________________________");
		l21 = new JLabel("---------------------------------------------------------------"
				+ "----------------------------------------------------");
		l22 = new JLabel("---------------------------------------------------------------"
				+ "----------------------------------------------------");
		l23 = new JLabel("---------------------------------------------------------------"
				+ "----------------------------------------------------");
		
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		t4 = new JTextField(10);
		t5 = new JTextField(10);
		t6 = new JTextField(10);
		t7 = new JTextField(10);
		t8 = new JTextField(10);

		add(l3);
		add(l20);
		
		add(l4);
		
		add(l1);
		add(t1);
		add(l9);
		add(t5);
		
		add(b1);
		add(b2);
		add(b3);
		add(b13);
		add(l21);
		
		add(l5);
		
		add(l17);
		add(t2);
		add(l10);
		add(t6);
		
		add(b4);
		add(b5);
		add(b6);
		add(b14);
		add(l22);
		
		add(l6);
		
		add(l18);
		add(t3);
		add(l11);
		add(t7);
		
		add(b7);
		add(b8);
		add(b9);
		add(b15);
		add(l23);
		
		add(l7);
		
		add(l19);
		add(t4);
		add(l13);
		add(t8);
		
		add(b10);
		add(b11);
		add(b12);
		add(b16);
		
			
		b1.addActionListener(windo);
		b2.addActionListener(windo);
		b3.addActionListener(windo);
		b4.addActionListener(windo);
		b5.addActionListener(windo);
		b6.addActionListener(windo);
		b7.addActionListener(windo);
		b8.addActionListener(windo);
		b9.addActionListener(windo);
		b10.addActionListener(windo);
		b11.addActionListener(windo);
		b12.addActionListener(windo);
		b13.addActionListener(windo);
		b14.addActionListener(windo);
		b15.addActionListener(windo);
		b16.addActionListener(windo);	
	}	
	public class Wind implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{
				if(e.getSource()==b1){
					w = Integer.parseInt(t1.getText());
					String n2 = Integer.toBinaryString(w);
					n1 =n2;
					t5.setText(n1);				
				}
				if(e.getSource()==b2){
					w = Integer.parseInt(t1.getText());
					String n2 = Integer.toOctalString(w);
					n1 =n2;
					t5.setText(n1);			
				}
				if(e.getSource()==b3){
					w = Integer.parseInt(t1.getText());
					String n2 = Integer.toHexString(w);
					n1 = n2;
					t5.setText(n1);
				}
			}catch(Exception ex){JOptionPane.showMessageDialog(null, "Будьте внимательней, вы вводите элемент который не подходит под систему счисления,\n "
					+ "                                    или питаетесь посчитать пустое поле ввода :-)");}
/*______________________________________________________________________________			
*/
			try{	
				if(e.getSource()==b4){
					w = Integer.parseInt(t2.getText(), 2);
					String n2 = Integer.toString(w);
					n1 = n2;
					t6.setText(n1);
				}
				if(e.getSource()==b5){
					w = Integer.parseInt(t2.getText(), 2);
					String n2 = Integer.toOctalString(w);
					n1 = n2;
					t6.setText(n1);
				}
				if(e.getSource()==b6){
					w = Integer.parseInt(t2.getText(), 2);
					String n2 = Integer.toHexString(w);
					n1 = n2;
					t6.setText(n1);
				}
			}catch(Exception ex){JOptionPane.showMessageDialog(null, "Будьте внимательней, вы вводите элемент который не подходит под систему счисления,\n "
					+ "                                    или питаетесь посчитать пустое поле ввода :-)");}
/*______________________________________________________________________________			
*/
			try{
				if(e.getSource()==b7){
					w = Integer.parseInt(t3.getText(), 8);
					String n2 = Integer.toBinaryString(w);
					n1 = n2;
					t7.setText(n1);
				}
				if(e.getSource()==b8){
					w = Integer.parseInt(t3.getText(), 8);
					String n2 = Integer.toString(w);
					n1 = n2;
					t7.setText(n1);
				}
				if(e.getSource()==b9){
					w = Integer.parseInt(t3.getText(), 8);
					String n2 = Integer.toHexString(w);
					n1 = n2;
					t7.setText(n1);
				}
			}catch(Exception ex){JOptionPane.showMessageDialog(null, "Будьте внимательней, вы вводите элемент который не подходит под систему счисления,\n "
					+ "                                    или питаетесь посчитать пустое поле ввода :-)");}
/*______________________________________________________________________________			
*/			
			try{	
				if(e.getSource()==b10){
					w = Integer.parseInt(t4.getText(), 16);
					String n2 = Integer.toBinaryString(w);
					n1 = n2;
					t8.setText(n1);
				}
				if(e.getSource()==b11){
					w = Integer.parseInt(t4.getText(), 16);
					String n2 = Integer.toString(w);
					n1 = n2;
					t8.setText(n1);
				}
				if(e.getSource()==b12){
					w = Integer.parseInt(t4.getText(), 16);
					String n2 = Integer.toOctalString(w);
					n1 = n2;
					t8.setText(n1);
				}	
			}catch(Exception ex){JOptionPane.showMessageDialog(null, "Будьте внимательней, вы ничего не ввели в поле ввода :-)");}
/*______________________________________________________________________________			
*/				
				if(e.getSource()==b13){
					t1.setText(null);
					t5.setText(null);
				}else if(e.getSource()==b14){	
					t2.setText(null);
					t6.setText(null);	
				}else if(e.getSource()==b15){
					t3.setText(null);
					t7.setText(null);
				}else if(e.getSource()==b16){
					t4.setText(null);
					t8.setText(null);
				}
		}	
	}
}