package Calculadora;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
    }
    Double numero1, numero2;
    String operacao;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotaoLimpar = new javax.swing.JButton();
        Botao7 = new javax.swing.JButton();
        BotaoIgual = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        BotaoDesligar = new javax.swing.JButton();
        BotaoPonto = new javax.swing.JButton();
        Botao0 = new javax.swing.JButton();
        BotaoDivisao = new javax.swing.JButton();
        BotaoMenos = new javax.swing.JButton();
        BotaoMultiplicacao = new javax.swing.JButton();
        BotaoMais = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Visor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 204)));

        BotaoLimpar.setBackground(new java.awt.Color(204, 204, 204));
        BotaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoLimpar.setForeground(new java.awt.Color(255, 0, 0));
        BotaoLimpar.setText("AC");
        BotaoLimpar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        Botao7.setBackground(new java.awt.Color(204, 204, 204));
        Botao7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao7.setText("7");
        Botao7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        BotaoIgual.setBackground(new java.awt.Color(204, 204, 204));
        BotaoIgual.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotaoIgual.setText("=");
        BotaoIgual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgualActionPerformed(evt);
            }
        });

        Botao9.setBackground(new java.awt.Color(204, 204, 204));
        Botao9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao9.setText("9");
        Botao9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        Botao8.setBackground(new java.awt.Color(204, 204, 204));
        Botao8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao8.setText("8");
        Botao8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao4.setBackground(new java.awt.Color(204, 204, 204));
        Botao4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao4.setText("4");
        Botao4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao5.setBackground(new java.awt.Color(204, 204, 204));
        Botao5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao5.setText("5");
        Botao5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao6.setBackground(new java.awt.Color(204, 204, 204));
        Botao6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao6.setText("6");
        Botao6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao1.setBackground(new java.awt.Color(204, 204, 204));
        Botao1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao1.setText("1");
        Botao1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao2.setBackground(new java.awt.Color(204, 204, 204));
        Botao2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao2.setText("2");
        Botao2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao3.setBackground(new java.awt.Color(204, 204, 204));
        Botao3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao3.setText("3");
        Botao3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        BotaoDesligar.setBackground(new java.awt.Color(204, 204, 204));
        BotaoDesligar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoDesligar.setForeground(new java.awt.Color(255, 0, 0));
        BotaoDesligar.setText("OFF");
        BotaoDesligar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDesligarActionPerformed(evt);
            }
        });

        BotaoPonto.setBackground(new java.awt.Color(204, 204, 204));
        BotaoPonto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoPonto.setText(".");
        BotaoPonto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPontoActionPerformed(evt);
            }
        });

        Botao0.setBackground(new java.awt.Color(204, 204, 204));
        Botao0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Botao0.setText("0");
        Botao0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        Botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao0ActionPerformed(evt);
            }
        });

        BotaoDivisao.setBackground(new java.awt.Color(204, 204, 204));
        BotaoDivisao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoDivisao.setText("/");
        BotaoDivisao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDivisaoActionPerformed(evt);
            }
        });

        BotaoMenos.setBackground(new java.awt.Color(204, 204, 204));
        BotaoMenos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoMenos.setText("-");
        BotaoMenos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMenosActionPerformed(evt);
            }
        });

        BotaoMultiplicacao.setBackground(new java.awt.Color(204, 204, 204));
        BotaoMultiplicacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoMultiplicacao.setText("*");
        BotaoMultiplicacao.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicacaoActionPerformed(evt);
            }
        });

        BotaoMais.setBackground(new java.awt.Color(204, 204, 204));
        BotaoMais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotaoMais.setText("+");
        BotaoMais.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        BotaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BotaoDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 204)));

        Visor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Visor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisorActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Calculadora/Pacetech.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Visor)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Visor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        Visor.setText(Visor.getText() + "1");

    }//GEN-LAST:event_Botao1ActionPerformed

    private void VisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisorActionPerformed
    }//GEN-LAST:event_VisorActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        Visor.setText(Visor.getText() + "2");
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        Visor.setText(Visor.getText() + "3");
    }//GEN-LAST:event_Botao3ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        Visor.setText(Visor.getText() + "4");
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao0ActionPerformed
        Visor.setText(Visor.getText() + "0");
    }//GEN-LAST:event_Botao0ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        Visor.setText(Visor.getText() + "5");
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        Visor.setText(Visor.getText() + "6");
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        Visor.setText(Visor.getText() + "7");
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        Visor.setText(Visor.getText() + "8");
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        Visor.setText(Visor.getText() + "9");
    }//GEN-LAST:event_Botao9ActionPerformed

    private void BotaoDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDivisaoActionPerformed
        numero1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        operacao = "divisao";
    }//GEN-LAST:event_BotaoDivisaoActionPerformed

    private void BotaoMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicacaoActionPerformed
        numero1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        operacao = "multiplicacao";
    }//GEN-LAST:event_BotaoMultiplicacaoActionPerformed

    private void BotaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMenosActionPerformed
        numero1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        operacao = "subtracao";
    }//GEN-LAST:event_BotaoMenosActionPerformed

    private void BotaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMaisActionPerformed
        numero1 = Double.parseDouble(Visor.getText());
        Visor.setText("");
        operacao = "soma";
    }//GEN-LAST:event_BotaoMaisActionPerformed

    private void BotaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgualActionPerformed
        numero2 = Double.parseDouble(Visor.getText());
        if (operacao == "soma") {
            Visor.setText(String.valueOf(numero1 + numero2));
            else if(operacao == "subtracao") {
                Visor.setText(String.valueOf(numero1 - numero2));
                        else if (operacao == "multiplicacao") {
                            Visor.setText(String.valueOf(numero1 * numero2));
                            else if (operacao == "divisao"){
                 Visor.setText(String.valueOf(numero1 / numero2));
                 }
                        }
                    }
    }//GEN-LAST:event_BotaoIgualActionPerformed

    private void BotaoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPontoActionPerformed
        Visor.setText(Visor.getText() + ".");
    }//GEN-LAST:event_BotaoPontoActionPerformed

    private void BotaoDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDesligarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoDesligarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        Visor.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao0;
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JButton BotaoDesligar;
    private javax.swing.JButton BotaoDivisao;
    private javax.swing.JButton BotaoIgual;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMais;
    private javax.swing.JButton BotaoMenos;
    private javax.swing.JButton BotaoMultiplicacao;
    private javax.swing.JButton BotaoPonto;
    private javax.swing.JTextField Visor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
