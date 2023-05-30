/*
 * Rafael Bailón Robles
 */

package biblioteca;

    import java.sql.Connection;
    import java.sql.Statement;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        //this.setUndecorated(true);
        //this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        TextoPass = new javax.swing.JPasswordField();
        TextoPregunta = new javax.swing.JTextField();
        TextoUser = new javax.swing.JTextField();
        LabelRegistro = new javax.swing.JLabel();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setMinimumSize(new java.awt.Dimension(307, 249));

        TextoPass.setBorder(null);
        TextoPass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextoPass.setOpaque(false);
        TextoPass.setBounds(30, 100, 250, 30);
        jLayeredPane1.add(TextoPass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TextoPregunta.setBorder(null);
        TextoPregunta.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextoPregunta.setOpaque(false);
        TextoPregunta.setBounds(30, 170, 260, 20);
        jLayeredPane1.add(TextoPregunta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TextoUser.setBorder(null);
        TextoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextoUser.setOpaque(false);
        TextoUser.setBounds(30, 30, 250, 20);
        jLayeredPane1.add(TextoUser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelRegistroMouseClicked(evt);
            }
        });
        LabelRegistro.setBounds(20, 210, 270, 30);
        jLayeredPane1.add(LabelRegistro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro.png"))); // NOI18N
        LabelFondo.setBounds(0, 0, 310, 250);
        jLayeredPane1.add(LabelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelRegistroMouseClicked
        
        /*
         * Envia los datos a la DB para registrar al usuario
         */
        
        boolean mensaje=true;
        if(TextoUser.getText().equals("")==false || TextoPass.getText().equals("")==false || TextoPregunta.getText().equals("")==false){
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        Connection conexion = null;
            try {
                conexion = DriverManager.getConnection("jdbc:odbc:Login","","");
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        Statement sentenciaSQL = null;
            try {
                sentenciaSQL=conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                sentenciaSQL.executeUpdate("INSERT INTO Usuarios VALUES('"+TextoUser.getText()+"','"+TextoPass.getText()+"','"+TextoPregunta.getText()+"')");
            } catch (SQLException ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error! \n El Usuario ya Existe");
                mensaje=false;
            }
            if(mensaje==true){
                javax.swing.JOptionPane.showMessageDialog(this, "Usuario Creado");
            }
        }
        
    }//GEN-LAST:event_LabelRegistroMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelRegistro;
    private javax.swing.JPasswordField TextoPass;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JTextField TextoUser;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
