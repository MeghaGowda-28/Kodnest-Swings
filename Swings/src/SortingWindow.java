import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SortingWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortingWindow frame = new SortingWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SortingWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("SORTING");
		heading.setForeground(Color.RED);
		heading.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		heading.setBackground(Color.CYAN);
		heading.setBounds(171, 11, 97, 32);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("Enter Number for Sorting");
		lbla.setForeground(Color.BLUE);
		lbla.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbla.setBounds(24, 67, 200, 22);
		contentPane.add(lbla);
		
		JLabel lblb = new JLabel("Number after Sorting");
		lblb.setForeground(Color.BLUE);
		lblb.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblb.setBounds(58, 114, 166, 22);
		contentPane.add(lblb);
		
		tf1 = new JTextField();
		tf1.setBackground(Color.PINK);
		tf1.setForeground(Color.BLACK);
		tf1.setBounds(244, 70, 180, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setForeground(Color.BLACK);
		tf2.setColumns(10);
		tf2.setBackground(Color.PINK);
		tf2.setBounds(244, 117, 180, 20);
		contentPane.add(tf2);
		
		JButton bsbutton = new JButton("Bubble Sort");
		bsbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String d1=tf1.getText();	
				String a[]=d1.split(" ");
				String temp;
				for(int i=0;i<a.length-1;i++){
					for(int j=0;j<a.length-i-1;j++){
						if(Integer.valueOf(a[j])>Integer.valueOf(a[j+1])){
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;}
					}
				}
				String d2="";
				for(int i=0;i<=a.length-1;i++){
				d2=d2+a[i]+" ";}
				tf2.setText(d2);
			}
		});
		bsbutton.setForeground(new Color(139, 0, 139));
		bsbutton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		bsbutton.setBounds(107, 195, 219, 29);
		contentPane.add(bsbutton);
	}
}
