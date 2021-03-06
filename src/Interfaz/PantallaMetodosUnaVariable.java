

package Interfaz;
import Funciones.*;
import com.singularsys.jep.JepException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class PantallaMetodosUnaVariable extends javax.swing.JFrame {

    boolean error = false;
    public static int metodo = 0;
    String funcion;
    String str;
    public static String fun;
    public static double xant;
    public static double xact;
    public static double inc;
    public static int iter;
    public static int cont = 0;


    public  String getFuncion(){

        funcion = tFuncion.getText();
        return  funcion;

    }
    public double getValor1(){
        double valor1 = Double.parseDouble(t1.getText());
        return valor1;
     }
    public double getIncremento(){
        double inc = Double.parseDouble(t2.getText());
        return inc;
     }
    public double getTolerancia(){
        double inc = Double.parseDouble(t2.getText());
        return inc;
     }
    public int getIteraciones(){
        int iter = Integer.parseInt(t3.getText());
        return iter;
     }

    public double getValor2(){

        double valor2 = Double.parseDouble(t6.getText());
        return valor2;
    }

    public String getFuncion2(){

        String fun2 = t4.getText();
        return fun2;
    }

    public String getFuncion3(){

        String sderivada = t5.getText();
        return sderivada;

    }
    public String getStr(String str){
        return str;
    }
    public  PantallaMetodosUnaVariable() {
        initComponents();
        tFuncion.setVisible(false);
        t1.setVisible(false);
        t3.setVisible(false);
        t2.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        lfuncion.setVisible(false);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        bGraficar.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgUnaVariable = new javax.swing.ButtonGroup();
        bgError = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        rbPuntoFijo = new javax.swing.JRadioButton();
        rbReglaFalsa = new javax.swing.JRadioButton();
        rbBiseccion = new javax.swing.JRadioButton();
        rbBusquedas = new javax.swing.JRadioButton();
        rbNewton = new javax.swing.JRadioButton();
        rbSecante = new javax.swing.JRadioButton();
        rbRaicesMultiples = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        lfuncion = new javax.swing.JLabel();
        tFuncion = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        l2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bAtras = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        l6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bGraficar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbRelativo = new javax.swing.JRadioButton();
        rbAbsoluto = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Métodos"));

        rgUnaVariable.add(rbPuntoFijo);
        rbPuntoFijo.setText("Punto Fijo");
        rbPuntoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPuntoFijoActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbReglaFalsa);
        rbReglaFalsa.setText("Regla Falsa");
        rbReglaFalsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReglaFalsaActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbBiseccion);
        rbBiseccion.setText("Bisección");
        rbBiseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBiseccionActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbBusquedas);
        rbBusquedas.setText("Busqueda Incremental");
        rbBusquedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBusquedasActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbNewton);
        rbNewton.setText("Metodo Newton");
        rbNewton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNewtonActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbSecante);
        rbSecante.setText("Secante");
        rbSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSecanteActionPerformed(evt);
            }
        });

        rgUnaVariable.add(rbRaicesMultiples);
        rbRaicesMultiples.setText("Raices multiples");
        rbRaicesMultiples.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRaicesMultiplesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbBusquedas)
                    .addComponent(rbReglaFalsa)
                    .addComponent(rbBiseccion))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNewton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbPuntoFijo)
                        .addGap(59, 59, 59)
                        .addComponent(rbRaicesMultiples))
                    .addComponent(rbSecante)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBusquedas)
                    .addComponent(rbPuntoFijo)
                    .addComponent(rbRaicesMultiples))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNewton)
                    .addComponent(rbBiseccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbReglaFalsa)
                    .addComponent(rbSecante))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Métodos Ecuaciones Una Variable");

        lfuncion.setText("Función");

        l1.setText("Valor Inicial");

        l2.setText("Delta");

        l3.setText("Iteraciones");

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bAtras.setText("Atras");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        l4.setText("g(x)");

        l5.setText("f''(x)");

        l6.setText("Limite Superior");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/sinergia88x99.png"))); // NOI18N

        bGraficar.setText("Graficar");
        bGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGraficarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Error"));

        bgError.add(rbRelativo);
        rbRelativo.setText("Relativo");

        bgError.add(rbAbsoluto);
        rbAbsoluto.setText("Absoluto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbRelativo)
                    .addComponent(rbAbsoluto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rbRelativo)
                .addGap(37, 37, 37)
                .addComponent(rbAbsoluto)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jMenu1.setText("Ayuda");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(bAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(bAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, 0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l6)
                                    .addComponent(l3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(l5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t5, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(t3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(l2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lfuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(tFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lfuncion)
                    .addComponent(bGraficar))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l4)
                    .addComponent(l5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bAtras))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbRaicesMultiplesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRaicesMultiplesActionPerformed


        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t6.setVisible(false);
        t4.setVisible(true);
        t5.setVisible(true);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(true);
        l6.setVisible(false);
        l2.setText("Tolerancia");
        l4.setText("f'(x)");
        l5.setText("f''(x)");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbRaicesMultiplesActionPerformed

    private void rbBusquedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBusquedasActionPerformed

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t4.setVisible(false);
        t6.setVisible(false);
        t5.setVisible(false);
        l6.setVisible(false);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(false);
        l5.setVisible(false);
        l1.setText("Valor inicial");
        l2.setText("Delta");
        bGraficar.setVisible(true);
        
    }//GEN-LAST:event_rbBusquedasActionPerformed

    private void rbBiseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBiseccionActionPerformed

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(true);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(true);
        l1.setText("Limite inferior");
        l2.setText("Tolerancia");
        l6.setText("Limite superior");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbBiseccionActionPerformed

    private void rbReglaFalsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReglaFalsaActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(true);
        t4.setVisible(false);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(true);
        l1.setText("Limite inferior");
        l2.setText("Tolerancia");
        l6.setText("Limite superior");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbReglaFalsaActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed

        PantallaMetodos metodos = new PantallaMetodos();
        metodos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bAtrasActionPerformed

    private void rbPuntoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPuntoFijoActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t5.setVisible(false);
        t6.setVisible(false);
        t4.setVisible(true);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(false);
        l6.setVisible(false);
        l2.setText("Tolerancia");
        l4.setText("g(x)");
        l1.setText("Valor inicial");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbPuntoFijoActionPerformed

    private void rbNewtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNewtonActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t6.setVisible(false);
        t5.setVisible(false);
        t4.setVisible(true);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        l5.setVisible(false);
        l6.setVisible(false);
        l2.setText("Tolerancia");
        l4.setText("f'(x)");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbNewtonActionPerformed

    private void rbSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSecanteActionPerformed
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        tFuncion.setVisible(true);
        t1.setVisible(true);
        t3.setVisible(true);
        t2.setVisible(true);
        t6.setVisible(true);
        t4.setVisible(false);
        t5.setVisible(false);
        lfuncion.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(true);
        l2.setText("Tolerancia");
        l4.setText("f'(x)");
        l6.setText("Valor inicial 2");
        bGraficar.setVisible(true);
    }//GEN-LAST:event_rbSecanteActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
       
        try{

        if (rbBusquedas.isSelected()){
      
            fun = getFuncion();
            xant = getValor1();
            inc = getIncremento();
            iter = getIteraciones();
            metodo = 1;
            MetodosUnaVariable.busquedasIncrementales(fun, xant, inc, iter);
            cont = Funciones.MetodosUnaVariable.cont;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }

      
      if (rbBiseccion.isSelected()){
          
          fun = getFuncion();
          double xi = getValor1();
          double xs = getValor2();
          int iter = getIteraciones();
          double tol = getTolerancia();
          

           if (rbRelativo.isSelected()){
            error = true;
          }else {error = false;}

          if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
              MetodosUnaVariable.Biseccion(fun, xi, xs, tol, iter,error);
              metodo = 2;
              ResultadosUnaVariable ruv = new ResultadosUnaVariable();
              ruv.setVisible(true);
            }
      }
        if (rbReglaFalsa.isSelected()){

            fun = getFuncion();
            double xi = getValor1();
            double xs = getValor2();
            int iter = getIteraciones();
            double tol = getTolerancia();

            if (rbRelativo.isSelected()){
            error = true;
          }else {error = false;}
            
            if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
            MetodosUnaVariable.reglaFalsa(fun,xi, xs, tol,iter, error);
            metodo  = 3;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }
        }

        if (rbPuntoFijo.isSelected()){

            fun = getFuncion();
            String fun2 = getFuncion2();
            double xa = getValor1();
            int iter = getIteraciones();
            double tol = getTolerancia();
            
             if (rbRelativo.isSelected()){
                error = true;
            }else {error = false;}

            if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
            MetodosUnaVariable.puntoFijo(fun, fun2, xa, tol, iter, error);
            metodo = 4;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }
        }

        if (rbNewton.isSelected()){

            fun = getFuncion();
            String derivada = getFuncion2();
            double x = getValor1();
            int iter = getIteraciones();
            double tol = getTolerancia();
             if (rbRelativo.isSelected()){
                error = true;
            }else {error = false;}

            if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
            MetodosUnaVariable.newton(fun, derivada, x, tol, iter, error);
            metodo = 5;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }

        }

        if (rbSecante.isSelected()){

            fun = getFuncion();
            double x0 = getValor1();
            double x1 = getValor2();
            int iter = getIteraciones();
            double tol = getTolerancia();

            if (rbRelativo.isSelected()){
                error = true;
            }else {error = false;}

            if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
            MetodosUnaVariable.secante(fun, x0, x1, tol, iter, error);
            metodo = 6;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }
        }

        if (rbRaicesMultiples.isSelected()){

            fun = getFuncion();
            String derivada = getFuncion2();
            String sderivada = getFuncion3();
            double x0 = getValor1();
            double tol = getTolerancia();
            int iter = getIteraciones();

            if (rbRelativo.isSelected()){
                error = true;
            }else {error = false;}

            if (!rbAbsoluto.isSelected() && !rbRelativo.isSelected()){
                JOptionPane.showMessageDialog(this, "Por favor elija un tipo de error");
            }else{
            MetodosUnaVariable.raicesMultiples(fun, derivada, sderivada, x0, tol, iter, error);
            metodo = 7;
            ResultadosUnaVariable ruv = new ResultadosUnaVariable();
            ruv.setVisible(true);
            }

        }
         }catch(Exception e){
             e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Por favor ingrese correctamente los valores requeridos");
        }
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGraficarActionPerformed
        try {
            
            Graficador g = new Graficador(getFuncion());
            g.setVisible(true);
        } catch (JepException ex) {
            Logger.getLogger(PantallaMetodosUnaVariable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGraficarActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaMetodosUnaVariable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bGraficar;
    private javax.swing.ButtonGroup bgError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel lfuncion;
    private javax.swing.JRadioButton rbAbsoluto;
    private javax.swing.JRadioButton rbBiseccion;
    private javax.swing.JRadioButton rbBusquedas;
    private javax.swing.JRadioButton rbNewton;
    private javax.swing.JRadioButton rbPuntoFijo;
    private javax.swing.JRadioButton rbRaicesMultiples;
    private javax.swing.JRadioButton rbReglaFalsa;
    private javax.swing.JRadioButton rbRelativo;
    private javax.swing.JRadioButton rbSecante;
    private javax.swing.ButtonGroup rgUnaVariable;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField tFuncion;
    // End of variables declaration//GEN-END:variables

}
