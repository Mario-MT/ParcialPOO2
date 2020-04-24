/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modocompra;

import Farmacia.FarmaciaNZMM;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nesto
 */
public final class Compra extends javax.swing.JFrame {

    DefaultTableModel modeloreg;
    DefaultTableModel detalle;
    int per = 0, cont;
    double total;
    String Tcarga, nombre, telefono;
    DefaultTableModel modelom;
    public ArrayList<Registro> lReg = new ArrayList<>();
    public ArrayList<ReFarmaco> lreFar = new ArrayList<>();
    public ArrayList<TipoFarmaco> lFar;

    public Compra() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jTabbedPane1.setSelectedIndex(0);
        modeloreg = (DefaultTableModel) this.jTable3.getModel();
        modelom = (DefaultTableModel) this.jTable4.getModel();
        detalle = (DefaultTableModel) this.jTable2.getModel();
        lFar = new ArrayList();
        CargarProveedores();
        ingresarDatos();
        f();
        cargarTipos();

    }

    void f() {

        txtnombre.setVisible(false);
        lbProveedor.setVisible(false);
        lbTel.setVisible(false);
        txtTelefono.setVisible(false);
        CBProveedor.setVisible(false);
    }

    public void CargarProveedores() {
        this.lReg.add(new Registro("Laboratorios Lopez", "2440-1234"));
        this.lReg.get(0).lreFar = new ArrayList();
        this.lReg.get(0).lreFar.add(new ReFarmaco("Analgesico", "Metamizol", "caja", 25, 12.50, 312.5));
        this.lReg.get(0).lreFar.add(new ReFarmaco("Analgesico", "Ibuprofeno", "caja", 25, 10.50, 262.5));
        this.lReg.get(0).lreFar.add(new ReFarmaco("Antiácidos y antiulcerosos", "Dolofin", "caja", 12, 12.50, 150.00));
        this.lReg.add(new Registro("Laboratorios Suizo", "2440-4321"));
        this.lReg.get(1).lreFar = new ArrayList();
        this.lReg.get(1).lreFar.add(new ReFarmaco("Analgesico", "Acetosil", "caja", 25, 12.50, 312.5));
        this.lReg.get(1).lreFar.add(new ReFarmaco("Antialergico", "Ambroxol", "caja", 25, 10.50, 262.5));
        this.lReg.get(1).lreFar.add(new ReFarmaco("otros", "Alcohol", "caja", 12, 12.50, 150.00));

    }

    public void ingresarDatos() {

        this.lFar.add(new TipoFarmaco("Analgesico", new ArrayList()));
        this.lFar.get(0).getMedicamento().add("Acetaminofen");
        this.lFar.get(0).getMedicamento().add("Dolofin");
        this.lFar.get(0).getMedicamento().add("Acetosil");
        this.lFar.get(0).getMedicamento().add("Diclofenalco");
        this.lFar.get(0).getMedicamento().add("Ibuprofeno");
        this.lFar.get(0).getMedicamento().add("Paracetamol");
        this.lFar.get(0).getMedicamento().add("Metamizol");
        this.lFar.add(new TipoFarmaco("Antiácidos y antiulcerosos", new ArrayList()));
        this.lFar.get(1).getMedicamento().add("Ranitidina");
        this.lFar.get(1).getMedicamento().add("Omeprazol");
        this.lFar.get(1).getMedicamento().add("Acexamato de zinc");
        this.lFar.get(1).getMedicamento().add("Nizatidina");
        this.lFar.get(1).getMedicamento().add("ALka-Zelzer");
        this.lFar.add(new TipoFarmaco("Antialérgicos", new ArrayList()));
        this.lFar.get(2).getMedicamento().add("Fexofenadina");
        this.lFar.get(2).getMedicamento().add("Loratadina");
        this.lFar.get(2).getMedicamento().add("Levocetirizina");
        this.lFar.get(2).getMedicamento().add("Olopatadina");
        this.lFar.get(2).getMedicamento().add("Ambroxol");
        this.lFar.get(2).getMedicamento().add("Alerdes");
        this.lFar.add(new TipoFarmaco("Antidiarreicos y laxantes", new ArrayList()));
        this.lFar.get(3).getMedicamento().add("Alka-AD");
        this.lFar.get(3).getMedicamento().add("Yodoclorina");
        this.lFar.get(3).getMedicamento().add("Paracetamol");
        this.lFar.get(3).getMedicamento().add("Codeina");
        this.lFar.add(new TipoFarmaco("Antiinfecciosos", new ArrayList()));
        this.lFar.get(4).getMedicamento().add("Amoxicilina");
        this.lFar.get(4).getMedicamento().add("Penicilina");
        this.lFar.get(4).getMedicamento().add("Cloranfenicol");
        this.lFar.get(4).getMedicamento().add("Fluconazol");
        this.lFar.add(new TipoFarmaco("Antiinflamatorios", new ArrayList()));
        this.lFar.get(5).getMedicamento().add("Meloxicam");
        this.lFar.get(5).getMedicamento().add("Dermisona");
        this.lFar.get(5).getMedicamento().add("Diclofenaco");
        this.lFar.add(new TipoFarmaco("Antitusivos y mucolíticos", new ArrayList()));
        this.lFar.get(6).getMedicamento().add("Tabcin");
        this.lFar.get(6).getMedicamento().add("ViroGrip");
        this.lFar.get(6).getMedicamento().add("Palagrip");
        this.lFar.get(6).getMedicamento().add("Jarabe Zorritone");
        this.lFar.get(6).getMedicamento().add("Fluibron");
        this.lFar.add(new TipoFarmaco("Otros", new ArrayList()));
        this.lFar.get(7).getMedicamento().add("Vermex");
        this.lFar.get(7).getMedicamento().add("Espasmofin");
        this.lFar.get(7).getMedicamento().add("Urofin");
        this.lFar.get(7).getMedicamento().add("Tiamina100");
        this.lFar.get(7).getMedicamento().add("Alcohol");
        this.lFar.get(7).getMedicamento().add("Algodon");
        this.lFar.get(7).getMedicamento().add("suero");

    }

    private void cargarTipos() {
        this.jComboBox2.removeAllItems();
        for (int i = 0; i < this.lFar.size(); i++) {
            this.jComboBox2.addItem(this.lFar.get(i).getTipo());
        }
    }

    private void cargarnombres(int pIdSuc) {
        this.jComboBox3.removeAllItems();
        for (int i = 0; i < this.lFar.get(pIdSuc).getMedicamento().size(); i++) {
            this.jComboBox3.addItem(this.lFar.get(pIdSuc).getMedicamento().get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Gruposino = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lbTel = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        Spcantidad = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbprecio = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        lbProveedor = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtnombre = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CBProveedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        LBTotal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        lbTel.setText("N° Telefono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        Spcantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Datos Medicamento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Datos del proveedor");

        lbprecio.setText("precio");

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        lbProveedor.setText("Proveedores ");

        jToggleButton2.setText("Finalizar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Nuevo proveedor");

        jLabel3.setText("Tipo de Farmaco");

        Gruposino.add(jRadioButton1);
        jRadioButton1.setText("Si");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Gruposino.add(jRadioButton2);
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("nombre medicamento");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre", "Uni/caja", "cantidad", "precio", "subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(120);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(120);
            jTable2.getColumnModel().getColumn(3).setMinWidth(60);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable2.getColumnModel().getColumn(4).setMinWidth(50);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(5).setMinWidth(60);
            jTable2.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Detalle de Productos");

        jLabel5.setText("Cantidad");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Total inversion");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Unidades");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Cajas");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(227, 227, 227))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbprecio)
                                .addGap(18, 18, 18)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 45, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(Spcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(LBTotal))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbProveedor)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addComponent(lbTel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CBProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbProveedor))))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton3)
                        .addComponent(jRadioButton4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Spcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToggleButton1)
                        .addComponent(jToggleButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbprecio)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(LBTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de compra", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Lista de proveedores");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "nombre", "Uni/caja", "Cantidad", "precio", "subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(2).setMinWidth(70);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(70);
            jTable4.getColumnModel().getColumn(3).setMinWidth(70);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable4.getColumnModel().getColumn(4).setMinWidth(50);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable4.getColumnModel().getColumn(4).setMaxWidth(50);
            jTable4.getColumnModel().getColumn(5).setMinWidth(60);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable4.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Detalle de compra");

        jLabel12.setText("Buscar");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("IR A MODO VENTA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro de proveedores", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Registro de compra");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        f();
        txtnombre.setVisible(true);
        lbTel.setVisible(true);
        txtTelefono.setVisible(true);

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        f();

        lbProveedor.setVisible(true);
        CBProveedor.setVisible(true);
        this.CBProveedor.removeAllItems();
        for (int i = 0; i < this.lReg.size(); i++) {
            this.CBProveedor.addItem(this.lReg.get(i).getNombre());
        }

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        this.cargarnombres(this.jComboBox2.getSelectedIndex());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        lbprecio.setText("Precio por Unidad");
        Tcarga = "Unidad";
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        lbprecio.setText("Precio por Caja");
        Tcarga = "caja";
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        for (int i = 0; i < this.lReg.size(); i++) {

            String[] registroP = {
                this.lReg.get(i).getNombre(),
                this.lReg.get(i).getTelefono()

            };
            modeloreg.addRow(registroP);
        }
        jTable1.setModel(modeloreg);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        modelom.getDataVector().removeAllElements();

        int indiceCliente = this.jTable3.getSelectedRow();
        int cantPedidos = this.lReg.get(indiceCliente).lreFar.size();
        for (int j = 0; j < cantPedidos; j++) {
            String[] registroP = {
                this.lReg.get(indiceCliente).lreFar.get(j).Tipo,
                this.lReg.get(indiceCliente).lreFar.get(j).nom,
                this.lReg.get(indiceCliente).lreFar.get(j).carga,
                Integer.toString(this.lReg.get(indiceCliente).lreFar.get(j).cantidad),
                Double.toString(this.lReg.get(indiceCliente).lreFar.get(j).precioU),
                Double.toString(this.lReg.get(indiceCliente).lreFar.get(j).Tinversion)

            };
            modelom.addRow(registroP);
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        int cantidad;
        double precio = Double.parseDouble(txtprecio.getText());
        cantidad = (int) Spcantidad.getValue();
        total += cantidad * precio;
        Double subT;
        subT = cantidad * precio;
        String[] tabla = {jComboBox2.getSelectedItem().toString(),
            jComboBox3.getSelectedItem().toString(),
            Tcarga,
            Spcantidad.getValue().toString(),
            txtprecio.getText(),
            subT.toString()};
        detalle.addRow(tabla);
        jTable2.setModel(detalle);
        String mt = String.valueOf(total);
        LBTotal.setText(mt);
        txtprecio.setText("");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        per = this.lReg.size();
        if (jRadioButton1.isSelected()) {
            nombre = txtnombre.getText();
            telefono = txtTelefono.getText();
        } else {
            nombre = CBProveedor.getSelectedItem().toString();
            telefono = this.lReg.get(CBProveedor.getSelectedIndex()).getTelefono();
        }
        for (int i = 0; i < 1; i++) {
            this.lReg.add(new Registro(nombre, telefono));

            this.lReg.get(per).lreFar = new ArrayList<>();
            for (int j = 0; j < jTable2.getRowCount(); j++) {
                String tipomed = jTable2.getValueAt(j, 0).toString();
                String nombremed = jTable2.getValueAt(j, 1).toString();
                String carga = jTable2.getValueAt(j, 2).toString();
                int cantidad = Integer.parseInt((String) jTable2.getValueAt(j, 3));
                double precio = Double.parseDouble((String) jTable2.getValueAt(j, 4));
                double subto = Double.parseDouble((String) jTable2.getValueAt(j, 5));

                this.lReg.get(per).lreFar.add(new ReFarmaco(tipomed, nombremed, carga, cantidad, precio, subto));
            }
        }
        //per+=1;
        total = 0;
        txtprecio.setText("");

        this.LBTotal.setText("");
        detalle.getDataVector().removeAllElements();

    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            this.modeloreg.setRowCount(0);
            this.detalle.setRowCount(0);

            String clienteBusq = this.jTextField3.getText();
            cont = 0;
            int n = this.lReg.size();

            for (int i = 0; i <= n + 1; i++) {
                cont += i;
                if (this.lReg.get(i).nombre.equals(clienteBusq)) {
                    break;
                }
            }
            String[] registro = {this.lReg.get(cont).getNombre(),
                this.lReg.get(cont).getTelefono()
            };
            this.modeloreg.addRow(registro);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El proveedor " + this.jTextField3.getText() + " no fue encontrado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        modelom.getDataVector().removeAllElements();
        modeloreg.getDataVector().removeAllElements();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO LETRAS");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMEROS");
    }//GEN-LAST:event_txtTelefonoKeyTyped
    }
    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "INGRESE SOLO NUMEROS");
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FarmaciaNZMM v = new FarmaciaNZMM();
        v.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Compra().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBProveedor;
    private javax.swing.ButtonGroup Gruposino;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JSpinner Spcantidad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel lbProveedor;
    private javax.swing.JLabel lbTel;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
