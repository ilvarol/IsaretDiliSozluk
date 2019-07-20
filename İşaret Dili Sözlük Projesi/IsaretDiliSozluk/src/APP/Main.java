package APP;

import LIB.Queries;
import LIB.Validator;
import PROPERTIES.WordProperty;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    Validator vld = new Validator();
    Queries queries = new Queries();

    public Main() {
        initComponents();
        FillDt(false);
        File file = new File(System.getProperty("user.dir") + "/Videos");
        if (!file.exists()) {
            file.mkdir();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dt = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        txt3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KELİME");

        txt1.setToolTipText("Kelime");
        txt1.setName(""); // NOI18N

        jButton1.setText("EKLE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt2.setToolTipText("Dosya Yolu");
        txt2.setName("txt2"); // NOI18N

        jLabel3.setText("DOSYA YOLU");

        jButton2.setText("SEÇ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dt.setModel(new javax.swing.table.DefaultTableModel(
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
        dt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dt);

        jButton3.setText("Ara");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt3.setToolTipText("Dosya Yolu");
        txt3.setName("txt2"); // NOI18N
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt3KeyPressed(evt);
            }
        });

        jButton4.setText("Seçili Olanı Sil");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Silme Modu : KAPALI");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1)
                                    .addComponent(txt2)))
                            .addComponent(txt3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String newPath = "";
        if (vld.validationJtxt(txt1, txt2)) {
            try {
                DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                Date date = new Date();
                newPath = System.getProperty("user.dir") + "/Videos/" + dateFormat.format(date) + ".mp4";
                CopyFile(file, new File(newPath));

                WordProperty wp = new WordProperty();
                wp.setWordID("null");
                wp.setWord(txt1.getText().trim());
                wp.setFile(("/Videos/" + dateFormat.format(date) + ".mp4"));
                if (queries.AddWord(wp)) {
                    JOptionPane.showMessageDialog(this, "Sözcük Eklendi");
                    FillDt(false);
                    vld.temizle(txt1, txt2);
                    txt2.enable();
                } else {
                    JOptionPane.showMessageDialog(this, "Zaten Mevcut!");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(dt, "lütfen düzgün bir dosya yolu giriniz !");
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    int selectedRowIndex = -1;
    private void dtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtMouseClicked

        try {
            if (!mode) {
                Desktop.getDesktop().open(new File(System.getProperty("user.dir") + wps.get(dt.getSelectedRow()).getFile()));
            } else {
                selectedRowIndex = Integer.parseInt(wps.get(dt.getSelectedRow()).getWordID());
            }

        } catch (IOException ex) {
        }
    }//GEN-LAST:event_dtMouseClicked

    File file = null;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Filter filter = new Filter();
        JFileChooser choose = new JFileChooser();
        choose.setFileFilter(filter);
        int returnVal = choose.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            file = choose.getSelectedFile();
            txt2.setText(file.getAbsolutePath());
            txt2.disable();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        FillDt(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Object[] options = {"EVET", "HAYIR"};
        int input = JOptionPane.showOptionDialog(null, wps.get(dt.getSelectedRow()).getWord() + " kelimesini sözlükten silmek istediğinize emin misiniz ?", "UYARI",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);
        if (input == JOptionPane.OK_OPTION) {
            File file = new File(System.getProperty("user.dir") + wps.get(dt.getSelectedRow()).getFile());
            file.delete();
            queries.DelWord(selectedRowIndex);
            FillDt(false);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    boolean mode = false;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (!mode) {
            mode = true;
            jButton5.setText(jButton5.getText().replaceAll("KAPALI", "AÇIK"));
            jButton5.setBackground(Color.red);
        } else {
            mode = false;
            jButton5.setText(jButton5.getText().replaceAll("AÇIK", "KAPALI"));
            jButton5.setBackground(null);
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void txt3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            FillDt(true);
        }
    }//GEN-LAST:event_txt3KeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables

    ArrayList<WordProperty> wps = null;

    private void FillDt(boolean Search) {
        DefaultTableModel dtm = null;
        if (Search) {
            wps = queries.GetWords(txt3.getText());
        } else {
            wps = queries.GetWords();
        }

        dtm = new DefaultTableModel();
        dtm.addColumn("Sözcük");

        for (WordProperty item : wps) {
            String[] dizi = {item.getWord()};
            dtm.addRow(dizi);
        }
        dt.setModel(dtm);
    }

    public static void CopyFile(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;
        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }
}

class Filter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file) {
        // Sadece directorylere ve XML dosyalarına izin verilmektedir.
        return file.isDirectory() || file.getAbsolutePath().endsWith(".mp4");
    }

    @Override
    public String getDescription() {
        // Bu tanımlama dialogda gösterilecektir.
        return "MP4 DOSYALARI (.mp4)";
    }
}
