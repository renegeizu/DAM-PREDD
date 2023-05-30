package biblioteca;

    import java.io.IOException;
    import java.net.*;
    import java.util.logging.Level;
    import java.util.logging.Logger;

public class Navegador extends javax.swing.JFrame {

    public Navegador(){
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        URL url = null;
        try {
            url = new URL("file:src/Ayuda/Principal.html");
        } catch (MalformedURLException ex) {
            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            jEditorPane1.setPage(url);
            jEditorPane1.addHyperlinkListener(null);
        } catch (IOException ex) {
            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayuda del Programa");

        jEditorPane1.setBackground(new java.awt.Color(204, 204, 204));
        jEditorPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jEditorPane1.setEnabled(false);
        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("Avanzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retroceder");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("1");

        jLabel1.setText("/3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 392, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().equals("1") || jTextField1.getText().equals("2") || jTextField1.getText().equals("3")){
            if(jTextField1.getText().equals("1")){
                URL url = null;
                try {
                    url = new URL("file:src/Ayuda/Creacion.html");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    jEditorPane1.setPage(url);
                    jEditorPane1.addHyperlinkListener(null);
                } catch (IOException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTextField1.setText("2");
            }else{
                if(jTextField1.getText().equals("2")){
                    URL url = null;
                    try {
                        url = new URL("file:src/Ayuda/Uso.html");
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        jEditorPane1.setPage(url);
                        jEditorPane1.addHyperlinkListener(null);
                    } catch (IOException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jTextField1.setText("3");
                }else{
                    if(jTextField1.getText().equals("3")){
                        URL url = null;
                        try {
                            url = new URL("file:src/Ayuda/Principal.html");
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            jEditorPane1.setPage(url);
                            jEditorPane1.addHyperlinkListener(null);
                        } catch (IOException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTextField1.setText("1");
                    }
                }
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Error! No se encuentra la pagina");
            jTextField1.setText("1");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals("1") || jTextField1.getText().equals("2") || jTextField1.getText().equals("3")){
            if(jTextField1.getText().equals("1")){
                URL url = null;
                try {
                    url = new URL("file:src/Ayuda/Uso.html");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    jEditorPane1.setPage(url);
                    jEditorPane1.addHyperlinkListener(null);
                } catch (IOException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
                jTextField1.setText("3");
            }else{
                if(jTextField1.getText().equals("2")){
                    URL url = null;
                    try {
                        url = new URL("file:src/Ayuda/Principal.html");
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        jEditorPane1.setPage(url);
                        jEditorPane1.addHyperlinkListener(null);
                    } catch (IOException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    jTextField1.setText("1");
                }else{
                    if(jTextField1.getText().equals("3")){
                        URL url = null;
                        try {
                            url = new URL("file:src/Ayuda/Creacion.html");
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            jEditorPane1.setPage(url);
                            jEditorPane1.addHyperlinkListener(null);
                        } catch (IOException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTextField1.setText("2");
                    }
                }
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Error! No se encuentra la pagina");
            jTextField1.setText("1");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().equals("1") || jTextField1.getText().equals("2") || jTextField1.getText().equals("3")){
            if(jTextField1.getText().equals("1")){
                URL url = null;
                try {
                    url = new URL("file:src/Ayuda/Principal.html");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    jEditorPane1.setPage(url);
                    jEditorPane1.addHyperlinkListener(null);
                } catch (IOException ex) {
                    Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                if(jTextField1.getText().equals("2")){
                    URL url = null;
                    try {
                        url = new URL("file:src/Ayuda/Creacion.html");
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        jEditorPane1.setPage(url);
                        jEditorPane1.addHyperlinkListener(null);
                    } catch (IOException ex) {
                        Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    if(jTextField1.getText().equals("3")){
                        URL url = null;
                        try {
                            url = new URL("file:src/Ayuda/Uso.html");
                        } catch (MalformedURLException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            jEditorPane1.setPage(url);
                            jEditorPane1.addHyperlinkListener(null);
                        } catch (IOException ex) {
                            Logger.getLogger(Navegador.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Error! No se encuentra la pagina");
            jTextField1.setText("1");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
