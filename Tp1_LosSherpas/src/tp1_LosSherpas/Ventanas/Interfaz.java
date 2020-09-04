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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import java.awt.Window.Type;

public class  Interfaz extends JFrame {

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

		

	
	public  Interfaz() {
		setResizable(false);
		setForeground(UIManager.getColor("Button.focus"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnNewButton.setBounds(50, 39, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);

		Panel panelLog = new Panel();
		panelLog.setBounds(100, 100, 320, 220);
		contentPane.add(panelLog);
		panelLog.setLayout(null);
		
		Panel panelNLogN = new Panel();
		panelNLogN.setBounds(470, 100, 320, 220);
		contentPane.add(panelNLogN);
		panelNLogN.setLayout(null);

		Panel panelLineal = new Panel();
		panelLineal.setBounds(850,100, 320, 220);
		contentPane.add(panelLineal);
		panelLineal.setLayout(null);
		
		Panel panelCuadratica = new Panel();
		panelCuadratica.setBounds(100, 350, 320, 220);
		contentPane.add(panelCuadratica);
		panelCuadratica.setLayout(null);
		
		Panel panelCubica = new Panel();
		panelCubica.setBounds(470, 350, 320, 220);
		contentPane.add(panelCubica);
		panelCubica.setLayout(null);
		
		Panel panelExp = new Panel();
		panelExp.setBounds(850, 350, 320, 220);
		contentPane.add(panelExp);
		panelExp.setLayout(null);
//Definicion de partes de log
		JPanel JPanelBeerLog = new JPanel();
		JPanelBeerLog.setForeground(Color.YELLOW);
		JPanelBeerLog.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerLog.setBounds(54, 106, 1, 1);
		panelLineal.add(JPanelBeerLog);
		JPanelBeerLog.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerLog.setLayout(null);
		
		int count=1;
		int fija= 33;
        //creacion automatica
		for (int i =0; i<9;i++) {
			JLabel JLabelBEERX = new JLabel("Jlabel"+count);
			JLabelBEERX.setBackground(Color.LIGHT_GRAY);
			JLabelBEERX.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
			JLabelBEERX.setFont(new Font("Stencil", Font.BOLD, 18));
			JLabelBEERX.setForeground(Color.YELLOW);
			JLabelBEERX.setVerticalTextPosition(SwingConstants.BOTTOM);
			fija = fija + 16;
			JLabelBEERX.setBounds(24, fija, 90, 16); //posicion del label
			JLabelBEERX.setVisible(true);
			panelLog.add(JLabelBEERX);
			panelLog.repaint();
			count++;
		};
		/**

		JLabel JlabelPintaLog = new JLabel("");
		JlabelPintaLog.setLabelFor(panelLog);
		JlabelPintaLog.setBounds(0, 11, 175, 203);
		panelLog.add(JlabelPintaLog);
		JlabelPintaLog.setAutoscrolls(true);
		JlabelPintaLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/PintaRender.png")));
		
		JPanel JPanelBeerLog = new JPanel();
		JPanelBeerLog.setForeground(Color.YELLOW);
		JPanelBeerLog.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerLog.setBounds(54, 106, 1, 1);
		panelLineal.add(JPanelBeerLog);
		JPanelBeerLog.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerLog.setLayout(null);

		
		JLabel JLabelBEER1Log = new JLabel("");
		JLabelBEER1Log.setBackground(Color.LIGHT_GRAY);
		JLabelBEER1Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER1Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER1Log.setForeground(Color.YELLOW);
		JLabelBEER1Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER1Log.setBounds(24, 161, 90, 16);
		JLabelBEER1Log.setVisible(false);
		panelLog.add(JLabelBEER1Log);
		
		JLabel JLabelBEER2Log = new JLabel("");
		JLabelBEER2Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER2Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER2Log.setForeground(Color.YELLOW);
		JLabelBEER2Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER2Log.setBounds(24, 145, 90, 16);
		JLabelBEER2Log.setVisible(false);
		panelLog.add(JLabelBEER2Log);
		
		JLabel JLabelBEER3Log = new JLabel("");
		JLabelBEER3Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER3Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER3Log.setForeground(Color.YELLOW);
		JLabelBEER3Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER3Log.setBounds(24, 129, 90, 16);
		JLabelBEER3Log.setVisible(false);
		panelLog.add(JLabelBEER3Log);
		
		
		JLabel JLabelBEER4Log = new JLabel("");
		JLabelBEER4Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER4Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER4Log.setForeground(Color.YELLOW);
		JLabelBEER4Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER4Log.setBounds(24, 113, 90, 16);
		JLabelBEER4Log.setVisible(false);
		panelLog.add(JLabelBEER4Log);
		
		JLabel JLabelBEER5Log = new JLabel("");
		JLabelBEER5Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER5Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER5Log.setForeground(Color.YELLOW);
		JLabelBEER5Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER5Log.setBounds(24, 97, 90, 16);
		JLabelBEER5Log.setVisible(false);
		panelLog.add(JLabelBEER5Log);
		
		JLabel JLabelBEER6Log = new JLabel("");
		JLabelBEER6Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));	
		JLabelBEER6Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER6Log.setForeground(Color.YELLOW);
		JLabelBEER6Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER6Log.setBounds(24, 81, 90, 16);
		JLabelBEER6Log.setVisible(false);
		panelLog.add(JLabelBEER6Log);
		
		JLabel JLabelBEER7Log = new JLabel("");
		JLabelBEER7Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER7Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER7Log.setForeground(Color.YELLOW);
		JLabelBEER7Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER7Log.setBounds(24, 65, 90, 16);
		JLabelBEER7Log.setVisible(false);
		panelLog.add(JLabelBEER7Log);
		
		JLabel JLabelBEER8Log = new JLabel("");
		JLabelBEER8Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER8Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER8Log.setForeground(Color.YELLOW);
		JLabelBEER8Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER8Log.setBounds(24, 49, 90, 16);
		JLabelBEER8Log.setVisible(false);
		panelLog.add(JLabelBEER8Log);
		
		JLabel JLabelBEER9Log = new JLabel("");
		JLabelBEER9Log.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER9Log.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER9Log.setForeground(Color.YELLOW);
		JLabelBEER9Log.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER9Log.setBounds(24, 33, 90, 16);
		JLabelBEER9Log.setVisible(false);
		panelLog.add(JLabelBEER9Log);
		
			 * 
		 */	
		
		JLabel lbltiempoLog = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog.setBounds(191, 49, 100, 14);
		panelLog.add(lbltiempoLog);
//Definicion de partes de nlog
		JLabel JlabelPintaNLog = new JLabel("");
		JlabelPintaNLog.setLabelFor(panelLineal);
		JlabelPintaNLog.setBounds(0, 11, 175, 203);
		panelNLogN.add(JlabelPintaNLog);
		JlabelPintaNLog.setAutoscrolls(true);
		JlabelPintaNLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/PintaRender.png")));
		
		JPanel JPanelBeerNLog = new JPanel();
		JPanelBeerNLog.setForeground(Color.YELLOW);
		JPanelBeerNLog.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerNLog.setBounds(54, 106, 1, 1);
		panelNLogN.add(JPanelBeerNLog);
		JPanelBeerNLog.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerNLog.setLayout(null);

		
		JLabel JLabelBEER1NLog = new JLabel("");
		JLabelBEER1NLog.setBackground(Color.LIGHT_GRAY);
		JLabelBEER1NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER1NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER1NLog.setForeground(Color.YELLOW);
		JLabelBEER1NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER1NLog.setBounds(24, 161, 90, 16);
		JLabelBEER1NLog.setVisible(false);
		panelNLogN.add(JLabelBEER1NLog);
		
		JLabel JLabelBEER2NLog = new JLabel("");
		JLabelBEER2NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER2NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER2NLog.setForeground(Color.YELLOW);
		JLabelBEER2NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER2NLog.setBounds(24, 145, 90, 16);
		JLabelBEER2NLog.setVisible(false);
		panelNLogN.add(JLabelBEER2NLog);
		
		JLabel JLabelBEER3NLog = new JLabel("");
		JLabelBEER3NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER3NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER3NLog.setForeground(Color.YELLOW);
		JLabelBEER3NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER3NLog.setBounds(24, 129, 90, 16);
		JLabelBEER3NLog.setVisible(false);
		panelNLogN.add(JLabelBEER3NLog);
		
		
		JLabel JLabelBEER4NLog = new JLabel("");
		JLabelBEER4NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER4NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER4NLog.setForeground(Color.YELLOW);
		JLabelBEER4NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER4NLog.setBounds(24, 113, 90, 16);
		JLabelBEER4NLog.setVisible(false);
		panelNLogN.add(JLabelBEER4NLog);
		
		JLabel JLabelBEER5NLog = new JLabel("");
		JLabelBEER5NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER5NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER5NLog.setForeground(Color.YELLOW);
		JLabelBEER5NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER5NLog.setBounds(24, 97, 90, 16);
		JLabelBEER5NLog.setVisible(false);
		panelNLogN.add(JLabelBEER5NLog);
		
		JLabel JLabelBEER6NLog = new JLabel("");
		JLabelBEER6NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));	
		JLabelBEER6NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER6NLog.setForeground(Color.YELLOW);
		JLabelBEER6NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER6NLog.setBounds(24, 81, 90, 16);
		JLabelBEER6NLog.setVisible(false);
		panelNLogN.add(JLabelBEER6NLog);
		
		JLabel JLabelBEER7NLog = new JLabel("");
		JLabelBEER7NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER7NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER7NLog.setForeground(Color.YELLOW);
		JLabelBEER7NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER7NLog.setBounds(24, 65, 90, 16);
		JLabelBEER7NLog.setVisible(false);
		panelNLogN.add(JLabelBEER7NLog);
		
		JLabel JLabelBEER8NLog = new JLabel("");
		JLabelBEER8NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER8NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER8NLog.setForeground(Color.YELLOW);
		JLabelBEER8NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER8NLog.setBounds(24, 49, 90, 16);
		JLabelBEER8NLog.setVisible(false);
		panelNLogN.add(JLabelBEER8NLog);
		
		JLabel JLabelBEER9NLog = new JLabel("");
		JLabelBEER9NLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER9NLog.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER9NLog.setForeground(Color.YELLOW);
		JLabelBEER9NLog.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER9NLog.setBounds(24, 33, 90, 16);
		JLabelBEER9NLog.setVisible(false);
		panelNLogN.add(JLabelBEER9NLog);
		
		JLabel lbltiempoNLogN = new JLabel("Tiempo de Ejecucion");
		lbltiempoNLogN.setBounds(191, 49, 100, 14);
		panelNLogN.add(lbltiempoNLogN);		
//Definicion de partes de lineal		
		JLabel JlabelPintaLineal = new JLabel("");
		JlabelPintaLineal.setLabelFor(panelLineal);
		JlabelPintaLineal.setBounds(0, 11, 175, 203);
		panelLineal.add(JlabelPintaLineal);
		JlabelPintaLineal.setAutoscrolls(true);
		JlabelPintaLineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/PintaRender.png")));
		
		JPanel JPanelBeerLineal = new JPanel();
		JPanelBeerLineal.setForeground(Color.YELLOW);
		JPanelBeerLineal.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerLineal.setBounds(54, 106, 1, 1);
		panelLineal.add(JPanelBeerLineal);
		JPanelBeerLineal.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerLineal.setLayout(null);

		
		JLabel jLabelFondo = new JLabel("");
		jLabelFondo.setBounds(0, 0, 1360, 739);
		jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/fondo2.png")));

		JLabel JLabelBEER1Lineal = new JLabel("");
		JLabelBEER1Lineal.setBackground(Color.LIGHT_GRAY);
		JLabelBEER1Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER1Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER1Lineal.setForeground(Color.YELLOW);
		JLabelBEER1Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER1Lineal.setBounds(24, 161, 90, 16);
		JLabelBEER1Lineal.setVisible(false);
		panelLineal.add(JLabelBEER1Lineal);
		
		JLabel JLabelBEER2Lineal = new JLabel("");
		JLabelBEER2Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER2Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER2Lineal.setForeground(Color.YELLOW);
		JLabelBEER2Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER2Lineal.setBounds(24, 145, 90, 16);
		JLabelBEER2Lineal.setVisible(false);
		panelLineal.add(JLabelBEER2Lineal);
		
		JLabel JLabelBEER3Lineal = new JLabel("");
		JLabelBEER3Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER3Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER3Lineal.setForeground(Color.YELLOW);
		JLabelBEER3Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER3Lineal.setBounds(24, 129, 90, 16);
		JLabelBEER3Lineal.setVisible(false);
		panelLineal.add(JLabelBEER3Lineal);
		
		
		JLabel JLabelBEER4Lineal = new JLabel("");
		JLabelBEER4Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER4Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER4Lineal.setForeground(Color.YELLOW);
		JLabelBEER4Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER4Lineal.setBounds(24, 113, 90, 16);
		JLabelBEER4Lineal.setVisible(false);
		panelLineal.add(JLabelBEER4Lineal);
		
		JLabel JLabelBEER5Lineal = new JLabel("");
		JLabelBEER5Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER5Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER5Lineal.setForeground(Color.YELLOW);
		JLabelBEER5Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER5Lineal.setBounds(24, 97, 90, 16);
		JLabelBEER5Lineal.setVisible(false);
		panelLineal.add(JLabelBEER5Lineal);
		
		JLabel JLabelBEER6Lineal = new JLabel("");
		JLabelBEER6Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));	
		JLabelBEER6Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER6Lineal.setForeground(Color.YELLOW);
		JLabelBEER6Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER6Lineal.setBounds(24, 81, 90, 16);
		JLabelBEER6Lineal.setVisible(false);
		panelLineal.add(JLabelBEER6Lineal);
		
		JLabel JLabelBEER7Lineal = new JLabel("");
		JLabelBEER7Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER7Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER7Lineal.setForeground(Color.YELLOW);
		JLabelBEER7Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER7Lineal.setBounds(24, 65, 90, 16);
		JLabelBEER7Lineal.setVisible(false);
		panelLineal.add(JLabelBEER7Lineal);
		
		JLabel JLabelBEER8Lineal = new JLabel("");
		JLabelBEER8Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER8Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER8Lineal.setForeground(Color.YELLOW);
		JLabelBEER8Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER8Lineal.setBounds(24, 49, 90, 16);
		JLabelBEER8Lineal.setVisible(false);
		panelLineal.add(JLabelBEER8Lineal);
		
		JLabel JLabelBEER9Lineal = new JLabel("");
		JLabelBEER9Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER9Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER9Lineal.setForeground(Color.YELLOW);
		JLabelBEER9Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER9Lineal.setBounds(24, 33, 90, 16);
		JLabelBEER9Lineal.setVisible(false);
		panelLineal.add(JLabelBEER9Lineal);
		
		JLabel lbltiempo = new JLabel("Tiempo de Ejecucion");
		lbltiempo.setBounds(191, 49, 100, 14);
		panelLineal.add(lbltiempo);
		//Definicion de partes de nlog		

		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//log
			//	JLabelBEER1Log.setVisible(true);
			//	JLabelBEER2Log.setVisible(true);
			//	JLabelBEER3Log.setVisible(true);
			//	JLabelBEER4Log.setVisible(true);
			//	JLabelBEER5Log.setVisible(true);
			//	JLabelBEER6Log.setVisible(true);
			//	JLabelBEER7Log.setVisible(true);
			//	JLabelBEER8Log.setVisible(true);
			//	JLabelBEER9Log.setVisible(true);
				//LogN
				JLabelBEER1NLog.setVisible(true);
				JLabelBEER2NLog.setVisible(true);
				JLabelBEER3NLog.setVisible(true);
				JLabelBEER4NLog.setVisible(true);
				JLabelBEER5NLog.setVisible(true);
				JLabelBEER6NLog.setVisible(true);
				JLabelBEER7NLog.setVisible(true);
				JLabelBEER8NLog.setVisible(true);
				JLabelBEER9NLog.setVisible(true);
				//lineal
				JLabelBEER1Lineal.setVisible(true);
				JLabelBEER2Lineal.setVisible(true);
				JLabelBEER3Lineal.setVisible(true);
				JLabelBEER4Lineal.setVisible(true);
				JLabelBEER5Lineal.setVisible(true);
				JLabelBEER6Lineal.setVisible(true);
				JLabelBEER7Lineal.setVisible(true);
				JLabelBEER8Lineal.setVisible(true);
				JLabelBEER9Lineal.setVisible(true);
				
						
				
		     }
		});	
		//	jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/Fondo1.png")));
		contentPane.add(jLabelFondo);
	}
}
