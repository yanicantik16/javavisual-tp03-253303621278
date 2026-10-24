package com.unpri.charactermanager.view;

import com.unpri.charactermanager.model.Character;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private final ArrayList<Character> characterList;

    public MainWindow(ArrayList<Character> characterList) {
        this.characterList = new ArrayList<>(characterList);

        setTitle("Character Manager - TP8");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel(
                "CHARACTER MANAGER",
                SwingConstants.CENTER
        );
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBorder(
                BorderFactory.createEmptyBorder(20, 10, 10, 10)
        );

        add(titleLabel, BorderLayout.NORTH);

        JPanel characterPanel = new JPanel();
        characterPanel.setLayout(
                new BoxLayout(characterPanel, BoxLayout.Y_AXIS)
        );
        characterPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 20, 10, 20)
        );

        for (Character character : characterList) {
            JPanel card = new JPanel(new GridLayout(0, 1, 5, 5));
            card.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.GRAY),
                    BorderFactory.createEmptyBorder(10, 15, 10, 15)
            ));
            card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 130));
            card.setAlignmentX(Component.LEFT_ALIGNMENT);

            card.add(new JLabel("Nama: " + character.getName()));
            card.add(new JLabel("Tipe: " + character.getType()));
            card.add(new JLabel("Level: " + character.getLevel()));
            card.add(new JLabel("Hit Points: " + character.getHitPoints()));
            card.add(new JLabel("Attack Power: " + character.getAttackPower()));

            characterPanel.add(card);
            characterPanel.add(Box.createVerticalStrut(10));
        }

        JScrollPane scrollPane = new JScrollPane(characterPanel);
        add(scrollPane, BorderLayout.CENTER);

        double averageLevel = 0.0;

        if (!characterList.isEmpty()) {
            int totalLevel = 0;

            for (Character character : characterList) {
                totalLevel += character.getLevel();
            }

            averageLevel = (double) totalLevel / characterList.size();
        }

        JLabel summaryLabel = new JLabel(
                "Total Karakter: " + characterList.size()
                + " | Rata-rata Level: "
                + String.format("%.2f", averageLevel),
                SwingConstants.CENTER
        );

        summaryLabel.setFont(new Font("Arial", Font.BOLD, 15));
        summaryLabel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 20, 10)
        );

        add(summaryLabel, BorderLayout.SOUTH);
    }
}
