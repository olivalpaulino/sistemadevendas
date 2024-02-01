/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemadevendas.view;

import javax.swing.UIManager;

/**
 *
 * @author Núcleo
 */
public class Frmcliente extends javax.swing.JFrame {

    /**
     * Creates new form Frmcliente
     */
    public Frmcliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBanner = new javax.swing.JPanel();
        jLabelBanner = new javax.swing.JLabel();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        jPanelAbaConsultaDeClienes = new javax.swing.JPanel();
        jLabelConsultaDeClientesNome = new javax.swing.JLabel();
        jTextFieldConsultaDeClientesNome = new javax.swing.JTextField();
        jButtonConsultaDeClientesPesquisar = new javax.swing.JButton();
        jScrollPaneConsultaDeClientesTabelaDeDados = new javax.swing.JScrollPane();
        jTableConsultaDeClientesTabelaDeDados = new javax.swing.JTable();
        jPanelAbaDadosPessoais = new javax.swing.JPanel();
        jLabelDadosPessoaisCodigo = new javax.swing.JLabel();
        jTextFieldDadosPessoaisCodigo = new javax.swing.JTextField();
        jLabelDadosPessoaisNome = new javax.swing.JLabel();
        jTextFieldDadosPessoaisNome = new javax.swing.JTextField();
        jLabelDadosPessoaisEmail = new javax.swing.JLabel();
        jTextFieldDadosPessoaisEmail = new javax.swing.JTextField();
        jLabelDadosPessoaisCelular = new javax.swing.JLabel();
        jFormattedTextFieldDadosPessoaisCelular = new javax.swing.JFormattedTextField();
        jLabelDadosPessoaisTelefoneFixo = new javax.swing.JLabel();
        jFormattedTextFieldDadosPessoaisTelefoneFixo = new javax.swing.JFormattedTextField();
        jLabelDadosPessoaisCep = new javax.swing.JLabel();
        jFormattedTextFieldDadosPessoaisCep = new javax.swing.JFormattedTextField();
        jLabelDadosPessoaisEndereco = new javax.swing.JLabel();
        jTextFieldDadosPessoaisEndereco = new javax.swing.JTextField();
        jLabelDadosPessoaisNumero = new javax.swing.JLabel();
        jTextFieldDadosPessoaisNumero = new javax.swing.JTextField();
        jLabelDadosPessoaisCidade = new javax.swing.JLabel();
        jTextFieldDadosPessoaisCidade = new javax.swing.JTextField();
        jLabelDadosPessoaisBairro = new javax.swing.JLabel();
        jTextFieldDadosPessoaisBairro = new javax.swing.JTextField();
        jLabelDadosPessoaisComplemento = new javax.swing.JLabel();
        jTextFieldDadosPessoaisComplemento = new javax.swing.JTextField();
        jLabelDadosPessoaisUF = new javax.swing.JLabel();
        jComboBoxDadosPessoaisUF = new javax.swing.JComboBox<>();
        jLabelDadosPessoaisRG = new javax.swing.JLabel();
        jFormattedTextFieldDadosPessoaisRG = new javax.swing.JFormattedTextField();
        jLabelDadosPessoaisCPF = new javax.swing.JLabel();
        jFormattedTextFieldDadosPessoaisCPF = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBanner.setBackground(new java.awt.Color(0, 102, 204));

        jLabelBanner.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelBanner.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBanner.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanelBannerLayout = new javax.swing.GroupLayout(jPanelBanner);
        jPanelBanner.setLayout(jPanelBannerLayout);
        jPanelBannerLayout.setHorizontalGroup(
            jPanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelBanner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBannerLayout.setVerticalGroup(
            jPanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBannerLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelBanner)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanelAbaConsultaDeClienes.setBackground(new java.awt.Color(255, 255, 255));

        jLabelConsultaDeClientesNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelConsultaDeClientesNome.setText("Nome:");

        jTextFieldConsultaDeClientesNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonConsultaDeClientesPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConsultaDeClientesPesquisar.setText("Pesquisar");
        jButtonConsultaDeClientesPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaDeClientesPesquisarActionPerformed(evt);
            }
        });

        jTableConsultaDeClientesTabelaDeDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome:", "Cpf:", "RG:", "E-mail:", "Telefone:", "Celular:", "Cep:", "Endereço:", "Nº:", "Bairro:", "Complemento:", "Bairro:", "Cidade:", "UF:"
            }
        ));
        jScrollPaneConsultaDeClientesTabelaDeDados.setViewportView(jTableConsultaDeClientesTabelaDeDados);

        javax.swing.GroupLayout jPanelAbaConsultaDeClienesLayout = new javax.swing.GroupLayout(jPanelAbaConsultaDeClienes);
        jPanelAbaConsultaDeClienes.setLayout(jPanelAbaConsultaDeClienesLayout);
        jPanelAbaConsultaDeClienesLayout.setHorizontalGroup(
            jPanelAbaConsultaDeClienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbaConsultaDeClienesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAbaConsultaDeClienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneConsultaDeClientesTabelaDeDados, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addGroup(jPanelAbaConsultaDeClienesLayout.createSequentialGroup()
                        .addComponent(jLabelConsultaDeClientesNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldConsultaDeClientesNome, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsultaDeClientesPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAbaConsultaDeClienesLayout.setVerticalGroup(
            jPanelAbaConsultaDeClienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbaConsultaDeClienesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAbaConsultaDeClienesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConsultaDeClientesNome)
                    .addComponent(jTextFieldConsultaDeClientesNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultaDeClientesPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneConsultaDeClientesTabelaDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPaneAbas.addTab("Consulta de clientes", jPanelAbaConsultaDeClienes);

        jPanelAbaDadosPessoais.setBackground(new java.awt.Color(255, 255, 255));

        jLabelDadosPessoaisCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisCodigo.setText("Código:");

        jTextFieldDadosPessoaisCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisNome.setText("Nome:");

        jTextFieldDadosPessoaisNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisEmail.setText("E-mail:");

        jTextFieldDadosPessoaisEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisCelular.setText("Celular:");

        try {
            jFormattedTextFieldDadosPessoaisCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDadosPessoaisCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisTelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisTelefoneFixo.setText("Telefone Fixo:");

        try {
            jFormattedTextFieldDadosPessoaisTelefoneFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDadosPessoaisTelefoneFixo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisCep.setText("Cep:");

        try {
            jFormattedTextFieldDadosPessoaisCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDadosPessoaisCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisEndereco.setText("Endereço:");

        jTextFieldDadosPessoaisEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisNumero.setText("Número:");

        jTextFieldDadosPessoaisNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisCidade.setText("Cidade:");

        jTextFieldDadosPessoaisCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisBairro.setText("Bairro:");

        jTextFieldDadosPessoaisBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisComplemento.setText("Complemento:");

        jTextFieldDadosPessoaisComplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisUF.setText("UF:");

        jComboBoxDadosPessoaisUF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxDadosPessoaisUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelDadosPessoaisRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisRG.setText("RG:");

        try {
            jFormattedTextFieldDadosPessoaisRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDadosPessoaisRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabelDadosPessoaisCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDadosPessoaisCPF.setText("CPF:");

        try {
            jFormattedTextFieldDadosPessoaisCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDadosPessoaisCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelAbaDadosPessoaisLayout = new javax.swing.GroupLayout(jPanelAbaDadosPessoais);
        jPanelAbaDadosPessoais.setLayout(jPanelAbaDadosPessoaisLayout);
        jPanelAbaDadosPessoaisLayout.setHorizontalGroup(
            jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDadosPessoaisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisCep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldDadosPessoaisCep, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDadosPessoaisCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelDadosPessoaisTelefoneFixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldDadosPessoaisTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(359, 359, 359))
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDadosPessoaisEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDadosPessoaisNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jLabelDadosPessoaisComplemento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDadosPessoaisComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextFieldDadosPessoaisNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDadosPessoaisCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(jLabelDadosPessoaisNome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDadosPessoaisNome, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelDadosPessoaisRG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDadosPessoaisCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDadosPessoaisUF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldDadosPessoaisRG, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelDadosPessoaisCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldDadosPessoaisCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jComboBoxDadosPessoaisUF, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabelDadosPessoaisBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDadosPessoaisBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jFormattedTextFieldDadosPessoaisCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelAbaDadosPessoaisLayout.setVerticalGroup(
            jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDadosPessoaisCodigo)
                    .addComponent(jTextFieldDadosPessoaisCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDadosPessoaisNome)
                    .addComponent(jTextFieldDadosPessoaisNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDadosPessoaisEmail)
                    .addComponent(jTextFieldDadosPessoaisEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDadosPessoaisCelular)
                    .addComponent(jFormattedTextFieldDadosPessoaisCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDadosPessoaisTelefoneFixo)
                    .addComponent(jFormattedTextFieldDadosPessoaisTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDadosPessoaisCep)
                    .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jFormattedTextFieldDadosPessoaisCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDadosPessoaisEndereco)
                        .addComponent(jTextFieldDadosPessoaisEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDadosPessoaisNumero)
                        .addComponent(jTextFieldDadosPessoaisNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDadosPessoaisCidade)
                    .addComponent(jTextFieldDadosPessoaisCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDadosPessoaisBairro)
                    .addComponent(jTextFieldDadosPessoaisBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDadosPessoaisComplemento)
                    .addComponent(jTextFieldDadosPessoaisComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDadosPessoaisUF)
                    .addComponent(jComboBoxDadosPessoaisUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAbaDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelDadosPessoaisRG)
                        .addComponent(jFormattedTextFieldDadosPessoaisRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDadosPessoaisCPF))
                    .addGroup(jPanelAbaDadosPessoaisLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jFormattedTextFieldDadosPessoaisCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPaneAbas.addTab("Dados pessoais", jPanelAbaDadosPessoais);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Novo");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Salvar");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Excluir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneAbas)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPaneAbas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4, jButton5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultaDeClientesPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaDeClientesPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultaDeClientesPesquisarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmcliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonConsultaDeClientesPesquisar;
    private javax.swing.JComboBox<String> jComboBoxDadosPessoaisUF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDadosPessoaisCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDadosPessoaisCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldDadosPessoaisCep;
    private javax.swing.JFormattedTextField jFormattedTextFieldDadosPessoaisRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldDadosPessoaisTelefoneFixo;
    private javax.swing.JLabel jLabelBanner;
    private javax.swing.JLabel jLabelConsultaDeClientesNome;
    private javax.swing.JLabel jLabelDadosPessoaisBairro;
    private javax.swing.JLabel jLabelDadosPessoaisCPF;
    private javax.swing.JLabel jLabelDadosPessoaisCelular;
    private javax.swing.JLabel jLabelDadosPessoaisCep;
    private javax.swing.JLabel jLabelDadosPessoaisCidade;
    private javax.swing.JLabel jLabelDadosPessoaisCodigo;
    private javax.swing.JLabel jLabelDadosPessoaisComplemento;
    private javax.swing.JLabel jLabelDadosPessoaisEmail;
    private javax.swing.JLabel jLabelDadosPessoaisEndereco;
    private javax.swing.JLabel jLabelDadosPessoaisNome;
    private javax.swing.JLabel jLabelDadosPessoaisNumero;
    private javax.swing.JLabel jLabelDadosPessoaisRG;
    private javax.swing.JLabel jLabelDadosPessoaisTelefoneFixo;
    private javax.swing.JLabel jLabelDadosPessoaisUF;
    private javax.swing.JPanel jPanelAbaConsultaDeClienes;
    private javax.swing.JPanel jPanelAbaDadosPessoais;
    private javax.swing.JPanel jPanelBanner;
    private javax.swing.JScrollPane jScrollPaneConsultaDeClientesTabelaDeDados;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JTable jTableConsultaDeClientesTabelaDeDados;
    private javax.swing.JTextField jTextFieldConsultaDeClientesNome;
    private javax.swing.JTextField jTextFieldDadosPessoaisBairro;
    private javax.swing.JTextField jTextFieldDadosPessoaisCidade;
    private javax.swing.JTextField jTextFieldDadosPessoaisCodigo;
    private javax.swing.JTextField jTextFieldDadosPessoaisComplemento;
    private javax.swing.JTextField jTextFieldDadosPessoaisEmail;
    private javax.swing.JTextField jTextFieldDadosPessoaisEndereco;
    private javax.swing.JTextField jTextFieldDadosPessoaisNome;
    private javax.swing.JTextField jTextFieldDadosPessoaisNumero;
    // End of variables declaration//GEN-END:variables
}
