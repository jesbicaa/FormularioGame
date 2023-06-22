package Games;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormPersonagem extends javax.swing.JFrame {
    private Jogo jg;
    private PersonagensPrinc pc;
    
    public void preencherTabelaPersonagem(){
        List<PersonagensPrinc> listPers = this.jg.getListPers();
        DefaultTableModel tabela = (DefaultTableModel) tblPers.getModel();
        
        tabela.setNumRows(0);
        
        for(PersonagensPrinc p : listPers){
            Object[] novoPersonagem = new Object[]{
                p.getNome(),
                p.getIdade(),
                p.getPersonalidade(),
                p.getGenero()
            };
            
            tabela.addRow(novoPersonagem);
        }
    }
    
    public FormPersonagem() {
        initComponents();
        this.jg = new Jogo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtNomePers = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPersoPers = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnInserPersona = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPers = new javax.swing.JTable();
        btnFinalizarInsertPers = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        jsIdade = new javax.swing.JSpinner();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Personagem"));

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel5.setText("Personalidade:");

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel6.setText("Idade:");

        btnInserPersona.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnInserPersona.setText("Inserir Personagem");
        btnInserPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserPersonaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel7.setText("Nome:");

        jLabel8.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        jLabel8.setText("Genero:");

        tblPers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Personalidade", "Genero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPers);

        btnFinalizarInsertPers.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 18)); // NOI18N
        btnFinalizarInsertPers.setText("Finalizar Inserção de Personagem");
        btnFinalizarInsertPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarInsertPersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(txtPersoPers, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomePers)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(btnInserPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarInsertPers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNomePers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jsIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPersoPers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInserPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarInsertPers, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserPersonaActionPerformed
        this.pc = new PersonagensPrinc();
        this.pc.setNome(txtNomePers.getText());
        this.pc.setPersonalidade(txtPersoPers.getText());
        this.pc.setGenero(txtGenero.getText());
        this.pc.setIdade(Integer.parseInt(String.valueOf(jsIdade.getValue())));
        
        this.jg.addPersonagem(pc);
        preencherTabelaPersonagem();
        
        txtNomePers.setText("");
        txtPersoPers.setText("");
        txtGenero.setText("");
        jsIdade.setValue(0);
    }//GEN-LAST:event_btnInserPersonaActionPerformed

    private void btnFinalizarInsertPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarInsertPersActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnFinalizarInsertPersActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarInsertPers;
    private javax.swing.JButton btnInserPersona;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsIdade;
    private javax.swing.JTable tblPers;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNomePers;
    private javax.swing.JTextField txtPersoPers;
    // End of variables declaration//GEN-END:variables
}
