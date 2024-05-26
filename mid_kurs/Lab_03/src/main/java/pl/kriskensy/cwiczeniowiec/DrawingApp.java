package pl.kriskensy.cwiczeniowiec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawingApp extends JFrame {

    private JPanel drawingPanel;
    private JButton closeButton;
    private ArrayList<Point> points = new ArrayList<>();

    public DrawingApp() {
        setTitle("app");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
        addComponenstToFrame();
    }

    private void initComponents() {
        drawingPanel = new JPanel(){
            @Override
            protected void paintComponent (Graphics g){
                super.paintComponent(g);
                drawPoints(g);
                drawingPanel.repaint();
            }
        };

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                points.add(e.getPoint());
                drawingPanel.repaint();
            }
        });

        closeButton = new JButton("close");
        closeButton.addActionListener(e -> dispose());
    }

    private void addComponenstToFrame() {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(drawingPanel, BorderLayout.CENTER);
        getContentPane().add(closeButton, BorderLayout.SOUTH);
    }

    private void drawPoints(Graphics g) {
        g.setColor(Color.MAGENTA);

        for (Point point : points) {
            //g.fillOval(point.x, point.y, 10, 10);
            g.drawRect(200,200,100,100);
        }

        if(points.size() > 1) {
            g.setColor(Color.RED);
            Point previousPoint = points.get(0);

            for (int i = 1; i < points.size(); i++) {
                Point currentPoint = points.get(i);
                g.drawLine(previousPoint.x, previousPoint.y, currentPoint.x, currentPoint.y);
                previousPoint = currentPoint;
            }
        }
    }
}
