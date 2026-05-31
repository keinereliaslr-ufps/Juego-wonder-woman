package vista;

import controlador.ControladorJuego;
import java.util.ArrayList;
import modelo.Habilidad;
import modelo.Lugar;
import modelo.ObjetoEspecial;

public class VistaJuego extends javax.swing.JFrame {

    private ControladorJuego controlador;

    public VistaJuego(ControladorJuego controlador) {
        this.controlador = controlador;
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbLugar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        btnVerPersonajes = new javax.swing.JButton();
        btnDialogo = new javax.swing.JButton();
        btnCombate = new javax.swing.JButton();
        chkUsarHabilidad = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        cmbHabilidades = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEquipo = new javax.swing.JComboBox<>();
        btnUsarSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Wonder Woman");

        jLabel1.setText("Lugar:");

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        btnVerPersonajes.setText("Ver Personajes");
        btnVerPersonajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPersonajesActionPerformed(evt);
            }
        });

        btnDialogo.setText("Ejecutar Diálogo");
        btnDialogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDialogoActionPerformed(evt);
            }
        });

        btnCombate.setText("Ejecutar Combate");
        btnCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombateActionPerformed(evt);
            }
        });

        chkUsarHabilidad.setText("Usar habilidad");

        jLabel2.setText("Habilidades:");

        jLabel3.setText("Equipo:");

        btnUsarSeleccion.setText("Usar selección");
        btnUsarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsarSeleccionActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVerPersonajes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDialogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCombate)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkUsarHabilidad)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHabilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsarSeleccion)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerPersonajes)
                    .addComponent(btnDialogo)
                    .addComponent(btnCombate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkUsarHabilidad)
                    .addComponent(jLabel2)
                    .addComponent(cmbHabilidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsarSeleccion))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPersonajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPersonajesActionPerformed
        txtResultado.setText(controlador.obtenerPersonajesDeLugar(cmbLugar.getSelectedIndex()));
    }//GEN-LAST:event_btnVerPersonajesActionPerformed

    private void btnDialogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDialogoActionPerformed
        txtResultado.append("\n" + controlador.ejecutarDialogoSimple() + "\n");
    }//GEN-LAST:event_btnDialogoActionPerformed

    private void btnCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombateActionPerformed
        txtResultado.append("\n" + controlador.ejecutarCombateSimple() + "\n");
    }//GEN-LAST:event_btnCombateActionPerformed

    private void btnUsarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsarSeleccionActionPerformed
        txtResultado.append("\n" + controlador.usarSeleccionWonderWoman(chkUsarHabilidad.isSelected(), cmbHabilidades.getSelectedIndex(), cmbEquipo.getSelectedIndex()) + "\n");
    }//GEN-LAST:event_btnUsarSeleccionActionPerformed

    public void cargarLugares(ArrayList<Lugar> lugares) {
        cmbLugar.removeAllItems();
        for (int i = 0; i < lugares.size(); i++) {
            cmbLugar.addItem(lugares.get(i).getNombre());
        }
    }

    public void cargarHabilidades(ArrayList<Habilidad> habilidades) {
        cmbHabilidades.removeAllItems();
        for (int i = 0; i < habilidades.size(); i++) {
            cmbHabilidades.addItem(habilidades.get(i).getNombre());
        }
    }

    public void cargarEquipo(ArrayList<ObjetoEspecial> equipo) {
        cmbEquipo.removeAllItems();
        for (int i = 0; i < equipo.size(); i++) {
            cmbEquipo.addItem(equipo.get(i).getNombre());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCombate;
    private javax.swing.JButton btnDialogo;
    private javax.swing.JButton btnUsarSeleccion;
    private javax.swing.JButton btnVerPersonajes;
    private javax.swing.JCheckBox chkUsarHabilidad;
    private javax.swing.JComboBox<String> cmbEquipo;
    private javax.swing.JComboBox<String> cmbHabilidades;
    private javax.swing.JComboBox<String> cmbLugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
