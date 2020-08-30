package tp1_LosSherpas.Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Label;
import javax.swing.border.TitledBorder;

import tp1_LosSherpas.main.LlenadorLineal;

import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.DebugGraphics;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Interfaz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
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
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(50, 39, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		Panel panel = new Panel();
		panel.setBounds(431, 39, 320, 229);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel JPanelBeer = new JPanel();
		JPanelBeer.setForeground(Color.YELLOW);
		JPanelBeer.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeer.setBounds(54, 106, 1, 1);
		panel.add(JPanelBeer);
		JPanelBeer.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeer.setLayout(null);
		
		JLabel JlabelLineal = new JLabel("");
		JlabelLineal.setBounds(29, 11, 175, 203);
		JlabelLineal.setAutoscrolls(true);
		panel.add(JlabelLineal);

		
		JLabel jLabelFondo = new JLabel("");
		jLabelFondo.setBounds(0, 0, 774, 651);
		jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/Fondo1.png")));
		JlabelLineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/PintaRender.png")));
		
		JLabel JLabelBEER = new JLabel("");
		JLabelBEER.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER.setForeground(Color.YELLOW);
		JLabelBEER.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER.setBounds(43, 160, 109, 16);
		panel.add(JLabelBEER);
		
		JLabel JLabelBEER2 = new JLabel("");
		JLabelBEER2.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER2.setForeground(Color.YELLOW);
		JLabelBEER2.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER2.setBounds(43, 143, 109, 16);
		panel.add(JLabelBEER2);
		
		JLabel JLabelBEER3 = new JLabel("");
		JLabelBEER3.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER3.setForeground(Color.YELLOW);
		JLabelBEER3.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER3.setBounds(43, 118, 109, 16);
		panel.add(JLabelBEER3);
		
		JLabel JLabelBEER4 = new JLabel("");
		JLabelBEER4.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER4.setForeground(Color.YELLOW);
		JLabelBEER4.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER4.setBounds(43, 106, 109, 16);
		panel.add(JLabelBEER4);
		
		JLabel JLabelBEER5 = new JLabel("");
		JLabelBEER5.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER5.setForeground(Color.YELLOW);
		JLabelBEER5.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER5.setBounds(43, 87, 109, 16);
		panel.add(JLabelBEER5);
		
		JLabel JLabelBEER6 = new JLabel("");
		JLabelBEER6.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER6.setForeground(Color.YELLOW);
		JLabelBEER6.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER6.setBounds(43, 70, 109, 16);
		panel.add(JLabelBEER6);
		
		JLabel JLabelBEER7 = new JLabel("");
		JLabelBEER7.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER7.setForeground(Color.YELLOW);
		JLabelBEER7.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER7.setBounds(43, 50, 109, 16);
		panel.add(JLabelBEER7);
		
		JLabel lblNewLabel = new JLabel("Tiempo de Ejecucion");
		lblNewLabel.setBounds(191, 11, 100, 14);
		panel.add(lblNewLabel);
		

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
              
		     JLabelBEER.setText("8888888888888888");
		     JLabelBEER2.setText("8888888888888888");
		     JLabelBEER3.setText("8888888888888888");
		     JLabelBEER4.setText("8888888888888888");
		     JLabelBEER5.setText("8888888888888888");
		     JLabelBEER6.setText("8888888888888888");
		     JLabelBEER7.setText("8888888888888888"); 
		     }
		});	
		//	jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/Fondo1.png")));
		contentPane.add(jLabelFondo);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBounds(431, 274, 320, 229);
		contentPane.add(panel_1);
		
		JLabel JLabelBEER5_1 = new JLabel("");
		JLabelBEER5_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER5_1.setForeground(Color.YELLOW);
		JLabelBEER5_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER5_1.setBounds(43, 87, 109, 16);
		panel_1.add(JLabelBEER5_1);
		
		JPanel JPanelBeer_1 = new JPanel();
		JPanelBeer_1.setLayout(null);
		JPanelBeer_1.setForeground(Color.YELLOW);
		JPanelBeer_1.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeer_1.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeer_1.setBounds(54, 106, 1, 1);
		panel_1.add(JPanelBeer_1);
		
		JLabel JlabelLineal_1 = new JLabel("");
		JlabelLineal_1.setAutoscrolls(true);
		JlabelLineal_1.setBounds(29, 11, 175, 203);
		panel_1.add(JlabelLineal_1);
		
		JLabel JLabelBEER_1 = new JLabel("");
		JLabelBEER_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER_1.setForeground(Color.YELLOW);
		JLabelBEER_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER_1.setBounds(43, 160, 109, 16);
		panel_1.add(JLabelBEER_1);
		
		JLabel JLabelBEER2_1 = new JLabel("");
		JLabelBEER2_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER2_1.setForeground(Color.YELLOW);
		JLabelBEER2_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER2_1.setBounds(43, 143, 109, 16);
		panel_1.add(JLabelBEER2_1);
		
		JLabel JLabelBEER3_1 = new JLabel("");
		JLabelBEER3_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER3_1.setForeground(Color.YELLOW);
		JLabelBEER3_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER3_1.setBounds(43, 118, 109, 16);
		panel_1.add(JLabelBEER3_1);
		
		JLabel JLabelBEER4_1 = new JLabel("");
		JLabelBEER4_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER4_1.setForeground(Color.YELLOW);
		JLabelBEER4_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER4_1.setBounds(43, 106, 109, 16);
		panel_1.add(JLabelBEER4_1);
		
		JLabel JLabelBEER6_1 = new JLabel("");
		JLabelBEER6_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER6_1.setForeground(Color.YELLOW);
		JLabelBEER6_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER6_1.setBounds(43, 70, 109, 16);
		panel_1.add(JLabelBEER6_1);
		
		JLabel JLabelBEER7_1 = new JLabel("");
		JLabelBEER7_1.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER7_1.setForeground(Color.YELLOW);
		JLabelBEER7_1.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER7_1.setBounds(43, 50, 109, 16);
		panel_1.add(JLabelBEER7_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tiempo de Ejecucion");
		lblNewLabel_1.setBounds(191, 11, 100, 14);
		panel_1.add(lblNewLabel_1);
	}
}
