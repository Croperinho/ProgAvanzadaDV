package IU;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Container;
import Negocio.Almacen;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class InterfazAgregarCont extends JFrame {

	private JPanel contentPane;
	private JTextField inputId;
	private JTextField inputDni;
	private JTextField inputNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAgregarCont frame = new InterfazAgregarCont();
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
	public InterfazAgregarCont() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Complete los datos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 11, 302, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 72, 87, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dni");
		lblNewLabel_2.setBounds(10, 119, 87, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(10, 164, 87, 22);
		contentPane.add(lblNewLabel_3);
		
		inputId = new JTextField();
		inputId.setColumns(10);
		inputId.setBounds(107, 73, 173, 20);
		contentPane.add(inputId);
		
		inputDni = new JTextField();
		inputDni.setColumns(10);
		inputDni.setBounds(107, 120, 173, 20);
		contentPane.add(inputDni);
		
		inputNombre = new JTextField();
		inputNombre.setColumns(10);
		inputNombre.setBounds(107, 165, 173, 20);
		contentPane.add(inputNombre);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.setBounds(294, 227, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton ButtonAgregar = new JButton("Agregar container");
		ButtonAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Almacen a1 = new Almacen();
				Container c1 = new Container();
				c1.setNombre(inputNombre.getText());
				c1.setDni(Integer.parseInt(inputDni.getText()));
				c1.setnroContainer(Integer.parseInt(inputId.getText()));
				
				if(a1.crearConteiner(c1)) {
					JOptionPane.showMessageDialog(null, "Se agrego correctamente");
				}else {
					JOptionPane.showMessageDialog(null, "Error al agregar");
				}
				
			}
		});
		ButtonAgregar.setBounds(94, 227, 158, 23);
		contentPane.add(ButtonAgregar);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
		});
	}
	
	

}
