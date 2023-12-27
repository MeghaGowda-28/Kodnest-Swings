import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LinearSearchWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearchWindow frame = new LinearSearchWindow();
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
	public LinearSearchWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(221, 160, 221));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setForeground(new Color(0, 0, 128));
		heading.setFont(new Font("Stencil", Font.PLAIN, 20));
		heading.setBounds(143, 11, 151, 21);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("Enter 5 numbers");
		lbla.setForeground(new Color(160, 82, 45));
		lbla.setBackground(new Color(233, 150, 122));
		lbla.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lbla.setBounds(48, 58, 123, 19);
		contentPane.add(lbla);
		
		JLabel lblb = new JLabel("Enter Key to search");
		lblb.setForeground(new Color(160, 82, 45));
		lblb.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblb.setBackground(new Color(233, 150, 122));
		lblb.setBounds(48, 88, 148, 19);
		contentPane.add(lblb);
		
		JLabel lblres = new JLabel("Result");
		lblres.setForeground(new Color(160, 82, 45));
		lblres.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblres.setBackground(new Color(233, 150, 122));
		lblres.setBounds(48, 118, 148, 19);
		contentPane.add(lblres);
		
		JButton btnls = new JButton("Linear Search");
		btnls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String d1=tf1.getText();
				String d2=tf2.getText();
				int var2=Integer.valueOf(d2);
				String a[]=d1.split(" ");
				for(int i=0;i<=a.length-1;i++){
					if(Integer.valueOf(a[i])==var2){
						tfres.setText("Search Success key @ "+i);
						break;
					}
					else{
						tfres.setText("Key not found");
					}
				}
			}
		});
		btnls.setForeground(new Color(255, 0, 0));
		btnls.setBackground(new Color(175, 238, 238));
		btnls.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		btnls.setBounds(131, 194, 172, 29);
		contentPane.add(btnls);
		
		tf1 = new JTextField();
		tf1.setBounds(218, 59, 172, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(218, 89, 172, 20);
		contentPane.add(tf2);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(218, 119, 172, 20);
		contentPane.add(tfres);
	}
}
