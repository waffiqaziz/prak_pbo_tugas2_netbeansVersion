//@author Waffiq Aziz / 123190070
package bidang2D;

import javax.swing.*;
import java.awt.event.*;
import ruang3D.Balok;

public class Main {

  public static void main(String[] args) {
    new GUI();
  }
}

class GUI extends JFrame implements ActionListener {

  String panjang, lebar, tinggi;
  Balok balok1 = new Balok();

  private static final long serialVersionUID = 1L;
  JLabel lkalkulatorBalok = new JLabel("KALKULATOR BALOK");

  JLabel lpanjang = new JLabel("Panjang Balok");
  JLabel llebar = new JLabel("Lebar Balok");
  JLabel ltinggi = new JLabel("Tinggi Balok");

  JLabel lhasil = new JLabel("HASIL");
  JLabel lluas1 = new JLabel("Luas Persegi 1");
  JLabel lluas2 = new JLabel("Luas Persegi 2");
  JLabel lluas3 = new JLabel("Luas Persegi 3");
  JLabel lluasPer = new JLabel("Luas Permukaan Balok");
  JLabel lkel1 = new JLabel("Keliling persegi 1");
  JLabel lkel2 = new JLabel("Keliling persegi 2");
  JLabel lkel3 = new JLabel("Keliling persegi 3");
  JLabel lvol = new JLabel("Volume Balok");

  JLabel lhasilLuas1 = new JLabel();
  JLabel lhasilLuas2 = new JLabel();
  JLabel lhasilLuas3 = new JLabel();
  JLabel lhasilLuasPer = new JLabel();
  JLabel lhasilKel1 = new JLabel();
  JLabel lhasilKel2 = new JLabel();
  JLabel lhasilKel3 = new JLabel();
  JLabel lhasilVol = new JLabel();

  JTextField fpanjang = new JTextField(10);
  JTextField flebar = new JTextField(10);
  JTextField ftinggi = new JTextField(10);

  JButton bsubmit = new JButton("Hitung");
  JButton breset = new JButton("Reset");

  public GUI() {
    setTitle("123190070 Waffiq Aziz");
    setSize(320, 440);

    setLayout(null);
    add(lkalkulatorBalok);
    add(lpanjang);
    add(llebar);
    add(ltinggi);
    add(lhasil);
    add(fpanjang);
    add(flebar);
    add(ftinggi);
    add(bsubmit);
    add(breset);
    add(lluas1);
    add(lluas2);
    add(lluas3);
    add(lluasPer);
    add(lkel1);
    add(lkel2);
    add(lkel3);
    add(lvol);
    add(lhasil);
    add(lhasilKel1);
    add(lhasilKel2);
    add(lhasilKel3);
    add(lhasilLuas1);
    add(lhasilLuas2);
    add(lhasilLuas3);
    add(lhasilLuasPer);
    add(lhasilVol);

    breset.addActionListener((ActionListener) this);
    bsubmit.addActionListener((ActionListener) this);

    // sett bounds(m,n,o,p) >>> (sumbu-x,sumbu-y,panjang komponen, tinggi komponen)
    lkalkulatorBalok.setBounds(100, 10, 320, 20);
    lpanjang.setBounds(40, 50, 120, 20);
    llebar.setBounds(40, 90, 120, 20);
    ltinggi.setBounds(40, 130, 120, 20);

    fpanjang.setBounds(145, 50, 120, 20);
    flebar.setBounds(145, 90, 120, 20);
    ftinggi.setBounds(145, 130, 120, 20);
    bsubmit.setBounds(60, 170, 80, 20);
    breset.setBounds(170, 170, 80, 20);

    lhasil.setBounds(133, 210, 120, 20);
    lkel1.setBounds(40, 230, 120, 20);
    lkel2.setBounds(40, 250, 120, 20);
    lkel3.setBounds(40, 270, 120, 20);
    lluas1.setBounds(40, 290, 120, 20);
    lluas2.setBounds(40, 310, 120, 20);
    lluas3.setBounds(40, 330, 120, 20);
    lluasPer.setBounds(40, 350, 140, 20);
    lvol.setBounds(40, 370, 140, 20);

    lhasilKel1.setBounds(200, 230, 140, 20);
    lhasilKel2.setBounds(200, 250, 140, 20);
    lhasilKel3.setBounds(200, 270, 140, 20);
    lhasilLuas1.setBounds(200, 290, 140, 20);
    lhasilLuas2.setBounds(200, 310, 140, 20);
    lhasilLuas3.setBounds(200, 330, 140, 20);
    lhasilLuasPer.setBounds(200, 350, 140, 20);
    lhasilVol.setBounds(200, 370, 140, 20);

    lhasil.setVisible(false);
    lkel1.setVisible(false);
    lkel2.setVisible(false);
    lkel3.setVisible(false);
    lluas1.setVisible(false);
    lluas2.setVisible(false);
    lluas3.setVisible(false);
    lluasPer.setVisible(false);
    lvol.setVisible(false);

    setVisible(true);

    setDefaultCloseOperation(EXIT_ON_CLOSE); // running program akan berhenti jika jframe ditutup

    setLocationRelativeTo(null); // membuat frame muncul di tengah layar

  }

  public static boolean isNumeric(String strNum) {
    if (strNum == null) {
      return false;
    }
    try {
      double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  public static void infoBox(String infoMessage, String titleBar) {
    JOptionPane.showMessageDialog(null, infoMessage, "Message " + titleBar, JOptionPane.INFORMATION_MESSAGE);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == breset) { // jika tombol reset ditekan
      // clear textfield
      fpanjang.setText(null);
      ftinggi.setText(null);
      flebar.setText(null);

      // set textfield & label not visible
      lhasil.setVisible(false);
      lkel1.setVisible(false);
      lkel2.setVisible(false);
      lkel3.setVisible(false);
      lluas1.setVisible(false);
      lluas2.setVisible(false);
      lluas3.setVisible(false);
      lluasPer.setVisible(false);
      lvol.setVisible(false);

      lhasilKel1.setVisible(false);
      lhasilKel2.setVisible(false);
      lhasilKel3.setVisible(false);
      lhasilLuas1.setVisible(false);
      lhasilLuas2.setVisible(false);
      lhasilLuas3.setVisible(false);
      lhasilLuasPer.setVisible(false);
      lhasilVol.setVisible(false);

      fpanjang.requestFocus();
    }
    if (e.getSource() == bsubmit) {

      panjang = fpanjang.getText();
      lebar = flebar.getText();
      tinggi = ftinggi.getText();

      if (panjang.isEmpty() || lebar.isEmpty() || tinggi.isEmpty()) {
        fpanjang.requestFocus();
        infoBox("Empty Text Field", "Error");
      } else {
        if (!isNumeric(panjang) || !isNumeric(lebar) || !isNumeric(tinggi)) {
          infoBox("Input not Numeric", "Error");
          fpanjang.requestFocus();
        } else if (isNumeric(panjang) && isNumeric(lebar) && isNumeric(tinggi)) {
          int p = Integer.parseInt(panjang);
          int l = Integer.parseInt(lebar);
          int t = Integer.parseInt(tinggi);

          balok1.setValue(p, l, t);

          lhasil.setVisible(true);
          lkel1.setVisible(true);
          lkel2.setVisible(true);
          lkel3.setVisible(true);
          lluas1.setVisible(true);
          lluas2.setVisible(true);
          lluas3.setVisible(true);
          lluasPer.setVisible(true);
          lvol.setVisible(true);

          lhasilKel1.setVisible(true);
          lhasilKel2.setVisible(true);
          lhasilKel3.setVisible(true);
          lhasilLuas1.setVisible(true);
          lhasilLuas2.setVisible(true);
          lhasilLuas3.setVisible(true);
          lhasilLuasPer.setVisible(true);
          lhasilVol.setVisible(true);

          lhasilKel1.setText(Float.toString(balok1.getKel1()));
          lhasilKel2.setText(Float.toString(balok1.getKel2()));
          lhasilKel3.setText(Float.toString(balok1.getKel3()));
          lhasilLuas1.setText(Float.toString(balok1.getLuas1()));
          lhasilLuas2.setText(Float.toString(balok1.getLuas2()));
          lhasilLuas3.setText(Float.toString(balok1.getLuas3()));
          lhasilLuasPer.setText(Float.toString(balok1.getLuasPer()));
          lhasilVol.setText(Float.toString(balok1.getVol()));
        }
      }
    }
  }
}
