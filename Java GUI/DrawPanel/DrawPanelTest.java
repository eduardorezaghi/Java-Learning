// Figura 4.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel.

import java.awt.Color;

import javax.swing.JFrame;

public class DrawPanelTest
{
    public static void main(String[] args) 
    {
        // cria um painel que contém o desenho
        DrawPanel panel = new DrawPanel();
        // cria um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // configura o frame para ser encerrado quando fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);       // adiciona o painel ao frame
        application.setSize(250,250); // configura o tam. do frame
        application.setVisible(true); // torna o frame visível
    }
}