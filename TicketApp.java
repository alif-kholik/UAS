import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicketApp {

    private static final Color BACKGROUND_COLOR = new Color(5, 18, 27);
    private static final Color CARD_COLOR = new Color(25, 37, 46);
    private static final Color BUTTON_COLOR = new Color(0, 151, 255);

    private static JPanel shop;
    private static JTextField formNama, formEmail, formWA, formJudul, formTgl, formPrice, formTotal, jumlah;

    public static void main(String[] args) {
        String[][] ticketKonser = {
                { "Play Music Festival", "19 Agustus 2024", "150.000" },
                { "West Java Festival", "2 September 2024", "30.000" },
                { "Coolab Fest", "18 Juni 2024", "80.000" },
                { "Play Music Banduung", "22 Februari 2024", "200.000" },
                { "Bahaya Mantan Terindah", "23 Januari 2024", "100.000" }
        };

        JFrame form = new JFrame("Aplikasi Ticket Konser");
        form.setPreferredSize(new Dimension(1280, 720));
        form.setLayout(new BorderLayout());
        form.getContentPane().setBackground(BACKGROUND_COLOR);

        JLabel judul = new JLabel("Aplikasi Konser");
        judul.setHorizontalAlignment(SwingConstants.CENTER);
        judul.setFont(new Font("Cabinet Grotesk", Font.BOLD, 50));
        judul.setForeground(Color.white);
        form.add(judul, BorderLayout.NORTH);

        JPanel ticketPanel = createTicketPanel(ticketKonser);
        form.add(ticketPanel, BorderLayout.CENTER);

        shop = createPurchasePanel();
        form.add(shop, BorderLayout.SOUTH);

        form.pack();
        form.setLocationRelativeTo(null);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
    }

    private static JPanel createTicketPanel(String[][] ticketKonser) {
        JPanel ticketPanel = new JPanel(new GridLayout(1, 5, 10, 0));
        ticketPanel.setBackground(BACKGROUND_COLOR);

        for (int i = 0; i < ticketKonser.length; i++) {
            JPanel card = createCard(ticketKonser[i]);
            ticketPanel.add(card);
        }

        return ticketPanel;
    }

    private static JPanel createCard(String[] ticketData) {
        JPanel card = new JPanel(new GridBagLayout());
        card.setBackground(CARD_COLOR);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridheight = 267;
        gbc.gridwidth = 226;

        JLabel imageLabel = createImageLabel();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        card.add(imageLabel, gbc);

        createLabel(ticketData[0], ticketData[1], card, gbc, 1, GridBagConstraints.WEST);
        createLabel("", "", card, gbc, 2, GridBagConstraints.CENTER);
        createLabel("Rp." + ticketData[2], "", card, gbc, 3, GridBagConstraints.WEST);

        JButton buyButton = createBuyButton();
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        card.add(buyButton, gbc);

        return card;
    }

    private static JLabel createImageLabel() {
        JLabel imageLabel = new JLabel();
        imageLabel.setIcon(
                new ImageIcon(new ImageIcon("4.jpg").getImage().getScaledInstance(226, 137, Image.SCALE_DEFAULT)));
        return imageLabel;
    }

    private static void createLabel(String labelText, String value, JPanel panel, GridBagConstraints gbc, int gridY,
            int anchor) {
        JLabel label = new JLabel(labelText);
        label.setFont(new Font("poppins", Font.BOLD, 16));
        label.setForeground(Color.white);
        gbc.gridy = gridY;
        gbc.anchor = anchor;
        gbc.gridwidth = 2;
        panel.add(label, gbc);

        JLabel valueLabel = new JLabel(value);
        valueLabel.setFont(new Font("poppins", Font.PLAIN, 12));
        valueLabel.setForeground(new Color(175, 181, 186));
        gbc.gridy = gridY + 1;
        panel.add(valueLabel, gbc);
    }

    private static JButton createBuyButton() {
        JButton buyButton = new JButton("Pilih Ticket");
        buyButton.setBackground(BUTTON_COLOR);
        buyButton.setForeground(Color.white);
        buyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return buyButton;
    }

    private static JPanel createPurchasePanel() {
        JPanel shop = new JPanel();
        shop.setBackground(CARD_COLOR);
        shop.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        createLabel("Isi Data Pembeli", "", shop, gbc, 0, GridBagConstraints.CENTER);
        createLabel("Beli Ticket", "", shop, gbc, 0, GridBagConstraints.CENTER);

        String[] labels = { "Nama", "Email", "No WA" };
        JTextField[] fields = { formNama, formEmail, formWA };

        for (int i = 0; i < labels.length; i++) {
            createLabel(labels[i], "", shop, gbc, i + 1, GridBagConstraints.WEST);
            JTextField textField = createTextField();
            fields[i] = textField;
            shop.add(textField, gbc);
        }

        JButton sendButton = createSendButton();
        shop.add(sendButton, gbc);

        return shop;
    }

    private static JTextField createTextField() {
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(240, 28));
        textField.setBackground(BUTTON_COLOR);
        textField.setBorder(null);
        textField.setFont(new Font("poppins", Font.PLAIN, 16));
        textField.setForeground(Color.white);
        textField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));
        return textField;
    }

    private static JButton createSendButton() {
        JButton sendButton = new JButton("Save");
        sendButton.setBackground(BUTTON_COLOR);
        sendButton.setOpaque(true);
        sendButton.setBorder(null);
        sendButton.setForeground(Color.white);
        sendButton.setFont(new Font("poppins", Font.PLAIN, 16));
        sendButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleSendButtonClick();
            }
        });

        return sendButton;
    }

    private static void handleSendButtonClick() {
        // Implement the logic when the "Save" button is clicked
        // You can access formNama, formEmail, formWA, etc. to get the entered values
    }
}
