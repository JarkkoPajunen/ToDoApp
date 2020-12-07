import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;

public class Task extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextPane txtpnCreateATask;
	private JTextPane txtpnTask;
	private JTextPane txtpnTask_1;
	private JTextPane txtpnTask_2;
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("dd/MM");
	String tiedosto = "src/Taskit.txt";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task frame = new Task();
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
	public Task() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 595, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 40, 355, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(91, 88, 355, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				ToDoApp.textField.setText(textField_1.getText());
				ToDoApp.textField.setText(textField_3.setText(sf.format(date)));
				
				kirjoitaTiedostoon(textField_1.getText(), tiedosto);
				
			}
		});
		btnNewButton.setBounds(480, 39, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Create");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ToDoApp.textField_1.setText(textField_2.getText());
				kirjoitaTiedostoon(textField_2.getText(), tiedosto);
				
			}
		});
		btnNewButton_1.setBounds(480, 87, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Create");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ToDoApp.textField_2.setText(textField_3.getText());
				kirjoitaTiedostoon(textField_3.getText(), tiedosto);
			}
		});
		btnNewButton_2.setBounds(480, 131, 89, 23);
		contentPane.add(btnNewButton_2);
		
		txtpnCreateATask = new JTextPane();
		txtpnCreateATask.setBackground(Color.WHITE);
		txtpnCreateATask.setText("Create a task");
		txtpnCreateATask.setBounds(177, 0, 80, 20);
		contentPane.add(txtpnCreateATask);
		
		txtpnTask = new JTextPane();
		txtpnTask.setEditable(false);
		txtpnTask.setText("Task 1");
		txtpnTask.setBounds(21, 40, 46, 20);
		contentPane.add(txtpnTask);
		
		txtpnTask_1 = new JTextPane();
		txtpnTask_1.setEditable(false);
		txtpnTask_1.setText("Task 2");
		txtpnTask_1.setBounds(21, 88, 46, 20);
		contentPane.add(txtpnTask_1);
		
		txtpnTask_2 = new JTextPane();
		txtpnTask_2.setEditable(false);
		txtpnTask_2.setText("Task 3");
		txtpnTask_2.setBounds(21, 132, 46, 20);
		contentPane.add(txtpnTask_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(91, 132, 355, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
	}

	
	public void kirjoitaTiedostoon(String txt, String tiedosto) {
		try {
			java.util.Date date = new java.util.Date();
			FileWriter fwriter = new FileWriter(tiedosto, true);
			fwriter.write(date.toString() + " Task:  " + txt + "\n");
			fwriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		
}	


