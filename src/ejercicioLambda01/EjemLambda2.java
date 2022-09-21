package ejercicioLambda01;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EjemLambda2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblSaluda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemLambda2 frame = new EjemLambda2();
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
	public EjemLambda2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("nombre");
		lblNombre.setBounds(129, 132, 69, 20);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(227, 129, 420, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSaluda = new JButton("saluda");
	
		btnSaluda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblSaluda.setText("Hola "+textField.getText());
				System.out.println(e.getSource().getClass());
			}
		});
	
				
		btnSaluda.setBounds(228, 219, 115, 29);
		contentPane.add(btnSaluda);
		
		lblSaluda = new JLabel(" ");
		lblSaluda.setBounds(36, 405, 722, 56);
		contentPane.add(lblSaluda);
	}
}
