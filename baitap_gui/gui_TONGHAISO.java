/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap_gui;
import java.awt.*;
import java.awt.event.*;

public class gui_TONGHAISO extends Frame 
{
    private Label lbeNum1, lbeNum2 , lbeTong;
    private TextField txtNum1,txtNum2,txttong;
    private Button btnTong;
    
    public gui_TONGHAISO()
    {
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("Tinh tong hai so");
        // Label và TextField cho Num 1
        lbeNum1 = new Label("Num 1:");              //khoi tao doi tuong
        lbeNum1.setBounds(50,50,100,30);            //xac dinh vi tri va kich thuoc
        this.add(lbeNum1);                          //dat vao khung chua
        txtNum1 = new TextField();
        txtNum1.setBounds(150,50,150,30);
        this.add(txtNum1);
        
        // Label và TextField cho Num 2
        lbeNum2 = new Label("Num 2:");              //khoi tao doi tuong
        lbeNum2.setBounds(50,100,100,30);            //xac dinh vi tri va kich thuoc
        this.add(lbeNum2);                          //dat vao khung chua
        txtNum2 = new TextField();
        txtNum2.setBounds(150, 100, 150, 30); 
        this.add(txtNum2);
        
        // Label và TextField hiển thị kết quả tổng
        lbeTong = new Label("Tong:");              //khoi tao doi tuong
        lbeTong.setBounds(50,200,100,30);            //xac dinh vi tri va kich thuoc
        this.add(lbeTong);                          //dat vao khung chua
        txttong = new TextField();
        txttong.setBounds(150,200,150,30);
        this.add(txttong);
        // Button tính tổng
        btnTong = new Button("Tính Tổng");
        btnTong.setBounds(150, 150, 100, 40);
        this.add(btnTong);
        
        // Xử lý sự kiện khi nhấn nút
        btnTong.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    int num1 = Integer.parseInt(txtNum1.getText());
                    int num2 = Integer.parseInt(txtNum2.getText());
                    int tong = num1 + num2;
                    txttong.setText(String.valueOf(tong));
                } 
                catch (NumberFormatException ex) 
                {
                    txttong.setText("Lỗi nhập liệu!");
                }
            }
        });
        // Đóng cửa sổ khi nhấn nút X
        this.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });
        
        this.btnTong.addActionListener(new MyActionEvent(txtNum1,txtNum2,txttong));
        
        this.addWindowListener(new WindowAdapter()
        {
			public void windowClosing(WindowEvent e)
			{ 
                            System.exit(0); 
			}
        });	

    }    
}
    
