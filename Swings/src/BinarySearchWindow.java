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

public class BinarySearchWindow extends JFrame {

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
					BinarySearchWindow frame = new BinarySearchWindow();
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
	public BinarySearchWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 215, 0));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setFont(new Font("Snap ITC", Font.BOLD, 18));
		heading.setBounds(115, 11, 198, 24);
		contentPane.add(heading);
		
		JLabel lbla = new JLabel("Enter 5 numbers :");
		lbla.setForeground(new Color(255, 0, 0));
		lbla.setFont(new Font("Forte", Font.PLAIN, 18));
		lbla.setBounds(48, 63, 149, 26);
		contentPane.add(lbla);
		
		JLabel lblb = new JLabel("Enter Key to search :");
		lblb.setForeground(Color.RED);
		lblb.setFont(new Font("Forte", Font.PLAIN, 18));
		lblb.setBounds(48, 104, 158, 26);
		contentPane.add(lblb);
		
		JLabel lbla_1_1 = new JLabel("Result after search :");
		lbla_1_1.setForeground(Color.RED);
		lbla_1_1.setFont(new Font("Forte", Font.PLAIN, 18));
		lbla_1_1.setBounds(48, 143, 156, 26);
		contentPane.add(lbla_1_1);
		
		JButton btnbs = new JButton("Binary Search");
		btnbs.setBackground(new Color(255, 192, 203));
		btnbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nums=tf1.getText();
				String data=tf2.getText();
				int key=Integer.valueOf(data);
				String a[]=nums.split(" ");
				int low=0;
				int high=a.length-1;
				while(low<=high){
					int mid=(low+high)/2;
					if(Integer.valueOf(a[mid])==key){
						tfres.setText("Search Success key @ "+mid);
						break;
						}
					else if(Integer.valueOf(a[mid])<key){
						low=mid+1;
						}
					else{
						high=mid-1;
					}
					tfres.setText("Key not found");
				}
			}
		});
		btnbs.setForeground(new Color(0, 0, 128));
		btnbs.setFont(new Font("Stencil", Font.BOLD, 15));
		btnbs.setBounds(115, 212, 198, 25);
		contentPane.add(btnbs);
		
		tf1 = new JTextField();
		tf1.setBounds(227, 68, 176, 20);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(227, 109, 176, 20);
		contentPane.add(tf2);
		
		tfres = new JTextField();
		tfres.setColumns(10);
		tfres.setBounds(227, 148, 176, 20);
		contentPane.add(tfres);
	}

}
