package Games;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormGame extends javax.swing.JFrame {
    private ControlaEstudio ce;
    private Jogo jg;
    private Estudio es;
    
    public void habilitarJogo(boolean op){
        txtIdJogo.setEditable(op);
        txtAnoJogo.setEditable(op);
        txtNomeJogo.setEditable(op);
        txtValor.setEditable(op);
        btnInserPers.setEnabled(op);
        btnAddJogo.setEnabled(op);
        btnFinalizarInsert.setEnabled(op);
    }
    
    public void habilitarEstudio(boolean op){
        txtIdEstudio.setEditable(op);
        txtAnoEstudio.setEditable(op);
        txtNomeEstudio.setEditable(op);
        btnInserJogo.setEnabled(op);
    }
    
    public void preencherTabelaJogo(){
        List<Jogo> listaJogo = this.es.getListJogo();
        DefaultTableModel tblJogos = (DefaultTableModel) tblJogo.getModel();
        
        tblJogos.setNumRows(0);
        
        for(Jogo j : listaJogo){
            Object[] novoJogo = new Object[]{
                j.getId(),
                j.getNome(),
                j.getValor(),
                j.getPlataforma(),
                j.getDataLanc()  
            };
            
            tblJogos.addRow(novoJogo);
        }
    }
    
    public void preencherTabelaEstudio(){
        List<Estudio> listaEstudio = this.ce.getEstudios();
        DefaultTableModel tlbEstudio = (DefaultTableModel) tblEstudio.getModel();
        
        tlbEstudio.setNumRows(0);
        
        for(Estudio e : listaEstudio){
            Object[] novoEstudio = new Object[]{
                e.getId(),
                e.getNome(),
                e.getAnoCriacao(), 
            };
            
            tlbEstudio.addRow(novoEstudio);
        }
    }
    
    public FormGame() {
        initComponents();
        this.habilitarJogo(false);
        this.habilitarEstudio(true);
        this.ce = new ControlaEstudio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudio = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdEstudio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNomeEstudio = new javax.swing.JTextField();
        txtAnoEstudio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnInserJogo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtIdJogo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomeJogo = new javax.swing.JTextField();
        txtAnoJogo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInserPers = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbPlataforma = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJogo = new javax.swing.JTable();
        btnAddJogo = new javax.swing.JButton();
        btnFinalizarInsert = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblEstudio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Data de Criacao"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEstudio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Estudios", jPanel1);

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 36)); // NOI18N
        jLabel1.setText("Formulário de Jogos de Estudios");

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel2.setText("Código do Estudio:");

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel3.setText("Nome do Estudio:");

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel4.setText("Ano de Criação do Estudio:");

        btnInserJogo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnInserJogo.setText("Inserir Jogos");
        btnInserJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserJogoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogo"));

        txtIdJogo.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel5.setText("Nome do Jogo:");

        txtNomeJogo.setEditable(false);

        txtAnoJogo.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel6.setText("Ano de Criação do Jogo:");

        btnInserPers.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnInserPers.setText("Inserir Personagem");
        btnInserPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserPersActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel7.setText("Código do Jogo:");

        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel8.setText("Valor do Jogo:");

        jLabel9.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel9.setText("Plataforma do Jogo:");

        cmbPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha...", "Computador", "Play Station", "Xbox", "Nintendo" }));

        tblJogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Valor", "Plataforma", "Data de Lançamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblJogo);
        if (tblJogo.getColumnModel().getColumnCount() > 0) {
            tblJogo.getColumnModel().getColumn(2).setHeaderValue("Valor");
            tblJogo.getColumnModel().getColumn(3).setHeaderValue("Plataforma");
        }

        btnAddJogo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnAddJogo.setText("Inserir Jogo");
        btnAddJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddJogoActionPerformed(evt);
            }
        });

        btnFinalizarInsert.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnFinalizarInsert.setText("Finalizar Inserção de Jogo");
        btnFinalizarInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(22, 22, 22)
                                .addComponent(cmbPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeJogo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor))
                            .addComponent(btnInserPers, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdJogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFinalizarInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtAnoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserPers, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizarInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnInserJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnoEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnoEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserJogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNomeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Formulario de Jogo de Estudios", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserJogoActionPerformed
        this.es = new Estudio();
        this.es.setId(Integer.parseInt(txtIdEstudio.getText()));
        this.es.setNome(txtNomeEstudio.getText());
        this.es.setAnoCriacao(Integer.parseInt(txtAnoEstudio.getText()));
        
        this.habilitarJogo(true);
        this.habilitarEstudio(false);
    }//GEN-LAST:event_btnInserJogoActionPerformed

    private void btnAddJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddJogoActionPerformed
        this.jg = new Jogo();
        this.jg.setId(Integer.parseInt(txtIdJogo.getText()));
        this.jg.setNome(txtNomeJogo.getText());
        this.jg.setValor(Double.parseDouble(txtValor.getText()));
        this.jg.setPlataforma(cmbPlataforma.getSelectedItem().toString());
        this.jg.setDataLanc(Integer.parseInt(txtAnoJogo.getText()));
        
        this.es.addJogo(jg);
        preencherTabelaJogo();
        
        txtNomeJogo.setText("");
        txtIdJogo.setText("");
        txtValor.setText("");
        txtAnoJogo.setText("");
        cmbPlataforma.setSelectedItem("Escolher...");
        
    }//GEN-LAST:event_btnAddJogoActionPerformed

    private void btnInserPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserPersActionPerformed
        FormPersonagem fp = new FormPersonagem();
        
        fp.setVisible(true);
    }//GEN-LAST:event_btnInserPersActionPerformed

    private void btnFinalizarInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarInsertActionPerformed
         this.ce.adicionar(this.es);
        
        txtIdJogo.setText ("");
        txtIdEstudio.setText("");
        txtNomeEstudio.setText("");
        txtNomeJogo.setText("");
        txtAnoEstudio.setText("");
        txtAnoJogo.setText("");
        txtValor.setText("");
        cmbPlataforma.setSelectedItem("Escolher...");
        DefaultTableModel tabelaJogos = (DefaultTableModel) tblJogo.getModel();
        tabelaJogos.setNumRows (0);
        
        habilitarJogo(false);
        habilitarEstudio(true);
        
        JOptionPane.showMessageDialog (this, "Inserção de Jogos finalizada com sucesso");
        
        preencherTabelaEstudio();
    }//GEN-LAST:event_btnFinalizarInsertActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddJogo;
    private javax.swing.JButton btnFinalizarInsert;
    private javax.swing.JButton btnInserJogo;
    private javax.swing.JButton btnInserPers;
    private javax.swing.JComboBox<String> cmbPlataforma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEstudio;
    private javax.swing.JTable tblJogo;
    private javax.swing.JTextField txtAnoEstudio;
    private javax.swing.JTextField txtAnoJogo;
    private javax.swing.JTextField txtIdEstudio;
    private javax.swing.JTextField txtIdJogo;
    private javax.swing.JTextField txtNomeEstudio;
    private javax.swing.JTextField txtNomeJogo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
