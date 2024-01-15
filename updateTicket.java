import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class updateTicket {

    public static void main(String[] args) {

        // =================== Daftar Ticket Konser ======================
        String ticketKonser[][] = {
                { "Play Music Festival", "19 Agustus 2024", "150.000" },
                { "West Java Festival", "2 September 2024", "30.000" },
                { "Coolab Fest", "18 Juni 2024", "80.000" },
                { "Play Music Banduung", "22 Februari 2024", "200.000" },
                { "Bahaya Mantan Terindah", "23 Januari 2024", "100.000" } };

        JFrame container;
        JPanel navbar, main, footer, sidePadding;

        container = new JFrame("Aplikasi Ticket Konser");
        container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container.setSize(1280, 720);
        container.setLayout(new BorderLayout());
        container.setLocationRelativeTo(null);

        navbar = new JPanel();
        navbar.setLayout(new BorderLayout());
        main = new JPanel();
        main.setLayout(new BorderLayout());
        footer = new JPanel();
        sidePadding = new JPanel();

        navbar.setBackground(Color.DARK_GRAY);
        main.setBackground(Color.LIGHT_GRAY);
        footer.setBackground(Color.black);
        sidePadding.setBackground(Color.LIGHT_GRAY);

        navbar.setPreferredSize(new Dimension(100, 100));
        main.setPreferredSize(new Dimension(100, 100));
        footer.setPreferredSize(new Dimension(100, 100));
        sidePadding.setPreferredSize(new Dimension(30, 100));

        // isi Navbar
        // judul Aplikasi
        JLabel judul;
        judul = new JLabel("Aplikasi Konser");
        judul.setLayout(new BorderLayout());
        judul.setFont(new Font("Cabinet Grotesk", Font.BOLD, 50));
        judul.setForeground(Color.white);
        judul.setVerticalAlignment(JLabel.CENTER);
        judul.setHorizontalAlignment(JLabel.CENTER);
        navbar.add(judul, BorderLayout.CENTER);

        // Isi Main
        // Container Card
        JPanel contCard = new JPanel();
        contCard.setLayout(new BorderLayout());
        contCard.setPreferredSize(new Dimension(1280, 297));
        contCard.setBackground(Color.LIGHT_GRAY);
        main.add(contCard, BorderLayout.NORTH);

        // Card
        // Background
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setPreferredSize(new Dimension(226, 295));
        card.setBackground(new Color(0x19252E));
        contCard.add(card, BorderLayout.WEST);

        // Text
        // nama Konser
        // image
        JLabel img;
        img = new JLabel();
        img.setLayout(new BorderLayout());
        ImageIcon image = new ImageIcon(
                new ImageIcon("1.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT));
        img.setIcon(image);
        card.add(img, BorderLayout.NORTH);

        // Container Text
        JPanel contText = new JPanel();
        contText.setLayout(new BorderLayout());
        contText.setBackground(new Color(0x19252E));
        contText.setPreferredSize(new Dimension(226, 58));
        contText.setBorder(new EmptyBorder(7, 10, 7, 10));
        card.add(contText, BorderLayout.CENTER);

        // Container Button
        JPanel contBtn = new JPanel();
        contBtn.setBackground(new Color(0x19252E));
        contBtn.setPreferredSize(new Dimension(226, 100));
        card.add(contBtn, BorderLayout.SOUTH);
        Box box = Box.createVerticalBox();
        box.setPreferredSize(new Dimension(100, 100));
        ;

        // Label Text
        JLabel lblKonser;
        lblKonser = new JLabel();
        lblKonser = new JLabel(ticketKonser[0][0]);
        lblKonser.setFont(new Font("poppins", Font.BOLD, 16));
        lblKonser.setForeground(Color.white);
        contText.add(lblKonser, BorderLayout.NORTH);

        // tanggal Konser
        JLabel tglKonser;
        tglKonser = new JLabel(ticketKonser[0][1]);
        tglKonser.setLayout(new BorderLayout());
        tglKonser.setFont(new Font("poppins", Font.PLAIN, 12));
        tglKonser.setForeground(Color.LIGHT_GRAY);
        contText.add(tglKonser, BorderLayout.SOUTH);

        // button beli
        String Button[][] = {
                { "Gold", "150.000" },
                { "Silver", "100.000" },
                { "Bronze", "50.000" }
        };
        // Gold
        // button
        for (int i = 0; i < 3; i++) {
            Button btn = new Button(Button[i][0]);
            box.add(btn);
            btn.setBackground(new Color(0x25323D));
            btn.setPreferredSize(new Dimension(64, 24));
            btn.setForeground(Color.white);
            btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btn.setFocusable(false);
            Border emptyBorder = BorderFactory.createEmptyBorder();
            btn.setFont(new Font("poppins", Font.BOLD, 16));
            box.add(Box.createVerticalStrut(5));
        }

        // btnGold = new JButton("Gold");
        // btnGold.setBackground(new Color(0x25323D));
        // btnGold.setBorder(new EmptyBorder(2, 10, 2, 10));
        // btnGold.setPreferredSize(new Dimension(64, 24));
        // btnGold.setForeground(Color.white);
        // btnGold.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // btnGold.setFocusable(false);
        // btnGold.setFont(new Font("poppins", Font.BOLD, 16));
        // box.add(btnGold);

        contBtn.add(box);
        container.add(navbar, BorderLayout.NORTH);
        container.add(main, BorderLayout.CENTER);
        container.add(footer, BorderLayout.SOUTH);
        container.add(sidePadding, BorderLayout.WEST);
        container.setVisible(true);

    }
}