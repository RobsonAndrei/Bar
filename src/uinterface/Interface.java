package uinterface;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import business.Bar;
import business.Cliente;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.awt.Scrollbar;
import java.awt.Font;

public class Interface {
	
	
	private void mostrar(JLabel respTotalPessoas, JLabel percentilMasc, JLabel percentilFEm, JLabel respTotalSocio,
			JLabel respTotalNaoSocio) {
		respTotalPessoas.setText(Integer.toString(b.totalClientes()));

		percentilFEm.setText(Double.toString(b.qtdMulheres()) + " %");

		percentilMasc.setText(Double.toString(b.qtdHomems()) + " %");

		respTotalNaoSocio.setText(Integer.toString(b.naoSocios()));

		respTotalSocio.setText(Integer.toString(b.qtdSocios()));
	}

	private JFrame frmCachaaSystem;
	/**
	 * @wbp.nonvisual location=99,101
	 */
	java.net.URL url = getClass().getResource("/Users/robsonsantos/eclipse-workspace/Bar/Lula.jpg");
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldIDADE;
	private JTextField textFieldNUMEROSOCIO;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textFieldCPFPESQUISA;
	private JTextField textFieldCPFSair;
	private Bar b;
	private Cliente c;
	private boolean socio;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private char genero;
	private ImageIcon icon;
	private JScrollPane scroll;
	private JTextField textFieldPONTOS;
	private JTextField textFieldCPFPonts;
	private Cliente aux = null;

	/**
	 * @wbp.nonvisual location=57,81
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frmCachaaSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// icon = new ImageIcon(url);
		
		
		
		frmCachaaSystem = new JFrame();
		frmCachaaSystem.setTitle("Cachaça System");
		frmCachaaSystem.setBounds(100, 100, 1055, 639);
		frmCachaaSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCachaaSystem.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(67, 67, 142, 100);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setIcon(new ImageIcon("/Users/robsonsantos/eclipse-workspace/Bar/Lula.jpg"));
		frmCachaaSystem.getContentPane().add(lblNewLabel);

		JLabel lblDadosDoCliente = new JLabel("Dados do Cliente");
		lblDadosDoCliente.setBounds(451, 41, 128, 16);
		frmCachaaSystem.getContentPane().add(lblDadosDoCliente);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(230, 80, 541, 26);
		frmCachaaSystem.getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(234, 63, 61, 16);
		frmCachaaSystem.getContentPane().add(lblNome);

		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(234, 118, 61, 16);
		frmCachaaSystem.getContentPane().add(lblCpf);

		textFieldCPF = new JTextField();
		textFieldCPF.setBounds(266, 113, 172, 26);
		frmCachaaSystem.getContentPane().add(textFieldCPF);
		textFieldCPF.setColumns(10);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(450, 118, 61, 16);
		frmCachaaSystem.getContentPane().add(lblIdade);

		textFieldIDADE = new JTextField();
		textFieldIDADE.setBounds(495, 113, 51, 26);
		frmCachaaSystem.getContentPane().add(textFieldIDADE);
		textFieldIDADE.setColumns(10);

		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(578, 118, 61, 16);
		frmCachaaSystem.getContentPane().add(lblGenero);

		JRadioButton rdbtnNewRadioButtonSOCIO = new JRadioButton("SOCIO");
		rdbtnNewRadioButtonSOCIO.setBounds(358, 149, 141, 23);
		buttonGroup.add(rdbtnNewRadioButtonSOCIO);
		frmCachaaSystem.getContentPane().add(rdbtnNewRadioButtonSOCIO);

		JRadioButton rdbtnNoScio = new JRadioButton("Não Sócio");
		rdbtnNoScio.setBounds(244, 149, 141, 23);
		buttonGroup.add(rdbtnNoScio);
		frmCachaaSystem.getContentPane().add(rdbtnNoScio);

		JLabel lblNumeroDeSocio = new JLabel("Numero de Socio");
		lblNumeroDeSocio.setBounds(451, 151, 119, 16);
		frmCachaaSystem.getContentPane().add(lblNumeroDeSocio);

		JRadioButton rdbtnMasc = new JRadioButton("Masc.");
		rdbtnMasc.setBounds(628, 114, 68, 23);
		buttonGroup_1.add(rdbtnMasc);
		frmCachaaSystem.getContentPane().add(rdbtnMasc);

		JRadioButton rdbtnFem = new JRadioButton("Fem.");
		rdbtnFem.setBounds(694, 114, 75, 23);
		buttonGroup_1.add(rdbtnFem);
		frmCachaaSystem.getContentPane().add(rdbtnFem);

		textFieldNUMEROSOCIO = new JTextField();
		textFieldNUMEROSOCIO.setBounds(570, 146, 130, 26);
		frmCachaaSystem.getContentPane().add(textFieldNUMEROSOCIO);
		textFieldNUMEROSOCIO.setColumns(10);

		JLabel respTotalPessoas = new JLabel("");
		respTotalPessoas.setBounds(535, 264, 61, 16);
		frmCachaaSystem.getContentPane().add(respTotalPessoas);

		JLabel percentilMasc = new JLabel("");
		percentilMasc.setBounds(403, 334, 61, 16);
		percentilMasc.setForeground(Color.BLUE);
		frmCachaaSystem.getContentPane().add(percentilMasc);

		JLabel percentilFEm = new JLabel("");
		percentilFEm.setBounds(511, 334, 61, 16);
		percentilFEm.setForeground(Color.MAGENTA);
		frmCachaaSystem.getContentPane().add(percentilFEm);

		JLabel respTotalSocio = new JLabel("");
		respTotalSocio.setBounds(495, 374, 61, 16);
		frmCachaaSystem.getContentPane().add(respTotalSocio);

		JLabel respTotalNaoSocio = new JLabel("");
		respTotalNaoSocio.setBounds(495, 402, 61, 16);
		frmCachaaSystem.getContentPane().add(respTotalNaoSocio);

		b = new Bar();

		JButton btnNewButtonENTRADA = new JButton("ENTRAR NO BAR");
		btnNewButtonENTRADA.setBounds(783, 80, 128, 55);
		btnNewButtonENTRADA.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				if (rdbtnNewRadioButtonSOCIO.isSelected()) {
					socio = true;
				}
				if (rdbtnNoScio.isSelected()) {
					socio = false;
				}

				if (rdbtnMasc.isSelected()) {
					genero = 'M';
				}
				if (rdbtnFem.isSelected()) {
					genero = 'F';
				}

				int idadeInt = Integer.parseInt(textFieldIDADE.getText());

				if (rdbtnNewRadioButtonSOCIO.isSelected()) {
					c = new Cliente(textFieldNome.getText(), textFieldCPF.getText(), idadeInt, genero, socio);
					c.setNumSocio(textFieldNUMEROSOCIO.getText());
					b.entrada(c);
				}
				if (rdbtnNoScio.isSelected()) {
					c = new Cliente(textFieldNome.getText(), textFieldCPF.getText(), idadeInt, genero, socio);
					b.entrada(c);
				}

				textFieldNome.setText(null);
				textFieldCPF.setText(null);
				textFieldIDADE.setText(null);
				textFieldNUMEROSOCIO.setText(null);

				mostrar(respTotalPessoas, percentilMasc, percentilFEm, respTotalSocio, respTotalNaoSocio);

			}
		});
		btnNewButtonENTRADA.setBackground(Color.BLUE);
		btnNewButtonENTRADA.setForeground(Color.BLUE);
		frmCachaaSystem.getContentPane().add(btnNewButtonENTRADA);

		JTextArea textAreaQEsBar = new JTextArea();
		textAreaQEsBar.setForeground(Color.YELLOW);
		textAreaQEsBar.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		textAreaQEsBar.setBackground(Color.DARK_GRAY);

		JScrollPane scrollPaneQENbar = new JScrollPane(textAreaQEsBar, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPaneQENbar.setBounds(43, 246, 304, 348);
		frmCachaaSystem.getContentPane().add(scrollPaneQENbar);
		// scrollPaneQENbar.setViewportView(textAreaQEsBar);

		JButton btnQuemEstaNoBAR = new JButton("Quem Esta no Bar");
		btnQuemEstaNoBAR.setBounds(122, 208, 142, 29);
		btnQuemEstaNoBAR.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textAreaQEsBar.setText(b.clientNoBar());
				// scrollPaneQENbar.add(textAreaQEsBar);

			}
		});
		frmCachaaSystem.getContentPane().add(btnQuemEstaNoBAR);

		textFieldCPFPESQUISA = new JTextField();
		textFieldCPFPESQUISA.setBounds(562, 208, 193, 26);
		frmCachaaSystem.getContentPane().add(textFieldCPFPESQUISA);
		textFieldCPFPESQUISA.setColumns(10);

		JLabel respESTSNOBAR = new JLabel("");
		respESTSNOBAR.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 16));
		respESTSNOBAR.setBounds(783, 213, 230, 16);
		respESTSNOBAR.setForeground(Color.RED);
		frmCachaaSystem.getContentPane().add(respESTSNOBAR);

		JButton btnNewButtonPESQCPF = new JButton("Pesq. por cpf");
		btnNewButtonPESQCPF.setBounds(416, 208, 142, 29);
		btnNewButtonPESQCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean esta = b.cpfEstaNoBar(textFieldCPFPESQUISA.getText());
				if (esta == true) {
					respESTSNOBAR.setForeground(Color.GREEN);
					respESTSNOBAR.setText("Está no bar !!!!");
				} else {
					respESTSNOBAR.setForeground(Color.RED);
					respESTSNOBAR.setText("Não Está no bar !!!");
				}

			}
		});
		frmCachaaSystem.getContentPane().add(btnNewButtonPESQCPF);

		JLabel lblTotalDePessoas = new JLabel("Total de pessoas:");
		lblTotalDePessoas.setBounds(416, 264, 119, 16);
		frmCachaaSystem.getContentPane().add(lblTotalDePessoas);

		JLabel lblMascVsFem = new JLabel("Masc.    Vs.      Fem.");
		lblMascVsFem.setBounds(416, 305, 142, 16);
		frmCachaaSystem.getContentPane().add(lblMascVsFem);

		JLabel lblScios = new JLabel("Sócios:  ");
		lblScios.setBounds(403, 374, 84, 16);
		frmCachaaSystem.getContentPane().add(lblScios);

		JLabel lblNaoScios = new JLabel("Nao Sócios:");
		lblNaoScios.setBounds(403, 402, 84, 16);
		frmCachaaSystem.getContentPane().add(lblNaoScios);

		JLabel lblCpfValidarSada = new JLabel("CPF: validar saída:");
		lblCpfValidarSada.setBounds(388, 472, 168, 16);
		frmCachaaSystem.getContentPane().add(lblCpfValidarSada);

		textFieldCPFSair = new JTextField();
		textFieldCPFSair.setBounds(511, 467, 181, 26);
		frmCachaaSystem.getContentPane().add(textFieldCPFSair);
		textFieldCPFSair.setColumns(10);

		JLabel respSaidadoBAr = new JLabel("");
		respSaidadoBAr.setForeground(Color.BLUE);
		respSaidadoBAr.setBounds(518, 500, 342, 16);
		frmCachaaSystem.getContentPane().add(respSaidadoBAr);

		JLabel lblInserirPontosNo = new JLabel("Inserir Pontos no programa de milhas:");
		lblInserirPontosNo.setBounds(461, 173, 240, 16);
		frmCachaaSystem.getContentPane().add(lblInserirPontosNo);

		textFieldPONTOS = new JTextField();
		textFieldPONTOS.setBounds(839, 168, 38, 26);
		frmCachaaSystem.getContentPane().add(textFieldPONTOS);
		textFieldPONTOS.setColumns(10);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				b.inserirMilhas(textFieldCPFPonts.getText(), Integer.parseInt(textFieldPONTOS.getText()));

				textFieldCPFPonts.setText("");
				textFieldPONTOS.setText("");

			}
		});
		btnInserir.setBounds(875, 168, 117, 29);
		frmCachaaSystem.getContentPane().add(btnInserir);

		JButton btnGerarRelatrio = new JButton("Gerar relatório");
		btnGerarRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					b.salvarNofinaldoDia();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnGerarRelatrio.setBounds(591, 528, 117, 29);
		frmCachaaSystem.getContentPane().add(btnGerarRelatrio);

		textFieldCPFPonts = new JTextField();
		textFieldCPFPonts.setBounds(709, 168, 130, 26);
		frmCachaaSystem.getContentPane().add(textFieldCPFPonts);
		textFieldCPFPonts.setColumns(10);

		JLabel lblCpf_1 = new JLabel("Cpf:");
		lblCpf_1.setBounds(744, 153, 61, 16);
		frmCachaaSystem.getContentPane().add(lblCpf_1);

		JLabel lblPts = new JLabel("Pts:");
		lblPts.setBounds(839, 153, 61, 16);
		frmCachaaSystem.getContentPane().add(lblPts);

		JButton btnNewButtonSaida = new JButton("Sair do Bar");
		btnNewButtonSaida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente aux = b.getClienteCpf(textFieldCPFSair.getText());
				if (aux != null) {
					respSaidadoBAr.setText("Cliente " + aux.getNome() + " saiu do bar!!");
					aux = b.saida(textFieldCPFSair.getText());
					mostrar(respTotalPessoas, percentilMasc, percentilFEm, respTotalSocio, respTotalNaoSocio);
					
				}
				else {
					respSaidadoBAr.setText("Este cpf não consta na base de dados!!");
					
				}
				
				textFieldCPFSair.setText(null);
			}
		});
		btnNewButtonSaida.setForeground(Color.RED);
		btnNewButtonSaida.setBounds(704, 467, 117, 29);
		frmCachaaSystem.getContentPane().add(btnNewButtonSaida);
		
		

	}

	
}
