package mypack;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class EmpClient 	extends Frame implements ActionListener
{
	Label lblesal,lblename,lbleno;
	TextField txteno,txtename,txtesal;
	Button btninsert,btnupdate,btnnew,btnselect;
	Contract c;
	EmpClient() throws ClassNotFoundException,SQLException
	{
		ApplicationContext ac=new FileSystemXmlApplicationContext("EmpCfg.xml");
		 c=(Contract)ac.getBean("e");

		setSize(400,400);
		setTitle("userPad");
		setLocation(100,100);	
		setLayout(null);

		lblesal=new Label("eno");
		lblename=new Label("ename");
		lbleno=new Label("esal");

		txteno=new TextField();
		txtename=new TextField();
		txtesal=new TextField();

		btninsert=new Button("INSERT");
		btnupdate=new Button("UPDATE");
		btnnew=new Button("NEW DATA");
		btnselect=new Button("select");

		lblesal.setBounds(50,80,90,20);
		lblename.setBounds(50,100,90,20);
		lbleno.setBounds(50,120,90,20);

		txteno.setBounds(150,80,90,20);
		txtename.setBounds(150,100,90,20);	
		txtesal.setBounds(150,120,90,20);

		btninsert.setBounds(50,140,90,20);
		btnupdate.setBounds(150,140,90,20);
		btnnew.setBounds(50,160,90,20);
		btnselect.setBounds(150,160,90,20);

		btninsert.addActionListener(this);
		btnupdate.addActionListener(this);
		btnnew.addActionListener(this);
		btnselect.addActionListener(this);

		add(lblesal);
		add(lblename);
		add(lbleno);
		add(txteno);
		add(txtename);
		add(txtesal);
		add(btninsert);
		add(btnupdate);
		add(btnnew);
		add(btnselect);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		Object b=e.getSource();
		try
		{
		if(b==btninsert)
		{
			Integer eno=Integer.parseInt(txteno.getText());
			String ename=txtename.getText();
			Integer esal=Integer.parseInt(txtesal.getText());
		
			Emp emp=new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			
			int x=c.addRecord(emp);
		
			System.out.println("record added" + emp.getEno()+ " " + emp.getEname() + " " + emp.getEsal());
			
		}
		else if(b==btnupdate)
		{
			Integer eno=Integer.parseInt(txteno.getText());
			String ename=txtename.getText();
			Integer esal=Integer.parseInt(txtesal.getText());
		
	
			Emp emp=new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			
			int y=c.updateRecord(emp);
			System.out.println(y+"record updated");
		
		}
		else if(b==btnselect)
		{
			Integer eno=Integer.parseInt(txteno.getText());

			c.findRecord(eno);
		}
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
	}
	
	public static void main(String[] args) throws SQLException
	{
		try {
			
			new EmpClient();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}

	}

}
