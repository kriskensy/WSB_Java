package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
public class Prog11 extends JFrame {
    public static void main(String[] args) {
        Prog11 okno = new Prog11("Okno z czym się da");
        okno.init(); //inicjujemy
        okno.setVisible(true); //i pokazujemy okno
    }
    Prog11(String tytul) {
        //To taki maly konstruktor
        super(tytul);
    }
    void init() {
        //Tu nadajemy parametry naszemu oknu
        setSize(500, 300);
        setBackground(Color.decode("#124469"));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ustalamy sposób rozmieszczania komponentów
        setLayout(new FlowLayout());
        // definiujemy i dodajemy komponenty
        JTextField text1 = new JTextField(25);
        add( text1 );
        text1.setText("Oto text");
        JButton b1 = new JButton("Pierwszy");
        add(b1);
        JButton b2 = new JButton("Drugi");
        add(b2);
        JTextArea obszar = new JTextArea("Tu jaki napis", 12, 20);
        add( new JScrollPane(obszar));
        JLabel lab = new JLabel("Ala ma kota");
        add(lab);
    }
}