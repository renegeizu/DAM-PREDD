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
    import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    public Login() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException { 
        //this.setUndecorated(true);
        //this.setLocationRelativeTo(null);
        initComponents();
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        TextoPassword = new javax.swing.JPasswordField();
        LabelCuentaNueva = new javax.swing.JLabel();
        BotonInsertar = new javax.swing.JButton();
        LabelContraseñaOlvidada = new javax.swing.JLabel();
        TextoUser = new javax.swing.JTextField();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conexion al Programa");
        setMinimumSize(new java.awt.Dimension(505, 189));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TextoPassword.setForeground(new java.awt.Color(255, 255, 255));
        TextoPassword.setBorder(null);
        TextoPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        TextoPassword.setOpaque(false);
        TextoPassword.setBounds(150, 100, 250, 30);
        jLayeredPane1.add(TextoPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelCuentaNueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelCuentaNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCuentaNuevaMouseClicked(evt);
            }
        });
        LabelCuentaNueva.setBounds(130, 14, 130, 20);
        jLayeredPane1.add(LabelCuentaNueva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BotonInsertar.setBackground(new java.awt.Color(0, 0, 0));
        BotonInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton.png"))); // NOI18N
        BotonInsertar.setBorder(null);
        BotonInsertar.setContentAreaFilled(false);
        BotonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsertar.setFocusPainted(false);
        BotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertarActionPerformed(evt);
            }
        });
        BotonInsertar.setBounds(420, 60, 52, 60);
        jLayeredPane1.add(BotonInsertar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelContraseñaOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelContraseñaOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelContraseñaOlvidadaMouseClicked(evt);
            }
        });
        LabelContraseñaOlvidada.setBounds(130, 140, 140, 20);
        jLayeredPane1.add(LabelContraseñaOlvidada, javax.swing.JLayeredPane.DEFAULT_LAYER);

        TextoUser.setBackground(new java.awt.Color(0, 0, 0));
        TextoUser.setForeground(new java.awt.Color(255, 255, 255));
        TextoUser.setBorder(null);
        TextoUser.setCaretColor(new java.awt.Color(255, 255, 255));
        TextoUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextoUser.setOpaque(false);
        TextoUser.setBounds(150, 50, 250, 30);
        jLayeredPane1.add(TextoUser, javax.swing.JLayeredPane.DEFAULT_LAYER);

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.png"))); // NOI18N
        LabelFondo.setBounds(0, 0, 510, 190);
        jLayeredPane1.add(LabelFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertarActionPerformed
        
        /*
         * Revisa la tabla Usuarios en la DB Login
         * Si se encuentra el usuario y contraseña accede al siguiente jframe
         * Si no, salta un mensaje de error
         */
        
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        try {
            resultado = sentenciaSQL.executeQuery("SELECT * FROM Usuarios");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(resultado.next()){
                if(resultado.getString(1).equals(TextoUser.getText()) && resultado.getString(2).equals(TextoPassword.getText())){
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
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if(resultado.last()==true && this.isVisible()==true){
                javax.swing.JOptionPane.showMessageDialog(this, "Error!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BotonInsertarActionPerformed

    private void LabelContraseñaOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelContraseñaOlvidadaMouseClicked
        
        /*
         * Al pulsar en "Forgot your password?" se abre un nuevo jframe
         * Para acceder sin contraseña
         */
        
        ForgotPassWord fpw=new ForgotPassWord();
        fpw.setVisible(true);
        fpw.setResizable(false);
        this.setVisible(false);
        fpw.LabelError.setVisible(false);
        
    }//GEN-LAST:event_LabelContraseñaOlvidadaMouseClicked

    private void LabelCuentaNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCuentaNuevaMouseClicked
        
        /*
         * Abre un nuevo jframe
         * El nuevo jframe es para crear una nueva cuenta
         */
        
        Registro regs=new Registro();
        regs.setVisible(true);
        regs.setResizable(false);
        this.setVisible(false);
        
    }//GEN-LAST:event_LabelCuentaNuevaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        /*
         * Cierra el programa
         */
        
        System.exit(0);
        
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInsertar;
    private javax.swing.JLabel LabelContraseñaOlvidada;
    private javax.swing.JLabel LabelCuentaNueva;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JPasswordField TextoPassword;
    protected static javax.swing.JTextField TextoUser;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
