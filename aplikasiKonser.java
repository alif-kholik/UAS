import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

public class aplikasiKonser {

    public static void main(String[] args) {

        // Deklarasi
        JLabel judul, img1, img2, img3, img4, img5, text1, text2, text3, text4, text5, Rp;
        JPanel card1, card2, card3, card4, card5, shop;
        JButton btn1, btn2, btn3, btn4, btn5;
        Color abu = new Color(175, 181, 186);
        Color colorBtn = new Color(37, 50, 61);
        Color biru = new Color(0, 151, 255);

        // =================== Daftar Ticket Konser ======================
        String ticketKonser[][] = {
                { "Play Music Festival", "19 Agustus 2024", "150.000" },
                { "West Java Festival", "2 September 2024", "30.000" },
                { "Coolab Fest", "18 Juni 2024", "80.000" },
                { "Play Music Banduung", "22 Februari 2024", "200.000" },
                { "Bahaya Mantan Terindah", "23 Januari 2024", "100.000" } };

        // =================== container open ======================

        // Container Aplikasi
        JFrame form = new JFrame("Aplikasi Ticket Konser");

        // mengatur ukuran container
        form.setPreferredSize(new Dimension(1280, 720));

        // agar di tengah
        form.setLayout(null);

        // membuat exit program berjalan
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // agar posisi container di tengah
        form.setLocationRelativeTo(null);

        // Background
        form.getContentPane().setBackground(new Color(5, 18, 27));

        // =================== container closed ======================

        // judul Aplikasi
        judul = new JLabel("Aplikasi Konser");
        judul.setBounds(460, 28, 361, 74);
        judul.setFont(new Font("Cabinet Grotesk", Font.BOLD, 50));
        judul.setForeground(Color.white);
        form.add(judul);

        // =================== card Open ====================

        // =========================== banner 1 =============================
        img1 = new JLabel();
        img1.setBounds(46, 128, 226, 137);
        img1.setIcon(
                new ImageIcon(new ImageIcon("1.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        form.add(img1);

        // ================== text banner 1 =======================
        card1 = new JPanel();
        card1.setBounds(46, 266, 226, 130);
        card1.setBackground(new Color(25, 37, 46));
        card1.setLayout(null);
        form.add(card1);
        // nama Konser
        text1 = new JLabel(ticketKonser[0][0]);
        text1.setBounds(20, 15, 195, 18);
        text1.setFont(new Font("poppins", Font.BOLD, 16));
        text1.setForeground(Color.white);
        card1.add(text1);
        // tanggal Konser
        text1 = new JLabel(ticketKonser[0][1]);
        text1.setBounds(20, 40, 195, 14);
        text1.setFont(new Font("poppins", Font.PLAIN, 12));
        text1.setForeground(abu);
        card1.add(text1);
        // Harga Konser
        Rp = new JLabel("Rp.");
        Rp.setBounds(20, 75, 29, 14);
        Rp.setFont(new Font("poppins", Font.BOLD, 16));
        Rp.setForeground(Color.white);
        text1 = new JLabel(ticketKonser[0][2]);
        text1.setBounds(49, 75, 195, 14);
        text1.setFont(new Font("poppins", Font.BOLD, 16));
        text1.setForeground(Color.white);
        card1.add(text1);
        card1.add(Rp);
        // Tombol Pilih Ticket
        btn1 = new JButton("Pilih Ticket");
        btn1.setBounds(0, 100, 226, 30);
        btn1.setBackground(colorBtn);
        btn1.setOpaque(true);
        btn1.setBorder(null);
        btn1.setForeground(Color.white);
        btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        card1.add(btn1);

        // =========================== Banner 2 ===============================
        img2 = new JLabel();
        img2.setBounds(286, 128, 226, 137);
        img2.setIcon(
                new ImageIcon(new ImageIcon("2.jpeg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        form.add(img2);

        // =========================== text banner 2 =============================
        card2 = new JPanel();
        card2.setBounds(286, 266, 226, 130);
        card2.setBackground(new Color(25, 37, 46));
        card2.setLayout(null);
        form.add(card2);
        // nama Konser
        text2 = new JLabel(ticketKonser[1][0]);
        text2.setBounds(20, 15, 195, 18);
        text2.setFont(new Font("poppins", Font.BOLD, 16));
        text2.setForeground(Color.white);
        card2.add(text2);
        // tanggal Konser
        text2 = new JLabel(ticketKonser[1][1]);
        text2.setBounds(20, 40, 195, 14);
        text2.setFont(new Font("poppins", Font.PLAIN, 12));
        text2.setForeground(abu);
        card2.add(text2);
        // Harga Konser
        Rp = new JLabel("Rp.");
        Rp.setBounds(20, 75, 29, 14);
        Rp.setFont(new Font("poppins", Font.BOLD, 16));
        Rp.setForeground(Color.white);
        text2 = new JLabel(ticketKonser[1][2]);
        text2.setBounds(49, 75, 195, 14);
        text2.setFont(new Font("poppins", Font.BOLD, 16));
        text2.setForeground(Color.white);
        card2.add(text2);
        card2.add(Rp);
        // Tombol Pilih Ticket
        btn2 = new JButton("Pilih Ticket");
        btn2.setBounds(0, 100, 226, 30);
        btn2.setBackground(colorBtn);
        btn2.setOpaque(true);
        btn2.setBorder(null);
        btn2.setForeground(Color.white);
        btn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn2.setFocusable(false);

        card2.add(btn2);

        // =========================== banner 3 =============================
        img3 = new JLabel();
        img3.setBounds(527, 128, 226, 137);
        img3.setIcon(
                new ImageIcon(new ImageIcon("3.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        form.add(img3);

        // =========================== text banner 3 =============================
        card3 = new JPanel();
        card3.setBounds(527, 266, 226, 130);
        card3.setBackground(new Color(25, 37, 46));
        card3.setLayout(null);
        form.add(card3);
        // nama Konser
        text3 = new JLabel(ticketKonser[2][0]);
        text3.setBounds(20, 15, 195, 18);
        text3.setFont(new Font("poppins", Font.BOLD, 16));
        text3.setForeground(Color.white);
        card3.add(text3);
        // tanggal Konser
        text3 = new JLabel(ticketKonser[2][1]);
        text3.setBounds(20, 40, 195, 14);
        text3.setFont(new Font("poppins", Font.PLAIN, 12));
        text3.setForeground(abu);
        card3.add(text3);
        // Harga Konser
        Rp = new JLabel("Rp.");
        Rp.setBounds(20, 75, 29, 14);
        Rp.setFont(new Font("poppins", Font.BOLD, 16));
        Rp.setForeground(Color.white);
        text3 = new JLabel(ticketKonser[2][2]);
        text3.setBounds(49, 75, 195, 14);
        text3.setFont(new Font("poppins", Font.BOLD, 16));
        text3.setForeground(Color.white);
        card3.add(text3);
        card3.add(Rp);
        // Tombol Pilih Ticket
        btn3 = new JButton("Pilih Ticket");
        btn3.setBounds(0, 100, 226, 30);
        btn3.setBackground(colorBtn);
        btn3.setOpaque(true);
        btn3.setBorder(null);
        btn3.setForeground(Color.white);
        btn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn3.setFocusable(false);
        card3.add(btn3);

        // =========================== banner 4 =============================
        img4 = new JLabel();
        img4.setBounds(767, 128, 226, 137);
        img4.setIcon(
                new ImageIcon(new ImageIcon("4.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        form.add(img4);

        // =========================== text banner 4 =============================
        card4 = new JPanel();
        card4.setBounds(767, 266, 226, 130);
        card4.setBackground(new Color(25, 37, 46));
        card4.setLayout(null);
        form.add(card4);
        // nama Konser
        text4 = new JLabel(ticketKonser[3][0]);
        text4.setBounds(20, 15, 195, 18);
        text4.setFont(new Font("poppins", Font.BOLD, 16));
        text4.setForeground(Color.white);
        card4.add(text4);
        // tanggal Konser
        text4 = new JLabel(ticketKonser[3][1]);
        text4.setBounds(20, 40, 195, 14);
        text4.setFont(new Font("poppins", Font.PLAIN, 12));
        text4.setForeground(abu);
        card4.add(text4);
        // Harga Konser
        Rp = new JLabel("Rp.");
        Rp.setBounds(20, 75, 29, 14);
        Rp.setFont(new Font("poppins", Font.BOLD, 16));
        Rp.setForeground(Color.white);
        text4 = new JLabel(ticketKonser[3][2]);
        text4.setBounds(49, 75, 195, 14);
        text4.setFont(new Font("poppins", Font.BOLD, 16));
        text4.setForeground(Color.white);
        card4.add(text4);
        card4.add(Rp);
        // Tombol Pilih Ticket
        btn4 = new JButton("Pilih Ticket");
        btn4.setBounds(0, 100, 226, 30);
        btn4.setBackground(colorBtn);
        btn4.setOpaque(true);
        btn4.setBorder(null);
        btn4.setForeground(Color.white);
        btn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn4.setFocusable(false);

        card4.add(btn4);

        // =========================== banner 5 =============================
        img5 = new JLabel();
        img5.setBounds(1008, 128, 226, 137);
        img5.setIcon(
                new ImageIcon(new ImageIcon("5.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        form.add(img5);

        // =========================== text banner 5 =============================
        card5 = new JPanel();
        card5.setBounds(1008, 266, 226, 130);
        card5.setBackground(new Color(25, 37, 46));
        card5.setLayout(null);
        form.add(card5);
        // nama Konser
        text5 = new JLabel(ticketKonser[4][0]);
        text5.setBounds(20, 15, 195, 18);
        text5.setFont(new Font("poppins", Font.BOLD, 16));
        text5.setForeground(Color.white);
        card5.add(text5);
        // tanggal Konser
        text5 = new JLabel(ticketKonser[4][1]);
        text5.setBounds(20, 40, 195, 14);
        text5.setFont(new Font("poppins", Font.PLAIN, 12));
        text5.setForeground(abu);
        card5.add(text5);
        // Harga Konser
        Rp = new JLabel("Rp.");
        Rp.setBounds(20, 75, 29, 14);
        Rp.setFont(new Font("poppins", Font.BOLD, 16));
        Rp.setForeground(Color.white);
        text5 = new JLabel(ticketKonser[4][2]);
        text5.setBounds(49, 75, 195, 14);
        text5.setFont(new Font("poppins", Font.BOLD, 16));
        text5.setForeground(Color.white);
        card5.add(text5);
        card5.add(Rp);
        // Tombol Pilih Ticket
        btn5 = new JButton("Pilih Ticket");
        btn5.setBounds(0, 100, 226, 30);
        btn5.setBackground(colorBtn);
        btn5.setOpaque(true);
        btn5.setBorder(null);
        btn5.setForeground(Color.white);
        btn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn5.setFocusable(false);

        card5.add(btn5);

        // ==================== card Closed ====================

        // ===================== Pembelian Open ======================

        // ===================== Container Pembelian ======================
        shop = new JPanel();
        shop.setBounds(46, 425, 1188, 255);
        shop.setBackground(new Color(25, 37, 46));
        shop.setLayout(null);
        form.add(shop);

        // ===================== Data Peserta ======================
        // deklarasi
        JLabel lblNama, lblEmail, lblWA, h1, h2, lblJudul, lblTgl, lblPrice, lblJumlah, RpTotal;
        JTextField formNama, formEmail, formWA, formJudul, formTgl, formPrice, formTotal, jumlah;
        JButton send, btnBeli;
        JLabel iyah = new JLabel();
        iyah.setText("iyah");

        // Judul pembeli
        h1 = new JLabel("Isi Data Pembeli");
        h1.setBounds(38, 27, 359, 29);
        h1.setFont(new Font("Cabinet Grotesk", Font.BOLD, 28));
        h1.setForeground(Color.white);
        shop.add(h1);

        // Judul beli ticket
        h2 = new JLabel("Beli Ticket");
        h2.setBounds(489, 27, 359, 29);
        h2.setFont(new Font("Cabinet Grotesk", Font.BOLD, 28));
        h2.setForeground(Color.white);
        shop.add(h2);

        // Form Pembeli
        // Label Nama
        lblNama = new JLabel("Nama");
        lblNama.setBounds(38, 85, 52, 23);
        lblNama.setFont(new Font("poppins", Font.BOLD, 16));
        lblNama.setForeground(Color.white);
        shop.add(lblNama);

        // form Nama
        formNama = new JTextField();
        formNama.setBounds(160, 85, 240, 28);
        formNama.setBackground(colorBtn);
        formNama.setBorder(null);
        formNama.setFont(new Font("poppins", Font.PLAIN, 16));
        formNama.setForeground(Color.white);
        formNama.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formNama);

        // Label Email
        lblEmail = new JLabel("Email");
        lblEmail.setBounds(38, 125, 52, 23);
        lblEmail.setFont(new Font("poppins", Font.BOLD, 16));
        lblEmail.setForeground(Color.white);
        shop.add(lblEmail);

        // form Email
        formEmail = new JTextField();
        formEmail.setBounds(160, 125, 240, 28);
        formEmail.setBackground(colorBtn);
        formEmail.setBorder(null);
        formEmail.setFont(new Font("poppins", Font.PLAIN, 16));
        formEmail.setForeground(Color.white);
        formEmail.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formEmail);

        // Label WA
        lblWA = new JLabel("No WA");
        lblWA.setBounds(38, 165, 100, 23);
        lblWA.setFont(new Font("poppins", Font.BOLD, 16));
        lblWA.setForeground(Color.white);
        shop.add(lblWA);

        // form WA
        formWA = new JTextField();
        formWA.setBounds(160, 165, 240, 28);
        formWA.setBackground(colorBtn);
        formWA.setBorder(null);
        formWA.setFont(new Font("poppins", Font.PLAIN, 16));
        formWA.setForeground(Color.white);
        formWA.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formWA);

        // Send Data
        send = new JButton("Save");
        send.setBounds(300, 205, 100, 28);
        send.setBackground(biru);
        send.setOpaque(true);
        send.setBorder(null);
        send.setForeground(Color.white);
        send.setFont(new Font("poppins", Font.PLAIN, 16));
        send.setCursor(new Cursor(Cursor.HAND_CURSOR));

        send.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (formNama.getText().isEmpty() && formEmail.getText().isEmpty() && formWA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Form Masih Kosong", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else if (formNama.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Form Nama Belum Terisi", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else if (formEmail.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Form Email Belum Terisi", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else if (formWA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Form No WA Belum Terisi", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(form, "Data Berhasil Tersimpan");
                    iyah.setText("tidak");
                    formNama.setEnabled(false);
                    formEmail.setEnabled(false);
                    formWA.setEnabled(false);
                }
            }

        });
        shop.add(send);

        // ====================== Form Beli Ticket ==========================
        // Label Judul Konser
        lblJudul = new JLabel("Judul Konser");
        lblJudul.setBounds(489, 85, 200, 23);
        lblJudul.setFont(new Font("poppins", Font.BOLD, 16));
        lblJudul.setForeground(Color.white);
        shop.add(lblJudul);

        // form Judul Konser
        formJudul = new JTextField();
        formJudul.setBounds(652, 85, 240, 28);
        formJudul.setBackground(colorBtn);
        formJudul.setBorder(null);
        formJudul.setFont(new Font("poppins", Font.PLAIN, 16));
        formJudul.setForeground(Color.white);
        formJudul.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formJudul);

        // Label Tanggal Konser
        lblTgl = new JLabel("Tanggal");
        lblTgl.setBounds(489, 125, 100, 23);
        lblTgl.setFont(new Font("poppins", Font.BOLD, 16));
        lblTgl.setForeground(Color.white);
        shop.add(lblTgl);

        // form Tanggal Konser
        formTgl = new JTextField();
        formTgl.setBounds(652, 125, 240, 28);
        formTgl.setBackground(colorBtn);
        formTgl.setBorder(null);
        formTgl.setFont(new Font("poppins", Font.PLAIN, 16));
        formTgl.setForeground(Color.white);
        formTgl.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formTgl);

        // Label Harga
        lblPrice = new JLabel("Harga");
        lblPrice.setBounds(489, 165, 100, 23);
        lblPrice.setFont(new Font("poppins", Font.BOLD, 16));
        lblPrice.setForeground(Color.white);
        shop.add(lblPrice);

        // form Harga
        formPrice = new JTextField();
        formPrice.setBounds(652, 165, 240, 28);
        formPrice.setBackground(colorBtn);
        formPrice.setBorder(null);
        formPrice.setFont(new Font("poppins", Font.PLAIN, 16));
        formPrice.setForeground(Color.white);
        formPrice.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formPrice);

        // Label Jumlah
        lblPrice = new JLabel("Jumlah");
        lblPrice.setBounds(489, 210, 100, 23);
        lblPrice.setFont(new Font("poppins", Font.BOLD, 16));
        lblPrice.setForeground(Color.white);
        shop.add(lblPrice);

        // ===================== form Total ============================
        // Form TOTAL
        RpTotal = new JLabel("Rp.");
        RpTotal.setBounds(957, 215, 29, 14);
        RpTotal.setFont(new Font("poppins", Font.BOLD, 16));
        RpTotal.setForeground(Color.white);
        shop.add(RpTotal);

        formTotal = new JTextField();
        formTotal.setBounds(998, 205, 148, 28);
        formTotal.setFont(new Font("poppins", Font.PLAIN, 16));
        formTotal.setForeground(Color.white);
        formTotal.setBorder(null);
        formTotal.setBackground(colorBtn);
        formTotal.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(formTotal);
        // ===================== form Total ============================

        // Jumlah
        jumlah = new JTextField();
        jumlah.setBounds(652, 205, 240, 28);
        jumlah.setFont(new Font("poppins", Font.PLAIN, 16));
        jumlah.setForeground(Color.white);
        jumlah.setBorder(null);
        jumlah.setBackground(colorBtn);
        jumlah.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        shop.add(jumlah);

        jumlah.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {

                    int intJumlah = Integer.parseInt(jumlah.getText());

                    if (intJumlah > 5) {
                        JOptionPane.showMessageDialog(form, "Tidak Bisa Membeli Lebih dari 5", "Alert",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        double intPrice = Double.parseDouble(formPrice.getText());
                        String jmlhTotal = String.valueOf(intPrice * intJumlah);
                        formTotal.setText(jmlhTotal + "00");
                        formTotal.setEnabled(false);
                    }
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

        });

        // ===================== Tombol Beli dan Total =====================
        // Tombol Beli
        btnBeli = new JButton("Beli Ticket");
        btnBeli.setBounds(957, 85, 190, 48);
        btnBeli.setBackground(biru);
        btnBeli.setOpaque(true);
        btnBeli.setBorder(null);
        btnBeli.setForeground(Color.white);
        btnBeli.setFont(new Font("poppins", Font.PLAIN, 20));
        btnBeli.setCursor(new Cursor(Cursor.HAND_CURSOR));
        shop.add(btnBeli);

        btnBeli.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int intJumlah = Integer.parseInt(jumlah.getText());
                double intPrice = Double.parseDouble(formPrice.getText());
                String jmlhTotal = String.valueOf(intPrice * intJumlah);
                formTotal.setText(jmlhTotal + "00");
                formTotal.setEnabled(false);

                if (formJudul.getText().isEmpty() && formTgl.getText().isEmpty() && formPrice.getText().isEmpty()
                        && jumlah.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Belum Memilih Ticket", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else if (formNama.getText().isEmpty() && formEmail.getText().isEmpty()
                        && formWA.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(form, "Data Pembeli Belum Terisi", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else if (formNama.isEnabled() == true) {
                    JOptionPane.showMessageDialog(form, "Data Pembeli Belum Tersimpan", "Alert",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(form,
                            "Berhasil Membeli Ticket!!" + "\n" +
                                    "Ticket akan dikirimkan melalui email : "
                                    + formEmail.getText()
                                    + "\n" + "Terima Kasih");
                    formJudul.setText("");
                    formTgl.setText("");
                    formPrice.setText("");
                    formNama.setText("");
                    formEmail.setText("");
                    formWA.setText("");
                    formTotal.setText("");
                    jumlah.setText("");
                    formJudul.setEnabled(true);
                    formTgl.setEnabled(true);
                    formPrice.setEnabled(true);
                    formNama.setEnabled(true);
                    formEmail.setEnabled(true);
                    formWA.setEnabled(true);
                    formTotal.setEnabled(true);
                }

            }
        });

        // Total
        lblJumlah = new JLabel("Total :");
        lblJumlah.setBounds(957, 180, 102, 14);
        lblJumlah.setFont(new Font("poppins", Font.PLAIN, 12));
        lblJumlah.setForeground(Color.white);
        shop.add(lblJumlah);

        // ===================== Pembelian Closed ======================

        // Function Button Pilih Tikcet
        // Banner 1
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formJudul.setText(ticketKonser[0][0]);
                formTgl.setText(ticketKonser[0][1]);
                formPrice.setText(ticketKonser[0][2]);
                formJudul.setEnabled(false);
                formTgl.setEnabled(false);
                formPrice.setEnabled(false);
            }
        });

        // Banner 2
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formJudul.setText(ticketKonser[1][0]);
                formTgl.setText(ticketKonser[1][1]);
                formPrice.setText(ticketKonser[1][2]);
                formJudul.setEnabled(false);
                formTgl.setEnabled(false);
                formPrice.setEnabled(false);
            }
        });

        // Banner 3
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formJudul.setText(ticketKonser[2][0]);
                formTgl.setText(ticketKonser[2][1]);
                formPrice.setText(ticketKonser[2][2]);
                formJudul.setEnabled(false);
                formTgl.setEnabled(false);
                formPrice.setEnabled(false);
            }
        });

        // Banner 4
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formJudul.setText(ticketKonser[3][0]);
                formTgl.setText(ticketKonser[3][1]);
                formPrice.setText(ticketKonser[3][2]);
                formJudul.setEnabled(false);
                formTgl.setEnabled(false);
                formPrice.setEnabled(false);
            }
        });

        // Banner 5
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                formJudul.setText(ticketKonser[4][0]);
                formTgl.setText(ticketKonser[4][1]);
                formPrice.setText(ticketKonser[4][2]);
                formJudul.setEnabled(false);
                formTgl.setEnabled(false);
                formPrice.setEnabled(false);
            }
        });

        form.pack();
        // agar container tampil
        form.setVisible(true);
    }

}