package fs2;
import java.awt.*;


import javax.imageio.ImageIO;
import javax.swing.*;


import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.border.EmptyBorder;


public class DetailsDataSwing
{
 JFrame mainF,addF,viewF,deleteF,searchF,updateF,sortF;
 Container mainMenu,addMenu,viewMenu,deleteMenu,searchMenu,updateMenu,sortMenu;
 JPanel titlepan,mainMenuSelectP,addMenuSelectP,addMenuViewP,viewMenuViewP,deleteMenuSelectP,deleteMenuViewP,searchMenuSelectP,searchMenuViewP,updateMenuSelectP,updateMenuViewP,delettitle1;
 JButton b1,b2,b3,b4,b5,addMBtn,addBackB,viewBackB,deleteMBtn,deleteBackB,searchb1,searchb2,searchBackB,searchNameBtn,searchSeatTypeBtn,searchDestinationBtn,searchMBtn,updateMBtn,updateBackB,updateSelectTraceBtn;  
 JLabel title,addSeatnoL,addNameL,addSourceL,addDestinationL,addSeatTypeL,addseatnoL,addStatusL,viewtitle;
 JLabel deleteSeatnoL,deleteStatusL;
 JLabel searchNameL,searchDestinationL,searchDestination2L,searchSeatTypeL;
 JLabel updateSeatnoL,updateNameL,updateSourceL,updateDestinationL,updateSeatTypeL,updateStatusL, deletetitle;
 
 JTextField addMTextFSeatno,addMTextFName,addMTextFSource,addMTextFDestination;
 JTextField deleteMTextFSeatno;
 JTextField searchMTextFName,searchMTextFsec,searchMTextFename,searchMTextFedes;
 JTextField updateMTextFSeatno,updateMTextFName,updateMTextFSource,updateMTextFDestination;
 
 JComboBox mainMComboBox,searchMComboBox,searchMComboBSeatType,addMComboBSeatType,updateMComboBSeatType;
 JTextArea mainMTextA,addMTextA,viewMTextA,deleteMTextA,searchMTextAForView,searchMTextAForResult,updateMTextAForView,updateMTextAForResult,sortMTextAForResult;
 String Seatno, name,source, Destination, SorN, SeatType;
 String SeatnoView, nameView,sourceView, DestinationView, SorNView, seatnoView;
 String SeatnoDelView, nameDelView, sourceDelView, DestinationDelView, SorNDelView, seatnoDelView;
 String SeatnoSort, nameSort,sourceSort, DestinationSort, SorNSort, seatnoSort;
 String SeatnoDelete, nameDelete,sourceDelete, DestinationDelete, SorNDelete, seatnoDelete;
 String nameSearchSel,nameSearchSe2, DestinationSearchSel, SorNSearchSel;
 String newNameUpdate,newSourceUpdate, newSeatTypeUpdate, splittUpdate, newDestinationUpdate, recordUpdate1, SeatnoUpdate1,SeatnoUpdate2nd,recordUpdate2,choice;
 String buffer;
 long pos_array[]=new long[1000];
 String primary_array[]=new String[1000];
 String secondary_array[]=new String[1000];
 long s_pos_array[]=new long[1000];
 JLabel delSeatnoV,delNameV,delSourceV,delDestinationV,delSeatTypeV,bg;
 String delValidationSeatno,delValidationName,delValidationSource, delValidationDestination,delValidationSeatType;
 //--ValUpdate
DetailsDataSwing() 
{
	  mainF=new JFrame("Main Menu");
	  addF=new JFrame("Add Menu");
	  viewF=new JFrame("View All Menu");
	  deleteF=new JFrame("Delete Menu");
	  searchF=new JFrame("Search Menu");
	  updateF=new JFrame("Update Menu");
	  sortF=new JFrame("Sort Menu");
	 
	//--Main Menu Container
	  {

	  
	  mainMenu=mainF.getContentPane();
	 
mainMenu.setBackground(Color.DARK_GRAY);
	  
	  
	  

	   mainMenu.setVisible(true);
	   //to override the paint component
      
	   addMenu=addF.getContentPane();
	   addMenu.setBackground(Color.DARK_GRAY);
	   addMenu.setVisible(true);
	   
	   viewMenu=viewF.getContentPane();
	   viewMenu.setBackground(Color.DARK_GRAY);
	   viewMenu.setVisible(true);
	   
	   titlepan=new JPanel();
	   titlepan.setBounds(200,50,1000,100);
	   titlepan.setBackground(Color.white);
	   
	   mainMenuSelectP=new JPanel();
	   mainMenuSelectP.setBounds(530,200,400,180);
	   mainMenuSelectP.setBackground(Color.white);
	   
	   addMenuSelectP=new JPanel();
	   addMenuSelectP.setBounds(500,100,340,340);
	   addMenuSelectP.setLayout(new BoxLayout(addMenuSelectP,BoxLayout.PAGE_AXIS));
	   addMenuSelectP.setBorder(new EmptyBorder(new Insets(50, 100,50, 100)));
	   addMenuSelectP.setBackground(Color.WHITE);
	   
	   
	   viewMenuViewP=new JPanel();
	   viewMenuViewP.setBounds(350,80,720,420);
	   viewMenuViewP.setBackground(Color.WHITE);

	   //addMenuSelectP.setBorder(BorderFactory.createEmptyBorder(0,30,10,10));
	   
	   
	   addMenuViewP=new JPanel();
	   addMenuViewP.setBounds(500,450,340,100);
	   addMenuViewP.setBackground(Color.WHITE);
	   
	   deleteMenu=deleteF.getContentPane();
	   deleteMenu.setBackground(Color.DARK_GRAY);
	   deleteMenu.setVisible(true);
	   
	   
	   
	   deleteMenuSelectP=new JPanel();
	   deleteMenuSelectP.setBounds(600,475,200,80);
	   deleteMenuSelectP.setBackground(Color.gray);
	   
	   deleteMenuViewP=new JPanel();
	   deleteMenuViewP.setBounds(350,150,720,370);
	   deleteMenuViewP.setBackground(Color.gray);
	   
	   searchMenu=searchF.getContentPane();
	   searchMenu.setBackground(Color.DARK_GRAY);
	   searchMenu.setVisible(true);
	   
	   //--Search Menu Panel
	   searchMenuSelectP=new JPanel();
	   searchMenuSelectP.setBounds(100,100,400,400);
	   searchMenuSelectP.setBackground(Color.gray);
	   
	   searchMenuViewP=new JPanel();
	   searchMenuViewP.setBounds(600,100,650,400);
	   searchMenuViewP.setBackground(Color.gray);
	   
	 //--Update Menu Container
	   updateMenu=updateF.getContentPane();
	   updateMenu.setBackground(Color.DARK_GRAY);
	   updateMenu.setVisible(true);
	   
	   updateMenuSelectP=new JPanel();
	   updateMenuSelectP.setBounds(500,10,200,350);
	   updateMenuSelectP.setBackground(Color.LIGHT_GRAY);
	   
	   updateMenuViewP=new JPanel();
	   updateMenuViewP.setBounds(750,10,200,200);
	   updateMenuViewP.setBackground(Color.LIGHT_GRAY);

	   
	  }
	  {
	  
	   //add menu view
	   //--------------------------------------------------------------------------
	   //---
	   
	   addSeatnoL=new JLabel("Seatno");
	   addSeatnoL.setBounds(100,0,40,20);
	   
	   addMTextFSeatno=new JTextField();
	   addMTextFSeatno.setPreferredSize(new Dimension(60,20));
	   
	   //---
	   
	   addNameL=new JLabel("Name ");
	   addNameL.setPreferredSize(new Dimension(40,20));
	   
	   addMTextFName=new JTextField();
	   addMTextFName.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   addSourceL=new JLabel("Source ");
	   addSourceL.setPreferredSize(new Dimension(40,20));
	   
	   addMTextFSource=new JTextField();
	   addMTextFSource.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   
	   addDestinationL=new JLabel("Destination ");
	   addDestinationL.setPreferredSize(new Dimension(40,20));
	   
	   addMTextFDestination=new JTextField();
	   addMTextFDestination.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   addSeatTypeL=new JLabel("Class Type ");
	   addSeatTypeL.setPreferredSize(new Dimension(50,20));
	   
	   String selectSeatTypeAdd[]={"Select ClassType","First","Business","R-Economy","P-Economy"};
	   addMComboBSeatType=new JComboBox(selectSeatTypeAdd);
	   addMComboBSeatType.setPreferredSize(new Dimension(110,20));
	   addMBtn=new JButton("Save");
	   addMBtn.setPreferredSize(new Dimension(80,20));
	   
	   addBackB=new JButton("Back");
	   addBackB.setPreferredSize(new Dimension(80,20));
	   addMTextA=new JTextArea();
	   addMTextA.setPreferredSize(new Dimension(170,80));
	   addMTextA.setEditable(false);
	  }
	
	  {//view menu view
	   //---
	   
	  viewtitle=new JLabel("ALL RECORDS IN FILE");
	  viewtitle.setPreferredSize(new Dimension(300,30));
	  Font font = new Font("Arial Black", Font.BOLD,20);
	  viewtitle.setFont(font);
	  
	   viewBackB=new JButton("Back");
	   viewBackB.setPreferredSize(new Dimension(80,20));
	   
	   viewMTextA=new JTextArea(20, 60);
	   viewMTextA.setPreferredSize(new Dimension(700,650));
	   viewMTextA.setEditable(false);
	   
	   //---
	   //----------------------------------------------------------------
	   JScrollPane scrollView = new JScrollPane(viewMTextA,
	   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	   //----------------------------------------------------------------
	   
	   viewMenuViewP.add(viewtitle,BorderLayout.CENTER);
	   viewMenuViewP.add(scrollView,BorderLayout.CENTER);
	   viewMenuViewP.add(viewBackB,BorderLayout.NORTH);
	 //  viewMenuViewP.add(viewMTextA,BorderLayout.SOUTH);
	   
	   
	  }
	  {//delete menu view
	  deletetitle=new JLabel("ALL RECORDS IN FILE");
	  deletetitle.setPreferredSize(new Dimension(300,30));
	  Font font = new Font("Arial Black", Font.BOLD,20);
	  deletetitle.setFont(font);
	  
	   deleteSeatnoL=new JLabel("Seatno: ");
	   deleteSeatnoL.setForeground(Color.green);
	   deleteSeatnoL.setPreferredSize(new Dimension(20,20));
	   
	   deleteMTextFSeatno=new JTextField();
	   deleteMTextFSeatno.setPreferredSize(new Dimension(110,20));
	   
	   deleteMBtn=new JButton("Delete");
	   deleteMBtn.setPreferredSize(new Dimension(80,20));
	   
	   deleteStatusL=new JLabel("---Status of Delete---");
	   deleteStatusL.setPreferredSize(new Dimension(170,20));
	   
	   deleteBackB=new JButton("Back");
	   deleteBackB.setPreferredSize(new Dimension(80,20));
	   
	   deleteMTextA=new JTextArea(15, 60);
	   deleteMTextA.setPreferredSize(new Dimension(700,430));
	   deleteMTextA.setEditable(false);
	  
	  
	  JScrollPane scrollDelete = new JScrollPane(deleteMTextA,
	   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	  
	  //----------------------------------------------------------------
	  deleteMenuSelectP.add(deleteSeatnoL,BorderLayout.NORTH);
	   deleteMenuSelectP.add(deleteMTextFSeatno,BorderLayout.NORTH);
	   deleteMenuSelectP.add(deleteMBtn,BorderLayout.CENTER);
	   deleteMenuSelectP.add(deleteBackB,BorderLayout.CENTER);
	   deleteMenuSelectP.add(deleteStatusL,BorderLayout.SOUTH);
	   
	   deleteMenuViewP.add(deletetitle,BorderLayout.CENTER);
	   deleteMenuViewP.add(scrollDelete,BorderLayout.CENTER);
	  
	  }
	  {//Search menu view
	  
	  searchb1=new JButton(" SEARCH BY NAME ");
	  searchb1.setPreferredSize(new Dimension(300,30));
	  Font font1 = new Font("Arial Black",Font.BOLD, 14);
	  //searchb1.setSize(200,100);
	  searchb1.setFont(font1);
	  searchb1.setBackground(Color.LIGHT_GRAY);   
	  searchMenuSelectP.add(searchb1,BorderLayout.NORTH);
	  
	  searchb2=new JButton("SEARCH BY NAME & SOURCE");
	  searchb2.setPreferredSize(new Dimension(300,30));
	  Font font2 = new Font("Arial Black",Font.BOLD, 14);
	  //searchb1.setSize(200,100);
	  searchb2.setFont(font2);
	  searchb2.setBackground(Color.LIGHT_GRAY);   
	  searchMenuSelectP.add(searchb2,BorderLayout.NORTH);
	  
	  
	  searchNameL=new JLabel("Name: ");
	  searchNameL.setPreferredSize(new Dimension(105,40));
	   
	  searchMTextFName=new JTextField();
	  searchMTextFName.setPreferredSize(new Dimension(200,25));
	  
	  searchNameBtn=new JButton("select");
	  searchNameBtn.setPreferredSize(new Dimension(210,20));
	  //----------------------------------------------------------------
	  searchDestinationL=new JLabel("Name & Source:");
	  searchDestinationL.setPreferredSize(new Dimension(190,40));
	   
	  searchMTextFename=new JTextField();
	  searchMTextFename.setPreferredSize(new Dimension(80,20));
	  
	  searchMTextFedes=new JTextField();
	  searchMTextFedes.setPreferredSize(new Dimension(80,20));
	  
	  searchDestinationBtn=new JButton("select");
	  searchDestinationBtn.setPreferredSize(new Dimension(210,20));
	  

	  searchBackB=new JButton("BACK");
	  searchBackB.setPreferredSize(new Dimension(300,30));
	  Font font3 = new Font("Arial Black",Font.BOLD, 14);
	  //searchb1.setSize(200,100);
	  searchBackB.setFont(font3);
	  searchBackB.setBackground(Color.LIGHT_GRAY);
	  //----------------------------------------------------------------
	
	  //----------------------------------------------------------------
	  
	   searchMTextAForResult=new JTextArea(15, 50);
	   searchMTextAForResult.setPreferredSize(new Dimension(100,100));
	   searchMTextAForResult.setEditable(false);
	   
	   //---
	   //----------------------------------------------------------------
	   JScrollPane scrollSearch = new JScrollPane(searchMTextAForResult,
	   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	  
	  //---------------------------------- Display ------------------------------
	  
	 
	  searchMenuSelectP.add(searchBackB,BorderLayout.SOUTH);
	  
	  searchMenuSelectP.add(searchNameL,BorderLayout.NORTH);
	  searchMenuSelectP.add(searchMTextFName,BorderLayout.NORTH);
	  searchMenuSelectP.add(searchNameBtn,BorderLayout.NORTH);
	  
	  searchMenuSelectP.add(searchDestinationL,BorderLayout.CENTER);
	  searchMenuSelectP.add(searchMTextFename,BorderLayout.CENTER);
	  searchMenuSelectP.add(searchMTextFedes,BorderLayout.CENTER);
	  searchMenuSelectP.add(searchDestinationBtn,BorderLayout.CENTER);
	  searchMenuViewP.add(scrollSearch,BorderLayout.CENTER);
	  searchNameL.setVisible(false);
          searchMTextFName.setVisible(false);
          searchNameBtn.setVisible(false);
          
          searchDestinationL.setVisible(false);
          searchMTextFename.setVisible(false);
          searchMTextFedes.setVisible(false);
          searchDestinationBtn.setVisible(false);
	  //-------------
	  
	
	  
	  //searchMenuViewP.add(scrollSearch,BorderLayout.CENTER);

	  //----------------------------------------------------------------
	  
	  }
	  {//Update menu view
	   //----------------------------------------------------------------
	   //---
	   updateSeatnoL=new JLabel("Seatno: ");
	   updateSeatnoL.setPreferredSize(new Dimension(20,20));
	   
	   updateMTextFSeatno=new JTextField();
	   updateMTextFSeatno.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   updateSelectTraceBtn=new JButton("Select");
	   updateSelectTraceBtn.setPreferredSize(new Dimension(80,20));
	   //---
	   updateMTextAForView=new JTextArea("Tracing the details\nSeatno\nName\nDestination\nClassType\nSeatno");
	   updateMTextAForView.setPreferredSize(new Dimension(170,150));
	   updateMTextAForView.setEditable(false);
	   //---
	   
	   updateNameL=new JLabel("Name:   ");
	   updateNameL.setPreferredSize(new Dimension(70,20));
	   
	   updateMTextFName=new JTextField();
	   updateMTextFName.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   
	   updateSourceL=new JLabel("Source:   ");
	   updateSourceL.setPreferredSize(new Dimension(70,20));
	   
	   updateMTextFSource=new JTextField();
	   updateMTextFSource.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   updateDestinationL=new JLabel("Destination:");
	   updateDestinationL.setPreferredSize(new Dimension(70,20));
	   
	   updateMTextFDestination=new JTextField();
	   updateMTextFDestination.setPreferredSize(new Dimension(110,20));
	   
	   //---
	   
	   updateSeatTypeL=new JLabel("Class Type:   ");
	   updateSeatTypeL.setPreferredSize(new Dimension(70,20));
	   
	   String selectSeatTypeUpdate[]={"Select ClassType","First","Business","R-Economy","P-Economy"};
	   updateMComboBSeatType=new JComboBox(selectSeatTypeUpdate);
	   updateMComboBSeatType.setPreferredSize(new Dimension(110,20));
	   
	   updateMBtn=new JButton("Update");
	   updateMBtn.setPreferredSize(new Dimension(80,20));
	   
	   updateBackB=new JButton("Back");
	   updateBackB.setPreferredSize(new Dimension(80,20));
	   //--------------------------------------------------------------------------
	   
	   updateMTextAForResult=new JTextArea("Tracing the details result\nSeatno\nName\nSource\nDestination\nSeatType\nseatno");
	   updateMTextAForResult.setPreferredSize(new Dimension(170,150));
	   updateMTextAForResult.setEditable(false);
	   
	   updateStatusL=new JLabel("Status of update");
	   updateStatusL.setPreferredSize(new Dimension(200,20));
	   
	   //---Val
	   
	   
	   delSeatnoV=new JLabel("Enter the Seatno!!! If Seatno is of 1 Char then ignore !");
	   delSeatnoV.setPreferredSize(new Dimension(300,15));
	   delSeatnoV.setForeground(Color.RED);
	   delSeatnoV.setVisible(false);
	   
	   delNameV=new JLabel("Enter the Name!!!");
	   delNameV.setPreferredSize(new Dimension(100,10));
	   delNameV.setForeground(Color.RED);
	   delNameV.setVisible(false);
	   
	   
	   delSourceV=new JLabel("Enter the Source!!!");
	   delSourceV.setPreferredSize(new Dimension(100,10));
	   delSourceV.setForeground(Color.RED);
	   delSourceV.setVisible(false);
	   
	   delDestinationV=new JLabel("Enter the Destination!!!");
	   delDestinationV.setPreferredSize(new Dimension(100,10));
	   delDestinationV.setForeground(Color.RED);
	   delDestinationV.setVisible(false);
	   
	   delSeatTypeV=new JLabel("Select SeatType!!!");
	   delSeatTypeV.setPreferredSize(new Dimension(150,20));
	   delSeatTypeV.setForeground(Color.RED);
	   delSeatTypeV.setVisible(false);
	   
	   //---Val
	   
	   //------------------------- Display ---------------------------------------
	   updateMenuSelectP.add(updateSeatnoL,BorderLayout.NORTH);
	   updateMenuSelectP.add(updateMTextFSeatno,BorderLayout.NORTH);
	   updateMenuSelectP.add(updateSelectTraceBtn,BorderLayout.NORTH);
	   updateMenuSelectP.add(updateMTextAForView,BorderLayout.NORTH);
	   //---------------------------
	   updateMenuSelectP.add(updateNameL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMTextFName,BorderLayout.CENTER);
	   
	   updateMenuSelectP.add(updateDestinationL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMTextFDestination,BorderLayout.CENTER);
	   
	   updateMenuSelectP.add(updateSeatTypeL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMComboBSeatType,BorderLayout.CENTER);
	   
	   
	   //---------------------------
	   updateMenuSelectP.add(updateSourceL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMTextFSource,BorderLayout.CENTER);
	   
	   updateMenuSelectP.add(updateDestinationL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMTextFDestination,BorderLayout.CENTER);
	   
	   updateMenuSelectP.add(updateSeatTypeL,BorderLayout.CENTER);
	   updateMenuSelectP.add(updateMComboBSeatType,BorderLayout.CENTER);
	   
	   
	   //---------------------------
	   
	   
	   
	   
	   
	   updateMenuSelectP.add(updateMBtn,BorderLayout.SOUTH);
	   updateMenuSelectP.add(updateBackB,BorderLayout.SOUTH);
	   //----------------------------------------------------------------
	   updateMenuViewP.add(updateMTextAForResult,BorderLayout.NORTH);
	   updateMenuViewP.add(updateStatusL,BorderLayout.SOUTH);
	   //---Val
	   updateMenuSelectP.add(delSeatnoV,BorderLayout.SOUTH);
	   updateMenuSelectP.add(delNameV,BorderLayout.SOUTH);
	   updateMenuSelectP.add(delSourceV,BorderLayout.SOUTH);
	   updateMenuSelectP.add(delDestinationV,BorderLayout.SOUTH);
	   updateMenuSelectP.add(delSeatTypeV,BorderLayout.SOUTH);
	   //---Val
	   
	   
	   
	   //----------------------------------------------------------------
	  }
	  
	  {
	  title=new JLabel("AIRLINE TICKET MANAGEMENT SYSTEM");
	  title.setPreferredSize(new Dimension(600,100));
	  Font font = new Font("Arial Black", Font.BOLD,22);
	  title.setFont(font);
	  
	  
	  }
	  {//--setting all frames visiblity to true
	   
	  mainF.setVisible(true);
	
	  mainF.setLayout(null);
	  addF.setVisible(false);
	  addF.setLayout(null);
	  
	  viewF.setVisible(false);
	  viewF.setLayout(null);
	  
	  deleteF.setVisible(false);
	  deleteF.setLayout(null);

	  searchF.setVisible(false);
	  searchF.setLayout(null);
	  
	  updateF.setVisible(false);
	  updateF.setLayout(null);
	  
	  }
	  {
	  mainMenu.add(titlepan,BorderLayout.CENTER);
	  mainMenu.add(mainMenuSelectP);
	  mainMenu.setSize(550,300);
	   mainF.setSize(1550,800);
	   mainMenu.setVisible(true);
	  // ImagePanel panel = new ImagePanel(new ImageIcon("main.jpg").getImage());
	  
	   
	   addMenu.add(addMenuSelectP);
	   addMenu.add(addMenuViewP);
	   addMenu.setSize(550,300);
	   addF.setSize(1550,800);
	   addMenu.setVisible(true);
	   
	   viewMenu.add(viewMenuViewP);
	   viewMenu.setSize(550,300);
	   viewF.setSize(1550,800);
	   viewMenu.setVisible(true);
	   
	   deleteMenu.add(deleteMenuSelectP);
	   deleteMenu.add(deleteMenuViewP);
	   deleteMenu.setSize(550,300);
	   deleteF.setSize(1550,800);
	   deleteMenu.setVisible(true);
	   
	   
	   searchMenu.add(searchMenuSelectP);
	  searchMenu.add(searchMenuViewP);
	   searchMenu.setSize(550,300);
	   searchF.setSize(1550,800);
	   searchMenu.setVisible(true);
	   
	   updateMenu.add(updateMenuSelectP);
	   updateMenu.add(updateMenuViewP);
	   updateMenu.setSize(550,450);
	   updateF.setSize(1550,800);
	   updateMenu.setVisible(true);
	  }
	  {
	  titlepan.add(title,BorderLayout.CENTER);
	  
	   b1=new JButton("Add Airline Record  "); 
	   b1.setPreferredSize(new Dimension(300,30));
	        Font font5 = new Font("Arial Black",Font.BOLD, 14);
	// b1.setSize(300,300);
	  b1.setFont(font5);
	  b1.setBackground(Color.LIGHT_GRAY); 
	        mainMenuSelectP.add(b1,BorderLayout.NORTH);
	        
	        b2=new JButton("View Airline Record "); 
	        b2.setPreferredSize(new Dimension(300,30));
	        Font font6 = new Font("Arial Black",Font.BOLD, 14);
	// b1.setSize(300,300);
	  b2.setFont(font5);
	  b2.setBackground(Color.LIGHT_GRAY); 
	       mainMenuSelectP.add(b2,BorderLayout.NORTH);
	        
	        b3=new JButton("Delete Airline Record"); 
	        b3.setPreferredSize(new Dimension(300,30));
	        Font font9 = new Font("Arial Black",Font.BOLD, 14);
	// b1.setSize(300,300);
	  b3.setFont(font9);
	  b3.setBackground(Color.LIGHT_GRAY); 
	       mainMenuSelectP.add(b3,BorderLayout.NORTH);
	        
	        
	        b4=new JButton("Search Airline Record"); 
	        b4.setPreferredSize(new Dimension(300,30));
	       	// b1.setSize(300,300);
	  b4.setFont(font5);
	  b4.setBackground(Color.LIGHT_GRAY); 
	        mainMenuSelectP.add(b4,BorderLayout.NORTH);    
	        
	        b5=new JButton("Update Airline Record"); 
	        b5.setPreferredSize(new Dimension(300,30));
	       	// b1.setSize(300,300);
	  b5.setFont(font5);
	  b5.setBackground(Color.LIGHT_GRAY); 
	        mainMenuSelectP.add(b5,BorderLayout.NORTH);
	        
	        
	        addMenuSelectP.add(addSeatnoL,BorderLayout.NORTH);
	      addMenuSelectP.add(addMTextFSeatno,BorderLayout.NORTH);
	        
	        addMenuSelectP.add(addNameL,BorderLayout.EAST);
	        addMenuSelectP.add(addMTextFName,BorderLayout.NORTH);
	        
	        addMenuSelectP.add(addSourceL,BorderLayout.EAST);
	        addMenuSelectP.add(addMTextFSource,BorderLayout.NORTH);
	        
	        
	        addMenuSelectP.add(addDestinationL,BorderLayout.NORTH);
	        addMenuSelectP.add(addMTextFDestination,BorderLayout.NORTH);
	        
	        addMenuSelectP.add(addSeatTypeL,BorderLayout.NORTH);
	        addMenuSelectP.add(addMComboBSeatType,BorderLayout.NORTH);
	        
	        addMenuSelectP.add(addMBtn,BorderLayout.SOUTH);
	        addMenuSelectP.add(addBackB,BorderLayout.SOUTH);
	        
	        addMenuViewP.add(addMTextA,BorderLayout.NORTH);
	    //    addMenuViewP.add(addStatusL,BorderLayout.SOUTH);
	  }
	  {//ActionListener for add menu
	  b1.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	      mainF.setVisible(false);
	      addF.setVisible(true);
	      
	    }
	  });
	  }
	  {//ActionListener for view menu
	  b2.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	      mainF.setVisible(false);
	      addF.setVisible(false);
	      viewF.setVisible(true);
	      deleteStatusL.setText("");
	      try
	      {
	       //View details
	      
	       BufferedReader bR1 = new BufferedReader( new FileReader("details.txt") ); 
	       String record;
	       
	       int i=0;
	       String DisplayView1[]=new String[1024];
	       while( ( record = bR1.readLine() ) != null )
	       {
	       StringTokenizer st = new StringTokenizer(record,",");
	       
	       SeatnoView=st.nextToken();
	       nameView=st.nextToken();
	       sourceView=st.nextToken();
	       DestinationView=st.nextToken();
	       SorNView=st.nextToken();
	       DisplayView1[i]="Seatno = "+SeatnoView+" *** Name = "+nameView+"*** Source = "+sourceView+" *** Destination = "+DestinationView+" *** Class Type = "+SorNView+"\n";
	       
	       viewMTextA.append(DisplayView1[i]);
	       i++;
	       }
	       bR1.close();
	      }
	      catch(Exception ex)
	      {
	       System.out.println("Exception msg: view "+ex);
	      }
	    }
	  });
	  }
	  {//ActionListener for delete menu
	  b3.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	      mainF.setVisible(false);
	      addF.setVisible(false);
	      viewF.setVisible(false);
	      deleteF.setVisible(true);
	      try
	      {
	       //View details Delete
	       
	       BufferedReader bR1DelView = new BufferedReader( new FileReader("details.txt") ); 
	       String recordDelView;
	       
	       int iDel=0;
	       String DisplayDel1[]=new String[1024];
	       while( ( recordDelView = bR1DelView.readLine() ) != null )
	       {
	       StringTokenizer stDel = new StringTokenizer(recordDelView,",");
	       
	       SeatnoDelView=stDel.nextToken();
	       nameDelView=stDel.nextToken();
	       sourceDelView=stDel.nextToken();
	       DestinationDelView=stDel.nextToken();
	       SorNDelView=stDel.nextToken();
	       DisplayDel1[iDel]="Seatno = "+SeatnoDelView+" *** Name = "+nameDelView+" *** Source = "+sourceDelView+" *** Destination = "+DestinationDelView+" *** ClassType = "+SorNDelView+"\n";
	       
	       deleteMTextA.append(DisplayDel1[iDel]);
	       iDel++;
	       }
	       bR1DelView.close();
	      }
	      catch(Exception ex)
	      {
	       System.out.println("Exception msg: "+ex);
	      }
	    }
	  });
	  }
	  {//ActionListener for search menu
	  b4.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	    	mainF.setVisible(false);
	      addF.setVisible(false);
	      viewF.setVisible(false);
	      deleteF.setVisible(false);
	      searchF.setVisible(true);
	    }
	  });
	  }
	  
	  {//ActionListener for Back of Update menu
	    updateBackB.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	     updateF.setVisible(false);
	      updateMTextFSeatno.setText("");
	      updateMTextFName.setText("");
	      updateMTextFSource.setText("");
	      updateMTextFDestination.setText("");
	      updateMTextAForView.setText("");
	      updateMTextAForResult.setText("");
	      
	     mainF.setVisible(true);
	    }
	    
	   });
	  }
	  {//ActionListener for Delete btn of menu
	    deleteMBtn.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	    try
	    {
	    	String id;
	     if(deleteMTextFSeatno.getText().length()!=0)
	     {
	       deleteMTextA.setText("");
	      //------------ delete ----------
	      String Seatno2, record1,choice3;
	      
	      
	      File tempDB = new File("details.txt");
	      File db = new File("details.txt");
	      
	      
	      BufferedReader br2 = new BufferedReader( new FileReader( db ) );
	      BufferedWriter bw2 = new BufferedWriter( new FileWriter( tempDB ) );
	      
	      
	      //---------- Delete airline Record ----------
	      
	      Seatno2 =deleteMTextFSeatno.getText();
	     System.out.println("Seatno to be deleted:"+Seatno2);
	      
	      while( ( record1 = br2.readLine() ) != null ) {
	       
	       StringTokenizer stDel1 = new StringTokenizer(record1,",");
	       id=stDel1.nextToken();
	       System.out.println("id from file:"+id);
	       if( Seatno2.equals(id)){
	    	   System.out.println("id present");
	    	   System.out.println(record1);
	    	   continue;
	       }
	        
	     
	       bw2.write(record1);          
	       bw2.flush();               
	       bw2.newLine();                    
	   
	      }
	      
	      br2.close();
	      bw2.close();
	      
	     boolean a= db.delete();
	     
	      System.out.println("prev file deleted"+a);
	      //tempDB.renameTo(db);
	      boolean success = tempDB.renameTo(db); 
	      System.out.println("new file renamed to prev file"+success);
	     // String StatusDel="Status of Deleting bus: "+success;
	      deleteStatusL.setForeground(Color.GREEN);
	      //deleteStatusL.setText(StatusDel);
	      
	      
	      //-------------------------
	       //View details------------------------
	    
	       BufferedReader bR1 = new BufferedReader( new FileReader("details.txt") ); 
	       String record2;
	       
	       int i=0;
	       String DisplayView1[]=new String[1024];
	       while( ( record2 = bR1.readLine() ) != null )
	       {
	        StringTokenizer st = new StringTokenizer(record2,",");
	        
	        SeatnoDelete=st.nextToken();
	        nameDelete=st.nextToken();
	        sourceDelete=st.nextToken();
	        DestinationDelete=st.nextToken();
	        SorNDelete=st.nextToken();
	        DisplayView1[i]="Seatno = "+SeatnoDelete+" *** Name = "+nameDelete+"  *** Source = "+sourceDelete+" *** Deignation = "+DestinationDelete+" *** ClassType = "+SorNDelete+"\n";
	        
	        deleteMTextA.append(DisplayView1[i]);
	        i++;
	       }
	       bR1.close();
	       
	       deleteMTextFSeatno.setText("");
	     }
	    }
	    catch(Exception ex)
	    {
	     System.out.println("Exception msg: "+ex);
	    }
	    }
	    
	   });
	  }
	  //Search Select Event
      searchNameL.setVisible(false);
      searchMTextFName.setVisible(false);
      searchNameBtn.setVisible(false);
      
      searchDestinationL.setVisible(false);
      searchMTextFename.setVisible(false);
      searchMTextFedes.setVisible(false);
      searchDestinationBtn.setVisible(false);
      {
	  searchb1.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	    	  searchMTextFName.setText("");
	          searchMTextAForResult.setText("");
	          
	          searchNameL.setVisible(true);
	          searchMTextFName.setVisible(true);
	          searchNameBtn.setVisible(true);
	          
	          searchDestinationL.setVisible(false);
	          searchMTextFename.setVisible(false);
	          searchMTextFedes.setVisible(false);
	          searchDestinationBtn.setVisible(false);
	    }
	  });
	  searchb2.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	    	 searchMTextFename.setText("");
	    	 searchMTextFedes.setText("");
	      searchMTextAForResult.setText("");
	      
	      searchNameL.setVisible(false);
	      searchMTextFName.setVisible(false);
	      searchNameBtn.setVisible(false);
	      
	      searchDestinationL.setVisible(true);
	      searchMTextFename.setVisible(true);
	      searchMTextFedes.setVisible(true);
	      searchDestinationBtn.setVisible(true);
	    }
	  });
	  
	  }
      {
    	  searchNameBtn.addActionListener(new ActionListener()
    	   {
    	   //----------------------------------------------------------------
    	    public void actionPerformed(ActionEvent ae)
    	    {
    	     try
    	     {
    	    	 searchMTextAForResult.setText("");
    	    	 int count=0;
    	    	 int count1=1;
    	    	 long filelength;
    	    	 String name;
    	    	 String Destination;
    	    	 String recordSearch1;
    	   	  	 String recordSearch2;
    	         String DisplaySearch1[]=new String[1024];
    	         pos_array[0]=0;
    	         RandomAccessFile raf = new RandomAccessFile("details.txt", "rw");
    	         if(searchMTextFName.getText().length()!=0)
    	         {
    	        	 nameSearchSel =searchMTextFName.getText();
    	             nameSearchSel=nameSearchSel.toLowerCase();
    	        	 while((recordSearch1 = raf.readLine()) != null)
    	        	 {
    	        	 filelength=raf.getFilePointer();
    	        	 StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1,",");
    	        	 stSearchView1.nextToken();
    	        	 name=stSearchView1.nextToken();
    	        	 Destination=stSearchView1.nextToken();
    	        	 primary_array[count]=name;
    	        	 secondary_array[count]=Destination;
    	        	 pos_array[count1]=filelength;
    	        	 count++;
    	        	 count1++;
    	        	 
    	        	 }
    	        	 for(int y=0;y<count;y++)
    	        	 System.out.println(pos_array[y]+"|"+primary_array[y]+"|"+secondary_array[y]);
    	        	 System.out.println(count);
    	        	  int i,j,z;
    	        	 long sec6_result[]=new long[1024];
    	        	   String tempusn;
    	        	 long tempadd;
    	        	 for(i=0;i<=count;i++)
    	        	 {
    	        	 	for(j=i+1;j<=count;j++)
    	        	 	{
    	        	 	System.out.println(primary_array[j]+"|"+primary_array[i]);
    	        	 	if(primary_array[j]== null || primary_array[i]==null)
    	        	 	break;
    	        	 	if(primary_array[j].compareTo(primary_array[i])<0)
    	        	 	{
    	        	 	System.out.println("yuppppppppppppp");
    	        	 	tempusn=primary_array[i];
    	        	 	System.out.println(tempusn);
    	        	 	primary_array[i]=primary_array[j];
    	        	 	System.out.println(primary_array[i]);
    	        	 	primary_array[j]=tempusn;
    	        	 	System.out.println(primary_array[j]);
    	        	 	tempadd=pos_array[i];
    	        	 	System.out.println(tempadd);
    	        	 	pos_array[i]=pos_array[j];
    	        	 	System.out.println(pos_array[i]);
    	        	  	pos_array[j]=tempadd;
    	        	  	System.out.println(pos_array[j]);
    	        	 	}
    	        	 	
    	        	 	}
    	        	 }
    	        	 System.out.println("Index File");
    	        	 for(int x=0;x<count;x++)
    	        	 {
    	        	 System.out.println(pos_array[x]+"\t"+primary_array[x]+"\n");
    	        	 }
    	        	 int low=0,high=count,mid,flag=0;
    	        	 int mid_final=0;
    	        	 String key;
    	        	 boolean flag1=false;
    	        	 key=nameSearchSel;
    	        	 System.out.println(key);
    	        	 
    	        	 
    	        	 for(int q=0;q<count;q++)
    	        	 {
    	        	 if(key.equals(primary_array[q]))
    	        	 {
    	        	 System.out.println("yupp");
    	        	 flag1=true;
    	        	 break;
    	        	 }
    	        	 }
    	        	 System.out.println("flag"+flag1);
    	        	 if(flag1)
    	        	 {
    	           	 while(low<=high)
    	        	 {
    	        	 mid=(low+high)/2;
    	        	 System.out.println("mid"+mid);
    	        	 if(primary_array[mid].equals(key))
    	        	 {
    	   
    	        	 mid_final=mid;
    	        	 flag=1;
    	        	 break;
    	        	 }	
    	        	 else if(primary_array[mid].compareTo(key)<0)
    	        	 {
    	        	
    	        	 low=mid+1;
    	        	 }
    	        	 else
    	        	 {
    	        	
    	        	 high=mid-1;
    	        	 }	
    	        	 }
    	           	 z=0;
    	         	int t=0;
    	         	t=mid_final;
    	           	 int s_count=0;
    	           	sec6_result[z]=pos_array[t];
    	           	z++;
    	           	s_count++;
    	           	 if(t!=0)
    	           	 {
        	       	while((--t)>=0 && primary_array[t].equals(key) )
        	       	{
        	       	sec6_result[z]=pos_array[t];
        	       	z++;
        	       	System.out.println("pos"+pos_array[t]);
        	       	s_count++;
        	       	System.out.println("yupp");
        	       	}}
        	    	t=mid_final;
        	
        	if(t!=count-1)
        	{
        	System.out.println("org.Destination:"+key);
        	System.out.println("next duplicate:"+primary_array[t+1]);
        	while((t++)<=count && primary_array[t].equals(key)  )
        	{
        	
        	System.out.println("yupp");
        	System.out.println(primary_array[t]);
        	       	sec6_result[z]=pos_array[t];
        	       	z++;
        	       	s_count++; 
        	       	System.out.println("yupp1");
        	       	if(t==count-1)
        	       	break;
        	       	}
        	}
        	int x=0;
        	System.out.println(s_count);
        	/*for(int s=0;s<s_count;s_count++)
        	{
        	System.out.println(sec6_result[s]);
        	}*/
    	        	while(x<s_count)
    	        	{
    	        	 long l=sec6_result[x];
    	        	 System.out.println("l"+l);
    	        	 raf.seek(l);
    	        	 System.out.println(raf.getFilePointer());
    	        	 //System.out.println(raf.readLine());
    	        	 searchMTextAForResult.append(raf.readLine()+"\n");
    	        	 x++;
    	        	 }
    	        	 }
    	        	 else
    	        	 {
    	        	 searchMTextAForResult.append("primary string not found");
    	        	 }
    	         }
    	    	
    	     	raf.close();
    	     	searchMTextFName.setText("");
    	      }
    	     catch(Exception ex)
    	     {
    	      System.out.println("Exception msg: "+ex);
    	     }
    	     //----------------------------------------------------------------
    	    }
    	   });
    	   //----------------------------------------------------------------
    	   searchDestinationBtn.addActionListener(new ActionListener()
    	   {
    	    public void actionPerformed(ActionEvent ae)
    	    {
    	     try
    	     {
    	    	 nameSearchSel =searchMTextFename.getText();
    	         nameSearchSel=nameSearchSel.toLowerCase();
    	    	 System.out.println(nameSearchSel);
    	    	 
    	    	 nameSearchSe2 =searchMTextFedes.getText();
    	         nameSearchSe2=nameSearchSe2.toLowerCase();
    	    	 System.out.println(nameSearchSe2);
    	    	 String primary_array[]=new String[1000];
    	 	long pos_array[]=new long[1000];
    	 	String first_secondary_array_ename[]=new String[1000];
    	 	String first_secondary_array_eid[]=new String[1000];
    	 	String second_secondary_array_des[]=new String[1000];
    	 	String second_secondary_array_eid[]=new String[1000];
    	 	String recordSearch1;
    	 	long filelength;
    	 	int count=0,count1=1;
    	 	String eid,name,des; 
    	 	System.out.println("SECONDARY INDEXING");
    	 	RandomAccessFile ra = new RandomAccessFile("details.txt", "rw");
    	 	 while((recordSearch1 = ra.readLine()) != null)
    	      	 {
    	 	 System.out.println(recordSearch1);
    	      	 filelength=ra.getFilePointer();
    	      	 StringTokenizer stSearchView1 = new StringTokenizer(recordSearch1,",");
    	      	 eid=stSearchView1.nextToken();
    	      	 name=stSearchView1.nextToken();
    	      	 des=stSearchView1.nextToken();
    	      	 primary_array[count]=eid;
    	      	 pos_array[count1]=filelength;
    	      	first_secondary_array_ename[count]=name;
    	      	first_secondary_array_eid[count]=eid;
    	      	second_secondary_array_des[count]=des;
    	      	second_secondary_array_eid[count]=eid;
    	      	 count++;
    	      	 count1++;
    	      	 }
    	 	 System.out.println("primary index");
    	      	 for(int y=0;y<count;y++)
    	      	 {
    	      	 System.out.println(pos_array[y]+"|"+primary_array[y]+"|");
    	      	}
    	      	 System.out.println("first secondary index");
    	      	for(int y=0;y<count;y++)
    	      	 {
    	      	
    	      	 System.out.println(first_secondary_array_ename[y]+"|"+primary_array[y]+"|");
    	      	}
    	      	 System.out.println("second secondary index");
    	      	for(int y=0;y<count;y++)
    	      	 {
    	      	
    	      	 System.out.println(second_secondary_array_des[y]+"|"+primary_array[y]+"|");
    	      	}
    	      	 int i,j;
    	   	   String tempusn;
    	   	 long tempadd;
    	   	 for(i=0;i<=count;i++)
    	   	 {
    	   	 	for(j=i+1;j<=count;j++)
    	   	 	{
    	   	 	if(primary_array[j]== null || primary_array[i]==null)
    	   	 	break;
    	   	 	if(primary_array[j].compareTo(primary_array[i])<0)
    	   	 	{
    	   	 	tempusn=primary_array[i];
    	   	 	primary_array[i]=primary_array[j];	
    	   	 	primary_array[j]=tempusn;
    	   	 	tempadd=pos_array[i];
    	   	 	pos_array[i]=pos_array[j];
    	   	  	pos_array[j]=tempadd;
    	   	 	}
    	   	 	}
    	   	 }
    	      	 
    	      	 System.out.println("After sorting primary index:");
    	      	 for(int y=0;y<count;y++)
    	      	 {
    	      	 System.out.println(pos_array[y]+"|"+primary_array[y]+"|");
    	      	}
    	     	   String tempname;
    	     	   String tempeid;
    	     	 for(i=0;i<=count;i++)
    	     	 {
    	     	 	for(j=i+1;j<=count;j++)
    	     	 	{
    	     	 	if(first_secondary_array_ename[j]== null || first_secondary_array_ename[i]==null)
    	     	 	break;
    	     	 	if(first_secondary_array_ename[j].compareTo(first_secondary_array_ename[i])<0)
    	     	 	{
    	     	 	tempname=first_secondary_array_ename[i];
    	     	 	first_secondary_array_ename[i]=first_secondary_array_ename[j];	
    	     	 	first_secondary_array_ename[j]=tempname;
    	     	 	tempeid=first_secondary_array_eid[i];
    	     	 	first_secondary_array_eid[i]=first_secondary_array_eid[j];
    	     	 	first_secondary_array_eid[j]=tempeid;
    	     	 	}
    	     	 	}
    	     	 }
    	     	 System.out.println("After sorting secondary index");
    	     	for(int y=0;y<count;y++)
    	     	 {
    	     	 System.out.println(first_secondary_array_ename[y]+"|"+first_secondary_array_eid[y]+"|");
    	     	}
    	     	  String temepdes;
    	    	   String tempeid1;
    	    	 for(i=0;i<=count;i++)
    	    	 {
    	    	 	for(j=i+1;j<=count;j++)
    	    	 	{
    	    	 	if(second_secondary_array_des[j]== null || second_secondary_array_des[i]==null)
    	    	 	break;
    	    	 	if(second_secondary_array_des[j].compareTo(second_secondary_array_des[i])<0)
    	    	 	{
    	    	 	temepdes=second_secondary_array_des[i];
    	    	 	second_secondary_array_des[i]=second_secondary_array_des[j];	
    	    	 	second_secondary_array_des[j]=temepdes;
    	    	 	tempeid1=second_secondary_array_eid[i];
    	    	 	second_secondary_array_eid[i]=second_secondary_array_eid[j];
    	    	 	second_secondary_array_eid[j]=tempeid1;
    	    	 	}
    	    	 	}
    	    	 }
    	    	 System.out.println("After sorting second secondary index");
    	    	for(int y=0;y<count;y++)
    	    	 {
    	    	 System.out.println(second_secondary_array_des[y]+"|"+second_secondary_array_eid[y]+"|");
    	    	}
    	    	String key1=nameSearchSel;
    	    	String key2=nameSearchSe2;
    	    	boolean contains1=false;
    	    	boolean contains2=false;
    	    	for(int p=0; p < count; p++){
    	
    	//check if string array contains the string 
    	if(first_secondary_array_ename[p].equals(key1)){
    	 
    	//string found
    	contains1 = true;
    	break;
    	}
    	    	}
    	    	for(int p=0; p < count; p++){
    	
    	//check if string array contains the string 
    	if(second_secondary_array_des[p].equals(key2)){
    	 
    	//string found
    	contains2 = true;
    	break;
    	}
    	    	}
    	    	if(contains1 && contains2)
    	    	{
    	    	String sec1_result[]=new String[1000];
    	    	String sec2_result[]=new String[1000];
    	    	 int low=0,high=count,mid,flag=0;
    	    	 int mid_final=0;
    	    	// String key;
    	    	// key=nameSearchSel;
    	    	 System.out.println("Destination key:"+key2);
    	       	 while(low<=high)
    	    	 {
    	    	 mid=(low+high)/2;
    	    	 if(second_secondary_array_des[mid].equals(key2))
    	    	 {

    	    	 mid_final=mid;
    	    	 flag=1;
    	    	 break;
    	    	 }	
    	    	 else if(second_secondary_array_des[mid].compareTo(key2)<0)
    	    	 {
    	    	
    	    	 low=mid+1;
    	    	 }
    	    	 else
    	    	 {
    	    	
    	    	 high=mid-1;
    	    	 }	
    	    	 }
    	       	 int t=mid_final;
    	       	 System.out.println("mid:"+t);
    	       	 int z=0;
    	       	 int s_count=0;
    	       	sec2_result[z]=second_secondary_array_eid[t];
    	       	s_count++;
    	       	z++;
    	       	if(t!=0)
    	       	{
    	       	System.out.println("org.Destination:"+key2);
    	System.out.println("prev duplicate:"+second_secondary_array_des[t-1]);

    	       	while((--t)>=0 && second_secondary_array_des[t].equals(key2)  )
    	       	{
    	       	sec2_result[z]=second_secondary_array_eid[t];
    	       	z++;
    	       	s_count++;
    	       	if(t==0)
	           	break;
    	       	}
    	       	}
    	t=mid_final;
    	if(t!=count-1)
    	{
    	System.out.println("org.Destination:"+key2);
    	System.out.println("next duplicate:"+second_secondary_array_des[t+1]);
    	while((++t)<=count && second_secondary_array_des[t].equals(key2)  )
    	{
    	
    	System.out.println("yupp");
    	System.out.println(second_secondary_array_eid[t]);
    	       	sec2_result[z]=second_secondary_array_eid[t];
    	       	z++;
    	       	s_count++; 
    	       	if(t==count-1)
    	       	break;
    	       	}
    	}
    	System.out.println("second secondary search");
    	System.out.println("s_count:"+s_count);
    	    	 for(int r=0;r<s_count;r++)
    	    	 {
    	    	 System.out.println("eid:"+sec2_result[r]);
    	    	}
    	    	 int low1=0,high1=count,mid1=0,flag1=0;
    	        	 int mid_final1=0;
    	        	// String key;
    	        	// key=nameSearchSel;
    	        	 System.out.println("passenger name for search:"+key1);
    	           	 while(low1<=high1)
    	        	 { 
    	        	 mid1=(low1+high1)/2;
    	        	 if(first_secondary_array_ename[mid1].equals(key1))
    	        	 {

    	        	 mid_final1=mid1;
    	        	 flag1=1;
    	        	 break;
    	        	 }	
    	        	 else if(first_secondary_array_ename[mid1].compareTo(key1)<0)
    	        	 {
    	        	
    	        	 low1=mid1+1;
    	        	 }
    	        	 else
    	        	 {
    	        	
    	        	 high1=mid1-1;
    	        	 }	
    	        	 }
    	           	 int a=mid_final1;
    	           	 System.out.println("a:"+a);
    	           	  z=0;
    	           	  int r_count=0;
    	           	  if(mid_final1==0)
    	           	  {
    	           	  sec1_result[z]=first_secondary_array_eid[a];
    	           	  r_count++;
    	           	  z++;
    	           	  }
    	           	if(a!=0)
    	           	{
    	           	
    	           	 sec1_result[z]=first_secondary_array_eid[a];
    	      	  r_count++;
    	      	  z++;
    	      	System.out.println("org.ename:"+key1);
    	System.out.println("prev duplicate:"+first_secondary_array_ename[a-1]);
    	           	while((--a)>=0 && first_secondary_array_ename[a].equals(key1) )
    	           	{
    	           	
    	           	sec1_result[z]=first_secondary_array_eid[a];
    	           	z++;
    	           	r_count++;
    	           	if(a==0)
    	           	break;
    	           	}
    	           	}
    	           	a=mid_final1;
    	           	if(a!=count-1)
    	           	{
    	           	System.out.println("org.ename:"+key1);
    	    	System.out.println("next duplicate:"+first_secondary_array_ename[a+1]);
    	    	while((++a)<=count && first_secondary_array_ename[a].equals(key1) )
    	    	{
    	           	sec1_result[z]=first_secondary_array_eid[a];
    	           	z++;
    	           	r_count++;
    	      	if(a==count-1)
    	           	break;
    	           	}
    	           	}
    	    	System.out.println("first secondary search");
    	    	for(int r=0;r<r_count;r++)
    	    	{
    	    	System.out.println("eid1:"+sec1_result[r]);
    	   	 	}
    	    	String temp="";
    	    	for(i=0;i<=r_count;i++)
    	       	 {
    	       	 	for(j=i+1;j<=r_count;j++)
    	       	 	{
    	       	 	if(sec1_result[j]== null || sec1_result[i]==null)
    	       	 	break;
    	       	 	if(sec1_result[j].compareTo(sec1_result[i])<0)
    	              	 	{
    	       	 	temp=sec1_result[i];
    	       	 	sec1_result[i]=sec1_result[j];	
    	       	 	sec1_result[j]=temp;
    	       	 	}
    	       	 	}
    	       	 }
    	    	for(int r=0;r<r_count;r++)
    	    	{
    	    	System.out.println(sec1_result[r]);
    	   	 	}

    	    	String temp1="";
    	    	for(i=0;i<=s_count;i++)
    	          	 {
    	          	 	for(j=i+1;j<=s_count;j++)
    	          	 	{
    	          	 	if(sec2_result[j]== null || sec2_result[i]==null)
    	          	 	break;
    	          	 	if(sec2_result[j].compareTo(sec2_result[i])<0)
    	                 	 {
    	          	 	temp1=sec2_result[i];
    	          	 	sec2_result[i]=sec2_result[j];	
    	          	 	sec2_result[j]=temp1;
    	          	 	}
    	          	 	}
    	          	 }
    	    	for(int r=0;r<s_count;r++)
    	    	{
    	    	System.out.println(sec2_result[r]);
    	   	 	}

    	 	
    	    	i=0;
    	    	j=0;
    	    	String s="";
    	    	System.out.println("s_count"+s_count);
    	    	System.out.println("r_count"+r_count);
    	    	while(i<r_count&&j<s_count)  {  
    	    	if(sec1_result[i].equals(sec2_result[j]))  
    	    	{
    	    	System.out.println(sec1_result[i]);  
    	    	s= sec1_result[i];
    	    	i++; 
    	    	j++; 
    	    	} 
    	    	else if(sec1_result[i].compareTo(sec2_result[j])<0)    
    	    	i++;
    	    	else
    	    	j++; 
    	    	}
    	    	System.out.println(s);
    	    	int low2=0,high2=count,mid2,flag2=0;
    	       	 int mid_final2=0;
    	       	 boolean flag3=false;
    	       	 for(int q=0;q<count;q++)
    	       	 {
    	       	 if(s.equals(primary_array[q]))
    	       	 {
    	       	 flag3=true;
    	       	 break;
    	       	 }
    	       	 }
    	       	 System.out.println("flag"+flag3);
    	       	 if(flag3)
    	       	 {
    	          	 while(low2<=high2)
    	       	 {
    	       	 mid2=(low2+high2)/2;
    	       	 System.out.println(mid2);
    	       	 if(primary_array[mid2].equals(s))
    	       	 {
    	  
    	       	 mid_final2=mid2;
    	       	 flag2=1;
    	       	 break;
    	       	 }	
    	       	 else if(primary_array[mid2].compareTo(s)<0)
    	       	 {
    	       	
    	       	 low2=mid2+1;
    	       	 }
    	       	 else
    	       	 {
    	       	
    	       	 high2=mid2-1;
    	       	 }	
    	       	 }
    	       	 
    	       	
    	       	 long l2=pos_array[mid_final2];
    	       	 System.out.println("pos"+l2);
    	       	 ra.seek(l2);
    	       	 System.out.println("pointer"+ra.getFilePointer());
    	       	 //System.out.println(raf.readLine());
    	       	 searchMTextAForResult.append(ra.readLine());
    	       	 }
    	       	 else
    	       	 {
    	       	 searchMTextAForResult.append("primary string not found");
    	       	 }
    	    	
    	       
    	    	}
    	    	else{
    	    	boolean c1=contains1;
    	    	boolean c2=contains2;
    	    	if(!c1 && !c2)
    	    	 searchMTextAForResult.append("Passenger Name and Flight Destination not present in file");
    	    	else if(!c1)
    	    	 searchMTextAForResult.append("Passenger Name not present in file");
    	    	else
    	    	 searchMTextAForResult.append("Flight Destination not present in file");
    	    	}
    	    	ra.close();
    	    	searchMTextFename.setText("");
    	    	searchMTextFedes.setText("");
    	     }
    	     catch(Exception ex)
    	     {
    	      System.out.println("Exception msg: "+ex);
    	     }
    	     //----------------------------------------------------------------
    	    }
    	   });
    	   //----------------------------------------------------------------
      }

      {//ActionListener for main menu
	  b5.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	      mainF.setVisible(false);
	      addF.setVisible(false);
	      viewF.setVisible(false);
	      deleteF.setVisible(false);
	      searchF.setVisible(false);
	      updateF.setVisible(true);
	      
	    }
	  });
	  }
      {//ActionListener for main menu
	 
	    //-------------------------------- Update start --------------------------------
	      {
	       updateMTextAForView.setText("");
	       updateMTextAForResult.setText("");
	       updateStatusL.setText("");
	            updateSelectTraceBtn.addActionListener(new ActionListener(){
	         public void actionPerformed(ActionEvent ae)
	         {
	          try
	          {
	        	  SeatnoUpdate1 =updateMTextFSeatno.getText();
	              File dbUpdate = new File("details.txt");
	              File tempDBUpdate = new File("details2.txt");
	              BufferedReader brUpdate = new BufferedReader( new FileReader(dbUpdate) );
	              BufferedWriter bwUpdate = new BufferedWriter( new FileWriter(tempDBUpdate) );
	             
	             
	             updateMTextAForView.setText("");
	             while( ( recordUpdate1 = brUpdate.readLine() ) != null )
	             {
	              String DisplayUpdate1;
	              
	              StringTokenizer stUpdate1 = new StringTokenizer(recordUpdate1,",");
	              String id=stUpdate1.nextToken();
	              String name=stUpdate1.nextToken();
	              String source=stUpdate1.nextToken();
	              String des=stUpdate1.nextToken();
	              String s=stUpdate1.nextToken();
	              if( id.equals(SeatnoUpdate1) ) {
	               
	               DisplayUpdate1="-- Current Record --\nSeatno = "+id+"\nName = "+name+" \nSource = "+source+"   \nDestination = "+des+"\nClassType = "+s+"\n";
	              System.out.println(DisplayUpdate1);
	                updateMTextAForView.setText(DisplayUpdate1);
	                
	               
	              }
	             }       
	             brUpdate.close();
	             bwUpdate.close();
	             }
	             catch(Exception ex)
	             {
	              System.out.println("Exception msg: "+ex);
	             }
	            }
	           });
	               
	         } 
	         /****/  
	         { 
	           //value input
	              
	           
	           //-----------------------------
	           
	           
	            updateMBtn.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent ae)
	            {
	             
	             try
	             {
	              
	              if(updateMTextFDestination.getText().length()!=0&&updateMTextFName.getText().length()!=0)
	              {
	            	  SeatnoUpdate1 =updateMTextFSeatno.getText();
	             
	           //   BufferedReader brUpdate = new BufferedReader( new FileReader("details.txt") );
	              BufferedWriter bwUpdate2 = new BufferedWriter( new FileWriter("details2.txt") );
	              //updateMTextFID.setText("");
	              updateMTextAForResult.setText("");
	              
	              SeatnoUpdate2nd = SeatnoUpdate1;
	              System.out.println(SeatnoUpdate2nd);
	              newNameUpdate = updateMTextFName.getText();
	              newNameUpdate=newNameUpdate.toLowerCase();
	              
	              newSourceUpdate = updateMTextFSource.getText();
	              newSourceUpdate=newSourceUpdate.toLowerCase();
	              
	              newDestinationUpdate =  updateMTextFDestination.getText();
	              newSeatTypeUpdate= updateMComboBSeatType.getSelectedItem().toString();
	                
	              splittUpdate=SeatnoUpdate2nd;
	          //    brUpdate.close();
	          //   String IDnoUpdate=splittUpdate.substring(1, splittUpdate.length() -1);
	              
	              BufferedReader brUpdate2 = new BufferedReader( new FileReader("details.txt") );
	              String h;
	              while( (recordUpdate2 = brUpdate2.readLine()) != null )
	              {       
	            	  StringTokenizer stSearchView9 = new StringTokenizer(recordUpdate2,",");
	    	      	h=stSearchView9.nextToken();
	               if(SeatnoUpdate2nd.equals(h))
	               {
	                bwUpdate2.write(SeatnoUpdate2nd+","+newNameUpdate+ ","+newSourceUpdate+","+newDestinationUpdate+","+newSeatTypeUpdate+"$");
	                
	               }
	               else
	               {
	                bwUpdate2.write(recordUpdate2); 
	               }  
	                    
	               bwUpdate2.flush();
	               bwUpdate2.newLine();
	              }
	              
	              bwUpdate2.close();
	              brUpdate2.close();  
	              
	              File dbUpdate2 = new File("details.txt");
	               File tempDBUpdate2 = new File("details2.txt");
	               
	               dbUpdate2.delete();
	               
	               boolean success =tempDBUpdate2.renameTo(dbUpdate2);
	               
	               
	               String SuccessUpdate="Record Updation status: "+success;
	               
	           if(success==true)
	           {
	            updateStatusL.setForeground(Color.GREEN);
	            updateStatusL.setText(SuccessUpdate);
	           }
	           else
	           {
	            updateStatusL.setForeground(Color.RED);
	            updateStatusL.setText(SuccessUpdate);
	           }
	           String ViewUpdate="-- Updated Record --\nSeatno = "+SeatnoUpdate2nd+"\nName = "+newNameUpdate+ "\nSource = "+newSourceUpdate+"\nDestination = "+newDestinationUpdate+"\nClassType= "+newSeatTypeUpdate;
	           updateMTextAForResult.setText(ViewUpdate);
	           updateMTextFSeatno.setText("");
	           updateMTextFName.setText("");
	           updateMTextFSource.setText("");
	           updateMTextFDestination.setText("");
	           }
	          }
	          catch(Exception ex)
	          {
	           System.out.println("Exception msg: "+ex);
	          }
	         }
	        });
	             
	     //-----------------   
	      }
	      //-------------------------------- Update end --------------------------------
	    
	  }
	//ActionListener for Back of add menu
	  {
	    addBackB.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	     addF.setVisible(false);
	     mainF.setVisible(true);
	     addMTextFSeatno.setText("");
	     addMTextFName.setText("");
	     addMTextFSource.setText("");
	     addMTextFDestination.setText("");
	     addMTextA.setText("");
	     //addStatusL.setText("");
	    }
	    
	   });
	    {//ActionListener for Back of view menu
	        viewBackB.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent ae){
	         viewF.setVisible(false);
	         mainF.setVisible(true);
	         viewMTextA.setText("");
	        }
	        
	       });
	      }
	  } 
	  {//ActionListener for Back of Delete menu
	    deleteBackB.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	     deleteF.setVisible(false);
	     mainF.setVisible(true);
	     deleteMTextFSeatno.setText("");
	     deleteStatusL.setText("");
	     deleteMTextA.setText("");
	    }
	    
	   });
	  }
	  
	  {//ActionListener for Back of Search menu
	    searchBackB.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae){
	     searchF.setVisible(false);
	     mainF.setVisible(true);
	     searchMTextFName.setText("");
	     searchMTextFename.setText("");
	     searchMTextFedes.setText("");
	     searchMTextAForResult.setText("");
	    }
	   });
	  }
	  
	  {//update Validation-----------------------
	  
	    updateMTextFSeatno.addKeyListener(new KeyAdapter()
	    {
	     public void keyTyped(KeyEvent ke)
	     {
	      delValidationSeatno=updateMTextFSeatno.getText();
	      
	      if(delValidationSeatno.equals(""))
	      {
	       delSeatnoV.setVisible(true);
	      }
	      else if(delValidationSeatno.length()>0)
	      {
	       delSeatnoV.setVisible(false);
	      }
	     }
	    });
	    
	    updateMTextFName.addKeyListener(new KeyAdapter()
	    {
	     public void keyTyped(KeyEvent ke)
	     {
	      delValidationName=updateMTextFName.getText();
	      if(delValidationName.length()==0)
	      {
	       delNameV.setVisible(true);
	      }
	      else if(delValidationName.length()>0)
	      {
	       delNameV.setVisible(false);
	      }
	     }
	    });
	    
	    updateMTextFSource.addKeyListener(new KeyAdapter()
	    {
	     public void keyTyped(KeyEvent ke)
	     {
	      delValidationSource=updateMTextFSource.getText();
	      if(delValidationSource.length()==0)
	      {
	       delSourceV.setVisible(true);
	      }
	      else if(delValidationSource.length()>0)
	      {
	       delSourceV.setVisible(false);
	      }
	     }
	    });
	    
	    
	    
	    
	    updateMTextFDestination.addKeyListener(new KeyAdapter()
	    {
	     public void keyTyped(KeyEvent ke)
	     {
	      delValidationDestination=updateMTextFDestination.getText();
	      if(delValidationDestination.length()==0)
	      {
	       delDestinationV.setVisible(true);
	      }
	      else if(delValidationDestination.length()>0)
	      {
	       delDestinationV.setVisible(false);
	      }
	     }
	    });
	    
	    updateMComboBSeatType.addItemListener(new ItemListener()
	    {
	     public void itemStateChanged(ItemEvent e)
	     {      
	      delValidationSeatType=updateMComboBSeatType.getSelectedItem().toString();
	      String addQV1="Select ClassType";
	      String addQV2="Special";
	      String addQV3="Normal";
	      if(delValidationSeatType.equals(addQV1))
	      {
	       delSeatTypeV.setVisible(true);
	      }
	      else if((delValidationSeatType.equals(addQV2))||(delValidationSeatType.equals(addQV2)))
	      {
	       delSeatTypeV.setVisible(false);
	      }
	     }          
	    });

	    
	 }
	  {//Adding details
	   addMBtn.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent ae)
	    {
	     
	     try
	     {
	    	
	      String addQval="Select ClassType";
	      if(addMTextFSeatno.getText().length()!=0&&addMTextFName.getText().length()!=0&&addMTextFSource.getText().length()!=0&&addMTextFDestination.getText().length()!=0&&(!(addMComboBSeatType.getSelectedItem().toString().equals(addQval))))
	      {
	    	  
	       BufferedWriter bW1=new BufferedWriter(new FileWriter("details.txt",true));
	       Seatno =addMTextFSeatno.getText();
	       name = addMTextFName.getText();
	       source = addMTextFSource.getText();
	       Destination = addMTextFDestination.getText();
	       SeatType = addMComboBSeatType.getSelectedItem().toString();
	       name=name.toLowerCase();
	       
	    
	       
	      
	       bW1.write(Seatno+","+name+","+source+","+Destination+","+SeatType+"$");
	       bW1.flush();
	       bW1.newLine();
	       bW1.close();
	       addMTextFSeatno.setText("");
	       addMTextFName.setText("");
	       addMTextFSource.setText("");
	       addMTextFDestination.setText("");
	       String DetailsAdd="Seatno: "+Seatno+"\nName: "+name+"\nSource: "+source+"\nDestination: "+Destination+"\nClassType: "+SeatType;
	      addMTextA.setText(DetailsAdd);
	       //Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
	   //    addStatusL.setForeground(Color.GREEN);
	   //    addStatusL.setText("Added Details Successfully");
	       
	      }
	   
	     }
	     
	     catch(Exception ex)
	     {
	      System.out.println("Exception msg: Adding "+ex);
	     }
	    }
	   });
	  }
	   //-}-Main Menu Container
}

private void add(JLabel background) {
	// TODO Auto-generated method stub
	
}

public static void main(String args[])
{//Code Created By Youtube Channel LEGEND MORTAL Channel Link: http://goo.gl/1Q6uYh
  new DetailsDataSwing();
}
}