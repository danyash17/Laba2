/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsu.rfe.java.group8.DaniilShkabara.var11;

/**
 *
 * @author Даня
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Mainframe extends JFrame {
    private final int h=600;
    private final int w=600;
    // Текстовые поля для считывания значений переменных,
// как компоненты, совместно используемые в различных методах
private JTextField textFieldX;
private JTextField textFieldY;
// Текстовое поле для отображения результата,
// как компонент, совместно используемый в различных методах
private JTextField textFieldResult;
// Группа радио-кнопок для обеспечения уникальности выделения в группе
private ButtonGroup radioButtons = new ButtonGroup();
// Контейнер для отображения радио-кнопок
private Box hboxFormulaType = Box.createHorizontalBox();
private int formulaId = 1;
public double f1(double x,double y,double z){
    return (1/Math.sqrt(x)+Math.cos(Math.exp(y))+Math.cos(z*z))/Math.pow(Math.log((1+z)*(1+z))+Math.sqrt(Math.exp(Math.cos(y))+Math.sin(3.14*x)*Math.sin(3.14*x)), 1/3);
}
public double f2(double x,double y,double z){
return Math.atan(Math.pow(z, 1/x))/(y*y+z*Math.sin(Math.log(x)));
}

}
