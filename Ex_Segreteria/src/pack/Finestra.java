package pack;

import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Finestra {
	
	String dato;
	
	Finestra(){
						JFrame frame= new JFrame("Esempio");	
						
						JButton b=new JButton("Invia");  
						b.setBounds(100,100,140, 40);
						
						JButton b2=new JButton("1");
						b2.setBounds(100,100,100,100);
						
						JButton b3=new JButton("2");
						b3.setBounds(200, 100, 50, 50);
						
						JLabel label = new JLabel();
						label.setText("Enter");
						label.setBounds(10, 10, 100, 100);
						
						JLabel label1 = new JLabel();
						label1.setBounds(10,110,200,100);
						
						JTextField textfield = new JTextField();
						textfield.setBounds(110,50,130,30);

						frame.add(b);  
						//frame.add(b2);
						//frame.add(b3);
						frame.add(label);
						frame.add(label1);
						frame.add(textfield);
						frame.setSize(300,300);    
						frame.setLayout(null);    
						frame.setVisible(true);    
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
						
						b.addActionListener(new ActionListener() {
						
						@Override 
						public void actionPerformed(ActionEvent arg0) {
							dato= textfield.getText();
							label1.setText("Data Received "+dato );
							
							
						}
				    
				    } );
	}
					public static void main(String[] args) {    
					   
						new Finestra(); 
						
					}    
	
}
	


