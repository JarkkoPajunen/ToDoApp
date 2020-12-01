import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ToDoApp extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_3;
	private JTextPane txtpnTask;
	private JTextPane txtpnTask_1;
	private JTextPane txtpnTask_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextPane txtpnCreated;
	private JTextPane txtpnPreviousTasks;
	private JList list_1;
	private Task task = new Task();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoApp frame = new ToDoApp();
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
	public ToDoApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 414);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField.setText("");
				textField_3.setText("");
				
			}
		});
		btnNewButton.setBounds(517, 91, 75, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Done");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText("");
				textField_4.setText("");
				
			}
		});
		btnNewButton_1.setBounds(517, 132, 75, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Done");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText("");
				textField_5.setText("");
			}
		});
		btnNewButton_2.setBounds(517, 167, 75, 21);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(68, 91, 363, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(68, 130, 363, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(68, 167, 363, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_3 = new JButton("Create new task");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				task.setVisible(true);	
				
			}
		});
		btnNewButton_3.setBounds(10, 11, 130, 49);
		contentPane.add(btnNewButton_3);
		
		txtpnTask = new JTextPane();
		txtpnTask.setEditable(false);
		txtpnTask.setText("Task 1");
		txtpnTask.setBounds(10, 91, 48, 20);
		contentPane.add(txtpnTask);
		
		txtpnTask_1 = new JTextPane();
		txtpnTask_1.setEditable(false);
		txtpnTask_1.setText("Task 2");
		txtpnTask_1.setBounds(10, 131, 48, 20);
		contentPane.add(txtpnTask_1);
		
		txtpnTask_2 = new JTextPane();
		txtpnTask_2.setEditable(false);
		txtpnTask_2.setText("Task 3");
		txtpnTask_2.setBounds(10, 167, 48, 20);
		contentPane.add(txtpnTask_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(439, 91, 68, 21);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(439, 130, 68, 21);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(439, 167, 68, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		txtpnCreated = new JTextPane();
		txtpnCreated.setForeground(Color.BLACK);
		txtpnCreated.setEditable(false);
		txtpnCreated.setText("Created");
		txtpnCreated.setBounds(447, 59, 48, 20);
		contentPane.add(txtpnCreated);
		
		txtpnPreviousTasks = new JTextPane();
		txtpnPreviousTasks.setText("Previous tasks");
		txtpnPreviousTasks.setBounds(274, 218, 80, 20);
		contentPane.add(txtpnPreviousTasks);
		
	
		list_1 = new JList();
		list_1.setBackground(new Color(255, 240, 245));
		list_1.setBounds(68, 249, 480, 115);
		contentPane.add(list_1);
	}
}
