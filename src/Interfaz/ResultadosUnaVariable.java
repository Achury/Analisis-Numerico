/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ResultadosUnaVariable.java
 *
 * Created on May 1, 2011, 10:31:04 AM
 */

package Interfaz;
import Funciones.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;

public class ResultadosUnaVariable extends javax.swing.JFrame {

    private DefaultTableModel modeloBI;
    private DefaultTableModel modeloB;
    private DefaultTableModel modeloRF;
    private DefaultTableModel modeloPF;
    private DefaultTableModel modeloN;
    private DefaultTableModel modeloS;
    private DefaultTableModel modeloRM;


    public ResultadosUnaVariable() {
        int metodo = PantallaMetodosUnaVariable.metodo;
        initComponents();
        String res;
        res = Funciones.MetodosUnaVariable.str1;
        int count = Funciones.MetodosUnaVariable.cont;
        double arr[] = new double[count];
        double arry[] = new double[count];
        double arrxs[] = new double[count];
        double arrxm[] = new double[count];
        double arrerror[] = new double[count];
        double arrden [] = new double[count];

        arr = Funciones.MetodosUnaVariable.arr;
        arry = Funciones.MetodosUnaVariable.arry;
        arrxs = Funciones.MetodosUnaVariable.arrxs;
        arrxm = Funciones.MetodosUnaVariable.arrxm;
        arrerror = Funciones.MetodosUnaVariable.arrerror;
        arrden = Funciones.MetodosUnaVariable.arrden;

        modeloBI = new DefaultTableModel();
        modeloB = new DefaultTableModel();
        modeloRF = new DefaultTableModel();
        modeloPF = new DefaultTableModel();
        modeloN = new DefaultTableModel();
        modeloS = new DefaultTableModel();
        modeloRM = new DefaultTableModel();

        modeloBI.addColumn("n");
        modeloBI.addColumn("X");
        modeloBI.addColumn("F(x)");

        modeloB.addColumn("n");
        modeloB.addColumn("Xi");
        modeloB.addColumn("Xs");
        modeloB.addColumn("Xm");
        modeloB.addColumn("F(Xm)");
        modeloB.addColumn("Error");

        modeloRF.addColumn("n");
        modeloRF.addColumn("Xi");
        modeloRF.addColumn("Xs");
        modeloRF.addColumn("Xm");
        modeloRF.addColumn("F(Xm)");
        modeloRF.addColumn("Error");

        modeloPF.addColumn("n");
        modeloPF.addColumn("X");
        modeloPF.addColumn("F(X)");
        modeloPF.addColumn("Error");

        modeloN.addColumn("n");
        modeloN.addColumn("X");
        modeloN.addColumn("F(X)");
        modeloN.addColumn("Error");

        modeloS.addColumn("n");
        modeloS.addColumn("X");
        modeloS.addColumn("F(X)");
        modeloS.addColumn("Error");

        modeloRM.addColumn("n");
        modeloRM.addColumn("X");
        modeloRM.addColumn("F(X)");
        modeloRM.addColumn("denominador");
        modeloRM.addColumn("Error");

        
        if(metodo == 1){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloBI.addRow(new String [2]);
            }

            tblResultados.setModel(modeloBI);
            int i = 0;

            for(int j = 0; j< count + 1; j++){
                tblResultados.setValueAt(i , j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arry[i], j, 2);
                i++;
            }
        }
        if(metodo == 2){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloB.addRow(new String [5]);
            }

            tblResultados.setModel(modeloB);
            int i = 0;
            for(int j = 0; j< count; j++){
                tblResultados.setValueAt(i, j , 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arrxs[i], j, 2);
                tblResultados.setValueAt(arrxm[i], j, 3);
                tblResultados.setValueAt(arry[i], j, 4);
                tblResultados.setValueAt(arrerror[i], j, 5);
                i++;
            }
        }

        if(metodo == 3){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloRF.addRow(new String [5]);
            }

            tblResultados.setModel(modeloRF);
            int i = 0;
            for(int j = 0; j< count; j++){
                tblResultados.setValueAt(i, j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arrxs[i], j, 2);
                tblResultados.setValueAt(arrxm[i], j, 3);
                tblResultados.setValueAt(arry[i], j, 4);
                tblResultados.setValueAt(arrerror[i], j, 5);
                i++;
            }
        }

        if(metodo == 4){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloPF.addRow(new String [3]);
            }

            tblResultados.setModel(modeloPF);
            int i = 0;
            for(int j = 0; j< count + 1; j++){
                tblResultados.setValueAt(i, j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arry[i], j, 2);
                tblResultados.setValueAt(arrerror[i], j, 3);
                i++;
            }
        }

        if(metodo == 5){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloN.addRow(new String [3]);
            }

            tblResultados.setModel(modeloN);
            int i = 0;
            for(int j = 0; j< count + 1; j++){
                tblResultados.setValueAt(i, j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arry[i], j, 2);
                tblResultados.setValueAt(arrerror[i], j, 3);
                i++;
            }
        }

        if(metodo == 6){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloS.addRow(new String [6]);
            }

            tblResultados.setModel(modeloS);
            int i = 0;
            for(int j = 0; j< count + 1; j++){
                tblResultados.setValueAt(i, j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arry[i], j, 2);
                tblResultados.setValueAt(arrerror[i], j, 3);
                i++;
            }
        }
        if(metodo == 7){
            count = Funciones.MetodosUnaVariable.cont;
            for(int i = 0; i < 100; i++){
                modeloRM.addRow(new String [6]);
            }

            tblResultados.setModel(modeloRM);
            int i = 0;
            for(int j = 0; j< count + 1; j++){
                tblResultados.setValueAt(i, j, 0);
                tblResultados.setValueAt(arr[i], j, 1);
                tblResultados.setValueAt(arry[i], j, 2);
                tblResultados.setValueAt(arrden[i], j, 3);
                tblResultados.setValueAt(arrerror[i], j, 4);
                i++;
            }

        }
        lfun.setText("Funcion : " + PantallaMetodosUnaVariable.fun);
        lInformation.setText(res);

    }

    public static void print(double row[]){
        for(int i = 0; i < row.length; i++){
            System.out.println(row[i]);
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lInformation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bAtras = new javax.swing.JButton();
        lRes = new javax.swing.JLabel();
        lfun = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados"));

        lInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/sinergia88x99.png"))); // NOI18N

        bAtras.setText("Atras");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        lRes.setFont(new java.awt.Font("Ubuntu", 1, 18));

        lfun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(bAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lRes, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lfun, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lfun, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(bAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed

        this.dispose();
    }//GEN-LAST:event_bAtrasActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                new ResultadosUnaVariable().setVisible(true);
                }catch(Exception e){

                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lInformation;
    private javax.swing.JLabel lRes;
    private javax.swing.JLabel lfun;
    private javax.swing.JTable tblResultados;
    // End of variables declaration//GEN-END:variables

}
