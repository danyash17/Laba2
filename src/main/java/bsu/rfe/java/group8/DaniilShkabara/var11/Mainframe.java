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
private JTextField textFieldX;
private JTextField textFieldY;
private JTextField textFieldZ;
private JTextField textFieldResult;
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
private void addRadioButton(String buttonName, final int formulaId){
JRadioButton button = new JRadioButton(buttonName);
button.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ev) {
Mainframe.this.formulaId = formulaId;
}
});
radioButtons.add(button);
hboxFormulaType.add(button);
}
// Конструктор класса
public Mainframe() {
super("Вычисление формулы");
setSize(WIDTH, HEIGHT);
Toolkit kit = Toolkit.getDefaultToolkit();
// Отцентрировать окно приложения на экране
setLocation((kit.getScreenSize().width - WIDTH)/2,
(kit.getScreenSize().height - HEIGHT)/2);
hboxFormulaType.add(Box.createHorizontalGlue());
addRadioButton("Формула 1", 1);
addRadioButton("Формула 2", 2);
radioButtons.setSelected(
radioButtons.getElements().nextElement().getModel(), true);
hboxFormulaType.add(Box.createHorizontalGlue());
hboxFormulaType.setBorder(
BorderFactory.createLineBorder(Color.YELLOW));
// Создать область с полями ввода для X и Y
JLabel labelForX = new JLabel("X:");
textFieldX = new JTextField("0", 10);
textFieldX.setMaximumSize(textFieldX.getPreferredSize());
JLabel labelForY = new JLabel("Y:");
textFieldY = new JTextField("0", 10);
textFieldY.setMaximumSize(textFieldY.getPreferredSize());
JLabel labelForZ = new JLabel("Y:");
textFieldZ = new JTextField("0", 10);
textFieldZ.setMaximumSize(textFieldY.getPreferredSize());
Box hboxVariables = Box.createHorizontalBox();
hboxVariables.setBorder(
BorderFactory.createLineBorder(Color.RED));
hboxVariables.add(Box.createHorizontalGlue());
hboxVariables.add(labelForX);
hboxVariables.add(Box.createHorizontalStrut(10));
hboxVariables.add(textFieldX);
hboxVariables.add(Box.createHorizontalStrut(100));
hboxVariables.add(labelForY);
hboxVariables.add(Box.createHorizontalStrut(10));
hboxVariables.add(textFieldY);
hboxVariables.add(Box.createHorizontalGlue());
hboxVariables.add(Box.createHorizontalStrut(100));
hboxVariables.add(labelForZ);
hboxVariables.add(Box.createHorizontalStrut(10));
hboxVariables.add(textFieldZ);
hboxVariables.add(Box.createHorizontalGlue());
// Создать область для вывода результата
JLabel labelForResult = new JLabel("Результат:");
//labelResult = new JLabel("0");
textFieldResult = new JTextField("0", 10);
textFieldResult.setMaximumSize(
textFieldResult.getPreferredSize());
Box hboxResult = Box.createHorizontalBox();
hboxResult.add(Box.createHorizontalGlue());
hboxResult.add(labelForResult);
hboxResult.add(Box.createHorizontalStrut(10));
hboxResult.add(textFieldResult);
hboxResult.add(Box.createHorizontalGlue());
hboxResult.setBorder(BorderFactory.createLineBorder(Color.BLUE));
// Создать область для кнопок
JButton buttonCalc = new JButton("Вычислить");
buttonCalc.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ev) {
try {
 Double x = Double.parseDouble(textFieldX.getText());
 Double y = Double.parseDouble(textFieldY.getText());
 Double z = Double.parseDouble(textFieldZ.getText());
 Double result;
 if (formulaId==1)
result = f1(x,y,z);
 else
result = f2(x,y,z);
 textFieldResult.setText(result.toString());
} catch (NumberFormatException ex) {
JOptionPane.showMessageDialog(Mainframe.this,
"Ошибка в формате записи числа с плавающей точкой", "Ошибочный формат числа",
JOptionPane.WARNING_MESSAGE);
}
}
});
JButton buttonReset = new JButton("Очистить поля");
buttonReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ev) {
textFieldX.setText("0");
textFieldY.setText("0");
textFieldResult.setText("0");
}
});
Box hboxButtons = Box.createHorizontalBox();
hboxButtons.add(Box.createHorizontalGlue());
hboxButtons.add(buttonCalc);
hboxButtons.add(Box.createHorizontalStrut(30));
hboxButtons.add(buttonReset);
hboxButtons.add(Box.createHorizontalGlue());
hboxButtons.setBorder(
BorderFactory.createLineBorder(Color.GREEN));
// Связать области воедино в компоновке BoxLayout
Box contentBox = Box.createVerticalBox();
contentBox.add(Box.createVerticalGlue());
contentBox.add(hboxFormulaType);
contentBox.add(hboxVariables);
contentBox.add(hboxResult);
contentBox.add(hboxButtons);
contentBox.add(Box.createVerticalGlue());
getContentPane().add(contentBox, BorderLayout.CENTER);
}

}
