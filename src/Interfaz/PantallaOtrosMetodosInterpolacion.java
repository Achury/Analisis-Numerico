/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaOtrosMetodosInterpolacion.java
 *
 * Created on May 31, 2011, 1:25:31 AM
 */

package Interfaz;

import Funciones.MetodosInterpolacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaOtrosMetodosInterpolacion extends javax.swing.JFrame {

    private DefaultTableModel modeloMatriz;
    private DefaultTableModel modeloRes;
    public PantallaOtrosMetodosInterpolacion() {
        initComponents();
        bAceptar.setEnabled(false);
        bEjecutar.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rNeville = new javax.swing.JRadioButton();
        rCubico = new javax.swing.JRadioButton();
        rCuadratico = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tNum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        bAceptar = new javax.swing.JButton();
        bEjecutar = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpResultados = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/sinergia88x99.png"))); // NOI18N

        buttonGroup1.add(rNeville);
        rNeville.setText("Neville");
        rNeville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNevilleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rCubico);
        rCubico.setText("Spline Cubico");
        rCubico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCubicoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rCuadratico);
        rCuadratico.setText("Spline Cuadratico");
        rCuadratico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCuadraticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(rNeville)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(rCuadratico)
                .addGap(102, 102, 102)
                .addComponent(rCubico)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rNeville)
                    .addComponent(rCubico)
                    .addComponent(rCuadratico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Numero de puntos");

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTable);

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bEjecutar.setText("Ejecutar");
        bEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEjecutarActionPerformed(evt);
            }
        });

        bAtras.setText("Atras");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblResultado);

        jScrollPane3.setViewportView(tpResultados);

        jLabel3.setText("Resultados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(bEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(bAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAceptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEjecutar)
                    .addComponent(bAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        modeloMatriz = new DefaultTableModel();
        //tpResultados.setText("");
        int num = Integer.parseInt(tNum.getText());
        String[] titulos = new String[num + 1];
        Double [][] matriz = new Double[2][num + 1];
        int cont = 0;
        while(cont <= num){
            titulos[cont] = cont + "";
            cont++;
        }
        modeloMatriz.setDataVector(matriz, titulos);
        tblTable.setModel(modeloMatriz);
        tblTable.setValueAt("X", 0, 0);
        tblTable.setValueAt("y", 1, 0);

    }//GEN-LAST:event_bAceptarActionPerformed

    private void bEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEjecutarActionPerformed
     try{
     modeloRes = new DefaultTableModel();
     tpResultados.setText("");
     int num = Integer.parseInt(tNum.getText());
     Double [][] matriz = new Double[2][num + 1];
     if(rCuadratico.isSelected()){
        MetodosInterpolacion.splinesCuadratico(readx(num), ready(num),num);
        double [][]matRes = MetodosInterpolacion.matrizres;
        int filass = matRes.length;
        int columnass = matRes[0].length;
        Double [][] matriz2 = new Double[filass][columnass];
        String[] titulos = new String[columnass];

        int cont = 1;
        for(int i = 0; i < columnass - 3; i += 3){
            titulos[i] = "a" + cont;
            titulos[i + 1] = "b" + cont;
            titulos[i + 2] = "c" + cont;
            cont++;
         }
        titulos[columnass - 1] = "Res";

        modeloRes.setDataVector(matriz2, titulos);
        tblResultado.setModel(modeloRes);


        for(int i = 0; i < filass ; i++){
            for(int j = 0; j < columnass; j++){
                tblResultado.setValueAt(matRes[i][j], i, j);
            }

           }
            tpResultados.setText(MetodosInterpolacion.res);
        }

        if(rCubico.isSelected()){
        MetodosInterpolacion.splinesCubico(readx(num), ready(num),num);
        double [][]matRes = MetodosInterpolacion.matrizres;
        int filass = matRes.length;
        int columnass = matRes[0].length;
        Double [][] matriz2 = new Double[filass][columnass];
        String[] titulos = new String[columnass];

        int cont = 1;
        for(int i = 0; i < columnass - 4; i += 4){
            titulos[i] = "a" + cont;
            titulos[i + 1] = "b" + cont;
            titulos[i + 2] = "c" + cont;
            titulos[i + 3] = "d" + cont;
            cont++;
         }
        titulos[columnass - 1] = "Res";

        modeloRes.setDataVector(matriz2, titulos);
        tblResultado.setModel(modeloRes);


        for(int i = 0; i < filass ; i++){
            for(int j = 0; j < columnass; j++){
                tblResultado.setValueAt(matRes[i][j], i, j);
            }

           }
            tpResultados.setText(MetodosInterpolacion.res);

        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Por favor ingrese correctamente los valores requeridos");
        }
    }//GEN-LAST:event_bEjecutarActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    private void rNevilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rNevilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rNevilleActionPerformed

    private void rCuadraticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCuadraticoActionPerformed
        bAceptar.setEnabled(true);
        bEjecutar.setEnabled(true);
    }//GEN-LAST:event_rCuadraticoActionPerformed

    private void rCubicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCubicoActionPerformed
        bAceptar.setEnabled(true);
        bEjecutar.setEnabled(true);
    }//GEN-LAST:event_rCubicoActionPerformed
    public void print (double [][]a){
        int n = a.length;
        int m = a[0].length;
        for (int i = 0 ; i < n; ++i){
            for (int j = 0; j < m; ++j){
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
            
    }

    public double[] readx(int a){
        double[] x = new double[a];
        for(int i = 1; i <= a; i++){
            x[i -1] = Double.valueOf(tblTable.getValueAt(0, i).toString());
        }
        return x;
    }
     public double[] ready(int a){
        double[] y = new double[a];
        for(int i = 1; i <= a; i++){
            y[i -1] = Double.valueOf(tblTable.getValueAt(1, i).toString());
        }
        return y;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaOtrosMetodosInterpolacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bEjecutar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rCuadratico;
    private javax.swing.JRadioButton rCubico;
    private javax.swing.JRadioButton rNeville;
    private javax.swing.JTextField tNum;
    private javax.swing.JTable tblResultado;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextPane tpResultados;
    // End of variables declaration//GEN-END:variables

}
