package br.bossini;

import javax.swing.*;
import java.awt.*;

public class TesteTela {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Exemplo de Tela");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setMinimumSize(new Dimension(1024, 768));
    frame.setLayout(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();

    // Linha 0
    c.gridx = 0; // coluna
    c.gridy = 0; // linha
    c.weightx = 0; // peso horizontal (esse fica com peso zero e outro com 100%)
    c.weighty = 1; // peso vertical
    c.gridwidth = 1; // quantidade de colunas
    // top, left, bottom, right
    c.insets = new Insets(5, 5, 5, 5); // espaçamento de 5 pixels em todos os lados
    c.anchor = GridBagConstraints.NORTHWEST; // fixo a esquerda e no topo para quando expandir
    frame.add(new JLabel("Assunto:"), c); // adiciona o componente ao frame

    c.gridx = 1;
    c.gridy = 0;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1;
    c.weighty = 1;
    c.gridwidth = 3;
    c.insets = new Insets(5, 5, 5, 5);
    c.anchor = GridBagConstraints.NORTHWEST;
    frame.add(new JTextField(15), c);

    // Linha 1
    c.gridx = 0;
    c.gridy = 1;
    c.weightx = 0;
    c.weighty = 1;
    c.gridwidth = 1;
    c.insets = new Insets(5, 5, 5, 5); 
    c.anchor = GridBagConstraints.NORTH;
    frame.add(new JLabel("Tipo: "), c);

    c.gridx = 1;
    c.gridy = 1;
    c.weightx = 1;
    c.weighty = 1;
    c.gridwidth = 3;
    c.insets = new Insets(5, 5, 5, 5);
    c.anchor = GridBagConstraints.NORTHWEST;
    c.fill = GridBagConstraints.HORIZONTAL;
    ButtonGroup tipoGroup = new ButtonGroup();
    JRadioButton dissertativaRadio = new JRadioButton("Dissertativa");
    JRadioButton alternativaRadio = new JRadioButton("Alternativa");
    tipoGroup.add(dissertativaRadio);
    tipoGroup.add(alternativaRadio);
    JPanel tipoPanel = new JPanel();
    tipoPanel.add(dissertativaRadio);
    tipoPanel.add(alternativaRadio);
    frame.add(tipoPanel, c);

    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

}
