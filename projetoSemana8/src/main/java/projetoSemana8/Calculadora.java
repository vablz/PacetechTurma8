/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoSemana8;

/**
 *
 * @author Usuario
 */
public class Calculadora extends javax.swing.JFrame {

    float valorUm, valorDois= 0.0f;
    int dado = 0;
    String operacao, dade;
    
    public Calculadora() {
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

        num5 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num10 = new javax.swing.JButton();
        soma1 = new javax.swing.JButton();
        subtracao1 = new javax.swing.JButton();
        visor = new javax.swing.JTextField();
        nu1 = new javax.swing.JButton();
        nu2 = new javax.swing.JButton();
        nu3 = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        nu4 = new javax.swing.JButton();
        nu5 = new javax.swing.JButton();
        nu6 = new javax.swing.JButton();
        nu7 = new javax.swing.JButton();
        nu8 = new javax.swing.JButton();
        nu9 = new javax.swing.JButton();
        nu0 = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        dado6 = new javax.swing.JButton();
        dado20 = new javax.swing.JButton();
        d100 = new javax.swing.JButton();

        num5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        num5.setText("1");

        num7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        num7.setText("1");

        num9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        num9.setText("6");

        num10.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        num10.setText("4");
        num10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num10ActionPerformed(evt);
            }
        });

        soma1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        soma1.setText("+");
        soma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soma1ActionPerformed(evt);
            }
        });

        subtracao1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        subtracao1.setText("-");
        subtracao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracao1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        visor.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        nu1.setBackground(new java.awt.Color(255, 255, 255));
        nu1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu1.setForeground(new java.awt.Color(51, 0, 51));
        nu1.setText("1");
        nu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu1ActionPerformed(evt);
            }
        });

        nu2.setBackground(new java.awt.Color(255, 255, 255));
        nu2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu2.setForeground(new java.awt.Color(51, 0, 51));
        nu2.setText("2");
        nu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu2ActionPerformed(evt);
            }
        });

        nu3.setBackground(new java.awt.Color(255, 255, 255));
        nu3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu3.setForeground(new java.awt.Color(51, 0, 51));
        nu3.setText("3");
        nu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu3ActionPerformed(evt);
            }
        });

        limpar.setBackground(new java.awt.Color(51, 0, 51));
        limpar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        limpar.setForeground(new java.awt.Color(255, 255, 255));
        limpar.setText("AC");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        soma.setBackground(new java.awt.Color(51, 0, 51));
        soma.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        soma.setForeground(new java.awt.Color(255, 255, 255));
        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(51, 0, 51));
        igual.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        nu4.setBackground(new java.awt.Color(255, 255, 255));
        nu4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu4.setForeground(new java.awt.Color(51, 0, 51));
        nu4.setText("4");
        nu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu4ActionPerformed(evt);
            }
        });

        nu5.setBackground(new java.awt.Color(255, 255, 255));
        nu5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu5.setForeground(new java.awt.Color(51, 0, 51));
        nu5.setText("5");
        nu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu5ActionPerformed(evt);
            }
        });

        nu6.setBackground(new java.awt.Color(255, 255, 255));
        nu6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu6.setForeground(new java.awt.Color(51, 0, 51));
        nu6.setText("6");
        nu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu6ActionPerformed(evt);
            }
        });

        nu7.setBackground(new java.awt.Color(255, 255, 255));
        nu7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu7.setForeground(new java.awt.Color(51, 0, 51));
        nu7.setText("7");
        nu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu7ActionPerformed(evt);
            }
        });

        nu8.setBackground(new java.awt.Color(255, 255, 255));
        nu8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu8.setForeground(new java.awt.Color(51, 0, 51));
        nu8.setText("8");
        nu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu8ActionPerformed(evt);
            }
        });

        nu9.setBackground(new java.awt.Color(255, 255, 255));
        nu9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu9.setForeground(new java.awt.Color(51, 0, 51));
        nu9.setText("9");
        nu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu9ActionPerformed(evt);
            }
        });

        nu0.setBackground(new java.awt.Color(255, 255, 255));
        nu0.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nu0.setForeground(new java.awt.Color(51, 0, 51));
        nu0.setText("0");
        nu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu0ActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(51, 0, 51));
        subtracao.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        subtracao.setForeground(new java.awt.Color(255, 255, 255));
        subtracao.setText("-");
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(51, 0, 51));
        multiplicacao.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        multiplicacao.setText("x");
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        divisao.setBackground(new java.awt.Color(51, 0, 51));
        divisao.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        divisao.setForeground(new java.awt.Color(255, 255, 255));
        divisao.setText(":");
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        dado6.setBackground(new java.awt.Color(51, 0, 51));
        dado6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        dado6.setForeground(new java.awt.Color(255, 255, 255));
        dado6.setText("d6");
        dado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado6ActionPerformed(evt);
            }
        });

        dado20.setBackground(new java.awt.Color(51, 0, 51));
        dado20.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        dado20.setForeground(new java.awt.Color(255, 255, 255));
        dado20.setText("d20");
        dado20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dado20ActionPerformed(evt);
            }
        });

        d100.setBackground(new java.awt.Color(51, 0, 51));
        d100.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        d100.setForeground(new java.awt.Color(255, 255, 255));
        d100.setText("d100");
        d100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d100ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nu0, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nu7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nu8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nu9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nu4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nu5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nu6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nu1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nu2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nu3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(limpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dado6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dado20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(7, 7, 7)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar)
                    .addComponent(nu3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(nu2)
                    .addComponent(nu1)
                    .addComponent(soma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nu6)
                        .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dado6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nu4)
                        .addComponent(nu5)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nu7)
                    .addComponent(nu8)
                    .addComponent(nu9)
                    .addComponent(multiplicacao)
                    .addComponent(dado20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nu0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(igual)
                        .addComponent(divisao)
                        .addComponent(d100)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu1ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "1");
    }//GEN-LAST:event_nu1ActionPerformed

    private void nu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu2ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "2");
        
    }//GEN-LAST:event_nu2ActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        // TODO add your handling code here:
        valorUm = Float.parseFloat(visor.getText());
        operacao = "adicao";
        visor.setText(""); 
    }//GEN-LAST:event_somaActionPerformed

    private void nu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu3ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "3");
    }//GEN-LAST:event_nu3ActionPerformed

    private void nu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu4ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "4");
    }//GEN-LAST:event_nu4ActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        visor.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        switch (operacao){
            case "adicao":
                valorDois = Float.parseFloat(visor.getText());
                visor.setText(String.valueOf(valorUm+valorDois));
                
            break;
            case "subtracao":
                valorDois = Float.parseFloat(visor.getText());
                visor.setText(String.valueOf(valorUm-valorDois));
            break;
            case "multiplicacao":
                valorDois = Float.parseFloat(visor.getText());
                visor.setText(String.valueOf(valorUm*valorDois));
            break;
            case "divisao":
                valorDois = Float.parseFloat(visor.getText());
                visor.setText(String.valueOf(valorUm/valorDois));
            break;
              
            default:
            break;
        }
        
    }//GEN-LAST:event_igualActionPerformed

    private void num10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num10ActionPerformed

    private void nu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu5ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "5");
    }//GEN-LAST:event_nu5ActionPerformed

    private void nu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu6ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "6");
    }//GEN-LAST:event_nu6ActionPerformed

    private void nu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu7ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "7");
    }//GEN-LAST:event_nu7ActionPerformed

    private void nu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu8ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "8");
    }//GEN-LAST:event_nu8ActionPerformed

    private void nu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu9ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "9");
    }//GEN-LAST:event_nu9ActionPerformed

    private void nu0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu0ActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + "0");
    }//GEN-LAST:event_nu0ActionPerformed

    private void soma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soma1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soma1ActionPerformed

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        // TODO add your handling code here:
        valorUm = Float.parseFloat(visor.getText());
        operacao = "subtracao";
        visor.setText(""); 
    }//GEN-LAST:event_subtracaoActionPerformed

    private void subtracao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtracao1ActionPerformed

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
        // TODO add your handling code here:
        valorUm = Float.parseFloat(visor.getText());
        operacao = "multiplicacao";
        visor.setText(""); 
    }//GEN-LAST:event_multiplicacaoActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
        // TODO add your handling code here:
        valorUm = Float.parseFloat(visor.getText());
        operacao = "divisao";
        visor.setText(""); 
    }//GEN-LAST:event_divisaoActionPerformed

    private void dado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado6ActionPerformed
        // TODO add your handling code here:
        dado = (int) (Math.random()*6 +1);
        visor.setText(Integer.toString(dado));
    }//GEN-LAST:event_dado6ActionPerformed

    private void dado20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dado20ActionPerformed
        // TODO add your handling code here:}
        dado = (int) (Math.random()*20 +1);
        visor.setText(Integer.toString(dado));
    }//GEN-LAST:event_dado20ActionPerformed

    private void d100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d100ActionPerformed
        // TODO add your handling code here:
        dado = (int) (Math.random()*100 +1);
        visor.setText(Integer.toString(dado));
    }//GEN-LAST:event_d100ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton d100;
    private javax.swing.JButton dado20;
    private javax.swing.JButton dado6;
    private javax.swing.JButton divisao;
    private javax.swing.JButton igual;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton nu0;
    private javax.swing.JButton nu1;
    private javax.swing.JButton nu2;
    private javax.swing.JButton nu3;
    private javax.swing.JButton nu4;
    private javax.swing.JButton nu5;
    private javax.swing.JButton nu6;
    private javax.swing.JButton nu7;
    private javax.swing.JButton nu8;
    private javax.swing.JButton nu9;
    private javax.swing.JButton num10;
    private javax.swing.JButton num5;
    private javax.swing.JButton num7;
    private javax.swing.JButton num9;
    private javax.swing.JButton soma;
    private javax.swing.JButton soma1;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton subtracao1;
    private javax.swing.JTextField visor;
    // End of variables declaration//GEN-END:variables
}
