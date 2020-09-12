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

import tp1_LosSherpas.main.LlenadorCuadratico;
import tp1_LosSherpas.main.LlenadorCubico;
import tp1_LosSherpas.main.LlenadorExponencial;
import tp1_LosSherpas.main.LlenadorLineal;
import tp1_LosSherpas.main.LlenadorLogaritmico;
import tp1_LosSherpas.main.LlenadorNLogaritmico;

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
import java.awt.SystemColor;
import java.util.*;
public class  Interfaz extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBarCubica;
	private JTextField txtFieldQlitros;

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
		
		JButton btnNewButton = new JButton("SERVIR");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		
		txtFieldQlitros = new JTextField();
		txtFieldQlitros.setFont(new Font("Ink Free", Font.PLAIN, 17));
		txtFieldQlitros.setToolTipText("Litros");
		txtFieldQlitros.setBounds(190, 12, 86, 20);
		contentPane.add(txtFieldQlitros);
		txtFieldQlitros.setColumns(10);
		contentPane.add(btnNewButton);

		Panel panelLog = new Panel();
		panelLog.setBounds(34, 40, 360, 323);
		contentPane.add(panelLog);
		panelLog.setLayout(null);
		
		Panel panelNLogN = new Panel();
		panelNLogN.setBounds(470, 40, 360, 323);
		contentPane.add(panelNLogN);
		panelNLogN.setLayout(null);

		Panel panelLineal = new Panel();
		panelLineal.setBounds(890,40, 360, 323);
		contentPane.add(panelLineal);
		panelLineal.setLayout(null);
		
		Panel panelCuadratica = new Panel();
		panelCuadratica.setBounds(34, 392, 360, 323);
		contentPane.add(panelCuadratica);
		panelCuadratica.setLayout(null);
		
		JProgressBar progressBarCuadratica = new JProgressBar();
		progressBarCuadratica.setStringPainted(true);
		progressBarCuadratica.setOrientation(SwingConstants.VERTICAL);
		progressBarCuadratica.setForeground(new Color(255, 204, 51));
		progressBarCuadratica.setEnabled(false);
		progressBarCuadratica.setBackground(SystemColor.menu);
		progressBarCuadratica.setBounds(40, 78, 130, 166);
		panelCuadratica.add(progressBarCuadratica);
		
		JLabel JlabelPintaCuadratico = new JLabel("");
		JlabelPintaCuadratico.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		JlabelPintaCuadratico.setBackground(SystemColor.menu);
		JlabelPintaCuadratico.setAutoscrolls(true);
		JlabelPintaCuadratico.setBounds(10, 11, 291, 281);
		panelCuadratica.add(JlabelPintaCuadratico);
		
		JLabel lblLlenadoCuadratico = new JLabel("LLENADO CUADRATICO");
		lblLlenadoCuadratico.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblLlenadoCuadratico.setBounds(10, 298, 233, 25);
		panelCuadratica.add(lblLlenadoCuadratico);
		
		JLabel lbltiempoLog_1_1_1_1_1 = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog_1_1_1_1_1.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog_1_1_1_1_1.setBounds(198, 237, 152, 15);
		panelCuadratica.add(lbltiempoLog_1_1_1_1_1);
		
		JLabel labTiempoCuadratico = new JLabel("................");
		labTiempoCuadratico.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoCuadratico.setBounds(197, 263, 124, 29);
		panelCuadratica.add(labTiempoCuadratico);
		
		Panel panelCubica = new Panel();
		panelCubica.setBounds(470, 392, 360, 323);
		contentPane.add(panelCubica);
		panelCubica.setLayout(null);
		
		progressBarCubica = new JProgressBar();
		progressBarCubica.setStringPainted(true);
		progressBarCubica.setOrientation(SwingConstants.VERTICAL);
		progressBarCubica.setForeground(new Color(255, 204, 51));
		progressBarCubica.setEnabled(false);
		progressBarCubica.setBackground(SystemColor.menu);
		progressBarCubica.setBounds(39, 76, 130, 166);
		panelCubica.add(progressBarCubica);
		
		JLabel JlabelPintaCubico = new JLabel("");
		JlabelPintaCubico.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		JlabelPintaCubico.setBackground(SystemColor.menu);
		JlabelPintaCubico.setAutoscrolls(true);
		JlabelPintaCubico.setBounds(10, 11, 291, 281);
		panelCubica.add(JlabelPintaCubico);
		
		JLabel lblLlenadoCubico = new JLabel("LLENADO CUBICO");
		lblLlenadoCubico.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblLlenadoCubico.setBounds(20, 298, 233, 25);
		panelCubica.add(lblLlenadoCubico);
		
		JLabel lbltiempoLog_1_1_1_1 = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog_1_1_1_1.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog_1_1_1_1.setBounds(198, 237, 152, 15);
		panelCubica.add(lbltiempoLog_1_1_1_1);
		
		JLabel labTiempoCubico = new JLabel("................");
		labTiempoCubico.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoCubico.setBounds(197, 263, 124, 29);
		panelCubica.add(labTiempoCubico);
		
		Panel panelExp = new Panel();
		panelExp.setBounds(890, 392, 360, 323);
		contentPane.add(panelExp);
		panelExp.setLayout(null);
		
		JProgressBar progressBarExpon = new JProgressBar();
		progressBarExpon.setStringPainted(true);
		progressBarExpon.setOrientation(SwingConstants.VERTICAL);
		progressBarExpon.setForeground(new Color(255, 204, 51));
		progressBarExpon.setEnabled(false);
		progressBarExpon.setBackground(SystemColor.menu);
		progressBarExpon.setBounds(38, 76, 130, 166);
		panelExp.add(progressBarExpon);
		
		JLabel JlabelPintaExponencial = new JLabel("");
		JlabelPintaExponencial.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		JlabelPintaExponencial.setBackground(SystemColor.menu);
		JlabelPintaExponencial.setAutoscrolls(true);
		JlabelPintaExponencial.setBounds(10, 11, 291, 281);
		panelExp.add(JlabelPintaExponencial);
		
		JLabel lblLlenadoExponencial = new JLabel("LLENADO EXPONENCIAL");
		lblLlenadoExponencial.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblLlenadoExponencial.setBounds(30, 298, 233, 25);
		panelExp.add(lblLlenadoExponencial);
		
		JLabel lbltiempoLog_1_1_1 = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog_1_1_1.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog_1_1_1.setBounds(198, 237, 152, 15);
		panelExp.add(lbltiempoLog_1_1_1);
		
		JLabel labTiempoExp = new JLabel("................");
		labTiempoExp.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoExp.setBounds(197, 263, 124, 29);
		panelExp.add(labTiempoExp);
		
		JProgressBar progressBarNlogN = new JProgressBar();
		progressBarNlogN.setStringPainted(true);
		progressBarNlogN.setOrientation(SwingConstants.VERTICAL);
		progressBarNlogN.setForeground(new Color(255, 204, 51));
		progressBarNlogN.setEnabled(false);
		progressBarNlogN.setBackground(SystemColor.menu);
		progressBarNlogN.setBounds(40, 76, 130, 166);
		panelLineal.add(progressBarNlogN);
//Definicion de partes de log
		JPanel JPanelBeerLog = new JPanel();
		JPanelBeerLog.setForeground(Color.YELLOW);
		JPanelBeerLog.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerLog.setBounds(54, 106, 1, 1);
		panelLineal.add(JPanelBeerLog);
		JPanelBeerLog.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerLog.setLayout(null);
		
		JLabel labTiempoLog = new JLabel("................");
		labTiempoLog.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoLog.setBounds(198, 258, 124, 29);
		panelLog.add(labTiempoLog);
		

		
		JLabel lbltiempoLog = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog.setBounds(198, 233, 152, 15);
		panelLog.add(lbltiempoLog);
		
		JProgressBar progressBarLog = new JProgressBar();
		progressBarLog.setStringPainted(true);
		progressBarLog.setEnabled(false);
		progressBarLog.setBackground(SystemColor.control);
		progressBarLog.setBounds(41, 82, 130, 166);
		panelLog.add(progressBarLog);
		progressBarLog.setForeground(new Color(255, 204, 51));
		progressBarLog.setOrientation(SwingConstants.VERTICAL);
		

		JLabel JlabelPintaLog = new JLabel("");
		JlabelPintaLog.setBackground(SystemColor.control);
		JlabelPintaLog.setBounds(10, 11, 291, 281);
		panelLog.add(JlabelPintaLog);
		JlabelPintaLog.setLabelFor(panelLog);
		JlabelPintaLog.setAutoscrolls(true);
		JlabelPintaLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		
		JLabel lblNewLabel = new JLabel("LLENADO LOGARITMICO");
		lblNewLabel.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 298, 233, 25);
		panelLog.add(lblNewLabel);
		
		JProgressBar progressBarLin = new JProgressBar();
		progressBarLin.setStringPainted(true);
		progressBarLin.setOrientation(SwingConstants.VERTICAL);
		progressBarLin.setForeground(new Color(255, 204, 51));
		progressBarLin.setEnabled(false);
		progressBarLin.setBackground(SystemColor.menu);
		progressBarLin.setBounds(40, 76, 130, 166);
		panelNLogN.add(progressBarLin);
//Definicion de partes de nlog
		JLabel JlabelPintaNLog = new JLabel("");
		JlabelPintaNLog.setLabelFor(panelLineal);
		JlabelPintaNLog.setBounds(10, 11, 291, 281);
		panelNLogN.add(JlabelPintaNLog);
		JlabelPintaNLog.setAutoscrolls(true);
		JlabelPintaNLog.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		
		JPanel JPanelBeerNLog = new JPanel();
		JPanelBeerNLog.setForeground(Color.YELLOW);
		JPanelBeerNLog.setDebugGraphicsOptions(DebugGraphics.BUFFERED_OPTION);
		JPanelBeerNLog.setBounds(54, 106, 1, 1);
		panelNLogN.add(JPanelBeerNLog);
		JPanelBeerNLog.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JPanelBeerNLog.setLayout(null);
		
		JLabel lblLlenadoLineal = new JLabel("LLENADO LINEAL");
		lblLlenadoLineal.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblLlenadoLineal.setBounds(10, 298, 233, 25);
		panelNLogN.add(lblLlenadoLineal);
		
		JLabel lbltiempoLog_1 = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog_1.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog_1.setBounds(198, 231, 152, 15);
		panelNLogN.add(lbltiempoLog_1);
		
		JLabel labTiempoLin = new JLabel("................");
		labTiempoLin.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoLin.setBounds(197, 257, 124, 29);
		panelNLogN.add(labTiempoLin);
//Definicion de partes de lineal		
		JLabel JlabelPintaLineal = new JLabel("");
		JlabelPintaLineal.setLabelFor(panelLineal);
		JlabelPintaLineal.setBounds(10, 11, 291, 281);
		panelLineal.add(JlabelPintaLineal);
		JlabelPintaLineal.setAutoscrolls(true);
		JlabelPintaLineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/BeerUlt.png")));
		
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
		
		JLabel JLabelBEER8Lineal = new JLabel("");
		JLabelBEER8Lineal.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/beer.png")));
		JLabelBEER8Lineal.setVerticalTextPosition(SwingConstants.BOTTOM);
		JLabelBEER8Lineal.setForeground(Color.YELLOW);
		JLabelBEER8Lineal.setFont(new Font("Stencil", Font.BOLD, 18));
		JLabelBEER8Lineal.setBounds(24, 49, 90, 16);
		JLabelBEER8Lineal.setVisible(false);
		
		JLabel lblLlenadoNLog = new JLabel("LLENADO N LOG N");
		lblLlenadoNLog.setFont(new Font("Ink Free", Font.PLAIN, 17));
		lblLlenadoNLog.setBounds(10, 298, 233, 25);
		panelLineal.add(lblLlenadoNLog);
		
		JLabel lbltiempoLog_1_1 = new JLabel("Tiempo de Ejecucion");
		lbltiempoLog_1_1.setFont(new Font("Rubik", Font.BOLD, 12));
		lbltiempoLog_1_1.setBounds(198, 232, 152, 15);
		panelLineal.add(lbltiempoLog_1_1);
		
		JLabel labTiempoNlogN = new JLabel("................");
		labTiempoNlogN.setFont(new Font("Rubik", Font.PLAIN, 14));
		labTiempoNlogN.setBounds(197, 258, 124, 29);
		panelLineal.add(labTiempoNlogN);
		//Definicion de partes de nlog		

		btnNewButton.addMouseListener(new MouseAdapter() {
			 
				 
		
	
			@Override
			public void mouseClicked(MouseEvent e) {
	            String litros = txtFieldQlitros.getText();
	            
				tp1_LosSherpas.main.LlenadorLogaritmico log = new LlenadorLogaritmico(Integer.parseInt(litros),progressBarLog,labTiempoLog);
			    tp1_LosSherpas.main.LlenadorLineal linea = new LlenadorLineal(Integer.parseInt(litros),progressBarLin,labTiempoLin);
				tp1_LosSherpas.main.LlenadorNLogaritmico nLogN = new LlenadorNLogaritmico(Integer.parseInt(litros),progressBarNlogN,labTiempoNlogN);
				tp1_LosSherpas.main.LlenadorCuadratico cuadratico = new LlenadorCuadratico(Integer.parseInt(litros),progressBarCuadratica,labTiempoCuadratico);
				tp1_LosSherpas.main.LlenadorCubico cubico = new LlenadorCubico(Integer.parseInt(litros),progressBarCubica,labTiempoCubico);
				tp1_LosSherpas.main.LlenadorExponencial exponencial = new LlenadorExponencial(Integer.parseInt(litros),progressBarExpon,labTiempoExp);
				
				log.start();
				linea.start();
				nLogN.start();
				cuadratico.start();
				cubico.start();
				exponencial.start();
				


				
		     }
		});	
		//	jLabelFondo.setIcon(new ImageIcon(Interfaz.class.getResource("/tp1_LosSherpas/Imagenes/Fondo1.png")));
		contentPane.add(jLabelFondo);
	}
}
