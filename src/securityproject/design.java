package securityproject;

public class design extends javax.swing.JFrame {

    SecurityProject spro;

   
    public design() {
        initComponents();
        this.setSize(1100, 600);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        jLabel8 = new javax.swing.JLabel();
        privatet1 = new javax.swing.JLabel();
        ciphertext = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        p1 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        privatet2A = new javax.swing.JLabel();
        plaintextA = new javax.swing.JLabel();
        decryption = new javax.swing.JButton();
        e2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        p2 = new javax.swing.JTextField();
        plaintext = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        publict2 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        privatet2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        publict2A = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        encryption = new javax.swing.JButton();
        publict1A = new javax.swing.JLabel();
        publict1 = new javax.swing.JLabel();
        privatet1A = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ciphertextA = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(675, 77, 0, 457);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Entrer E:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 191, 80, 22);

        privatet1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet1.setForeground(new java.awt.Color(255, 255, 255));
        privatet1.setText("Clé Privée :");
        getContentPane().add(privatet1);
        privatet1.setBounds(162, 265, 59, 15);

        ciphertext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext.setForeground(new java.awt.Color(255, 255, 255));
        ciphertext.setText("Cipher :");
        getContentPane().add(ciphertext);
        ciphertext.setBounds(0, 451, 100, 17);

        jButton3.setBackground(new java.awt.Color(51, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Générer les clés");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 231, 140, 49);
        getContentPane().add(p1);
        p1.setBounds(143, 77, 170, 37);
        getContentPane().add(q1);
        q1.setBounds(143, 125, 170, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrer P:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 92, 120, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entrer Q:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 140, 110, 22);
        getContentPane().add(m1);
        m1.setBounds(129, 286, 190, 35);
        getContentPane().add(e1);
        e1.setBounds(142, 180, 170, 33);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Message");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 299, 110, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Entrer E:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(371, 183, 80, 22);

        privatet2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2A.setText("Private key ");
        getContentPane().add(privatet2A);
        privatet2A.setBounds(630, 260, 70, 15);

        plaintextA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plaintextA.setText("Message");
        getContentPane().add(plaintextA);
        plaintextA.setBounds(527, 448, 190, 17);

        decryption.setBackground(new java.awt.Color(51, 255, 204));
        decryption.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        decryption.setText("Déchiffrer");
        decryption.setAutoscrolls(true);
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });
        getContentPane().add(decryption);
        decryption.setBounds(530, 330, 155, 36);

        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        getContentPane().add(e2);
        e2.setBounds(510, 180, 209, 31);

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Généré les clés");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(372, 231, 140, 41);
        getContentPane().add(p2);
        p2.setBounds(510, 80, 210, 34);

        plaintext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plaintext.setText("Message en claire :");
        getContentPane().add(plaintext);
        plaintext.setBounds(351, 448, 130, 17);

        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2);
        q2.setBounds(510, 130, 209, 34);

        publict2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2.setText("Clé publique :");
        getContentPane().add(publict2);
        publict2.setBounds(530, 230, 80, 15);

        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        getContentPane().add(m2);
        m2.setBounds(510, 280, 209, 34);

        privatet2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2.setText("Clé privée :");
        getContentPane().add(privatet2);
        privatet2.setBounds(530, 260, 90, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Entrer P:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(371, 89, 90, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Entrer Q:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(371, 134, 90, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Message");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 290, 100, 22);

        publict2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2A.setText("Public key ");
        getContentPane().add(publict2A);
        publict2A.setBounds(630, 230, 70, 15);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        encryption.setBackground(new java.awt.Color(51, 255, 204));
        encryption.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        encryption.setText("Chiffrer");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });

        publict1A.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        publict1A.setForeground(new java.awt.Color(255, 255, 255));
        publict1A.setText("Public key ");

        publict1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict1.setForeground(new java.awt.Color(255, 255, 255));
        publict1.setText("Clé publique :");

        privatet1A.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        privatet1A.setForeground(new java.awt.Color(255, 255, 255));
        privatet1A.setText("Private key ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Emetteur");

        ciphertextA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertextA.setForeground(new java.awt.Color(255, 255, 255));
        ciphertextA.setText("Méssage chiffré");

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("Envoyer au destinataire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(publict1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publict1A, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(privatet1A))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ciphertextA, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publict1)
                    .addComponent(publict1A))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(privatet1A)
                .addGap(63, 63, 63)
                .addComponent(encryption, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(ciphertextA, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(1, 35, 340, 510);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(49, 122, 193));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(49, 122, 193));
        jLabel11.setText("                                                      ECOLE NATIONALE SUPERIEURE DES POSTES ET TELECOMMUNICATION ET DES TICS");

        jLabel15.setBackground(new java.awt.Color(51, 0, 153));
        jLabel15.setForeground(new java.awt.Color(204, 0, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityproject/supptic image allpages_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1090, 30);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("CHIFFREMENT RSA");

        jLabel16.setBackground(new java.awt.Color(51, 0, 153));
        jLabel16.setForeground(new java.awt.Color(204, 0, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityproject/supptic.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("2-CHWOFOH SIKAPA LUCIEN");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("3-DJOMGOUE NIMATCHA DARLANNE JOURELLE");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("4-HAMBOA GUEYI LEKETE BERTIN");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("1-AKOA ATHANASE STEEVE LOICK");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("MEMBRES DU GROUPE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel19)
                    .addContainerGap(59, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(73, 73, 73)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(jLabel19)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(730, 30, 350, 520);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Recepteur");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(520, 30, 70, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      spro = new SecurityProject(p1.getText(), q1.getText(), e1.getText());
        spro.check();
        publict1A.setText("(" + spro.Emath + "," + spro.nmath + ")");
        privatet1A.setText("(" + spro.dmath + "," + spro.nmath + ")");
        spro.getalphabet();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
        spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        spro.getMessageandEncrypt(m1.getText());
        ciphertextA.setText(spro.cipher.toString());
    }//GEN-LAST:event_encryptionActionPerformed

    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        spro.getMessageandDecrypt(m2.getText());
        plaintextA.setText(spro.cipher.toString());

    }//GEN-LAST:event_decryptionActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        
    }//GEN-LAST:event_e2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        publict2A.setText("(" + spro.Emath + "," + spro.nmath + ")");
        privatet2A.setText("(" + spro.dmath + "," + spro.nmath + ")");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m2.setText(ciphertextA.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ciphertext;
    private javax.swing.JLabel ciphertextA;
    private javax.swing.JButton decryption;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JButton encryption;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JLabel plaintext;
    private javax.swing.JLabel plaintextA;
    private javax.swing.JLabel privatet1;
    private javax.swing.JLabel privatet1A;
    private javax.swing.JLabel privatet2;
    private javax.swing.JLabel privatet2A;
    private javax.swing.JLabel publict1;
    private javax.swing.JLabel publict1A;
    private javax.swing.JLabel publict2;
    private javax.swing.JLabel publict2A;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    // End of variables declaration//GEN-END:variables
}
