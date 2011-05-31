/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PantallaSistemasDeEcuaciones.java
 *
 * Created on 3/03/2011, 10:28:43 PM
 */

package Interfaz;

import Funciones.MetodosSistemaDeEcuaciones;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class PantallaSistemasDeEcuaciones extends javax.swing.JFrame {
 
    private DefaultTableModel modeloMatriz;
    private DefaultTableModel modeloFac;
    private DefaultTableModel modeloTribanda;

    public PantallaSistemasDeEcuaciones() {
        initComponents();
        bMatriz.setEnabled(false);
    }
    public boolean isCellEditable(int rowIndex, int vColIndex) {
            return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMetodosSE = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rGauusSimp = new javax.swing.JRadioButton();
        rGaussPar = new javax.swing.JRadioButton();
        rGaussTotal = new javax.swing.JRadioButton();
        rFactGaussSimp = new javax.swing.JRadioButton();
        rFactGaussPar = new javax.swing.JRadioButton();
        rCrout = new javax.swing.JRadioButton();
        rDoolitle = new javax.swing.JRadioButton();
        rCholesky = new javax.swing.JRadioButton();
        rTribanda = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tNumVariables = new javax.swing.JTextField();
        bMatriz = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();
        bAtraz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpResultados = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bgMetodosSE.add(rGauusSimp);
        rGauusSimp.setText("Eliminacion Gaussiana simple");
        rGauusSimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGauusSimpActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rGaussPar);
        rGaussPar.setText("Eliminacion Gaussiana con pivoteo parcial");
        rGaussPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGaussParActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rGaussTotal);
        rGaussTotal.setText("Eliminacion Gaussiaan con pivoteo total");
        rGaussTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGaussTotalActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rFactGaussSimp);
        rFactGaussSimp.setText("Factorizacion con eliminacion Gaussiana simple");
        rFactGaussSimp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFactGaussSimpActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rFactGaussPar);
        rFactGaussPar.setText("Factorizacion con eliminacion Gaussiana y pivoteo parcial");
        rFactGaussPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rFactGaussParActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rCrout);
        rCrout.setText("Factorizacion de Crout");
        rCrout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCroutActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rDoolitle);
        rDoolitle.setText("Factorizacion de Doolittle");
        rDoolitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDoolitleActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rCholesky);
        rCholesky.setText("Factorizacion de Cholesky");
        rCholesky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rCholeskyActionPerformed(evt);
            }
        });

        bgMetodosSE.add(rTribanda);
        rTribanda.setText("Eliminacion Gaussiana tribanda");
        rTribanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rTribandaActionPerformed(evt);
            }
        });

        jButton1.setText("Metodos iterativos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rGauusSimp)
                    .addComponent(rGaussPar)
                    .addComponent(rGaussTotal)
                    .addComponent(rFactGaussPar)
                    .addComponent(rFactGaussSimp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rCrout)
                        .addComponent(rDoolitle)
                        .addComponent(rCholesky)
                        .addComponent(rTribanda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rGauusSimp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rGaussPar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rGaussTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rFactGaussSimp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rFactGaussPar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rCrout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rDoolitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rCholesky)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rTribanda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/sinergia88x99.png"))); // NOI18N

        jLabel2.setText("Ingrese el numero de variable");

        bMatriz.setText("Crear Matriz");
        bMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMatrizActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bAtraz.setText("Atras");
        bAtraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrazActionPerformed(evt);
            }
        });

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        jScrollPane2.setViewportView(tpResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tNumVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(bMatriz, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                                .addComponent(bAtraz, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                        .addGap(55, 55, 55)))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tNumVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMatriz))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bAtraz))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rFactGaussParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFactGaussParActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rFactGaussParActionPerformed

    private void rDoolitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDoolitleActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rDoolitleActionPerformed

    private void bMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMatrizActionPerformed
        modeloMatriz = new DefaultTableModel();
        modeloFac = new DefaultTableModel();
        modeloTribanda = new DefaultTableModel();
        int num = Integer.parseInt(tNumVariables.getText());
        String[] titulos = new String[num + 1];
        String[] titulosfac = new String[num];
        Double[][] matriz = new Double[num][num + 1];
        Double[][] matrizfac = new Double[num][num];
        int cont = 0;
        while(cont <= num){
            titulos[cont] = "X" + (cont+1);
            cont++;
        }
        cont = 0;
        while(cont < num){
            titulosfac[cont] = "X" + (cont+1);
            cont++;
        }
        cont = 0;
        modeloFac.setDataVector(matrizfac, titulosfac);
        titulos[num] = "b";
        modeloMatriz.setDataVector(matriz, titulos);
        if(rCholesky.isSelected() || rCrout.isSelected() || rDoolitle.isSelected() || rFactGaussPar.isSelected() || rFactGaussSimp.isSelected()){
            tblMatriz.setModel(modeloFac);
        }
        if(rGaussPar.isSelected() || rGaussTotal.isSelected() || rGauusSimp.isSelected()){
            tblMatriz.setModel(modeloMatriz);
        }
        if(rTribanda.isSelected()){
            tblMatriz.setModel(modeloMatriz);
            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    if(i > j+1){
                        tblMatriz.setValueAt("0", i, j);     
                    }
                    if(j > i + 1){
                        tblMatriz.setValueAt("0", i, j);
                    }
                }
            }
        }
        
    }//GEN-LAST:event_bMatrizActionPerformed
    public double[] readTA(int a){
        double A[] = new double[a - 1];
        for(int i = 0; i < a -1; i++){
            A[i] = Double.valueOf(tblMatriz.getValueAt(i + 1, i).toString());
        }
        return A;
    }
    public double[] readTB(int a){
        double B[] = new double[a];
        for(int i = 0; i < a ; i++){
            B[i] = Double.valueOf(tblMatriz.getValueAt(i, i).toString());
        }
        return B;
    }
    public double[] readTC(int a){
        double C[] = new double[a - 1];
        for(int i = 0; i < a - 1; i++){
            C[i] = Double.valueOf(tblMatriz.getValueAt(i, i + 1).toString());
        }
        return C;
    }

    
    public double[][] readA(int a){
        double matriz[][] = new double [a + 1][a + 1];
        for(int i = 0; i < a; i++){
            for(int j = 0; j < a; j++){

                matriz[i][j] = Double.valueOf(tblMatriz.getValueAt(i, j).toString());
            }
        }
        return matriz;
    }

    public double[][] readAB(int a){
        double matriz[][] = new double [a][a + 1];
        for(int i = 0; i < a; i++){
            for(int j = 0; j <= a; j++){

                 matriz[i][j] = Double.valueOf(tblMatriz.getValueAt(i, j).toString());
            }
        }
        return matriz;
    }

    public double[] readB(int a){
        double b[] = new double[a];
        for(int i =  0 ; i < a; i++ ){
            b[i] = Double.valueOf(tblMatriz.getValueAt(i, a).toString());
        }
        return b;
    }

    public void printb(double b[]){
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " " );
        }
        System.out.println();
    }

    public void print(double matriz[][]){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length + 1; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
     try{
      if(rGauusSimp.isSelected()){
        MetodosSistemaDeEcuaciones.elimGaussSimple(readAB(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));

        tpResultados.setText(MetodosSistemaDeEcuaciones.res);
      }
      if(rGaussPar.isSelected()){
        MetodosSistemaDeEcuaciones.elimGaussParcial(readAB(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.res);
      }
      if(rGaussTotal.isSelected()){
        MetodosSistemaDeEcuaciones.elimGaussTotal(readAB(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.res);
      }
      if(rFactGaussSimp.isSelected()){
        MetodosSistemaDeEcuaciones.factLUSimple(readA(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.mL + "\n" + MetodosSistemaDeEcuaciones.mU);
      }
      if(rFactGaussPar.isSelected()){
        MetodosSistemaDeEcuaciones.factLUPivoteo(readA(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.mL + "\n" + MetodosSistemaDeEcuaciones.mU + "\n" + MetodosSistemaDeEcuaciones.mP);
      }
      if(rCrout.isSelected()){
        MetodosSistemaDeEcuaciones.factCrout(readA(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.mL + "\n" + MetodosSistemaDeEcuaciones.mU);
      }
      if(rDoolitle.isSelected()){
        MetodosSistemaDeEcuaciones.factDoolittle(readA(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.mL + "\n" + MetodosSistemaDeEcuaciones.mU);
      }
      if(rCholesky.isSelected()){
        MetodosSistemaDeEcuaciones.factCholesky(readA(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.mL + "\n" + MetodosSistemaDeEcuaciones.mU);
      }
      if(rTribanda.isSelected()){
        MetodosSistemaDeEcuaciones.elimGaussTribanda(readTA(Integer.parseInt(tNumVariables.getText())), readTB(Integer.parseInt(tNumVariables.getText())), readTC(Integer.parseInt(tNumVariables.getText())), readB(Integer.parseInt(tNumVariables.getText())), Integer.parseInt(tNumVariables.getText()));
        tpResultados.setText(MetodosSistemaDeEcuaciones.res);

      }
   }catch(Exception e){
    JOptionPane.showMessageDialog(this, "Ingrese correctamente los datos");
   }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void rGauusSimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGauusSimpActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rGauusSimpActionPerformed

    private void rGaussParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGaussParActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rGaussParActionPerformed

    private void rGaussTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGaussTotalActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rGaussTotalActionPerformed

    private void rFactGaussSimpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rFactGaussSimpActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rFactGaussSimpActionPerformed

    private void rCroutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCroutActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rCroutActionPerformed

    private void rCholeskyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rCholeskyActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rCholeskyActionPerformed

    private void rTribandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rTribandaActionPerformed
        bMatriz.setEnabled(true);
    }//GEN-LAST:event_rTribandaActionPerformed

    private void bAtrazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrazActionPerformed
        this.dispose();
        PantallaMetodos pm = new PantallaMetodos();
        pm.setVisible(true);
    }//GEN-LAST:event_bAtrazActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaMetodosIterativos mi = new PantallaMetodosIterativos();
        mi.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaSistemasDeEcuaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAtraz;
    private javax.swing.JButton bMatriz;
    private javax.swing.ButtonGroup bgMetodosSE;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rCholesky;
    private javax.swing.JRadioButton rCrout;
    private javax.swing.JRadioButton rDoolitle;
    private javax.swing.JRadioButton rFactGaussPar;
    private javax.swing.JRadioButton rFactGaussSimp;
    private javax.swing.JRadioButton rGaussPar;
    private javax.swing.JRadioButton rGaussTotal;
    private javax.swing.JRadioButton rGauusSimp;
    private javax.swing.JRadioButton rTribanda;
    private javax.swing.JTextField tNumVariables;
    private javax.swing.JTable tblMatriz;
    private javax.swing.JTextPane tpResultados;
    // End of variables declaration//GEN-END:variables

}
