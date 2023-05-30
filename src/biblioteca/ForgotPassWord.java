/*
 * Rafael Bailón Robles
 */

package biblioteca;

    import java.sql.Connection;
    import java.sql.Statement;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;

public class ForgotPassWord extends javax.swing.JFrame {

    public ForgotPassWord() {
        //this.setUndecorated(true);
        //this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        LabelError = new javax.swing.JLabel();
        LabelBoton = new javax.swing.JLabel();
        TextoPregunta = new javax.swing.JTextField();
        TextoLogin = new javax.swing.JTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar Contraseña");
        setMinimumSize(new java.awt.Dimension(314, 261));

        LabelError.setForeground(new java.awt.Color(255, 0, 0));
        LabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelError.setText("El usuario o la respuesta es incorrecta!");
        LabelError.setBounds(10, 180, 290, 14);
        jLayeredPane1.add(LabelError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelBotonMouseClicked(evt);
            }
        });
        LabelBoton.setBounds(20, 210, 280, 30);
        jLayeredPane1.add(LabelBoton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TextoPregunta.setBorder(null);
        TextoPregunta.setOpaque(false);
        TextoPregunta.setBounds(30, 130, 250, 20);
        jLayeredPane1.add(TextoPregunta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TextoLogin.setBorder(null);
        TextoLogin.setOpaque(false);
        TextoLogin.setBounds(30, 50, 250, 30);
        jLayeredPane1.add(TextoLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ForgotPass.png"))); // NOI18N
        LabelFondo.setBounds(0, 0, 315, 260);
        jLayeredPane1.add(LabelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelBotonMouseClicked
        
        /*
         * Comprueba que el usuario y la respuesta sean correctas.
         * Si lo son, abre una nueva ventana.
         * Si no, mensaje de error en un jlabel
         */
        
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        try {
            resultado = sentenciaSQL.executeQuery("SELECT * FROM Usuarios");
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(resultado.next()){
                if(resultado.getString(1).equals(TextoLogin.getText()) && resultado.getString(3).equals(TextoPregunta.getText())){
                VentanaPrincipal ven=new VentanaPrincipal();
                ven.setVisible(true);
                ven.setResizable(false);
                ven.ContenedorPrincipal.setVisible(true);
                ven.ContenedorAñadir.setVisible(false);
                ven.ContenedorModificar.setVisible(false);
                ven.ContenedorListado.setVisible(false);
                ven.ContenedorBorrar.setVisible(false);
                this.setVisible(false);
                resultado.last();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(resultado.last()==true && this.isVisible()==true){
                LabelError.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ForgotPassWord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_LabelBotonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelBoton;
    protected javax.swing.JLabel LabelError;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JTextField TextoLogin;
    private javax.swing.JTextField TextoPregunta;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
