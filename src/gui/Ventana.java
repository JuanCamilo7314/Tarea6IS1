package gui;

import control.Control;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 * Ventana principal
 *
 * @author Juan Camilo Uni Lara, Yenny Maria Burbano Castillo
 */
public class Ventana extends javax.swing.JFrame {

    Control control;

    public Ventana() {
        this.setTitle("Ingenieria De Software I");
        ImageIcon icono = new ImageIcon("recursos/logo.jpg");
        this.setIconImage(icono.getImage());
        control = new Control();
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

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelCabeza = new javax.swing.JPanel();
        rutaCsv = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNumeroInscripciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCabeza.setBackground(new java.awt.Color(0, 41, 85));
        jPanelCabeza.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rutaCsv.setEditable(false);
        rutaCsv.setBackground(new java.awt.Color(225, 226, 225));
        rutaCsv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rutaCsv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        rutaCsv.setPreferredSize(new java.awt.Dimension(6, 34));
        rutaCsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutaCsvMouseClicked(evt);
            }
        });
        rutaCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaCsvActionPerformed(evt);
            }
        });

        btnCargar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCargar.setText("Seleccionar Archivo");
        btnCargar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCargar.setPreferredSize(new java.awt.Dimension(83, 34));
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        txtTitulo.setBackground(new java.awt.Color(0, 0, 0));
        txtTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Inscripciones Por Estudiante ");
        txtTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtNumeroInscripciones.setBackground(new java.awt.Color(225, 226, 225));
        txtNumeroInscripciones.setColumns(20);
        txtNumeroInscripciones.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNumeroInscripciones.setRows(5);
        txtNumeroInscripciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(txtNumeroInscripciones);

        javax.swing.GroupLayout jPanelCabezaLayout = new javax.swing.GroupLayout(jPanelCabeza);
        jPanelCabeza.setLayout(jPanelCabezaLayout);
        jPanelCabezaLayout.setHorizontalGroup(
            jPanelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCabezaLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanelCabezaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(rutaCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCabezaLayout.setVerticalGroup(
            jPanelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabezaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txtTitulo)
                .addGap(44, 44, 44)
                .addGroup(jPanelCabezaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutaCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabeza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabeza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        control.VaciarLista();
        File archivo = control.seleccionarRuta();
        List<String> listaInscripciones = new ArrayList<String>();
        String cadena = "";

        if (archivo != null) {
            rutaCsv.setText(" " + archivo.getName());
            listaInscripciones = control.mostrarCantidadInscripciones();
            for (String Inscripcion : listaInscripciones) {
                cadena = (cadena + "\n" + Inscripcion);
            }
            txtNumeroInscripciones.setText(cadena);
        } else {
            txtNumeroInscripciones.setText("");
            rutaCsv.setText("");
        }


    }//GEN-LAST:event_btnCargarActionPerformed

    private void rutaCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaCsvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaCsvActionPerformed

    private void rutaCsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutaCsvMouseClicked
        control.VaciarLista();
        File archivo = control.seleccionarRuta();
        List<String> listaInscripciones = new ArrayList<String>();
        String cadena = "";

        if (archivo != null) {
            rutaCsv.setText(" " + archivo.getName());
            listaInscripciones = control.mostrarCantidadInscripciones();
            for (String Inscripcion : listaInscripciones) {
                cadena = (cadena + "\n" + Inscripcion);
            }
            txtNumeroInscripciones.setText(cadena);
        } else {
            txtNumeroInscripciones.setText("");
            rutaCsv.setText("");
        }
    }//GEN-LAST:event_rutaCsvMouseClicked

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JPanel jPanelCabeza;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rutaCsv;
    private javax.swing.JTextArea txtNumeroInscripciones;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
