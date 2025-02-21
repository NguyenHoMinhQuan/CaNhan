/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_gui;
import  java.awt.*;
import  java.awt.event.*;
/**
 *
 * @author AD
 */
public class MyActionEvent implements   ActionListener
{
    private   Component num1,num2,num3;
    
    public   MyActionEvent(Component n1,Component n2,Component n3)
    {
      this.num1=n1;
      this.num2=n2;
      this.num3=n3;
      
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int Num1=Integer.parseInt(((TextField)num1).getText());
        int Num2=Integer.parseInt(((TextField)num2).getText());
            int tong=Num1+Num2;
            ((TextField)num3).setText(String.valueOf(tong));
    }
    
    
}
