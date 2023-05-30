/*
 * Rafael Bailón Robles
 */

package biblioteca;

    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.sql.Connection;
    import java.sql.Statement;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javax.swing.JFileChooser;
    import javax.swing.filechooser.FileNameExtensionFilter;

public class VentanaPrincipal extends javax.swing.JFrame {

    int reproductor=0;
    int ant=0;
    
    /*
     * Limpia los Campos del Panel 'Borrar'
     */
    
    public void LimpiarCamposBorrar(){
        BorrarTextoGenero.setText("");
        BorrarTextoCapitulosInicio.setText("");
        BorrarTextoCapitulosFinal.setText("");
        BorrarTextoOvasInicio.setText("");
        BorrarTextoOvasFinal.setText("");
        BorrarTextoResumen.setText("");
        BorrarTextoAutor.setText("");
        BorrarTextoFechaInicioDia.setText("");
        BorrarTextoFechaInicioMes.setText("");
        BorrarTextoFechaInicioAño.setText("");
        BorrarTextoFechaFinDia.setText("");
        BorrarTextoFechaFinMes.setText("");
        BorrarTextoFechaFinAño.setText("");
    }
    
    /*
     * Limpia los Campos del Panel 'Modificar'
     */
    
    public void LimpiarCamposModificar(){
        ModificarTextoNombre.setText("");
        ModificarTextoGenero.setText("");
        ModificarTextoCapitulosInicio.setText("");
        ModificarTextoCapitulosFinal.setText("");
        ModificarTextoOvasInicio.setText("");
        ModificarTextoOvasFinal.setText("");
        ModificarTextoResumen.setText("");
        ModificarTextoAutor.setText("");
        ModificarTextoFechaInicioDia.setText("");
        ModificarTextoFechaInicioMes.setText("");
        ModificarTextoFechaInicioAño.setText("");
        ModificarTextoFechaFinDia.setText("");
        ModificarTextoFechaFinMes.setText("");
        ModificarTextoFechaFinAño.setText("");
    }
    
    /*
     * Limpia los Campos del Panel 'Insertar'
     */
    
    public void LimpiarCamposInsertar(){
        InsertarTextoGenero.setText("");
        InsertarTextoNombre.setText("");
        InsertarTextoCapitulosInicio.setText("");
        InsertarTextoCapitulosFinal.setText("");
        InsertarTextoOvasInicio.setText("");
        InsertarTextoOvasFinal.setText("");
        InsertarTextoResumen.setText("");
        InsertarTextoAutor.setText("");
        InsertarTextoFechaInicioDia.setText("");
        InsertarTextoFechaInicioMes.setText("");
        InsertarTextoFechaInicioAño.setText("");
        InsertarTextoFechaFinDia.setText("");
        InsertarTextoFechaFinMes.setText("");
        InsertarTextoFechaFinAño.setText("");
    }
    
    /*
     * Cambia los Cuadros de Texto del Panel 'Modificar' a
     * activado o desactivado
     */
    
    public void ModificarActDesact(boolean aux){
        ModificarTextoGenero.setEnabled(aux);
        ModificarTextoCapitulosInicio.setEnabled(aux);
        ModificarTextoCapitulosFinal.setEnabled(aux);
        ModificarTextoOvasInicio.setEnabled(aux);
        ModificarTextoOvasFinal.setEnabled(aux);
        ModificarTextoResumen.setEnabled(aux);
        ModificarTextoAutor.setEnabled(aux);
        ModificarTextoFechaInicioDia.setEnabled(aux);
        ModificarTextoFechaInicioMes.setEnabled(aux);
        ModificarTextoFechaInicioAño.setEnabled(aux);
        ModificarTextoFechaFinDia.setEnabled(aux);
        ModificarTextoFechaFinMes.setEnabled(aux);
        ModificarTextoFechaFinAño.setEnabled(aux);
    }
    
    public VentanaPrincipal() {
        //this.setLocationRelativeTo(null);
        //this.setUndecorated(true);
        initComponents();
        Bienvenida1.setText("Bienvenido "+Login.TextoUser.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JLayeredPane();
        ContenedorMusica = new javax.swing.JLayeredPane();
        BotonMusica = new javax.swing.JButton();
        ContenedorPrincipal = new javax.swing.JLayeredPane();
        Bienvenida = new javax.swing.JButton();
        Bienvenida1 = new javax.swing.JButton();
        FondoPrincipal = new javax.swing.JLabel();
        ContenedorAñadir = new javax.swing.JLayeredPane();
        InsertarBotonBorrarCampos = new javax.swing.JButton();
        InsertarBotonInsertar = new javax.swing.JButton();
        InsertarEtiquetaOvaDe = new javax.swing.JLabel();
        InsertarEtiquetaNombre = new javax.swing.JLabel();
        InsertarEtiquetaGenero = new javax.swing.JLabel();
        InsertarEtiquetaNumCap = new javax.swing.JLabel();
        InsertarEtiquetaFecFin = new javax.swing.JLabel();
        InsertarEtiquetaCapDe = new javax.swing.JLabel();
        InsertarEtiquetaNumOva = new javax.swing.JLabel();
        InsertarEtiquetaResumen = new javax.swing.JLabel();
        InsertarEtiquetaAutor = new javax.swing.JLabel();
        InsertarEtiquetaFecInBarra1 = new javax.swing.JLabel();
        InsertarEtiquetaFecIn = new javax.swing.JLabel();
        InsertarEtiquetaFecInBarra2 = new javax.swing.JLabel();
        InsertarEtiquetaFecFinBarra1 = new javax.swing.JLabel();
        InsertarEtiquetaDemografia = new javax.swing.JLabel();
        InsertarEtiquetaFecFinBarra2 = new javax.swing.JLabel();
        PanelScroll = new javax.swing.JScrollPane();
        InsertarTextoResumen = new javax.swing.JTextArea();
        InsertarCajaDemografia = new javax.swing.JComboBox();
        InsertarTextoOvasFinal = new javax.swing.JTextField();
        InsertarTextoOvasInicio = new javax.swing.JTextField();
        InsertarTextoCapitulosFinal = new javax.swing.JTextField();
        InsertarTextoCapitulosInicio = new javax.swing.JTextField();
        InsertarTextoAutor = new javax.swing.JTextField();
        InsertarTextoFechaInicioAño = new javax.swing.JTextField();
        InsertarTextoGenero = new javax.swing.JTextField();
        InsertarTextoNombre = new javax.swing.JTextField();
        InsertarTextoFechaInicioDia = new javax.swing.JTextField();
        InsertarTextoFechaInicioMes = new javax.swing.JTextField();
        InsertarTextoFechaFinDia = new javax.swing.JTextField();
        InsertarTextoFechaFinMes = new javax.swing.JTextField();
        InsertarTextoFechaFinAño = new javax.swing.JTextField();
        FondoAñadir = new javax.swing.JLabel();
        ContenedorModificar = new javax.swing.JLayeredPane();
        ModificarBotonBorrar = new javax.swing.JButton();
        ModificarBotonModificar = new javax.swing.JButton();
        ModificarBotonBuscar = new javax.swing.JButton();
        ModificarEtiquetaOvaDe = new javax.swing.JLabel();
        ModificarEtiquetaNombre = new javax.swing.JLabel();
        ModificarEtiquetaGenero = new javax.swing.JLabel();
        ModificarEtiquetaNumCap = new javax.swing.JLabel();
        ModificarEtiquetaFecFin = new javax.swing.JLabel();
        ModificarEtiquetaCapDe = new javax.swing.JLabel();
        ModificarEtiquetaNumOva = new javax.swing.JLabel();
        ModificarEtiquetaResumen = new javax.swing.JLabel();
        ModificarEtiquetaAutor = new javax.swing.JLabel();
        ModificarEtiquetaFecInBarra2 = new javax.swing.JLabel();
        ModificarEtiquetaDemografia = new javax.swing.JLabel();
        ModificarEtiquetaFecIn = new javax.swing.JLabel();
        ModificarEtiquetaFecInBarra1 = new javax.swing.JLabel();
        ModificarEtiquetaFecFinBarra1 = new javax.swing.JLabel();
        ModificarEtiquetaFecFinBarra2 = new javax.swing.JLabel();
        PanelScroll1 = new javax.swing.JScrollPane();
        ModificarTextoResumen = new javax.swing.JTextArea();
        ModificarCajaDemografia = new javax.swing.JComboBox();
        ModificarTextoOvasFinal = new javax.swing.JTextField();
        ModificarTextoOvasInicio = new javax.swing.JTextField();
        ModificarTextoCapitulosFinal = new javax.swing.JTextField();
        ModificarTextoCapitulosInicio = new javax.swing.JTextField();
        ModificarTextoAutor = new javax.swing.JTextField();
        ModificarTextoFechaInicioAño = new javax.swing.JTextField();
        ModificarTextoGenero = new javax.swing.JTextField();
        ModificarTextoNombre = new javax.swing.JTextField();
        ModificarTextoFechaInicioDia = new javax.swing.JTextField();
        ModificarTextoFechaInicioMes = new javax.swing.JTextField();
        ModificarTextoFechaFinDia = new javax.swing.JTextField();
        ModificarTextoFechaFinMes = new javax.swing.JTextField();
        ModificarTextoFechaFinAño = new javax.swing.JTextField();
        FondoModificar = new javax.swing.JLabel();
        ContenedorBorrar = new javax.swing.JLayeredPane();
        BorrarBotonBorrar = new javax.swing.JButton();
        BorrarBotonBuscar = new javax.swing.JButton();
        BorrarEtiquetaOvaDe = new javax.swing.JLabel();
        BorrarEtiquetaNombre = new javax.swing.JLabel();
        BorrarEtiquetaGenero = new javax.swing.JLabel();
        BorrarEtiquetaNumCap = new javax.swing.JLabel();
        BorrarEtiquetaFecFin = new javax.swing.JLabel();
        BorrarEtiquetaCapDe = new javax.swing.JLabel();
        BorrarEtiquetaNumOva = new javax.swing.JLabel();
        BorrarEtiquetaResumen = new javax.swing.JLabel();
        BorrarEtiquetaAutor = new javax.swing.JLabel();
        BorrarEtiquetaFecInBarra2 = new javax.swing.JLabel();
        BorrarEtiquetaFecIn = new javax.swing.JLabel();
        BorrarEtiquetaDemografia = new javax.swing.JLabel();
        BorrarEtiquetaFecInBarra1 = new javax.swing.JLabel();
        BorrarEtiquetaFecFinBarra1 = new javax.swing.JLabel();
        BorrarEtiquetaFecFinBarra2 = new javax.swing.JLabel();
        PanelScroll2 = new javax.swing.JScrollPane();
        BorrarTextoResumen = new javax.swing.JTextArea();
        BorrarTextoOvasFinal = new javax.swing.JTextField();
        BorrarTextoOvasInicio = new javax.swing.JTextField();
        BorrarTextoCapitulosFinal = new javax.swing.JTextField();
        BorrarTextoCapitulosInicio = new javax.swing.JTextField();
        BorrarTextoAutor = new javax.swing.JTextField();
        BorrarTextoFechaInicioAño = new javax.swing.JTextField();
        BorrarTextoGenero = new javax.swing.JTextField();
        BorrarTextoNombre = new javax.swing.JTextField();
        BorrarTextoFechaInicioDia = new javax.swing.JTextField();
        BorrarTextoFechaInicioMes = new javax.swing.JTextField();
        BorrarTextoFechaFinDia = new javax.swing.JTextField();
        BorrarTextoFechaFinMes = new javax.swing.JTextField();
        BorrarTextoFechaFinAño = new javax.swing.JTextField();
        BorrarTextoDemografia = new javax.swing.JTextField();
        FondoBorrar = new javax.swing.JLabel();
        ContenedorListado = new javax.swing.JLayeredPane();
        ListadoBotonBuscar = new javax.swing.JButton();
        ListadoScrollPanel = new javax.swing.JScrollPane();
        ListadoTexto = new javax.swing.JTextArea();
        ListadoEtiquetaTipo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        FondoListado = new javax.swing.JLabel();
        BarraMenus = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Inicio = new javax.swing.JMenuItem();
        Separador5 = new javax.swing.JPopupMenu.Separator();
        Exportar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Ayuda = new javax.swing.JMenuItem();
        Separador = new javax.swing.JPopupMenu.Separator();
        Salir = new javax.swing.JMenuItem();
        Edicion = new javax.swing.JMenu();
        Añadir = new javax.swing.JMenuItem();
        Separador2 = new javax.swing.JPopupMenu.Separator();
        Modificar = new javax.swing.JMenuItem();
        Separador3 = new javax.swing.JPopupMenu.Separator();
        Borrar = new javax.swing.JMenuItem();
        Separador4 = new javax.swing.JPopupMenu.Separator();
        Listado = new javax.swing.JMenuItem();
        Opciones = new javax.swing.JMenu();
        Recordatorio = new javax.swing.JMenuItem();
        VisualizarAnotaciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Biblioteca Anime");
        setMinimumSize(new java.awt.Dimension(655, 340));

        BotonMusica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sonido On.png"))); // NOI18N
        BotonMusica.setFocusPainted(false);
        BotonMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMusicaActionPerformed(evt);
            }
        });
        BotonMusica.setBounds(10, 270, 40, 40);
        ContenedorMusica.add(BotonMusica, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorMusica.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorMusica, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Bienvenida.setText("La Biblioteca del Anime");
        Bienvenida.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bienvenida.setEnabled(false);
        Bienvenida.setBounds(430, 260, 200, 40);
        ContenedorPrincipal.add(Bienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Bienvenida1.setBackground(new java.awt.Color(204, 204, 255));
        Bienvenida1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bienvenida1.setEnabled(false);
        Bienvenida1.setBounds(200, 260, 200, 40);
        ContenedorPrincipal.add(Bienvenida1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Luffy VS Goku.png"))); // NOI18N
        FondoPrincipal.setBounds(0, 0, 660, 320);
        ContenedorPrincipal.add(FondoPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorPrincipal.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarBotonBorrarCampos.setBackground(new java.awt.Color(230, 230, 230));
        InsertarBotonBorrarCampos.setText("Borrar Campos");
        InsertarBotonBorrarCampos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarBotonBorrarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InsertarBotonBorrarCampos.setFocusPainted(false);
        InsertarBotonBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBotonBorrarCamposActionPerformed(evt);
            }
        });
        InsertarBotonBorrarCampos.setBounds(490, 270, 150, 30);
        ContenedorAñadir.add(InsertarBotonBorrarCampos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarBotonInsertar.setBackground(new java.awt.Color(230, 230, 230));
        InsertarBotonInsertar.setText("Insertar");
        InsertarBotonInsertar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarBotonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InsertarBotonInsertar.setFocusPainted(false);
        InsertarBotonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarBotonInsertarActionPerformed(evt);
            }
        });
        InsertarBotonInsertar.setBounds(490, 220, 150, 30);
        ContenedorAñadir.add(InsertarBotonInsertar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaOvaDe.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaOvaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaOvaDe.setText("de");
        InsertarEtiquetaOvaDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaOvaDe.setOpaque(true);
        InsertarEtiquetaOvaDe.setBounds(190, 170, 60, 30);
        ContenedorAñadir.add(InsertarEtiquetaOvaDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaNombre.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaNombre.setText("Nombre");
        InsertarEtiquetaNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaNombre.setOpaque(true);
        InsertarEtiquetaNombre.setBounds(10, 20, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaGenero.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaGenero.setText("Género");
        InsertarEtiquetaGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaGenero.setOpaque(true);
        InsertarEtiquetaGenero.setBounds(10, 70, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaNumCap.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaNumCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaNumCap.setText("Nº Capítulos");
        InsertarEtiquetaNumCap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaNumCap.setOpaque(true);
        InsertarEtiquetaNumCap.setBounds(10, 120, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaNumCap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecFin.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecFin.setText("Fecha Fin");
        InsertarEtiquetaFecFin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaFecFin.setOpaque(true);
        InsertarEtiquetaFecFin.setBounds(340, 120, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecFin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaCapDe.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaCapDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaCapDe.setText("de");
        InsertarEtiquetaCapDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaCapDe.setOpaque(true);
        InsertarEtiquetaCapDe.setBounds(190, 120, 60, 30);
        ContenedorAñadir.add(InsertarEtiquetaCapDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaNumOva.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaNumOva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaNumOva.setText("Nº OVAS");
        InsertarEtiquetaNumOva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaNumOva.setOpaque(true);
        InsertarEtiquetaNumOva.setBounds(10, 170, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaNumOva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaResumen.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaResumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaResumen.setText("Resumen");
        InsertarEtiquetaResumen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaResumen.setOpaque(true);
        InsertarEtiquetaResumen.setBounds(10, 220, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaResumen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaAutor.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaAutor.setText("Autor");
        InsertarEtiquetaAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaAutor.setOpaque(true);
        InsertarEtiquetaAutor.setBounds(340, 20, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecInBarra1.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecInBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecInBarra1.setText("/");
        InsertarEtiquetaFecInBarra1.setOpaque(true);
        InsertarEtiquetaFecInBarra1.setBounds(550, 70, 30, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecInBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecIn.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecIn.setText("Fecha Inicio");
        InsertarEtiquetaFecIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaFecIn.setOpaque(true);
        InsertarEtiquetaFecIn.setBounds(340, 70, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecInBarra2.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecInBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecInBarra2.setText("/");
        InsertarEtiquetaFecInBarra2.setOpaque(true);
        InsertarEtiquetaFecInBarra2.setBounds(490, 70, 30, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecInBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecFinBarra1.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecFinBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecFinBarra1.setText("/");
        InsertarEtiquetaFecFinBarra1.setOpaque(true);
        InsertarEtiquetaFecFinBarra1.setBounds(490, 120, 30, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecFinBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaDemografia.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaDemografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaDemografia.setText("Demografia");
        InsertarEtiquetaDemografia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InsertarEtiquetaDemografia.setOpaque(true);
        InsertarEtiquetaDemografia.setBounds(340, 170, 100, 30);
        ContenedorAñadir.add(InsertarEtiquetaDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarEtiquetaFecFinBarra2.setBackground(new java.awt.Color(157, 157, 255));
        InsertarEtiquetaFecFinBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsertarEtiquetaFecFinBarra2.setText("/");
        InsertarEtiquetaFecFinBarra2.setOpaque(true);
        InsertarEtiquetaFecFinBarra2.setBounds(550, 120, 30, 30);
        ContenedorAñadir.add(InsertarEtiquetaFecFinBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        InsertarTextoResumen.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoResumen.setColumns(20);
        InsertarTextoResumen.setLineWrap(true);
        InsertarTextoResumen.setRows(5);
        InsertarTextoResumen.setAutoscrolls(false);
        InsertarTextoResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PanelScroll.setViewportView(InsertarTextoResumen);

        PanelScroll.setBounds(130, 220, 310, 90);
        ContenedorAñadir.add(PanelScroll, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarCajaDemografia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shonen", "Seinen", "Kodomo", "Shojo", "Josei" }));
        InsertarCajaDemografia.setBounds(460, 170, 130, 30);
        ContenedorAñadir.add(InsertarCajaDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoOvasFinal.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoOvasFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoOvasFinal.setBounds(260, 170, 60, 30);
        ContenedorAñadir.add(InsertarTextoOvasFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoOvasInicio.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoOvasInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoOvasInicio.setBounds(130, 170, 50, 30);
        ContenedorAñadir.add(InsertarTextoOvasInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoCapitulosFinal.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoCapitulosFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoCapitulosFinal.setBounds(260, 120, 60, 30);
        ContenedorAñadir.add(InsertarTextoCapitulosFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoCapitulosInicio.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoCapitulosInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoCapitulosInicio.setBounds(130, 120, 50, 30);
        ContenedorAñadir.add(InsertarTextoCapitulosInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoAutor.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoAutor.setBounds(460, 20, 190, 30);
        ContenedorAñadir.add(InsertarTextoAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaInicioAño.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaInicioAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaInicioAño.setBounds(580, 70, 70, 30);
        ContenedorAñadir.add(InsertarTextoFechaInicioAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoGenero.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoGenero.setBounds(130, 70, 190, 30);
        ContenedorAñadir.add(InsertarTextoGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoNombre.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoNombre.setBounds(130, 20, 190, 30);
        ContenedorAñadir.add(InsertarTextoNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaInicioDia.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaInicioDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaInicioDia.setBounds(460, 70, 30, 30);
        ContenedorAñadir.add(InsertarTextoFechaInicioDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaInicioMes.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaInicioMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaInicioMes.setBounds(520, 70, 30, 30);
        ContenedorAñadir.add(InsertarTextoFechaInicioMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaFinDia.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaFinDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaFinDia.setBounds(460, 120, 30, 30);
        ContenedorAñadir.add(InsertarTextoFechaFinDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaFinMes.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaFinMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaFinMes.setBounds(520, 120, 30, 30);
        ContenedorAñadir.add(InsertarTextoFechaFinMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        InsertarTextoFechaFinAño.setBackground(new java.awt.Color(243, 221, 182));
        InsertarTextoFechaFinAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        InsertarTextoFechaFinAño.setBounds(580, 120, 70, 30);
        ContenedorAñadir.add(InsertarTextoFechaFinAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FondoAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cartel Goku y Luffy.jpg"))); // NOI18N
        FondoAñadir.setBounds(0, 0, 660, 320);
        ContenedorAñadir.add(FondoAñadir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorAñadir.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorAñadir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarBotonBorrar.setBackground(new java.awt.Color(230, 230, 230));
        ModificarBotonBorrar.setText("Borrar Campos");
        ModificarBotonBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarBotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarBotonBorrar.setFocusPainted(false);
        ModificarBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBotonBorrarActionPerformed(evt);
            }
        });
        ModificarBotonBorrar.setBounds(560, 270, 100, 30);
        ContenedorModificar.add(ModificarBotonBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarBotonModificar.setBackground(new java.awt.Color(230, 230, 230));
        ModificarBotonModificar.setText("Modificar");
        ModificarBotonModificar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarBotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarBotonModificar.setFocusPainted(false);
        ModificarBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBotonModificarActionPerformed(evt);
            }
        });
        ModificarBotonModificar.setBounds(490, 230, 150, 30);
        ContenedorModificar.add(ModificarBotonModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarBotonBuscar.setBackground(new java.awt.Color(230, 230, 230));
        ModificarBotonBuscar.setText("Buscar");
        ModificarBotonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarBotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarBotonBuscar.setFocusPainted(false);
        ModificarBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarBotonBuscarActionPerformed(evt);
            }
        });
        ModificarBotonBuscar.setBounds(460, 270, 90, 30);
        ContenedorModificar.add(ModificarBotonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaOvaDe.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaOvaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaOvaDe.setText("de");
        ModificarEtiquetaOvaDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaOvaDe.setOpaque(true);
        ModificarEtiquetaOvaDe.setBounds(190, 170, 60, 30);
        ContenedorModificar.add(ModificarEtiquetaOvaDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaNombre.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaNombre.setText("Nombre");
        ModificarEtiquetaNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaNombre.setOpaque(true);
        ModificarEtiquetaNombre.setBounds(10, 20, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaGenero.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaGenero.setText("Género");
        ModificarEtiquetaGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaGenero.setOpaque(true);
        ModificarEtiquetaGenero.setBounds(10, 70, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaNumCap.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaNumCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaNumCap.setText("Nº Capítulos");
        ModificarEtiquetaNumCap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaNumCap.setOpaque(true);
        ModificarEtiquetaNumCap.setBounds(10, 120, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaNumCap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecFin.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecFin.setText("Fecha Fin");
        ModificarEtiquetaFecFin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaFecFin.setOpaque(true);
        ModificarEtiquetaFecFin.setBounds(340, 120, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaFecFin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaCapDe.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaCapDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaCapDe.setText("de");
        ModificarEtiquetaCapDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaCapDe.setOpaque(true);
        ModificarEtiquetaCapDe.setBounds(190, 120, 60, 30);
        ContenedorModificar.add(ModificarEtiquetaCapDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaNumOva.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaNumOva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaNumOva.setText("Nº OVAS");
        ModificarEtiquetaNumOva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaNumOva.setOpaque(true);
        ModificarEtiquetaNumOva.setBounds(10, 170, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaNumOva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaResumen.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaResumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaResumen.setText("Resumen");
        ModificarEtiquetaResumen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaResumen.setOpaque(true);
        ModificarEtiquetaResumen.setBounds(10, 220, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaResumen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaAutor.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaAutor.setText("Autor");
        ModificarEtiquetaAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaAutor.setOpaque(true);
        ModificarEtiquetaAutor.setBounds(340, 20, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecInBarra2.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecInBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecInBarra2.setText("/");
        ModificarEtiquetaFecInBarra2.setOpaque(true);
        ModificarEtiquetaFecInBarra2.setBounds(550, 70, 30, 30);
        ContenedorModificar.add(ModificarEtiquetaFecInBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaDemografia.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaDemografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaDemografia.setText("Demografia");
        ModificarEtiquetaDemografia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaDemografia.setOpaque(true);
        ModificarEtiquetaDemografia.setBounds(340, 170, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecIn.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecIn.setText("Fecha Inicio");
        ModificarEtiquetaFecIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ModificarEtiquetaFecIn.setOpaque(true);
        ModificarEtiquetaFecIn.setBounds(340, 70, 100, 30);
        ContenedorModificar.add(ModificarEtiquetaFecIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecInBarra1.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecInBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecInBarra1.setText("/");
        ModificarEtiquetaFecInBarra1.setOpaque(true);
        ModificarEtiquetaFecInBarra1.setBounds(490, 70, 30, 30);
        ContenedorModificar.add(ModificarEtiquetaFecInBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecFinBarra1.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecFinBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecFinBarra1.setText("/");
        ModificarEtiquetaFecFinBarra1.setOpaque(true);
        ModificarEtiquetaFecFinBarra1.setBounds(490, 120, 30, 30);
        ContenedorModificar.add(ModificarEtiquetaFecFinBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarEtiquetaFecFinBarra2.setBackground(new java.awt.Color(157, 157, 255));
        ModificarEtiquetaFecFinBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModificarEtiquetaFecFinBarra2.setText("/");
        ModificarEtiquetaFecFinBarra2.setOpaque(true);
        ModificarEtiquetaFecFinBarra2.setBounds(550, 120, 30, 30);
        ContenedorModificar.add(ModificarEtiquetaFecFinBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelScroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ModificarTextoResumen.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoResumen.setColumns(20);
        ModificarTextoResumen.setLineWrap(true);
        ModificarTextoResumen.setRows(5);
        ModificarTextoResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoResumen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoResumen.setEnabled(false);
        PanelScroll1.setViewportView(ModificarTextoResumen);

        PanelScroll1.setBounds(130, 220, 310, 90);
        ContenedorModificar.add(PanelScroll1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarCajaDemografia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Shonen", "Seinen", "Kodomo", "Shojo", "Josei" }));
        ModificarCajaDemografia.setBounds(460, 170, 150, 30);
        ContenedorModificar.add(ModificarCajaDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoOvasFinal.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoOvasFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoOvasFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoOvasFinal.setEnabled(false);
        ModificarTextoOvasFinal.setBounds(260, 170, 60, 30);
        ContenedorModificar.add(ModificarTextoOvasFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoOvasInicio.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoOvasInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoOvasInicio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoOvasInicio.setEnabled(false);
        ModificarTextoOvasInicio.setBounds(130, 170, 50, 30);
        ContenedorModificar.add(ModificarTextoOvasInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoCapitulosFinal.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoCapitulosFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoCapitulosFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoCapitulosFinal.setEnabled(false);
        ModificarTextoCapitulosFinal.setBounds(260, 120, 60, 30);
        ContenedorModificar.add(ModificarTextoCapitulosFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoCapitulosInicio.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoCapitulosInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoCapitulosInicio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoCapitulosInicio.setEnabled(false);
        ModificarTextoCapitulosInicio.setBounds(130, 120, 50, 30);
        ContenedorModificar.add(ModificarTextoCapitulosInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoAutor.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoAutor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoAutor.setEnabled(false);
        ModificarTextoAutor.setBounds(460, 20, 190, 30);
        ContenedorModificar.add(ModificarTextoAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaInicioAño.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaInicioAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaInicioAño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaInicioAño.setEnabled(false);
        ModificarTextoFechaInicioAño.setBounds(580, 70, 70, 30);
        ContenedorModificar.add(ModificarTextoFechaInicioAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoGenero.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoGenero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoGenero.setEnabled(false);
        ModificarTextoGenero.setBounds(130, 70, 190, 30);
        ContenedorModificar.add(ModificarTextoGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoNombre.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoNombre.setBounds(130, 20, 190, 30);
        ContenedorModificar.add(ModificarTextoNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaInicioDia.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaInicioDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaInicioDia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaInicioDia.setEnabled(false);
        ModificarTextoFechaInicioDia.setBounds(460, 70, 30, 30);
        ContenedorModificar.add(ModificarTextoFechaInicioDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaInicioMes.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaInicioMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaInicioMes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaInicioMes.setEnabled(false);
        ModificarTextoFechaInicioMes.setBounds(520, 70, 30, 30);
        ContenedorModificar.add(ModificarTextoFechaInicioMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaFinDia.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaFinDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaFinDia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaFinDia.setEnabled(false);
        ModificarTextoFechaFinDia.setBounds(460, 120, 30, 30);
        ContenedorModificar.add(ModificarTextoFechaFinDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaFinMes.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaFinMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaFinMes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaFinMes.setEnabled(false);
        ModificarTextoFechaFinMes.setBounds(520, 120, 30, 30);
        ContenedorModificar.add(ModificarTextoFechaFinMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ModificarTextoFechaFinAño.setBackground(new java.awt.Color(243, 221, 182));
        ModificarTextoFechaFinAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ModificarTextoFechaFinAño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ModificarTextoFechaFinAño.setEnabled(false);
        ModificarTextoFechaFinAño.setBounds(580, 120, 70, 30);
        ContenedorModificar.add(ModificarTextoFechaFinAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FondoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Goku VS Luffy.jpg"))); // NOI18N
        FondoModificar.setBounds(0, 0, 660, 320);
        ContenedorModificar.add(FondoModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorModificar.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarBotonBorrar.setBackground(new java.awt.Color(230, 230, 230));
        BorrarBotonBorrar.setText("Borrar");
        BorrarBotonBorrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarBotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarBotonBorrar.setFocusPainted(false);
        BorrarBotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBotonBorrarActionPerformed(evt);
            }
        });
        BorrarBotonBorrar.setBounds(490, 270, 150, 30);
        ContenedorBorrar.add(BorrarBotonBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarBotonBuscar.setBackground(new java.awt.Color(230, 230, 230));
        BorrarBotonBuscar.setText("Buscar");
        BorrarBotonBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarBotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BorrarBotonBuscar.setFocusPainted(false);
        BorrarBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarBotonBuscarActionPerformed(evt);
            }
        });
        BorrarBotonBuscar.setBounds(490, 220, 150, 30);
        ContenedorBorrar.add(BorrarBotonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaOvaDe.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaOvaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaOvaDe.setText("de");
        BorrarEtiquetaOvaDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaOvaDe.setOpaque(true);
        BorrarEtiquetaOvaDe.setBounds(190, 170, 60, 30);
        ContenedorBorrar.add(BorrarEtiquetaOvaDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaNombre.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaNombre.setText("Nombre");
        BorrarEtiquetaNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaNombre.setOpaque(true);
        BorrarEtiquetaNombre.setBounds(10, 20, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaGenero.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaGenero.setText("Género");
        BorrarEtiquetaGenero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaGenero.setOpaque(true);
        BorrarEtiquetaGenero.setBounds(10, 70, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaNumCap.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaNumCap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaNumCap.setText("Nº Capítulos");
        BorrarEtiquetaNumCap.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaNumCap.setOpaque(true);
        BorrarEtiquetaNumCap.setBounds(10, 120, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaNumCap, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecFin.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecFin.setText("Fecha Fin");
        BorrarEtiquetaFecFin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaFecFin.setOpaque(true);
        BorrarEtiquetaFecFin.setBounds(340, 120, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecFin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaCapDe.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaCapDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaCapDe.setText("de");
        BorrarEtiquetaCapDe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaCapDe.setOpaque(true);
        BorrarEtiquetaCapDe.setBounds(190, 120, 60, 30);
        ContenedorBorrar.add(BorrarEtiquetaCapDe, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaNumOva.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaNumOva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaNumOva.setText("Nº OVAS");
        BorrarEtiquetaNumOva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaNumOva.setOpaque(true);
        BorrarEtiquetaNumOva.setBounds(10, 170, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaNumOva, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaResumen.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaResumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaResumen.setText("Resumen");
        BorrarEtiquetaResumen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaResumen.setOpaque(true);
        BorrarEtiquetaResumen.setBounds(10, 220, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaResumen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaAutor.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaAutor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaAutor.setText("Autor");
        BorrarEtiquetaAutor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaAutor.setOpaque(true);
        BorrarEtiquetaAutor.setBounds(340, 20, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecInBarra2.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecInBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecInBarra2.setText("/");
        BorrarEtiquetaFecInBarra2.setOpaque(true);
        BorrarEtiquetaFecInBarra2.setBounds(550, 70, 30, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecInBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecIn.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecIn.setText("Fecha Inicio");
        BorrarEtiquetaFecIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaFecIn.setOpaque(true);
        BorrarEtiquetaFecIn.setBounds(340, 70, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecIn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaDemografia.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaDemografia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaDemografia.setText("Demografia");
        BorrarEtiquetaDemografia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BorrarEtiquetaDemografia.setOpaque(true);
        BorrarEtiquetaDemografia.setBounds(340, 170, 100, 30);
        ContenedorBorrar.add(BorrarEtiquetaDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecInBarra1.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecInBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecInBarra1.setText("/");
        BorrarEtiquetaFecInBarra1.setOpaque(true);
        BorrarEtiquetaFecInBarra1.setBounds(490, 70, 30, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecInBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecFinBarra1.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecFinBarra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecFinBarra1.setText("/");
        BorrarEtiquetaFecFinBarra1.setOpaque(true);
        BorrarEtiquetaFecFinBarra1.setBounds(490, 120, 30, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecFinBarra1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarEtiquetaFecFinBarra2.setBackground(new java.awt.Color(157, 157, 255));
        BorrarEtiquetaFecFinBarra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BorrarEtiquetaFecFinBarra2.setText("/");
        BorrarEtiquetaFecFinBarra2.setOpaque(true);
        BorrarEtiquetaFecFinBarra2.setBounds(550, 120, 30, 30);
        ContenedorBorrar.add(BorrarEtiquetaFecFinBarra2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelScroll2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        BorrarTextoResumen.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoResumen.setColumns(20);
        BorrarTextoResumen.setLineWrap(true);
        BorrarTextoResumen.setRows(5);
        BorrarTextoResumen.setAutoscrolls(false);
        BorrarTextoResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoResumen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoResumen.setEnabled(false);
        PanelScroll2.setViewportView(BorrarTextoResumen);

        PanelScroll2.setBounds(130, 220, 310, 90);
        ContenedorBorrar.add(PanelScroll2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoOvasFinal.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoOvasFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoOvasFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoOvasFinal.setEnabled(false);
        BorrarTextoOvasFinal.setBounds(260, 170, 60, 30);
        ContenedorBorrar.add(BorrarTextoOvasFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoOvasInicio.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoOvasInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoOvasInicio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoOvasInicio.setEnabled(false);
        BorrarTextoOvasInicio.setBounds(130, 170, 50, 30);
        ContenedorBorrar.add(BorrarTextoOvasInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoCapitulosFinal.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoCapitulosFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoCapitulosFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoCapitulosFinal.setEnabled(false);
        BorrarTextoCapitulosFinal.setBounds(260, 120, 60, 30);
        ContenedorBorrar.add(BorrarTextoCapitulosFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoCapitulosInicio.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoCapitulosInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoCapitulosInicio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoCapitulosInicio.setEnabled(false);
        BorrarTextoCapitulosInicio.setBounds(130, 120, 50, 30);
        ContenedorBorrar.add(BorrarTextoCapitulosInicio, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoAutor.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoAutor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoAutor.setEnabled(false);
        BorrarTextoAutor.setBounds(460, 20, 190, 30);
        ContenedorBorrar.add(BorrarTextoAutor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaInicioAño.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaInicioAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaInicioAño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaInicioAño.setEnabled(false);
        BorrarTextoFechaInicioAño.setBounds(580, 70, 70, 30);
        ContenedorBorrar.add(BorrarTextoFechaInicioAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoGenero.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoGenero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoGenero.setEnabled(false);
        BorrarTextoGenero.setBounds(130, 70, 190, 30);
        ContenedorBorrar.add(BorrarTextoGenero, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoNombre.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoNombre.setBounds(130, 20, 190, 30);
        ContenedorBorrar.add(BorrarTextoNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaInicioDia.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaInicioDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaInicioDia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaInicioDia.setEnabled(false);
        BorrarTextoFechaInicioDia.setBounds(460, 70, 30, 30);
        ContenedorBorrar.add(BorrarTextoFechaInicioDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaInicioMes.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaInicioMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaInicioMes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaInicioMes.setEnabled(false);
        BorrarTextoFechaInicioMes.setBounds(520, 70, 30, 30);
        ContenedorBorrar.add(BorrarTextoFechaInicioMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaFinDia.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaFinDia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaFinDia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaFinDia.setEnabled(false);
        BorrarTextoFechaFinDia.setBounds(460, 120, 30, 30);
        ContenedorBorrar.add(BorrarTextoFechaFinDia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaFinMes.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaFinMes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaFinMes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaFinMes.setEnabled(false);
        BorrarTextoFechaFinMes.setBounds(520, 120, 30, 30);
        ContenedorBorrar.add(BorrarTextoFechaFinMes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoFechaFinAño.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoFechaFinAño.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoFechaFinAño.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoFechaFinAño.setEnabled(false);
        BorrarTextoFechaFinAño.setBounds(580, 120, 70, 30);
        ContenedorBorrar.add(BorrarTextoFechaFinAño, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BorrarTextoDemografia.setBackground(new java.awt.Color(243, 221, 182));
        BorrarTextoDemografia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        BorrarTextoDemografia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BorrarTextoDemografia.setEnabled(false);
        BorrarTextoDemografia.setBounds(460, 170, 190, 30);
        ContenedorBorrar.add(BorrarTextoDemografia, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FondoBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mirai Nikki (1).jpg"))); // NOI18N
        FondoBorrar.setBounds(0, 0, 660, 320);
        ContenedorBorrar.add(FondoBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorBorrar.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ListadoBotonBuscar.setBackground(new java.awt.Color(157, 157, 255));
        ListadoBotonBuscar.setText("Buscar");
        ListadoBotonBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListadoBotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ListadoBotonBuscar.setFocusPainted(false);
        ListadoBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoBotonBuscarActionPerformed(evt);
            }
        });
        ListadoBotonBuscar.setBounds(50, 90, 150, 30);
        ContenedorListado.add(ListadoBotonBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ListadoTexto.setBackground(new java.awt.Color(157, 157, 255));
        ListadoTexto.setColumns(20);
        ListadoTexto.setRows(5);
        ListadoTexto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ListadoTexto.setEnabled(false);
        ListadoScrollPanel.setViewportView(ListadoTexto);

        ListadoScrollPanel.setBounds(60, 180, 580, 130);
        ContenedorListado.add(ListadoScrollPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ListadoEtiquetaTipo.setBackground(new java.awt.Color(157, 157, 255));
        ListadoEtiquetaTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListadoEtiquetaTipo.setText("Tipo de Busqueda");
        ListadoEtiquetaTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListadoEtiquetaTipo.setOpaque(true);
        ListadoEtiquetaTipo.setBounds(50, 20, 150, 30);
        ContenedorListado.add(ListadoEtiquetaTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setBackground(new java.awt.Color(157, 157, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Nombre", "Autor", "FechaInicio", "FechaFin", "Genero", "Modificado Por", "Demografia" }));
        jComboBox1.setBounds(230, 20, 130, 30);
        ContenedorListado.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setBackground(new java.awt.Color(157, 157, 255));
        jTextField1.setBounds(390, 20, 220, 30);
        ContenedorListado.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        FondoListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/la-ley-de-Ueki.jpg"))); // NOI18N
        FondoListado.setBounds(0, 0, 660, 320);
        ContenedorListado.add(FondoListado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ContenedorListado.setBounds(0, 0, 660, 320);
        Contenedor.add(ContenedorListado, javax.swing.JLayeredPane.DEFAULT_LAYER);

        BarraMenus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BarraMenus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Archivo.setText("Archivo");

        Inicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        Archivo.add(Inicio);
        Archivo.add(Separador5);

        Exportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Exportar.setText("Exportar");
        Exportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });
        Archivo.add(Exportar);
        Archivo.add(jSeparator1);

        Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        Ayuda.setText("Ayuda");
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        Archivo.add(Ayuda);
        Archivo.add(Separador);

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Archivo.add(Salir);

        BarraMenus.add(Archivo);

        Edicion.setText("Edicion");

        Añadir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Añadir.setText("Añadir Anime");
        Añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        Edicion.add(Añadir);
        Edicion.add(Separador2);

        Modificar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        Modificar.setText("Modificar Anime");
        Modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        Edicion.add(Modificar);
        Edicion.add(Separador3);

        Borrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Borrar.setText("Borrar Anime");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        Edicion.add(Borrar);
        Edicion.add(Separador4);

        Listado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Listado.setText("Obtener Listado");
        Listado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadoActionPerformed(evt);
            }
        });
        Edicion.add(Listado);

        BarraMenus.add(Edicion);

        Opciones.setText("Opciones");

        Recordatorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Recordatorio.setText("Anotaciones");
        Recordatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordatorioActionPerformed(evt);
            }
        });
        Opciones.add(Recordatorio);

        VisualizarAnotaciones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        VisualizarAnotaciones.setText("Ver Notas");
        VisualizarAnotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarAnotacionesActionPerformed(evt);
            }
        });
        Opciones.add(VisualizarAnotaciones);

        BarraMenus.add(Opciones);

        setJMenuBar(BarraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        /*
         * Cierra el programa
         */
        
        System.exit(0);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void BotonMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMusicaActionPerformed
        
        /*
         * Crea una ventana con el reproductor de musica
         * Si ya se ha pulsado antes, solo la hace visible
         */
        
        ReproductorMusica rm=new ReproductorMusica();
        rm.setResizable(false);
        if(reproductor==0){
            rm.setVisible(true);
        }
    }//GEN-LAST:event_BotonMusicaActionPerformed

    private void InsertarBotonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBotonInsertarActionPerformed
        /*
         * Insertar Datos en la Tabla
         */
        
        String FInicio="",FFin="",FFDia="",FFMes="",FIDia="",FIMes="";
        int OvaInicio=0, OvaFinal=0;
        if(InsertarTextoNombre.getText().equals("")==false||InsertarTextoGenero.getText().equals("")==false||
           InsertarTextoCapitulosInicio.getText().equals("")==false||InsertarTextoCapitulosFinal.getText().equals("")==false||
           InsertarTextoResumen.getText().equals("")==false||InsertarTextoAutor.getText().equals("")==false||
           InsertarTextoFechaInicioDia.getText().equals("")==false||InsertarTextoFechaInicioMes.getText().equals("")==false||
           InsertarTextoFechaInicioAño.getText().equals("")==false){
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           Connection conexion = null;
            try {
                conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           Statement sentenciaSQL = null;
            try {
                sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           if(InsertarTextoFechaInicioDia.getText().length()==1){
               FIDia=0+InsertarTextoFechaInicioDia.getText();
           }else{
               FIDia=InsertarTextoFechaInicioDia.getText();
           }
           if(InsertarTextoFechaInicioMes.getText().length()==1){
               FIMes=0+InsertarTextoFechaInicioMes.getText();
           }else{
               FIMes=InsertarTextoFechaInicioMes.getText();
           }
           FInicio=FIDia+"/"+FIMes+"/"+InsertarTextoFechaInicioAño.getText();
           if(InsertarTextoFechaFinDia.getText().equals("")==false){
                if(InsertarTextoFechaFinDia.getText().length()==1){
                    FFDia=0+InsertarTextoFechaFinDia.getText();
                }else{
                    FFDia=InsertarTextoFechaFinDia.getText();
                }
                if(InsertarTextoFechaFinMes.getText().length()==1){
                   FFMes=0+InsertarTextoFechaFinMes.getText();
                }else{
                   FFMes=InsertarTextoFechaFinMes.getText();
                }
                FFin=FFDia+"/"+FFMes+"/"+InsertarTextoFechaFinAño.getText();
           }else{
                FFin="null";
           }
           if(InsertarTextoOvasInicio.getText().equals("")==false){
               try{
                OvaInicio=Integer.parseInt(InsertarTextoOvasInicio.getText());
               }catch(Exception ex){
                   javax.swing.JOptionPane.showMessageDialog(this, "Error! Insertado Caracter en Entero");
               }
           }else{
                OvaInicio=0;
           }
           if(InsertarTextoOvasFinal.getText().equals("")==false){
               try{
                OvaFinal=Integer.parseInt(InsertarTextoOvasFinal.getText());
               }catch(Exception ex){
                   javax.swing.JOptionPane.showMessageDialog(this, "Error! Insertado Caracter en Entero");
               }
           }else{
                OvaFinal=0;
           }
            try {
                sentenciaSQL.executeUpdate("INSERT INTO Animes (Nombre, CapitulosExistentes, CapitulosPoseidos, Resumen, FechaInicio, FechaFin, Autor, Genero, OvasExistentes, OvasPoseidas, UltimaModificacion, Demografia)"
                        + "VALUES('"+InsertarTextoNombre.getText()+"',"+Integer.parseInt(InsertarTextoCapitulosFinal.getText())+","+Integer.parseInt(InsertarTextoCapitulosInicio.getText())
                        + ",'"+InsertarTextoResumen.getText()+"','"+FInicio+"','"+FFin+"','"+InsertarTextoAutor.getText()+"','"+InsertarTextoGenero.getText()+"',"+OvaFinal+","+OvaInicio+", '"+Login.TextoUser.getText()+"', '"+InsertarCajaDemografia.getSelectedItem().toString()+"')");
                LimpiarCamposInsertar();
                javax.swing.JOptionPane.showMessageDialog(this, "Insertado Correctamente");
            } catch (SQLException ex) {   
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Insertar Datos!");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Error! Faltan Datos Importantes");
        }
    }//GEN-LAST:event_InsertarBotonInsertarActionPerformed

    private void InsertarBotonBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarBotonBorrarCamposActionPerformed
        /*
         * Limpiar Campos del Panel Borrar
         */
        
        LimpiarCamposInsertar();
    }//GEN-LAST:event_InsertarBotonBorrarCamposActionPerformed

    private void ModificarBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBotonBuscarActionPerformed
        /*
         * Sacar los Datos del Panel Modificar
         */
        
        String Inic="", Fin="";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        try {
            resultado = sentenciaSQL.executeQuery("SELECT * FROM Animes");
            resultado.next();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            do{
                if(resultado.getString(1).equals(ModificarTextoNombre.getText())==true){
                    ModificarActDesact(true);
                    Inic=resultado.getString(5);
                    Fin=resultado.getString(6);
                    ModificarTextoGenero.setText(resultado.getString(8));
                    ModificarTextoCapitulosInicio.setText(""+resultado.getInt(3));
                    ModificarTextoCapitulosFinal.setText(""+resultado.getInt(2));
                    ModificarTextoOvasInicio.setText(""+resultado.getInt(10));
                    ModificarTextoOvasFinal.setText(""+resultado.getInt(9));
                    ModificarTextoResumen.setText(resultado.getString(4));
                    ModificarTextoAutor.setText(resultado.getString(7));
                    ModificarTextoFechaInicioDia.setText(Inic.substring(0, 2));
                    ModificarTextoFechaInicioMes.setText(Inic.substring(3, 5));
                    ModificarTextoFechaInicioAño.setText(Inic.substring(6, 10));
                    if(Fin.equals("null")==true){
                        ModificarTextoFechaFinDia.setText("");
                        ModificarTextoFechaFinMes.setText("");
                        ModificarTextoFechaFinAño.setText("");
                    }else{
                        ModificarTextoFechaFinDia.setText(Fin.substring(0, 2));
                        ModificarTextoFechaFinMes.setText(Fin.substring(3, 5));
                        ModificarTextoFechaFinAño.setText(Fin.substring(6, 10));
                        Inic=""; Fin="";
                    }
                    if(resultado.getString(12).equals("Shonen")){
                        ModificarCajaDemografia.setSelectedIndex(0);
                    }else{
                        if(resultado.getString(12).equals("Seinen")){
                        ModificarCajaDemografia.setSelectedIndex(1);
                        }else{
                            if(resultado.getString(12).equals("Kodomo")){
                                ModificarCajaDemografia.setSelectedIndex(2);
                            }else{
                                if(resultado.getString(12).equals("Shojo")){
                                    ModificarCajaDemografia.setSelectedIndex(3);
                                }else{
                                    if(resultado.getString(12).equals("Josei")){
                                        ModificarCajaDemografia.setSelectedIndex(4);
                                    }
                                }
                            }
                        }
                    }
                }
            }while(resultado.next());
        } catch (SQLException ex) {
            System.out.println("Algun dato no existe");
        }
    }//GEN-LAST:event_ModificarBotonBuscarActionPerformed

    private void ModificarBotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBotonModificarActionPerformed
        /*
         * Modificar los Datos del Panel Modificar
         */
        
        String FInicio="",FFin="",FFDia="",FFMes="",FIDia="",FIMes="";
        int OvaInicio=0, OvaFinal=0;
        if(ModificarTextoNombre.getText().equals("")==false||ModificarTextoGenero.getText().equals("")==false||
           ModificarTextoCapitulosInicio.getText().equals("")==false||ModificarTextoCapitulosFinal.getText().equals("")==false||
           ModificarTextoResumen.getText().equals("")==false||ModificarTextoAutor.getText().equals("")==false||
           ModificarTextoFechaInicioDia.getText().equals("")==false||ModificarTextoFechaInicioMes.getText().equals("")==false||
           ModificarTextoFechaInicioAño.getText().equals("")==false){
            try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           Connection conexion = null;
            try {
                conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           Statement sentenciaSQL = null;
            try {
                sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
           if(ModificarTextoFechaInicioDia.getText().length()==1){
                FIDia=0+ModificarTextoFechaInicioDia.getText();
           }else{
                FIDia=ModificarTextoFechaInicioDia.getText();
           }
           if(ModificarTextoFechaInicioMes.getText().length()==1){
                FIMes=0+ModificarTextoFechaInicioMes.getText();
           }else{
                FIMes=ModificarTextoFechaInicioMes.getText();
           }
           FInicio=FIDia+"/"+FIMes+"/"+ModificarTextoFechaInicioAño.getText();
           if(ModificarTextoFechaFinDia.getText().equals("")==false){
                if(ModificarTextoFechaFinDia.getText().length()==1){
                    FFDia=0+ModificarTextoFechaFinDia.getText();
                }else{
                    FFDia=ModificarTextoFechaFinDia.getText();
                }
                if(ModificarTextoFechaFinMes.getText().length()==1){
                   FFMes=0+ModificarTextoFechaFinMes.getText();
                }else{
                   FFMes=ModificarTextoFechaFinMes.getText();
                }
                FFin=FFDia+"/"+FFMes+"/"+ModificarTextoFechaFinAño.getText();
           }else{
                FFin="null";
           }
           if(ModificarTextoOvasInicio.getText().equals("")==false){
               try{
                OvaInicio=Integer.parseInt(ModificarTextoOvasInicio.getText());
               }catch(Exception ex){
                   javax.swing.JOptionPane.showMessageDialog(this, "Error! Insertado Caracter en Entero");
               }
           }else{
                OvaInicio=0;
           }
           if(ModificarTextoOvasFinal.getText().equals("")==false){
               try{
                OvaFinal=Integer.parseInt(ModificarTextoOvasFinal.getText());
               }catch(Exception ex){
                   javax.swing.JOptionPane.showMessageDialog(this, "Error! Insertado Caracter en Entero");
               }
           }else{
                OvaFinal=0;
           }
            try {
                sentenciaSQL.executeUpdate("UPDATE Animes SET CapitulosExistentes="+ModificarTextoCapitulosFinal.getText()+" WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET CapitulosPoseidos="+ModificarTextoCapitulosInicio.getText()+" WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET Resumen='"+ModificarTextoResumen.getText()+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET FechaInicio='"+FInicio+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET FechaFin='"+FFin+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET Autor='"+ModificarTextoAutor.getText()+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET Genero='"+ModificarTextoGenero.getText()+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET OvasExistentes="+ModificarTextoOvasFinal.getText()+" WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET OvasPoseidas="+ModificarTextoOvasInicio.getText()+" WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET UltimaModificacion='"+Login.TextoUser.getText()+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                sentenciaSQL.executeUpdate("UPDATE Animes SET Demografia='"+ModificarCajaDemografia.getSelectedItem().toString()+"' WHERE Nombre='"+ModificarTextoNombre.getText()+"'");
                LimpiarCamposModificar();
                javax.swing.JOptionPane.showMessageDialog(this, "Actualizacion Correcta");
            } catch (SQLException ex) {   
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Insertar Datos!");
            }
        }else{
            javax.swing.JOptionPane.showMessageDialog(this, "Error! Faltan Datos Importantes");
        }
    }//GEN-LAST:event_ModificarBotonModificarActionPerformed

    private void ModificarBotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarBotonBorrarActionPerformed
        /*
         * Limpiar los Datos del Panel Borrar
         */
        
        ModificarActDesact(false);
        LimpiarCamposModificar();
    }//GEN-LAST:event_ModificarBotonBorrarActionPerformed

    private void BorrarBotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBotonBorrarActionPerformed
        /*
         * Borra datos de la tabla
         */
        
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        try {
            sentenciaSQL.executeUpdate("DELETE FROM Animes WHERE Nombre='"+BorrarTextoNombre.getText()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        LimpiarCamposBorrar();
        javax.swing.JOptionPane.showMessageDialog(this, "Borrado Correctamente");
    }//GEN-LAST:event_BorrarBotonBorrarActionPerformed

    private void BorrarBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarBotonBuscarActionPerformed
        /*
         * Saca los Datos a Borrar
         */
        
        String Inic="", Fin="";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        try {
            resultado = sentenciaSQL.executeQuery("SELECT * FROM Animes");
            resultado.next();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            do{
                if(resultado.getString(1).equals(BorrarTextoNombre.getText())==true){
                    Inic=resultado.getString(5);
                    Fin=resultado.getString(6);
                    BorrarTextoGenero.setText(resultado.getString(8));
                    BorrarTextoCapitulosInicio.setText(""+resultado.getInt(3));
                    BorrarTextoCapitulosFinal.setText(""+resultado.getInt(2));
                    BorrarTextoOvasInicio.setText(""+resultado.getInt(10));
                    BorrarTextoOvasFinal.setText(""+resultado.getInt(9));
                    BorrarTextoResumen.setText(resultado.getString(4));
                    BorrarTextoAutor.setText(resultado.getString(7));
                    BorrarTextoFechaInicioDia.setText(Inic.substring(0, 2));
                    BorrarTextoFechaInicioMes.setText(Inic.substring(3, 5));
                    BorrarTextoFechaInicioAño.setText(Inic.substring(6, 10));
                    BorrarTextoDemografia.setText(resultado.getString(12));
                    if(Fin.equals("null")==true){
                        BorrarTextoFechaFinDia.setText("");
                        BorrarTextoFechaFinMes.setText("");
                        BorrarTextoFechaFinAño.setText("");
                    }else{
                        BorrarTextoFechaFinDia.setText(Fin.substring(0, 2));
                        BorrarTextoFechaFinMes.setText(Fin.substring(3, 5));
                        BorrarTextoFechaFinAño.setText(Fin.substring(6, 10));
                        Inic=""; Fin="";
                    }
                }
            }while(resultado.next());
        } catch (SQLException ex) {
            System.out.println("Algun dato no existe");
        }
    }//GEN-LAST:event_BorrarBotonBuscarActionPerformed

    private void ListadoBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoBotonBuscarActionPerformed
        /*
         * Saca el listado de la tabla
         */
        
        String Mensaje="";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        if(jComboBox1.getSelectedItem().equals("Todos")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("Nombre")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE Nombre='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("Autor")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE Autor='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("FechaInicio")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE FechaInicio='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("FechaFin")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE FechaFin='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("Genero")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE Genero='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("Modificado Por")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE UltimaModificacion='"+Login.TextoUser.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
        if(jComboBox1.getSelectedItem().equals("Demografia")){
            try {
                resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes WHERE Demografia='"+jTextField1.getText()+"'");
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                while(resultado.next()){
                    Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                            +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                            +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                            +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                            +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"   Demografia: "+resultado.getString(12)
                            +"\n";
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            ListadoTexto.setText(Mensaje);
        }
    }//GEN-LAST:event_ListadoBotonBuscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        /*
         * Hace visible el panel añadir
         */
        
        ContenedorPrincipal.setVisible(false);
        ContenedorAñadir.setVisible(true);
        ContenedorModificar.setVisible(false);
        ContenedorListado.setVisible(false);
        ContenedorBorrar.setVisible(false);
    }//GEN-LAST:event_AñadirActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        /*
         * Hace visible el panel de modificar
         */
        
        ContenedorPrincipal.setVisible(false);
        ContenedorAñadir.setVisible(false);
        ContenedorModificar.setVisible(true);
        ContenedorListado.setVisible(false);
        ContenedorBorrar.setVisible(false);
    }//GEN-LAST:event_ModificarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        /*
         * Hace visible el panel de borrar
         */
        
        ContenedorPrincipal.setVisible(false);
        ContenedorAñadir.setVisible(false);
        ContenedorModificar.setVisible(false);
        ContenedorListado.setVisible(false);
        ContenedorBorrar.setVisible(true);
    }//GEN-LAST:event_BorrarActionPerformed

    private void ListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadoActionPerformed
        /*
         * Hace visible el panel listado
         */
        
        ContenedorPrincipal.setVisible(false);
        ContenedorAñadir.setVisible(false);
        ContenedorModificar.setVisible(false);
        ContenedorListado.setVisible(true);
        ContenedorBorrar.setVisible(false);
    }//GEN-LAST:event_ListadoActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        /*
         * Hace visible el panel incial
         */
        
        ContenedorPrincipal.setVisible(true);
        ContenedorAñadir.setVisible(false);
        ContenedorModificar.setVisible(false);
        ContenedorListado.setVisible(false);
        ContenedorBorrar.setVisible(false);
    }//GEN-LAST:event_InicioActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:odbc:Login","","");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        Statement sentenciaSQL = null;
        try {
            sentenciaSQL = (Statement) conexion.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            sentenciaSQL=(Statement) conexion.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet resultado = null;
        String Mensaje="";
        try {
            resultado=sentenciaSQL.executeQuery("SELECT * FROM Animes");
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            while(resultado.next()){
                Mensaje=Mensaje+"Nombre: "+resultado.getString(1)+"    Autor: "+resultado.getString(7)
                        +"   Genero: "+resultado.getString(8)+"   Capitulos Poseidos: "+resultado.getInt(3)
                        +" de "+resultado.getInt(2)+"   Ovas Poseidas: "+resultado.getInt(10)+" de "
                        +resultado.getInt(9)+"   Fecha Inicio: "+resultado.getString(5)+"   Fecha Fin: "
                        +resultado.getString(6)+"   Resumen: "+resultado.getString(4)+"\r"+"\n"+"\r"+"\n";
                    }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }       
        JFileChooser filechooser=new JFileChooser();
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter(".txt", "txt", "TXT"));
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter(".rtf", "rtf", "RTF"));
        int seleccion=filechooser.showSaveDialog(this);
        if(seleccion==JFileChooser.APPROVE_OPTION){
            File JFC=filechooser.getSelectedFile();
            FileOutputStream miArchivo = null;
            String contenido="";
            try {
                miArchivo=new FileOutputStream(JFC.getPath());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            contenido=Mensaje;
            try {
                miArchivo.write(contenido.getBytes());
                miArchivo.close();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ExportarActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        Navegador nav=new Navegador();
        nav.setVisible(true);
        nav.setResizable(false);
    }//GEN-LAST:event_AyudaActionPerformed

    private void RecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordatorioActionPerformed
        Anotaciones note=new Anotaciones();
        note.setResizable(false);
        if(ant==0){
            note.setVisible(true);
            note.jButton2.setVisible(false);
            note.jTextArea1.setEnabled(true);
        }
    }//GEN-LAST:event_RecordatorioActionPerformed

    private void VisualizarAnotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarAnotacionesActionPerformed
        Anotaciones note=new Anotaciones();
        note.setResizable(false);
        if(ant==0){
            note.setVisible(true);
            note.jButton1.setVisible(false);
            note.jTextArea1.setEnabled(false);
        }
    }//GEN-LAST:event_VisualizarAnotacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenuItem Ayuda;
    private javax.swing.JMenuItem Añadir;
    private javax.swing.JMenuBar BarraMenus;
    private javax.swing.JButton Bienvenida;
    private javax.swing.JButton Bienvenida1;
    private javax.swing.JMenuItem Borrar;
    private javax.swing.JButton BorrarBotonBorrar;
    private javax.swing.JButton BorrarBotonBuscar;
    private javax.swing.JLabel BorrarEtiquetaAutor;
    private javax.swing.JLabel BorrarEtiquetaCapDe;
    private javax.swing.JLabel BorrarEtiquetaDemografia;
    private javax.swing.JLabel BorrarEtiquetaFecFin;
    private javax.swing.JLabel BorrarEtiquetaFecFinBarra1;
    private javax.swing.JLabel BorrarEtiquetaFecFinBarra2;
    private javax.swing.JLabel BorrarEtiquetaFecIn;
    private javax.swing.JLabel BorrarEtiquetaFecInBarra1;
    private javax.swing.JLabel BorrarEtiquetaFecInBarra2;
    private javax.swing.JLabel BorrarEtiquetaGenero;
    private javax.swing.JLabel BorrarEtiquetaNombre;
    private javax.swing.JLabel BorrarEtiquetaNumCap;
    private javax.swing.JLabel BorrarEtiquetaNumOva;
    private javax.swing.JLabel BorrarEtiquetaOvaDe;
    private javax.swing.JLabel BorrarEtiquetaResumen;
    private javax.swing.JTextField BorrarTextoAutor;
    private javax.swing.JTextField BorrarTextoCapitulosFinal;
    private javax.swing.JTextField BorrarTextoCapitulosInicio;
    private javax.swing.JTextField BorrarTextoDemografia;
    private javax.swing.JTextField BorrarTextoFechaFinAño;
    private javax.swing.JTextField BorrarTextoFechaFinDia;
    private javax.swing.JTextField BorrarTextoFechaFinMes;
    private javax.swing.JTextField BorrarTextoFechaInicioAño;
    private javax.swing.JTextField BorrarTextoFechaInicioDia;
    private javax.swing.JTextField BorrarTextoFechaInicioMes;
    private javax.swing.JTextField BorrarTextoGenero;
    private javax.swing.JTextField BorrarTextoNombre;
    private javax.swing.JTextField BorrarTextoOvasFinal;
    private javax.swing.JTextField BorrarTextoOvasInicio;
    private javax.swing.JTextArea BorrarTextoResumen;
    private javax.swing.JButton BotonMusica;
    private javax.swing.JLayeredPane Contenedor;
    protected javax.swing.JLayeredPane ContenedorAñadir;
    protected javax.swing.JLayeredPane ContenedorBorrar;
    protected javax.swing.JLayeredPane ContenedorListado;
    protected javax.swing.JLayeredPane ContenedorModificar;
    protected javax.swing.JLayeredPane ContenedorMusica;
    protected javax.swing.JLayeredPane ContenedorPrincipal;
    private javax.swing.JMenu Edicion;
    private javax.swing.JMenuItem Exportar;
    private javax.swing.JLabel FondoAñadir;
    private javax.swing.JLabel FondoBorrar;
    private javax.swing.JLabel FondoListado;
    private javax.swing.JLabel FondoModificar;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JMenuItem Inicio;
    private javax.swing.JButton InsertarBotonBorrarCampos;
    private javax.swing.JButton InsertarBotonInsertar;
    private javax.swing.JComboBox InsertarCajaDemografia;
    private javax.swing.JLabel InsertarEtiquetaAutor;
    private javax.swing.JLabel InsertarEtiquetaCapDe;
    private javax.swing.JLabel InsertarEtiquetaDemografia;
    private javax.swing.JLabel InsertarEtiquetaFecFin;
    private javax.swing.JLabel InsertarEtiquetaFecFinBarra1;
    private javax.swing.JLabel InsertarEtiquetaFecFinBarra2;
    private javax.swing.JLabel InsertarEtiquetaFecIn;
    private javax.swing.JLabel InsertarEtiquetaFecInBarra1;
    private javax.swing.JLabel InsertarEtiquetaFecInBarra2;
    private javax.swing.JLabel InsertarEtiquetaGenero;
    private javax.swing.JLabel InsertarEtiquetaNombre;
    private javax.swing.JLabel InsertarEtiquetaNumCap;
    private javax.swing.JLabel InsertarEtiquetaNumOva;
    private javax.swing.JLabel InsertarEtiquetaOvaDe;
    private javax.swing.JLabel InsertarEtiquetaResumen;
    private javax.swing.JTextField InsertarTextoAutor;
    private javax.swing.JTextField InsertarTextoCapitulosFinal;
    private javax.swing.JTextField InsertarTextoCapitulosInicio;
    private javax.swing.JTextField InsertarTextoFechaFinAño;
    private javax.swing.JTextField InsertarTextoFechaFinDia;
    private javax.swing.JTextField InsertarTextoFechaFinMes;
    private javax.swing.JTextField InsertarTextoFechaInicioAño;
    private javax.swing.JTextField InsertarTextoFechaInicioDia;
    private javax.swing.JTextField InsertarTextoFechaInicioMes;
    private javax.swing.JTextField InsertarTextoGenero;
    private javax.swing.JTextField InsertarTextoNombre;
    private javax.swing.JTextField InsertarTextoOvasFinal;
    private javax.swing.JTextField InsertarTextoOvasInicio;
    private javax.swing.JTextArea InsertarTextoResumen;
    private javax.swing.JMenuItem Listado;
    private javax.swing.JButton ListadoBotonBuscar;
    private javax.swing.JLabel ListadoEtiquetaTipo;
    private javax.swing.JScrollPane ListadoScrollPanel;
    private javax.swing.JTextArea ListadoTexto;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JButton ModificarBotonBorrar;
    private javax.swing.JButton ModificarBotonBuscar;
    private javax.swing.JButton ModificarBotonModificar;
    private javax.swing.JComboBox ModificarCajaDemografia;
    private javax.swing.JLabel ModificarEtiquetaAutor;
    private javax.swing.JLabel ModificarEtiquetaCapDe;
    private javax.swing.JLabel ModificarEtiquetaDemografia;
    private javax.swing.JLabel ModificarEtiquetaFecFin;
    private javax.swing.JLabel ModificarEtiquetaFecFinBarra1;
    private javax.swing.JLabel ModificarEtiquetaFecFinBarra2;
    private javax.swing.JLabel ModificarEtiquetaFecIn;
    private javax.swing.JLabel ModificarEtiquetaFecInBarra1;
    private javax.swing.JLabel ModificarEtiquetaFecInBarra2;
    private javax.swing.JLabel ModificarEtiquetaGenero;
    private javax.swing.JLabel ModificarEtiquetaNombre;
    private javax.swing.JLabel ModificarEtiquetaNumCap;
    private javax.swing.JLabel ModificarEtiquetaNumOva;
    private javax.swing.JLabel ModificarEtiquetaOvaDe;
    private javax.swing.JLabel ModificarEtiquetaResumen;
    private javax.swing.JTextField ModificarTextoAutor;
    private javax.swing.JTextField ModificarTextoCapitulosFinal;
    private javax.swing.JTextField ModificarTextoCapitulosInicio;
    private javax.swing.JTextField ModificarTextoFechaFinAño;
    private javax.swing.JTextField ModificarTextoFechaFinDia;
    private javax.swing.JTextField ModificarTextoFechaFinMes;
    private javax.swing.JTextField ModificarTextoFechaInicioAño;
    private javax.swing.JTextField ModificarTextoFechaInicioDia;
    private javax.swing.JTextField ModificarTextoFechaInicioMes;
    private javax.swing.JTextField ModificarTextoGenero;
    private javax.swing.JTextField ModificarTextoNombre;
    private javax.swing.JTextField ModificarTextoOvasFinal;
    private javax.swing.JTextField ModificarTextoOvasInicio;
    private javax.swing.JTextArea ModificarTextoResumen;
    private javax.swing.JMenu Opciones;
    private javax.swing.JScrollPane PanelScroll;
    private javax.swing.JScrollPane PanelScroll1;
    private javax.swing.JScrollPane PanelScroll2;
    private javax.swing.JMenuItem Recordatorio;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JPopupMenu.Separator Separador2;
    private javax.swing.JPopupMenu.Separator Separador3;
    private javax.swing.JPopupMenu.Separator Separador4;
    private javax.swing.JPopupMenu.Separator Separador5;
    private javax.swing.JMenuItem VisualizarAnotaciones;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
