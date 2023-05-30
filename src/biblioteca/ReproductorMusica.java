/*
 * Rafael Bailón Robles
 */
package biblioteca;

    import java.util.logging.Level;
    import java.util.logging.Logger;
    import javazoom.jlgui.basicplayer.BasicPlayer;

public class ReproductorMusica extends javax.swing.JFrame {

    Reproductor musica=new Reproductor();
    BasicPlayer reproductor;
    
    int pausa=0, cont=0;
    
    /*
     * Metodo para reproducir en los botones avanzar y retroceder
     */
    
    public void reproducir(){
        pausa=0;
        if(cont==0){
            try {
                musica.AbrirFichero("src/Musica/Digimon.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==1){
            try {
                musica.AbrirFichero("src/Musica/Dragon Ball Kai.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==2){
            try {
                musica.AbrirFichero("src/Musica/Hellsing.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==3){
            try {
                musica.AbrirFichero("src/Musica/La Ley de Ueki.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==4){
            try {
                musica.AbrirFichero("src/Musica/One Piece.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==5){
            try {
                musica.AbrirFichero("src/Musica/Pokemon.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==6){
            try {
                musica.AbrirFichero("src/Musica/Mirai Nikki.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(cont==7){
            try {
                musica.AbrirFichero("src/Musica/Saint Seiya.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
    }
    
    public ReproductorMusica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Avanzar = new javax.swing.JButton();
        Parar = new javax.swing.JButton();
        Pausa = new javax.swing.JButton();
        Play = new javax.swing.JButton();
        Retroceder = new javax.swing.JButton();
        ListaReproduccion = new javax.swing.JComboBox();

        setTitle("Reproductor");

        Avanzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Avanzar.png"))); // NOI18N
        Avanzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Avanzar.setContentAreaFilled(false);
        Avanzar.setFocusPainted(false);
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        Parar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Parar.png"))); // NOI18N
        Parar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Parar.setContentAreaFilled(false);
        Parar.setFocusPainted(false);
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });

        Pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pausa.png"))); // NOI18N
        Pausa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pausa.setContentAreaFilled(false);
        Pausa.setFocusPainted(false);
        Pausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PausaActionPerformed(evt);
            }
        });

        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Play.png"))); // NOI18N
        Play.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Play.setContentAreaFilled(false);
        Play.setFocusPainted(false);
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Retroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Retroceder.png"))); // NOI18N
        Retroceder.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Retroceder.setContentAreaFilled(false);
        Retroceder.setFocusPainted(false);
        Retroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrocederActionPerformed(evt);
            }
        });

        ListaReproduccion.setMaximumRowCount(4);
        ListaReproduccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Digimon - Butterfly", "Dragon Ball - Dragon Soul", "Hellsing - Logos Naki World", "La Ley de Ueki - Falco", "One Piece - We Are (Japanese)", "Pokemon - Gotta Catch Em All", "Mirai Nikki - Kuusou Mesorogiwi", "Saint Seiya - Pegasus Fantasy" }));
        ListaReproduccion.setAutoscrolls(true);
        ListaReproduccion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListaReproduccionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListaReproduccion, 0, 362, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Retroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Parar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Pausa, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Play, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Avanzar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListaReproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Retroceder, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Parar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Pausa, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Play, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(Avanzar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
       
        /*
         * Accion del boton play para reproducir la musica
         * La cancion a reproducir se elige segun la que este
         * elegida en el jcombobox
         */
        
        pausa=0;
        if(ListaReproduccion.getSelectedItem().equals("Digimon - Butterfly")){
            try {
                musica.AbrirFichero("src/Musica/Digimon.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("Dragon Ball - Dragon Soul")){
            try {
                musica.AbrirFichero("src/Musica/Dragon Ball Kai.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("Hellsing - Logos Naki World")){
            try {
                musica.AbrirFichero("src/Musica/Hellsing.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("La Ley de Ueki - Falco")){
            try {
                musica.AbrirFichero("src/Musica/La Ley de Ueki.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("One Piece - We Are (Japanese)")){
            try {
                musica.AbrirFichero("src/Musica/One Piece.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("Pokemon - Gotta Catch Em All")){
            try {
                musica.AbrirFichero("src/Musica/Pokemon.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("Mirai Nikki - Kuusou Mesorogiwi")){
            try {
                musica.AbrirFichero("src/Musica/Mirai Nikki.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        if(ListaReproduccion.getSelectedItem().equals("Saint Seiya - Pegasus Fantasy")){
            try {
                musica.AbrirFichero("src/Musica/Saint Seiya.mp3");
                musica.Play();
            } catch (Exception ex) {
                System.out.println("Error: "+ex.getMessage());
            }
        }
        
    }//GEN-LAST:event_PlayActionPerformed

    private void PausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PausaActionPerformed
        
        /*
         * Pausar la cancion
         * Al volver a pulsar se reanuda
         */
        
        if(pausa==0){
            try {
                musica.Pausa();
            } catch (Exception ex) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            pausa=1;
        }else{
            try {
                musica.Continuar();
            } catch (Exception ex) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex);
            }
            pausa=0;
        }
        
    }//GEN-LAST:event_PausaActionPerformed

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        
        /*
         * Para la reproduccion de la cancion
         */
        
        try {
            musica.Stop();
        } catch (Exception ex) {
            Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PararActionPerformed

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        
        /*
         * Avanza a la siguiente cancion y la reproduce
         */
        
        try{
            cont++;
            ListaReproduccion.setSelectedIndex(cont);
            reproducir();
        }catch (Exception ex){
            cont=0;
            ListaReproduccion.setSelectedIndex(cont);
            try {
                musica.AbrirFichero("src/Musica/Digimon.mp3");
            } catch (Exception ex1) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex1);
            }
            try {
                musica.Play();
            } catch (Exception ex1) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }//GEN-LAST:event_AvanzarActionPerformed

    private void ListaReproduccionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListaReproduccionItemStateChanged
        
        /*
         * Al seleccionar una cancion, cambia el valor de cont
         * Ese valor es necesario en avanzar y retroceder
         */
        
        if(ListaReproduccion.getSelectedItem().equals("Digimon - Butterfly")){
            cont=0;
        }
        if(ListaReproduccion.getSelectedItem().equals("Dragon Ball - Dragon Soul")){
            cont=1;
        }
        if(ListaReproduccion.getSelectedItem().equals("Hellsing - Logos Naki World")){
            cont=2;
        }
        if(ListaReproduccion.getSelectedItem().equals("La Ley de Ueki - Falco")){
            cont=3;
        }
        if(ListaReproduccion.getSelectedItem().equals("One Piece - We Are (Japanese)")){
            cont=4;
        }
        if(ListaReproduccion.getSelectedItem().equals("Pokemon - Gotta Catch Em All")){
            cont=5;
        }
        if(ListaReproduccion.getSelectedItem().equals("Mirai Nikki - Kuusou Mesorogiwi")){
            cont=6;
        }
        if(ListaReproduccion.getSelectedItem().equals("Saint Seiya - Pegasus Fantasy")){
            cont=7;
        }
        
    }//GEN-LAST:event_ListaReproduccionItemStateChanged

    private void RetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrocederActionPerformed
        
        /*
         * Retrocede a la cancion anterior y la reproduce
         */
        
        try{
            cont--;
            ListaReproduccion.setSelectedIndex(cont);
            reproducir();
        }catch (Exception ex){
            cont=7;
            ListaReproduccion.setSelectedIndex(cont);
            try {
                musica.AbrirFichero("src/Musica/Saint Seiya.mp3");
            } catch (Exception ex1) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex1);
            }
            try {
                musica.Play();
            } catch (Exception ex1) {
                Logger.getLogger(ReproductorMusica.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
    }//GEN-LAST:event_RetrocederActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JComboBox ListaReproduccion;
    private javax.swing.JButton Parar;
    private javax.swing.JButton Pausa;
    private javax.swing.JButton Play;
    private javax.swing.JButton Retroceder;
    // End of variables declaration//GEN-END:variables
}
