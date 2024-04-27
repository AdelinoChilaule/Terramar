/*Nome do estudante: Elton Cavele, Codigo: 20190782, Turma 'A';*/
/* Nome do estudante: Adelino Fernandes S. Chilaule, Codigo: 20200791, Turma 'A';*/
/*Nome do estudante: Wilson Macuacua, Codigo: 20190958, Turma 'A';*/

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.text.MaskFormatter;

import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Janela_Bilhete extends JFrame {
 private JPanel painel;
 private Container cont;
 private GridLayout grid;
 private JButton btn_cancelar,btn_cadastrar;
 private JLabel  data_entrada,data_saida,forma_pagamento,codico,nome,matricula,bilhete_identidade,nome_companhia;
 private JLabel quant_milhas,numero_milhas,valor_bilhete,valor_portagem,quant_combustivel;

 private JRadioButton Rmar,Rcarro,Rcomboio,aereo,dinheiro,check, passageiro,carga;
 private JComboBox dataEntrada,dataSaida,tipo_barco;
 private String formas[]= {"Dinheiro","Check"};
 private String tipos[]= {"Cruzeiro","Navio","Barco"};
 private String dias[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
 private JTextField caixa_portagem,val_bilhete,caixa_codico,caixa_nome,caixa_bilhete,caixaKilometros,caixa_matricula,caixa_companhia,caixa_combustivel,caixa_Kilometros,caixa_milhas;
 private Font font_lb_titulos = null;
 private Color cor_font_lbs = null;
 private ButtonGroup butGroup,butGroup2,butGroup3;
 private String tipoRa,formaP,tComboio;
 //Metodo Construtor
 
    public Janela_Bilhete(Vector lista)
    {
    	super("Cadastro");
    	this.setLayout(null);
        cont=getContentPane();    	
    	painel=new JPanel();
    	butGroup =new ButtonGroup();
    	butGroup2 =new ButtonGroup();
    	butGroup3 =new ButtonGroup();
    	   
    	Font font_lbs = new Font("Segoe UI", Font.BOLD, 13);
        font_lb_titulos = new Font("Century Gothic", Font.BOLD, 18);
        cor_font_lbs = new Color(29, 36, 98);

        JPanel pane_titulo = new JPanel(null);
        pane_titulo.setBounds(5, 5, 910, 35);
        pane_titulo.setBackground(new Color(26, 228, 228));

        JLabel lb_titulo = new JLabel("Cadastro de Clientes");
        lb_titulo.setForeground(new Color(255, 255, 255));
        lb_titulo.setFont(new Font("Century Schoolbook", Font.BOLD, 25));
        lb_titulo.setHorizontalAlignment(SwingConstants.CENTER);
        lb_titulo.setBounds(5, 5, 815, 25);
        pane_titulo.add(lb_titulo);
        cont.add(pane_titulo);

        JPanel pane_dados = new JPanel(null);
        pane_dados.setBounds(10, 45, 900, 635);
        pane_dados.setBackground(new Color(255, 255, 255));
        pane_dados.setBorder(new LineBorder(new Color(47, 230, 195), 1));
        cont.add(pane_dados);

        JPanel pane_dados_pessoais = new JPanel(null);
        pane_dados_pessoais.setBackground(new Color(255,255,255));
        pane_dados_pessoais.setBounds(10, 10, 410, 458);
        pane_dados_pessoais.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados.add(pane_dados_pessoais);

        JLabel lb_dados_pessoasis = new JLabel("Dados Pessoais");
        lb_dados_pessoasis.setOpaque(true);
        lb_dados_pessoasis.setBounds(5, 5, pane_dados_pessoais.getWidth() - 10, 30);
        lb_dados_pessoasis.setBackground(new Color(133, 244, 190));
        lb_dados_pessoasis.setHorizontalAlignment(SwingConstants.CENTER);
        lb_dados_pessoasis.setForeground(new Color(255, 255, 255));
        lb_dados_pessoasis.setFont(font_lb_titulos);
        pane_dados_pessoais.add(lb_dados_pessoasis);
        
        nome=new JLabel("Nome");
        nome.setFont(font_lbs);
        nome.setForeground(cor_font_lbs);
        nome.setBounds(30,40,300,25);
        pane_dados_pessoais.add(nome);
        
        caixa_nome=new JTextField();
        caixa_nome.setFont(font_lbs);
        caixa_nome.setForeground(cor_font_lbs);
        caixa_nome.setBounds(20, 65, 350, 25);
        pane_dados_pessoais.add(caixa_nome);
        caixa_nome.setDocument(new ValidarCampos());
       
        codico = new JLabel("Codigo");
        codico.setFont(font_lbs);
        codico.setForeground(cor_font_lbs);
        codico.setBounds(30, 90, 300, 25);
        pane_dados_pessoais.add(codico);

        caixa_codico = new JTextField();
        caixa_codico.setFont(font_lbs);
        caixa_codico.setForeground(cor_font_lbs);
        caixa_codico.setBounds(20, 115, 350, 25);
        pane_dados_pessoais.add(caixa_codico);
        caixa_codico.setDocument(new ValidarCampos_num());
        
 
         

        bilhete_identidade= new JLabel("Bilhete de Identidade");
        bilhete_identidade.setFont(font_lbs);
        bilhete_identidade.setForeground(cor_font_lbs);
        bilhete_identidade.setBounds(30, 140, 300, 25);
        pane_dados_pessoais.add(bilhete_identidade);

        caixa_bilhete= new JTextField();
        caixa_bilhete.setText("Digite o seu BI");
        caixa_bilhete.setFont(font_lbs);
        caixa_bilhete.setForeground(cor_font_lbs);
        caixa_bilhete.setBounds(20, 165, 350, 25);
        pane_dados_pessoais.add(caixa_bilhete);
        
        
        
        
        
        forma_pagamento = new JLabel("Forma de Pagamento");
        forma_pagamento.setFont(font_lbs);
        forma_pagamento.setForeground(cor_font_lbs);
        forma_pagamento.setBounds(30, 190, 300, 25);
        pane_dados_pessoais.add(forma_pagamento);

        JPanel pagamento = new JPanel(null);
        pagamento.setBackground(new Color(255, 255, 255));
        pagamento.setBounds(20, 215, 350, 30);
        pagamento.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados_pessoais.add(pagamento);

        dinheiro = new JRadioButton("Dinheiro");
        dinheiro.setBackground(new Color(255, 255, 255));
        dinheiro.setActionCommand("D");
        dinheiro.setForeground(cor_font_lbs);
        dinheiro.setFont(font_lbs);
        dinheiro.setBounds(10, (pagamento.getHeight() - 20) / 2, 150, 20);
        dinheiro.setFocusPainted(false);
        dinheiro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pagamento.add(dinheiro);

        check = new JRadioButton("Check");
        check.setBackground(new Color(255, 255, 255));
        check.setActionCommand("C");
        check.setForeground(cor_font_lbs);
        check.setFont(font_lbs);
        check.setBounds(160, (pagamento.getHeight() - 20) / 2, 150, 20);
        check.setFocusPainted(false);
        check.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pagamento.add(check);
        
        
        dinheiro.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				formaP="Dinheiro";
			}
		});
        
        check.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				formaP="Cheque";
			}
		});
        
        
       
        data_entrada = new JLabel("Data saida");
        data_entrada.setFont(font_lbs);
        data_entrada.setForeground(cor_font_lbs);
        data_entrada.setBounds(30, 245, 300, 25);
        pane_dados_pessoais.add(data_entrada);

        dataEntrada = new JComboBox(dias);
        dataEntrada.setBackground(new Color(255, 255, 255));
        dataEntrada.setFont(font_lbs);
        dataEntrada.setForeground(cor_font_lbs);
        dataEntrada.setCursor(new Cursor((Cursor.HAND_CURSOR)));
        dataEntrada.setBounds(20, 270, 350, 25);
       
        pane_dados_pessoais.add(dataEntrada);
        
        data_saida = new JLabel("Data Chegada");
        data_saida.setFont(font_lbs);
        data_saida.setForeground(cor_font_lbs);
        data_saida.setBounds(30, 295, 300, 25);
        pane_dados_pessoais.add(data_saida);
	

        dataSaida = new JComboBox(dias);
        dataSaida.setBackground(new Color(255, 255, 255));
        dataSaida.setFont(font_lbs);
        dataSaida.setForeground(cor_font_lbs);
        dataSaida.setCursor(new Cursor((Cursor.HAND_CURSOR)));
        dataSaida.setBounds(20, 320,350, 25);
      
        pane_dados_pessoais.add(dataSaida);
        
        valor_bilhete = new JLabel("Valor do Bilhete");
        valor_bilhete.setFont(font_lbs);
        valor_bilhete.setForeground(cor_font_lbs);
        valor_bilhete.setBounds(30, 345, 300, 25);
        pane_dados_pessoais.add(valor_bilhete);

        val_bilhete=new JTextField();
        
        val_bilhete.setFont(font_lbs);
        val_bilhete.setForeground(cor_font_lbs);
        val_bilhete.setBounds(20, 370, 350, 25);
        pane_dados_pessoais.add(val_bilhete);
        val_bilhete.setDocument(new ValidarCampos_num());
       
        forma_pagamento = new JLabel("Tipo de Bilhete");
        forma_pagamento.setFont(font_lbs);
        forma_pagamento.setForeground(cor_font_lbs);
        forma_pagamento.setBounds(30, 392, 300, 25);
        pane_dados_pessoais.add(forma_pagamento);
        
        JPanel tipo_bilhete = new JPanel(null);
        tipo_bilhete.setBackground(new Color(255, 255, 255));
        tipo_bilhete.setBounds(10, 420, 397, 30);
        tipo_bilhete.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados_pessoais.add(tipo_bilhete);

        Rcarro= new JRadioButton("Carro");
        Rcarro.setBackground(new Color(255, 255, 255));
        Rcarro.setActionCommand("C");
        Rcarro.setForeground(cor_font_lbs);
        Rcarro.setFont(font_lbs);
        Rcarro.setBounds(10, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        Rcarro.setFocusPainted(false);
        Rcarro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo_bilhete.add(Rcarro);
        
        Rcomboio = new JRadioButton("Comboio");
        Rcomboio.setBackground(new Color(255, 255, 255));
        Rcomboio.setActionCommand("C");
        Rcomboio.setForeground(cor_font_lbs);
        Rcomboio.setFont(font_lbs);
        Rcomboio.setBounds(120, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        Rcomboio.setFocusPainted(false);
        Rcomboio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo_bilhete.add(Rcomboio);
        
        Rmar = new JRadioButton("Mar");
        Rmar.setBackground(new Color(255, 255, 255));
        Rmar.setActionCommand("C");
        Rmar.setForeground(cor_font_lbs);
        Rmar.setFont(font_lbs);
        Rmar.setBounds(220, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        Rmar.setFocusPainted(false);
        Rmar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo_bilhete.add(Rmar);

        
        aereo = new JRadioButton("Aereo");
        aereo.setBackground(new Color(255, 255, 255));
        aereo.setActionCommand("C");
        aereo.setForeground(cor_font_lbs);
        aereo.setFont(font_lbs);
        aereo.setBounds(320, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        aereo.setFocusPainted(false);
        aereo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo_bilhete.add(aereo);
        
     
        
        JPanel aereo_panel=new JPanel(null);
        aereo_panel.setBackground(new Color(255,255,255));
        aereo_panel.setBounds(10, 480, 410, 147);
     
        
        
        aereo_panel.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados.add(aereo_panel);
        
        
        
        
        JLabel label_aereo = new JLabel("Aereo");
        label_aereo.setOpaque(true);
        label_aereo.setBounds(5, 5, aereo_panel.getWidth() - 10, 30);
        label_aereo.setBackground(new Color(133, 244, 190));
        label_aereo.setHorizontalAlignment(SwingConstants.CENTER);
        label_aereo.setForeground(new Color(255, 255, 255));
        label_aereo.setFont(font_lb_titulos);
        aereo_panel.add(label_aereo);
        
        JLabel q_milhas=new JLabel("Quantidade Milhas");
        q_milhas.setFont(font_lbs);
        q_milhas.setForeground(cor_font_lbs);
        q_milhas.setBounds(30,40,300,25);
        aereo_panel.add(q_milhas);
        
         caixa_milhas=new JTextField();
        
        caixa_milhas.setFont(font_lbs);
        caixa_milhas.setForeground(cor_font_lbs);
        caixa_milhas.setBounds(20, 65, 350, 25);
        aereo_panel.add(caixa_milhas);
        caixa_milhas.setDocument(new ValidarCampos_num());
        
        JLabel nome_companhia = new JLabel("Nome Companhia");
        nome_companhia.setFont(font_lbs);
        nome_companhia.setForeground(cor_font_lbs);
        nome_companhia.setBounds(30, 90, 300, 25);
        aereo_panel.add(nome_companhia);

        caixa_companhia = new JTextField();
        caixa_companhia.setText("Digite o nome da Companhia");
        caixa_companhia.setFont(font_lbs);
        caixa_companhia.setForeground(cor_font_lbs);
        caixa_companhia.setBounds(20, 115, 350, 25);
        aereo_panel.add(caixa_companhia);
        caixa_companhia.setDocument(new ValidarCampos());
        
       
        
        
       
        
        
        JPanel carro = new JPanel(null);
        carro.setBackground(new Color(255, 255, 255));
        carro.setBounds(430, 10, 460, 200);
        carro.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados.add(carro);

        JLabel label_carro = new JLabel("Carro");
        label_carro.setOpaque(true);
        label_carro.setBounds(5, 5, carro.getWidth() - 10, 30);
        label_carro.setBackground(new Color(133, 244, 190));
        label_carro.setHorizontalAlignment(SwingConstants.CENTER);
        label_carro.setForeground(new Color(255, 255, 255));
        label_carro.setFont(font_lb_titulos);
        carro.add(label_carro);
        

        JLabel lb_kilometros = new JLabel("Numeros de Kilometros");
        lb_kilometros.setFont(font_lbs);
        lb_kilometros.setForeground(cor_font_lbs);
        lb_kilometros.setBounds(30, 40, 300, 25);
        carro.add(lb_kilometros);

        caixa_Kilometros=new JTextField();
        caixa_Kilometros.setText("Digite o numero de Kilometros");
        caixa_Kilometros.setFont(font_lbs);
        caixa_Kilometros.setForeground(cor_font_lbs);
        caixa_Kilometros.setBounds(20, 65, 350, 25);
        pane_dados_pessoais.add(caixa_nome);
        carro.add(caixa_Kilometros);
        caixa_Kilometros.setDocument(new ValidarCampos_num());
        
        matricula = new JLabel("Matricula");
        matricula.setFont(font_lbs);
        matricula.setForeground(cor_font_lbs);
        matricula.setBounds(30, 90, 300, 25);
        carro.add(matricula);

        caixa_matricula = new JTextField();
        caixa_matricula.setText("Digite a sua Matricula");
        caixa_matricula.setFont(font_lbs);
        caixa_matricula.setForeground(cor_font_lbs);
        caixa_matricula.setBounds(20, 115, 350, 25);
        carro.add(caixa_matricula);
        

        quant_combustivel= new JLabel("Combustivel");
        quant_combustivel.setFont(font_lbs);
        quant_combustivel.setForeground(cor_font_lbs);
        quant_combustivel.setBounds(50, 140, 150, 25);
        carro.add(quant_combustivel);

        caixa_combustivel = new JTextField();
        caixa_combustivel.setText("quantidade_Combustivel");
        caixa_combustivel.setFont(font_lbs);
        caixa_combustivel.setForeground(cor_font_lbs);
        caixa_combustivel.setBounds(20, 165, 170, 25);
        carro.add(caixa_combustivel);
        caixa_combustivel.setDocument(new ValidarCampos_num());
       
        valor_portagem= new JLabel("Valor Portagem");
        valor_portagem.setFont(font_lbs);
        valor_portagem.setForeground(cor_font_lbs);
        valor_portagem.setBounds(230, 135, 150, 25);
        carro.add(valor_portagem);

        caixa_portagem = new JTextField();
        caixa_portagem.setFont(font_lbs);
        caixa_portagem.setForeground(cor_font_lbs);
        caixa_portagem.setBounds(200, 165, 170, 25);
        carro.add(caixa_portagem);
         
        
        
        JPanel comboio = new JPanel(null);
        comboio.setBackground(new Color(255, 255, 255));
        comboio.setBounds(430, 220, 460, 248);
        comboio.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados.add(comboio);
        
        JLabel comboio_label = new JLabel("Comboio");
        comboio_label.setOpaque(true);
        comboio_label.setBounds(5, 5, carro.getWidth() - 10, 30);
        comboio_label.setBackground(new Color(133, 244, 190));
        comboio_label.setHorizontalAlignment(SwingConstants.CENTER);
        comboio_label.setForeground(new Color(255, 255, 255));
        comboio_label.setFont(font_lb_titulos);
        comboio.add(comboio_label);
        
        
        JLabel bilhete = new JLabel("Tipo de Bilhete");
        bilhete.setFont(font_lbs);
        bilhete.setForeground(cor_font_lbs);
        bilhete.setBounds(30, 40, 300, 25);
        comboio.add(bilhete);
        
        JPanel tipo = new JPanel(null);
        tipo.setBackground(new Color(255, 255, 255));
        tipo.setBounds(20, 90, 300, 30);
        tipo.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        comboio.add(tipo);

        passageiro= new JRadioButton("Passageiro");
        passageiro.setBackground(new Color(255, 255, 255));
        passageiro.setActionCommand("P");
        passageiro.setForeground(cor_font_lbs);
        passageiro.setFont(font_lbs);
        passageiro.setBounds(10, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        passageiro.setFocusPainted(false);
        passageiro.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo.add(passageiro);
        
        carga = new JRadioButton("Carga");
        carga.setBackground(new Color(255, 255, 255));
        carga.setActionCommand("C");
        carga.setForeground(cor_font_lbs);
        carga.setFont(font_lbs);
        carga.setBounds(160, (tipo_bilhete.getHeight() - 20) / 2, 100, 20);
        carga.setFocusPainted(false);
        carga.setCursor(new Cursor(Cursor.HAND_CURSOR));
        tipo.add(carga);
        passageiro.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tComboio="passageiro";
			}
		});
        
        carga.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tComboio="Carga";
			}
		});
        
        JLabel lb_kilometro = new JLabel("Numeros de Kilometros");
        lb_kilometro.setFont(font_lbs);
        lb_kilometro.setForeground(cor_font_lbs);
        lb_kilometro.setBounds(30, 140, 300, 25);
        comboio.add(lb_kilometro);

        caixaKilometros=new JTextField();
        caixaKilometros.setText("Digite o numero de Kilometros");
        caixaKilometros.setFont(font_lbs);
        caixaKilometros.setForeground(cor_font_lbs);
        caixaKilometros.setBounds(20, 190, 300, 30);
        caixaKilometros.setDocument(new ValidarCampos_num());
        comboio.add(caixaKilometros);

        JPanel mar = new JPanel(null);
        mar.setBackground(new Color(255, 255, 255));
        mar.setBounds(430, 480, 460, 100);
        mar.setBorder(new LineBorder(new Color(37, 248, 234), 1));
        pane_dados.add(mar);

        JLabel mar_label = new JLabel("MAR");
        mar_label.setOpaque(true);
        mar_label.setBounds(5, 5, carro.getWidth() - 10, 30);
        mar_label.setBackground(new Color(133, 244, 190));
        mar_label.setHorizontalAlignment(SwingConstants.CENTER);
        mar_label.setForeground(new Color(255, 255, 255));
        mar_label.setFont(font_lb_titulos);
        mar.add(mar_label);
       

        JLabel barco = new JLabel("Tipo de Barco");
        barco.setFont(font_lbs);
        barco.setForeground(cor_font_lbs);
        barco.setBounds(30, 40, 300, 25);
        mar.add(barco);

        tipo_barco = new JComboBox(tipos);
        tipo_barco.setBackground(new Color(255, 255, 255));
        tipo_barco.setFont(font_lbs);
        tipo_barco.setForeground(cor_font_lbs);
        tipo_barco.setCursor(new Cursor((Cursor.HAND_CURSOR)));
        tipo_barco.setBounds(20, 65, 350, 25);
        mar.add(tipo_barco);
        
        btn_cadastrar = new JButton("Cadastrar");
        btn_cadastrar.setBackground(new Color(0, 128, 0));
        btn_cadastrar.setBackground(new Color(85, 170, 85));
        btn_cadastrar.setForeground(new Color(255, 255, 255));
        btn_cadastrar.setBounds(450, 590, 190, 30);
        pane_dados.add(btn_cadastrar);

        btn_cancelar = new JButton("Cancelar");
        btn_cancelar.setBackground(new Color(255, 0, 0));
        btn_cancelar.setBackground(new Color(255, 24, 24));
        btn_cancelar.setForeground(new Color(255, 255, 255));
        btn_cancelar.setBounds(650, 590, 190, 30);
        pane_dados.add(btn_cancelar);
        
        //aereo
        caixa_milhas.setEnabled(false);
        caixa_companhia.setEnabled(false);
        
        //carro
        caixa_Kilometros.setEnabled(false);
        caixa_matricula.setEnabled(false);
        caixa_combustivel.setEnabled(false);
        caixa_portagem.setEnabled(false);
        
        //comboio
        passageiro.setEnabled(false);
        carga.setEnabled(false);
        caixa_Kilometros.setEnabled(false);
        
        //Mar
        tipo_barco.setEnabled(false);
        
        //eventos para radio
        Rcarro.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tipoRa="Carro";
				caixa_Kilometros.setEnabled(true);
		        caixa_matricula.setEnabled(true);
		        caixa_combustivel.setEnabled(true);
		        caixa_portagem.setEnabled(true);
		        caixa_milhas.setEnabled(false);
		        caixa_companhia.setEnabled(false);
		        passageiro.setEnabled(false);
		        carga.setEnabled(false);
		        tipo_barco.setEnabled(false);
			}
		});
        Rcomboio.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tipoRa="Comboio";
				passageiro.setEnabled(true);
		        carga.setEnabled(true);
		        caixa_Kilometros.setEnabled(true);
		        caixa_matricula.setEnabled(false);
		        caixa_combustivel.setEnabled(false);
		        caixa_portagem.setEnabled(false);
		        caixa_milhas.setEnabled(false);
		        caixa_companhia.setEnabled(false);
		        tipo_barco.setEnabled(false);
			}
		});
        Rmar.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tipoRa="Mar";
				tipo_barco.setEnabled(true);
				
				caixa_milhas.setEnabled(false);
			    caixa_companhia.setEnabled(false);

			        //carro
			    caixa_Kilometros.setEnabled(false);
			    caixa_matricula.setEnabled(false);
			    caixa_combustivel.setEnabled(false);
			    caixa_portagem.setEnabled(false);
			        
			        //comboio
			    passageiro.setEnabled(false);
			    carga.setEnabled(false);
			}
		});
        aereo.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				tipoRa="Aereo";
				caixa_milhas.setEnabled(true);
		        caixa_companhia.setEnabled(true);
		      //carro
		        caixa_Kilometros.setEnabled(false);
		        caixa_matricula.setEnabled(false);
		        caixa_combustivel.setEnabled(false);
		        caixa_portagem.setEnabled(false);
		        
		        //comboio
		        passageiro.setEnabled(false);
		        carga.setEnabled(false);
		        
		        //Mar
		        tipo_barco.setEnabled(false);
			}
		});
      
        //add criando o grupo de  RadioButton 
        butGroup.add(dinheiro);
        butGroup.add(check);
        butGroup2.add(Rcarro);
        butGroup2.add(Rcomboio);
        butGroup2.add(Rmar);
        butGroup2.add(aereo);
        butGroup3.add(passageiro);
        butGroup3.add(carga);
        eventos(lista);
        
        setSize(937,725);
        setVisible(true);
        setLocationRelativeTo(null);
    	
    }
    
    public void eventos(Vector lista)
    {
    	LerDoTeclado ler =new LerDoTeclado(); 
    	EscreverDoFicheiro es=new EscreverDoFicheiro();
    	btn_cadastrar.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				switch(tipoRa)
				{
				case "Carro":ler.carro(Integer.parseInt(caixa_codico.getText()), caixa_nome.getText(),caixa_bilhete.getText(),Byte.parseByte(dataSaida.getSelectedItem().toString()),
						Byte.parseByte(dataEntrada.getSelectedItem().toString()),Float.parseFloat(val_bilhete.getText()),formaP,Integer.parseInt(caixa_Kilometros.getText()),
						caixa_matricula.getText(),Float.parseFloat(caixa_combustivel.getText()),Float.parseFloat(caixa_portagem.getText()),lista);
						es.actualizarBilhete(lista);
				break;
						
				case "Comboio":ler.comboio(Integer.parseInt(caixa_codico.getText()), caixa_nome.getText(),caixa_bilhete.getText(),Byte.parseByte(dataSaida.getSelectedItem().toString()),
						Byte.parseByte(dataEntrada.getSelectedItem().toString()),Float.parseFloat(val_bilhete.getText()),formaP,Integer.parseInt(caixaKilometros.getText()),tComboio,lista);
						es.actualizarBilhete(lista);
				break;
				
				case "Aereo": ler.aereo(Integer.parseInt(caixa_codico.getText()), caixa_nome.getText(),caixa_bilhete.getText(),Byte.parseByte(dataEntrada.getSelectedItem().toString()),
						Byte.parseByte(dataSaida.getSelectedItem().toString()),Float.parseFloat(val_bilhete.getText()),formaP,
						Integer.parseInt(caixa_milhas.getText()),caixa_companhia.getText(),lista);
						es.actualizarBilhete(lista);	
				break;
				case "Mar": ler.mar(Integer.parseInt(caixa_codico.getText()), caixa_nome.getText(),caixa_bilhete.getText(),Byte.parseByte(dataEntrada.getSelectedItem().toString()),
						Byte.parseByte(dataSaida.getSelectedItem().toString()),Float.parseFloat(val_bilhete.getText()),formaP,tipo_barco.getSelectedItem().toString(),lista);
						es.actualizarBilhete(lista);
				}
			}
		});
    	btn_cancelar.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent h)
			{
				new JanelaMenu();
		        setVisible(false);
			}
		});
    }

}
