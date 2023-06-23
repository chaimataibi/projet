 package ihm;
       

import com.toedter.calendar.JDateChooser;
import static java.awt.SystemColor.text;
import static ihm.DBConnexion.con;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
 import java.lang.NullPointerException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import static java.awt.PageAttributes.MediaType.C;
import static java.awt.SystemColor.text;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import static net.proteanit.sql.DbUtils.resultSetToTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
  import java.text.SimpleDateFormat ;
import java.time.LocalDate ;
import java.time.Month ;
import  java.time.temporal.ChronoUnit ;
import java.util.Date ;
import java.util.Locale ;
import java.util.concurrent.TimeUnit ;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField ;
import static org.bouncycastle.math.raw.Nat.diff;


	

/**
 *
 * @author nadjia
 */
public class principale extends javax.swing.JFrame {
     PreparedStatement prepared = null;
     ResultSet resultat=null;
     private boolean dif;
     public principale() {
        initComponents();
        SUM();
       T.setDate(new Date());
       JDateChooser T = new JDateChooser();
//T.set(false); // This makes the component read-only
         T.setDate(new Date());

        jDateChooser7.setDate(new Date());
                date2.setDate(new Date());
         comboboxa();
         combobox();
         combobox1();
         combobox2();
         SUM1();
         COUNT1();
        date();
         setBounds(350,50,1150,750);
         try {
            UpDateTableclient();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
          try {
            UpDateTableproprietaire();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
     try {
            UpDateTablerevenue();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
  
        
         try {
            UpDateTablerechercher();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
         try {
            UpDateTableEnseignant();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
          try {
            UpDateTableEnseignant1();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}
        
         try {
            UpDateTablebien();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());}} 
     
     
     
     
     private void comboboxa(){
          
          
        try {
            String sql="SELECT* From client";

           prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
             
            resultat = prepared.executeQuery();
            while(  resultat.next()){
                String fa= resultat.getString("nomprenom");
                nom5.addItem(fa);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
      private void SUM(){
   
   try{
   String sql="SELECT sum(reste) from client where idv=?  ";   
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
      
             while(  resultat.next()){
                 String fa= resultat.getString("sum(reste)");
               
              reste.setText(fa);
           }
   } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   
   }
       private void COUNT1(){

   
   try{
   String sql="SELECT COUNT( idb) from contrat ";   
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
      
             while(  resultat.next()){
                String fa= resultat.getString("count( idb)");
              jTextField14.setText(fa);
           }
   } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   
   }

       private void comboboxb(){
        try {
            String sql="SELECT* From client";

           prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
             
            resultat = prepared.executeQuery();
            while(  resultat.next()){
               
                String fa= resultat.getString("nomprenom");
                nomprenom.addItem(fa);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
            
    private void UpDateTableEnseignant1() throws SQLException {
        String sql = "SELECT * FROM verssement ORDER BY nom  ";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
        verse.setModel(DbUtils.resultSetToTableModel(resultat));
    }
     private void getidc(){
         try{
  
  String sql3="SELECT idb From contrat where nom=? ";
 
              prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql3);
             prepared.setString(1, nom5.getSelectedItem().toString());
             resultat = prepared.executeQuery();
             while(  resultat.next()){
               ref1.setText(resultat.getString("idb"));}
            
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
     private void getid2(){
      try{
  
  String sql3="SELECT prix From bien where idb=? ";
 
              prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql3);
             prepared.setString(1, ref1.getText());
             resultat = prepared.executeQuery();
             while(  resultat.next()){
               totale.setText(resultat.getString("prix"));}
            
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
      private void getid4(){
      try{
  
  String sql1="SELECT idc From client where nomprenom=? ";
 String sql2="SELECT prix From contrat where code=? ";
 String sql3="SELECT idb From contrat where nom=? ";
 
              prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql3);
             prepared.setString(1, nom5.getSelectedItem().toString());
             resultat = prepared.executeQuery();
             while(  resultat.next()){
               ref1.setText(resultat.getString("idb"));}
 
              prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql1);
             prepared.setString(1, nom5.getSelectedItem().toString());
             resultat = prepared.executeQuery();
             while(  resultat.next()){
               idc.setText(resultat.getString("idc"));}
              prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql2);
             prepared.setString(1, idc.getText());
             resultat = prepared.executeQuery();
             while(  resultat.next()){
               totale.setText(resultat.getString("prix"));}
         
              
            
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
     
            private void getid3(){
      try{
  
   String sql = "select reste from verssement WHERE reste=totale-verse and idv=? ";
      prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
               
             prepared.setString(1, reste.getText());
             resultat = prepared.executeQuery();
           
             while(  resultat.next()){
               reste.setText(resultat.getString("reste"));}
            
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
            
         
                 
            
          
           
          private void combobox2(){
        try {   
        String sql="SELECT *From bien ";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
        while(  resultat.next()){
        String fa= resultat.getString("idb");
      jComboBox3 .addItem(fa);}
        resultat = prepared.executeQuery();
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }} 
            
        private void COUNT() {
        try {
            String sql = "SELECT reste from verssement,client  where idc=client ";
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
            while (resultat.next()) {
                String fa = resultat.getString("reste");
                montant.setText(fa);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
   } private void UpDateTableclient() throws SQLException {
        String sql = "select idc,nomprenom,ccp,contact,adresse from client ";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
        client.setModel(DbUtils.resultSetToTableModel(resultat));}
 private void UpDateTableproprietaire () throws SQLException {
        String sql = "select * from proprietaire";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
       jTable3.setModel(DbUtils.resultSetToTableModel(resultat));
 }
 
 
   
    private void UpDateTableEnseignant() throws SQLException {
        String sql = "select * from contrat";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
        contrat.setModel(DbUtils.resultSetToTableModel(resultat));
    } private void UpDateTablebien() throws SQLException {
        String sql = "select  idb,dateT,etat,type,emplacement,adresse,Surface,prix,Description,proprietaire  from bien";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
       produit.setModel(DbUtils.resultSetToTableModel(resultat));
    }
    private void UpDateTablerechercher() throws SQLException {
        String sql = "select  idb,etat,type,emplacement,adresse,Surface,prix,Description  from bien WHERE recherche=0";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
       rechercher.setModel(DbUtils.resultSetToTableModel(resultat));
    }
     private void UpDateTablerevenue() throws SQLException {
        String sql = "select   DISTINCT b.idb,b.prix as proprietaire   ,c.prix as client ,b.prix-c.prix as Revenue from contrat c, bien b  where b.recherche=1 ";
        prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
        resultat = prepared.executeQuery();
      revenue.setModel(DbUtils.resultSetToTableModel(resultat));
    }
      private void SUM1(){
   
   try{
   String sql="SELECT sum(b.prix-c.prix)   from  bien b  ,contrat c where b.recherche=1 ";   
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
      
             while(  resultat.next()){
                String fa= resultat.getString("sum(b.prix-c.prix)");
             jTextField15.setText(fa);
           }
   } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
   
   }
     private void combobox(){
        try {      
String sql="SELECT *From client ";
             prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
           while(  resultat.next()){
           
                String fa= resultat.getString("nomprenom");
               nomprenom5.addItem(fa);}
            resultat = prepared.executeQuery();
        } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
      private void combobox1(){
        try {
            
String sql="SELECT *From proprietaire ";
 
             prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
            resultat = prepared.executeQuery();
           
             while(  resultat.next()){
           
                String fa= resultat.getString("nom");
                nom.addItem(fa);}
             
                
            
            resultat = prepared.executeQuery();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
   public void date() {
        Thread clock;
        clock = new Thread() {
            public void run() {
                for (;;) {
                    Calendar Cal = new GregorianCalendar();
                    int sconde = Cal.get(Calendar.SECOND);
                    int minute = Cal.get(Calendar.MINUTE);
                    int heure = Cal.get(Calendar.HOUR);
                    jLabel83.setText("Heure:" + heure + ":" + (minute) + ":" + sconde);
                     int mois = Cal.get(Calendar.MONTH);
                    int annee = Cal.get(Calendar.YEAR);
                    int jour = Cal.get(Calendar.DAY_OF_MONTH);
                    jLabel84.setText("Date:" + jour + "/" + (mois+1) + "/" + annee);
                  
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                       
                    }

                }
            }

        };
        clock.start();
    }
     private void getid(){
        try {
            
String sql="SELECT type From bien where idb=? ";
 String sql1="SELECT emplacement From bien where idb=? ";
 String sql2="SELECT adresse From bien where idb=? ";
   
 
             prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                prepared.setString(1, jComboBox3.getSelectedItem().toString());
            resultat = prepared.executeQuery();
           
             while(  resultat.next()){
           
               type6.setText(resultat.getString("type"));}
               
         prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql1);
                prepared.setString(1, jComboBox3.getSelectedItem().toString());
            resultat = prepared.executeQuery();
           
     while(  resultat.next()){
           
               emplacement5.setText(resultat.getString("emplacement"));}
 prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql2);
                prepared.setString(1, jComboBox3.getSelectedItem().toString());
            resultat = prepared.executeQuery();
           
             while(  resultat.next()){
           
               adresse9.setText(resultat.getString("adresse"));}
             
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }}
            
    
      public static Connection cnx = DBConnexion.ConnectDB();
    
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        code3 = new javax.swing.JTextField();
        nom1 = new javax.swing.JTextField();
        cpp = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        adresse1 = new javax.swing.JTextField();
        montant = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        code4 = new javax.swing.JTextField();
        nom2 = new javax.swing.JTextField();
        cpp1 = new javax.swing.JTextField();
        contact1 = new javax.swing.JTextField();
        adresse2 = new javax.swing.JTextField();
        montant1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        code = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nbc = new javax.swing.JTextField();
        type = new javax.swing.JTextField();
        emplacement = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        nomprenom = new javax.swing.JComboBox<>();
        nbj = new javax.swing.JTextField();
        ref = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        a = new com.toedter.calendar.JDateChooser();
        code11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        nbc4 = new javax.swing.JTextField();
        date3 = new javax.swing.JTextField();
        type5 = new javax.swing.JTextField();
        emplacement4 = new javax.swing.JTextField();
        adresse8 = new javax.swing.JTextField();
        datea = new javax.swing.JTextField();
        nbj4 = new javax.swing.JTextField();
        dated = new javax.swing.JTextField();
        nomprenom4 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton36 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rSButtonPane1 = new rojerusan.RSButtonPane();
        jLabel92 = new javax.swing.JLabel();
        rSButtonPane2 = new rojerusan.RSButtonPane();
        jLabel1 = new javax.swing.JLabel();
        rSButtonPane3 = new rojerusan.RSButtonPane();
        jLabel2 = new javax.swing.JLabel();
        rSButtonPane4 = new rojerusan.RSButtonPane();
        jLabel3 = new javax.swing.JLabel();
        rSButtonPane5 = new rojerusan.RSButtonPane();
        jLabel42 = new javax.swing.JLabel();
        rSButtonPane6 = new rojerusan.RSButtonPane();
        jLabel13 = new javax.swing.JLabel();
        rSButtonPane7 = new rojerusan.RSButtonPane();
        jLabel41 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        m1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        code1 = new javax.swing.JTextField();
        etat = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        emp = new javax.swing.JComboBox<>();
        adress = new javax.swing.JTextField();
        surf = new javax.swing.JTextField();
        prix = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        nom = new javax.swing.JComboBox<>();
        T = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        produit = new javax.swing.JTable(){
            public boolean isCallEditable(int b,int c) {
                return false;
            }
        };
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        m2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contrat = new javax.swing.JTable(){
            public boolean isCallEdittable(int d, int c){

                return false;
            }
        };
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        nouveau = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        code12 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        type6 = new javax.swing.JTextField();
        emplacement5 = new javax.swing.JTextField();
        adresse9 = new javax.swing.JTextField();
        nomprenom5 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton37 = new javax.swing.JButton();
        jLabel124 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton32 = new javax.swing.JButton();
        j = new javax.swing.JTextField();
        na = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        code5 = new javax.swing.JTextField();
        nom3 = new javax.swing.JTextField();
        cpp2 = new javax.swing.JTextField();
        contact2 = new javax.swing.JTextField();
        adresse3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        client = new javax.swing.JTable();
        jLabel66 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        code6 = new javax.swing.JTextField();
        nom4 = new javax.swing.JTextField();
        cpp3 = new javax.swing.JTextField();
        contact3 = new javax.swing.JTextField();
        adresse4 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField17 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        nom5 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        totale = new javax.swing.JTextField();
        ref1 = new javax.swing.JTextField();
        ver = new javax.swing.JTextField();
        reste = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        code7 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        date2 = new com.toedter.calendar.JDateChooser();
        jLabel82 = new javax.swing.JLabel();
        idc = new javax.swing.JTextField();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        verse = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        revenue = new javax.swing.JTable();
        jPanel33 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        m3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rechercher = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        code2 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setText("Code Client");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Nom ");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setText("cpp");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setText("Contact");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setText("Adresse");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Montant Crédit");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setText("Derniére Date");

        jButton15.setText("jButton6");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(montant))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpp, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(code3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(montant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addGap(30, 30, 30)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setText("Code Client");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Nom ");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("cpp");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("Contact");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setText("Adresse");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setText("Montant Crédit");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setText("Derniére Date");

        jButton19.setText("jButton6");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(montant1))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpp1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(code4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(code4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(montant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addGap(30, 30, 30)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 340, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        code.setBackground(new java.awt.Color(153, 153, 153));
        code.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Date Contrat");
        code.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 97, 32));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Réference");
        code.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 97, 30));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Type");
        code.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 97, 33));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Emplacement");
        code.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 97, 31));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Adresse");
        code.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 135, 26));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Nom Client");
        code.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 135, 41));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("debut de contrat");
        code.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 135, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Durée de contrat");
        code.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 135, 33));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("fin de contrat");
        code.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 24));

        nbc.setBackground(new java.awt.Color(153, 153, 153));
        nbc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        nbc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nbcKeyTyped(evt);
            }
        });
        code.add(nbc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 191, 20));
        code.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 191, 20));

        emplacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplacementActionPerformed(evt);
            }
        });
        code.add(emplacement, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 191, -1));
        code.add(adresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 190, -1));

        nomprenom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        code.add(nomprenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 190, -1));

        nbj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nbjKeyTyped(evt);
            }
        });
        code.add(nbj, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 190, -1));

        ref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        code.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        code.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 30, 20));

        jDateChooser2.setDateFormatString("yyyy-M-dd");
        code.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, -1));

        jDateChooser3.setDateFormatString("yyyy-M-dd");
        code.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 190, -1));

        a.setDateFormatString("yyyy-M-dd");
        code.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 190, -1));

        code11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("N° Contrat");
        code11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 97, 37));

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel109.setText("Date Contrat");
        code11.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 97, 32));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel110.setText("Réference");
        code11.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 97, 30));

        jLabel111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel111.setText("Type");
        code11.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 97, 33));

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel112.setText("Emplacement");
        code11.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 97, 31));

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel113.setText("Adresse");
        code11.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 135, 26));

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("Nom Client");
        code11.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 135, 41));

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel115.setText("Date D'arrivée");
        code11.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 135, 30));

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel116.setText("Nb Jours réservés");
        code11.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 135, 33));

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel117.setText("Date Départ Prévue");
        code11.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 24));
        code11.add(nbc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 6, 191, 20));
        code11.add(date3, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 57, 191, 20));
        code11.add(type5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 191, 20));

        emplacement4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplacement4ActionPerformed(evt);
            }
        });
        code11.add(emplacement4, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 225, 191, -1));
        code11.add(adresse8, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 10, 170, -1));
        code11.add(datea, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 110, 170, -1));
        code11.add(nbj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 160, 170, -1));
        code11.add(dated, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 210, 170, -1));

        nomprenom4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        code11.add(nomprenom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 160, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        code11.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        jButton36.setText("jButton8");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        code11.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 20, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        rSButtonPane1.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane1.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane1MouseClicked(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("SonyannaScriptSSi", 1, 36)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\home.png")); // NOI18N
        jLabel92.setText("home");

        javax.swing.GroupLayout rSButtonPane1Layout = new javax.swing.GroupLayout(rSButtonPane1);
        rSButtonPane1.setLayout(rSButtonPane1Layout);
        rSButtonPane1Layout.setHorizontalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel92)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        rSButtonPane1Layout.setVerticalGroup(
            rSButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(rSButtonPane1);
        rSButtonPane1.setBounds(0, 10, 310, 80);

        rSButtonPane2.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane2.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane2.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\loupe.png")); // NOI18N
        jLabel1.setText("Rechercher");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane2Layout = new javax.swing.GroupLayout(rSButtonPane2);
        rSButtonPane2.setLayout(rSButtonPane2Layout);
        rSButtonPane2Layout.setHorizontalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40))
        );
        rSButtonPane2Layout.setVerticalGroup(
            rSButtonPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("             Rechercher");

        jPanel2.add(rSButtonPane2);
        rSButtonPane2.setBounds(0, 100, 310, 90);

        rSButtonPane3.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane3.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane3.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane3MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\contract (4).png")); // NOI18N
        jLabel2.setText("  Estimer");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane3Layout = new javax.swing.GroupLayout(rSButtonPane3);
        rSButtonPane3.setLayout(rSButtonPane3Layout);
        rSButtonPane3Layout.setHorizontalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        rSButtonPane3Layout.setVerticalGroup(
            rSButtonPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(rSButtonPane3);
        rSButtonPane3.setBounds(0, 190, 310, 90);

        rSButtonPane4.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane4.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane4.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane4MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\contract (3).png")); // NOI18N
        jLabel3.setText("  Contrat");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane4Layout = new javax.swing.GroupLayout(rSButtonPane4);
        rSButtonPane4.setLayout(rSButtonPane4Layout);
        rSButtonPane4Layout.setHorizontalGroup(
            rSButtonPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        rSButtonPane4Layout.setVerticalGroup(
            rSButtonPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jPanel2.add(rSButtonPane4);
        rSButtonPane4.setBounds(0, 280, 310, 100);

        rSButtonPane5.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane5.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane5.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane5MouseClicked(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\pay.png")); // NOI18N
        jLabel42.setText("Payment");
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane5Layout = new javax.swing.GroupLayout(rSButtonPane5);
        rSButtonPane5.setLayout(rSButtonPane5Layout);
        rSButtonPane5Layout.setHorizontalGroup(
            rSButtonPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        rSButtonPane5Layout.setVerticalGroup(
            rSButtonPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.add(rSButtonPane5);
        rSButtonPane5.setBounds(0, 500, 310, 100);

        rSButtonPane6.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane6.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane6.setColorNormal(new java.awt.Color(102, 102, 102));
        rSButtonPane6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonPane6MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\cheer.png")); // NOI18N
        jLabel13.setText("    Client");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout rSButtonPane6Layout = new javax.swing.GroupLayout(rSButtonPane6);
        rSButtonPane6.setLayout(rSButtonPane6Layout);
        rSButtonPane6Layout.setHorizontalGroup(
            rSButtonPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        rSButtonPane6Layout.setVerticalGroup(
            rSButtonPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSButtonPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel2.add(rSButtonPane6);
        rSButtonPane6.setBounds(0, 400, 310, 90);

        rSButtonPane7.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonPane7.setColorHover(new java.awt.Color(153, 153, 153));
        rSButtonPane7.setColorNormal(new java.awt.Color(102, 102, 102));

        jLabel41.setFont(new java.awt.Font("Script MT Bold", 1, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image\\money-bag (1).png")); // NOI18N
        jLabel41.setText(" Revenue");

        javax.swing.GroupLayout rSButtonPane7Layout = new javax.swing.GroupLayout(rSButtonPane7);
        rSButtonPane7.setLayout(rSButtonPane7Layout);
        rSButtonPane7Layout.setHorizontalGroup(
            rSButtonPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane7Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        rSButtonPane7Layout.setVerticalGroup(
            rSButtonPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSButtonPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(rSButtonPane7);
        rSButtonPane7.setBounds(0, 600, 310, 80);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 310, 700));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agence Immobiliere", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Calligraphy", 1, 24))); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel26.setBackground(new java.awt.Color(214, 224, 222));

        jButton33.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\icons8_Facebook_32px_8.png")); // NOI18N

        jLabel86.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\1687078162879.gif")); // NOI18N

        jButton34.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\icons8_Instagram_32px_3.png")); // NOI18N

        jButton35.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\icons8_Twitter_32px_2.png")); // NOI18N

        jButton38.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\icons8_Gmail_32px_2.png")); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 583, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanel16);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(153, 153, 153));

        jLabel32.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(51, 51, 51));
        jLabel32.setText("Les Biens");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel33.setText("code");
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 117, 25));

        jLabel34.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel34.setText("Date Transaction");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 52, -1, 23));

        jLabel35.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel35.setText("Etat");
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 117, 28));

        jLabel36.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel36.setText("Type");
        jPanel7.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 126, 117, 28));

        jLabel37.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel37.setText("Emplacement");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 165, 130, 24));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel8.setText("Adresse");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 77, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel9.setText("Surface");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 77, 24));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel10.setText("Prix");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 77, 29));

        jLabel38.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel38.setText("Description");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 110, 28));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel11.setText("Propriétaire");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 130, -1));

        code1.setBackground(new java.awt.Color(153, 153, 153));
        code1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                code1KeyTyped(evt);
            }
        });
        jPanel7.add(code1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 15, 160, -1));

        etat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Vendre", "Louer" }));
        etat.setToolTipText("a\nb\n");
        etat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(etat, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 93, 160, -1));

        type1.setBackground(new java.awt.Color(153, 153, 153));
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "villa", "appartement", "maison", "studio" }));
        type1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 132, 160, -1));

        emp.setBackground(new java.awt.Color(153, 153, 153));
        emp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "x", "alg" }));
        emp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empActionPerformed(evt);
            }
        });
        jPanel7.add(emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 169, 160, -1));

        adress.setBackground(new java.awt.Color(153, 153, 153));
        adress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 260, -1));

        surf.setBackground(new java.awt.Color(153, 153, 153));
        surf.setText("                                           ");
        surf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        surf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surfActionPerformed(evt);
            }
        });
        surf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surfKeyTyped(evt);
            }
        });
        jPanel7.add(surf, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 260, -1));

        prix.setBackground(new java.awt.Color(153, 153, 153));
        prix.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        prix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prixKeyTyped(evt);
            }
        });
        jPanel7.add(prix, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 260, -1));

        desc.setBackground(new java.awt.Color(153, 153, 153));
        desc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 260, -1));

        nom.setBackground(new java.awt.Color(153, 153, 153));
        nom.setForeground(new java.awt.Color(153, 153, 153));
        nom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        nom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        jPanel7.add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 250, 20));

        T.setBackground(new java.awt.Color(153, 153, 153));
        T.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        T.setEnabled(false);
        T.setIcon(null);
        T.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TPropertyChange(evt);
            }
        });
        T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TKeyTyped(evt);
            }
        });
        jPanel7.add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 160, -1));

        produit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        produit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produitMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(produit);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\housea.png")); // NOI18N
        jButton1.setText("Nouveau");
        jButton1.setDefaultCapable(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\delete.png")); // NOI18N
        jButton8.setText("Supprimer");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\register (1).png")); // NOI18N
        jButton3.setText("Modifier ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\house.png")); // NOI18N
        jButton4.setText("vider");
        jButton4.setAutoscrolls(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\printer.png")); // NOI18N
        jButton7.setText("Imprimer");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\gallery (2).png")); // NOI18N
        jButton5.setText("Sélectionner Le Dossier");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N

        jTextField11.setBorder(new javax.swing.border.MatteBorder(null));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton8)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton7)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout m1Layout = new javax.swing.GroupLayout(m1);
        m1.setLayout(m1Layout);
        m1Layout.setHorizontalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        m1Layout.setVerticalGroup(
            m1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estimer", m1);

        m2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        jLabel20.setBackground(new java.awt.Color(102, 102, 102));
        jLabel20.setFont(new java.awt.Font("Elephant", 2, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("            Contrat  De  Location");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(0, 12, 830, 54);

        contrat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        contrat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contratMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(contrat);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 538, 810, 90);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\printer.png")); // NOI18N
        jButton9.setText("Contrat");
        jPanel3.add(jButton9);
        jButton9.setBounds(690, 650, 131, 33);

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\update.png")); // NOI18N
        jButton10.setText("Enregistrer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10);
        jButton10.setBounds(450, 470, 150, 41);

        jButton11.setBackground(new java.awt.Color(204, 255, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\file.png")); // NOI18N
        jButton11.setText("Supprimer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton11);
        jButton11.setBounds(230, 470, 170, 41);

        nouveau.setBackground(new java.awt.Color(204, 255, 204));
        nouveau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nouveau.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\add (1).png")); // NOI18N
        nouveau.setText("Nouveau");
        nouveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouveauActionPerformed(evt);
            }
        });
        jPanel3.add(nouveau);
        nouveau.setBounds(50, 470, 131, 41);

        jButton12.setBackground(new java.awt.Color(204, 255, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\task.png")); // NOI18N
        jButton12.setText("vider");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton12);
        jButton12.setBounds(660, 470, 150, 41);

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField12KeyReleased(evt);
            }
        });
        jPanel3.add(jTextField12);
        jTextField12.setBounds(228, 83, 123, 20);

        code12.setBackground(new java.awt.Color(153, 153, 153));
        code12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel118.setText("N° Contrat");
        code12.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 37));

        jLabel119.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel119.setText("Date Contrat");
        code12.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 32));

        jLabel120.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel120.setText("Réference");
        code12.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 97, 30));

        jLabel121.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel121.setText("Type");
        code12.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 97, 33));

        jLabel122.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel122.setText("Emplacement");
        code12.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 130, 31));

        jLabel123.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel123.setText("Adresse");
        code12.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 135, 26));

        jLabel125.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel125.setText("Date D'arrivée");
        code12.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 135, 30));

        jLabel126.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel126.setText("Nb Jours réservés");
        code12.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 170, 33));

        jLabel127.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel127.setText("Date Départ Prévue");
        code12.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, 24));

        type6.setBackground(new java.awt.Color(153, 153, 153));
        type6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code12.add(type6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 191, 20));

        emplacement5.setBackground(new java.awt.Color(153, 153, 153));
        emplacement5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        emplacement5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emplacement5ActionPerformed(evt);
            }
        });
        code12.add(emplacement5, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 225, 191, -1));

        adresse9.setBackground(new java.awt.Color(153, 153, 153));
        adresse9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code12.add(adresse9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 170, -1));

        nomprenom5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        code12.add(nomprenom5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 200, -1));

        jComboBox3.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        code12.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, -1));

        jButton37.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\accept.png")); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        code12.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 20, 20));

        jLabel124.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel124.setText("Nom Client");
        code12.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 135, 41));
        code12.add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, -1));
        code12.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 200, -1));
        code12.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 180, -1));

        jButton32.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\accept.png")); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        code12.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 20, 20));

        j.setBackground(new java.awt.Color(153, 153, 153));
        j.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code12.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 190, -1));

        na.setBackground(new java.awt.Color(153, 153, 153));
        na.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code12.add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, -1));

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel21.setText("Prix");
        code12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 30));

        jTextField13.setBackground(new java.awt.Color(153, 153, 153));
        jTextField13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        code12.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 200, -1));

        jPanel3.add(code12);
        code12.setBounds(10, 137, 820, 308);

        jLabel31.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N
        jLabel31.setText("jLabel31");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(355, 77, 37, 32);

        m2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 690));

        jTabbedPane1.addTab("Contrat", m2);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(null);

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));

        jLabel59.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel59.setText("Code Client");

        jLabel60.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel60.setText("Nom ");

        jLabel61.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel61.setText("cpp");

        jLabel62.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel62.setText("Contact");

        jLabel63.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel63.setText("Adresse");

        code5.setBackground(new java.awt.Color(153, 153, 153));
        code5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                code5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                code5KeyTyped(evt);
            }
        });

        nom3.setBackground(new java.awt.Color(153, 153, 153));
        nom3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        cpp2.setBackground(new java.awt.Color(153, 153, 153));
        cpp2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        cpp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpp2KeyTyped(evt);
            }
        });

        contact2.setBackground(new java.awt.Color(153, 153, 153));
        contact2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        adresse3.setBackground(new java.awt.Color(153, 153, 153));
        adresse3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        adresse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresse3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\imprimer.png")); // NOI18N
        jButton2.setText("Imprimer");
        jButton2.setAutoscrolls(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(18, 18, 18)
                                .addComponent(code5))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adresse3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpp2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adresse3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.add(jPanel18);
        jPanel18.setBounds(6, 69, 430, 540);

        client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(client);

        jPanel11.add(jScrollPane6);
        jScrollPane6.setBounds(440, 70, 350, 330);

        jLabel66.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel66.setText("        Les Clients");
        jPanel11.add(jLabel66);
        jLabel66.setBounds(10, 20, 420, 34);

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        jPanel11.add(jTextField10);
        jTextField10.setBounds(570, 30, 160, 20);

        jLabel40.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N
        jPanel11.add(jLabel40);
        jLabel40.setBounds(740, 10, 40, 40);

        jButton20.setBackground(new java.awt.Color(204, 255, 204));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\user-avatar.png")); // NOI18N
        jButton20.setText("Enregistrer");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20);
        jButton20.setBounds(460, 480, 130, 30);

        jButton18.setBackground(new java.awt.Color(204, 255, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\avatar.png")); // NOI18N
        jButton18.setText("vider");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton18);
        jButton18.setBounds(640, 480, 140, 30);

        jButton17.setBackground(new java.awt.Color(204, 255, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\user.png")); // NOI18N
        jButton17.setText("Supprimer");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17);
        jButton17.setBounds(640, 430, 140, 30);

        jButton16.setBackground(new java.awt.Color(204, 255, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\add-user.png")); // NOI18N
        jButton16.setText("Nouveau");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton16);
        jButton16.setBounds(460, 430, 130, 30);

        jTabbedPane2.addTab("tab1", jPanel11);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jPanel24.setBackground(new java.awt.Color(153, 153, 153));

        jLabel67.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel67.setText("Code Client");

        jLabel68.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel68.setText("Nom ");

        jLabel69.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel69.setText("cpp");

        jLabel70.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel70.setText("Contact");

        jLabel71.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel71.setText("Adresse");

        code6.setBackground(new java.awt.Color(153, 153, 153));
        code6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        code6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                code6KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                code6KeyTyped(evt);
            }
        });

        nom4.setBackground(new java.awt.Color(153, 153, 153));
        nom4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        cpp3.setBackground(new java.awt.Color(153, 153, 153));
        cpp3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        cpp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpp3KeyTyped(evt);
            }
        });

        contact3.setBackground(new java.awt.Color(153, 153, 153));
        contact3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        adresse4.setBackground(new java.awt.Color(153, 153, 153));
        adresse4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        adresse4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresse4ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(204, 255, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\imprimer.png")); // NOI18N
        jButton21.setText("Imprimer");
        jButton21.setAutoscrolls(true);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel67)
                                .addGap(18, 18, 18)
                                .addComponent(code6))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adresse4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpp3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(code6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contact3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adresse4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel8.add(jPanel24);
        jPanel24.setBounds(10, 102, 415, 511);

        jLabel43.setBackground(new java.awt.Color(153, 153, 153));
        jLabel43.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel43.setText("        Les  proprietaire");
        jPanel8.add(jLabel43);
        jLabel43.setBounds(10, 36, 415, 29);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable3);

        jPanel8.add(jScrollPane7);
        jScrollPane7.setBounds(431, 102, 378, 402);

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField17);
        jTextField17.setBounds(610, 50, 134, 20);

        jLabel72.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N
        jPanel8.add(jLabel72);
        jLabel72.setBounds(760, 29, 32, 40);

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\add-user.png")); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton22);
        jButton22.setBounds(450, 510, 50, 50);

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\user-avatar.png")); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton23);
        jButton23.setBounds(540, 510, 50, 50);

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\user.png")); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton24);
        jButton24.setBounds(640, 510, 50, 50);

        jButton39.setBackground(new java.awt.Color(255, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\avatar.png")); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton39);
        jButton39.setBounds(740, 510, 50, 50);

        jTabbedPane2.addTab("tab2", jPanel8);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Client", jPanel10);

        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jPanel31.setBackground(new java.awt.Color(153, 153, 153));
        jPanel31.setLayout(null);

        jLabel65.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel65.setText("La Date");
        jPanel31.add(jLabel65);
        jLabel65.setBounds(20, 70, 80, 20);

        jLabel76.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel76.setText("Client");
        jPanel31.add(jLabel76);
        jLabel76.setBounds(40, 120, 70, 20);

        jLabel77.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel77.setText("Totale");
        jPanel31.add(jLabel77);
        jLabel77.setBounds(30, 220, 70, 20);

        nom5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        nom5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom5ActionPerformed(evt);
            }
        });
        jPanel31.add(nom5);
        nom5.setBounds(130, 120, 200, 20);

        jLabel78.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel78.setText("Réference");
        jPanel31.add(jLabel78);
        jLabel78.setBounds(20, 270, 90, 20);

        jLabel79.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel79.setText("Versement");
        jPanel31.add(jLabel79);
        jLabel79.setBounds(10, 320, 100, 20);

        jLabel80.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel80.setText("Reste");
        jPanel31.add(jLabel80);
        jLabel80.setBounds(20, 370, 90, 20);

        totale.setBackground(new java.awt.Color(153, 153, 153));
        totale.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        totale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                totaleMouseClicked(evt);
            }
        });
        totale.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                totaleInputMethodTextChanged(evt);
            }
        });
        jPanel31.add(totale);
        totale.setBounds(130, 220, 200, 20);

        ref1.setBackground(new java.awt.Color(153, 153, 153));
        ref1.setAutoscrolls(false);
        ref1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        ref1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref1ActionPerformed(evt);
            }
        });
        jPanel31.add(ref1);
        ref1.setBounds(130, 270, 200, 20);

        ver.setBackground(new java.awt.Color(153, 153, 153));
        ver.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel31.add(ver);
        ver.setBounds(130, 320, 200, 20);

        reste.setBackground(new java.awt.Color(153, 153, 153));
        reste.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        reste.setEnabled(true

        );
        reste.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resteMouseClicked(evt);
            }
        });
        reste.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                resteInputMethodTextChanged(evt);
            }
        });
        jPanel31.add(reste);
        reste.setBounds(130, 370, 200, 16);

        jLabel81.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel81.setText("code");
        jPanel31.add(jLabel81);
        jLabel81.setBounds(30, 10, 50, 33);

        code7.setBackground(new java.awt.Color(153, 153, 153));
        code7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel31.add(code7);
        code7.setBounds(140, 20, 190, 16);

        jButton25.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\accept.png")); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton25);
        jButton25.setBounds(330, 120, 20, 20);

        date2.setBackground(new java.awt.Color(153, 153, 153));
        date2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        date2.setDateFormatString("yyyy-M-dd");
        date2.setMaxSelectableDate(null);
        jPanel31.add(date2);
        date2.setBounds(130, 70, 200, 22);

        jLabel82.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel82.setText("N°client");
        jPanel31.add(jLabel82);
        jLabel82.setBounds(20, 160, 110, 50);

        idc.setBackground(new java.awt.Color(153, 153, 153));
        idc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel31.add(idc);
        idc.setBounds(130, 170, 200, 20);

        jButton30.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\imprimer.png")); // NOI18N
        jButton30.setText("jButton30");
        jPanel31.add(jButton30);
        jButton30.setBounds(10, 480, 141, 40);

        jButton31.setText("crédit");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel31.add(jButton31);
        jButton31.setBounds(210, 480, 137, 40);

        verse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        verse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verseMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(verse);

        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Elephant", 2, 18)); // NOI18N
        jLabel64.setText("Les Verssement Des Clients");

        jLabel39.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N

        jButton26.setBackground(new java.awt.Color(204, 255, 204));
        jButton26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton26.setText("Nouveau");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(204, 255, 204));
        jButton27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton27.setText("Enregistrer");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(204, 255, 204));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\money.png")); // NOI18N
        jButton29.setText("vider");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(204, 255, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\trash-can.png")); // NOI18N
        jButton28.setText("Supprimer");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(74, 74, 74))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel39))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton29)
                            .addComponent(jButton28))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 640));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("payment", jPanel27);

        jPanel30.setLayout(null);

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        revenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "prix", "prix", "Revenue"
            }
        ));
        jScrollPane9.setViewportView(revenue);

        jPanel33.setBackground(new java.awt.Color(153, 153, 153));

        jLabel87.setBackground(new java.awt.Color(153, 153, 153));
        jLabel87.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        jLabel87.setText("               Revenue");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setText("Total Des Biens");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setText("Total Revenue");

        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
        });

        jLabel91.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane9)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel90))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel88)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel30.add(jPanel32);
        jPanel32.setBounds(0, 0, 840, 640);

        jTabbedPane1.addTab("Revenue", jPanel30);

        m3.setBackground(new java.awt.Color(255, 255, 255));

        rechercher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rechercher);

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setForeground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setText("Etat");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setText("Type de Bien");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setText("Emplacement");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel7.setText("Adresse");

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel14.setText("Surface");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel15.setText("Prix");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel16.setText("Description");

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel17.setText("code");

        code2.setBackground(new java.awt.Color(153, 153, 153));
        code2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jTextField7.setBackground(new java.awt.Color(153, 153, 153));
        jTextField7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jButton6.setBackground(new java.awt.Color(204, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\gallery (2).png")); // NOI18N
        jButton6.setText("Afficher Image");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 153, 255));
        jButton13.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Downloads\\printer.png")); // NOI18N
        jButton13.setText("Imprimer");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(code2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(code2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton6))
                .addGap(28, 28, 28))
        );

        jLabel85.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\iconnes\\rechercher.png")); // NOI18N

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Elephant", 2, 24)); // NOI18N
        jLabel12.setText("    Rechercher");

        javax.swing.GroupLayout m3Layout = new javax.swing.GroupLayout(m3);
        m3.setLayout(m3Layout);
        m3Layout.setHorizontalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(m3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addContainerGap())
        );
        m3Layout.setVerticalGroup(
            m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(m3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Rechercher", m3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 850, 710));

        jPanel23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel23MouseDragged(evt);
            }
        });
        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel23MousePressed(evt);
            }
        });
        jPanel23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel23KeyReleased(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\TM 161\\Desktop\\image agence\\logout.png")); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 1120, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int x,y;
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
                                    

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        setBounds(350,50,1100,750);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void emplacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplacementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplacementActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void nbcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbcKeyTyped
        // TODO add your handling code here:
         char t=evt.getKeyChar();
                if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
                    evt.consume();
                {}
       
    }//GEN-LAST:event_nbcKeyTyped

    private void nbjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nbjKeyTyped
        // TODO add your handling code here:
         char t=evt.getKeyChar();
                if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
                    evt.consume();
                {}
       
    }//GEN-LAST:event_nbjKeyTyped

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        getid();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        COUNT();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        COUNT();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        // TODO add your handling code here:
      jTabbedPane1.setSelectedIndex(5);

    }//GEN-LAST:event_jLabel42MouseClicked

    private void jPanel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MousePressed
        // TODO add your handling code here:
         x=evt.getX();
        y=evt.getY();
    }//GEN-LAST:event_jPanel23MousePressed

    private void jPanel23MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseDragged
        // TODO add your handling code here:
         int xx =evt.getXOnScreen();
          int yy =evt.getYOnScreen();
        this.setLocation(xx=x, yy=y);
    }//GEN-LAST:event_jPanel23MouseDragged

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void emplacement4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplacement4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplacement4ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jPanel23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel23KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel23KeyReleased

    private void rSButtonPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
                                    
        
    }//GEN-LAST:event_rSButtonPane1MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        setBounds(350,50,1200,750);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void rSButtonPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
                                    
    }//GEN-LAST:event_rSButtonPane2MouseClicked

    private void rSButtonPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane3MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
                                    
    }//GEN-LAST:event_rSButtonPane3MouseClicked

    private void rSButtonPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane4MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
                                    
    }//GEN-LAST:event_rSButtonPane4MouseClicked

    private void rSButtonPane6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane6MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
                                    
    }//GEN-LAST:event_rSButtonPane6MouseClicked

    private void rSButtonPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonPane5MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
                                    
    }//GEN-LAST:event_rSButtonPane5MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)rechercher.getModel();
        String search= jTextField9.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> idv = new TableRowSorter<DefaultTableModel>(table);
        rechercher.setRowSorter(idv);
        idv.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        NewJFrame_1 menu = new  NewJFrame_1 ();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void rechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercherMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)rechercher.getModel();
        int myIndex=rechercher.getSelectedRow();
        code2.setText(model.getValueAt(myIndex,0).toString());
        jTextField6.setText(model.getValueAt(myIndex,1).toString());
        jTextField5.setText(model.getValueAt(myIndex,2).toString());
        jTextField7.setText(model.getValueAt(myIndex,3).toString());
        jTextField1.setText(model.getValueAt(myIndex,4).toString());
        jTextField2.setText(model.getValueAt(myIndex,5).toString());
        jTextField3.setText(model.getValueAt(myIndex,6).toString());
        jTextField4.setText(model.getValueAt(myIndex,7).toString());
    }//GEN-LAST:event_rechercherMouseClicked

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)revenue.getModel();
        String search=jTextField16.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> idb = new TableRowSorter<DefaultTableModel>(table);
        revenue.setRowSorter(idb);
        idb.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if(code7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez Versement");
        }else{

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Supprimer un enregistrement?","Supprimer enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "DELETE FROM verssement WHERE  idv='"+code7.getText()+"'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

                    prepared.executeUpdate();
                    UpDateTableEnseignant1();

                    UpDateTableEnseignant1();
                    JOptionPane.showMessageDialog(null, "Supprimer versement");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }}
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        code7.setText("");
        date2.setDateFormatString("");
        nom5.setSelectedItem("");
        totale.setText("");
        ref1.setText("");
        ver.setText("");
        reste.setText("");
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if(code7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez versement");
        }else{

            try{
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Modifier un enregistrement?","Modifier enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "UPDATE verssement SET idv=? ,date=?,nom=?,idc=?,totale=?,Reference=?,verse=? ,rest=? WHERE idv='"+code7.getText()+"'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code7.getText());

                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
                    String theDate = dateFormat.format(date2.getDate());
                    prepared.setString(2,theDate);

                    prepared.setString(3, nom5.getSelectedItem().toString());
                    prepared.setString(4, idc.getText());
                    prepared.setString(5, totale.getText());
                    prepared.setString(6, ref1.getText());
                    prepared.setString(7, ver.getText());
                    prepared.setString(8, reste.getText());
                    JOptionPane.showMessageDialog(null, "Modifier versement");

                    prepared.executeUpdate();
                    UpDateTableEnseignant1();

                    UpDateTableEnseignant1();}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();}}
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(code7.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez verssement");
        }else{
            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir ajouter un enregistrement?","ajouter enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "INSERT INTO verssement (idv,date,nom,client,totale,Reference,verse,rest) VALUES (?,?,?,?,?,?,?,?) ";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code7.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
                    String theDate = dateFormat.format(date2.getDate());
                    prepared.setString(2,theDate);

                    prepared.setString(3, nom5.getSelectedItem().toString());
                    prepared.setString(4, idc.getText());

                    prepared.setString(5, totale.getText());
                    prepared.setString(6, ref1.getText());
                    prepared.setString(7, ver.getText());
                    prepared.setString(8, reste.getText());

                    prepared.executeUpdate();

                    UpDateTableEnseignant1();
                    UpDateTableEnseignant1();
                    JOptionPane.showMessageDialog(null, "Nouveau versement");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();}}

        try{
            String sql = "UPDATE   verssement set reste=totale-verse";
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

            prepared.executeUpdate();

        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)verse.getModel();
        String search= jTextField8.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        verse.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void verseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verseMouseClicked
        // TODO add your handling code here:

        DefaultTableModel model=(DefaultTableModel)verse.getModel();
        int myIndex=verse.getSelectedRow();
        code7.setText(model.getValueAt(myIndex,0).toString());

        try {
            // DefaultTableModel model = (DefaultTableModel)etudiant.getModel();
            //  int seectedRow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-M-dd").parse((String)model.getValueAt(myIndex, 1).toString());
            date2.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);

        }

        nom5.setSelectedItem(model.getValueAt(myIndex,2).toString());

        totale.setText(model.getValueAt(myIndex,3).toString());
        ref1.setText(model.getValueAt(myIndex,4).toString());

        ver.setText(model.getValueAt(myIndex,5).toString());
        reste.setText(model.getValueAt(myIndex,6).toString());
    }//GEN-LAST:event_verseMouseClicked

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        crédis menu = new  crédis();
        menu.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
       getid4();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void resteInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_resteInputMethodTextChanged
        // TODO add your handling code here:
        try{
            String sql = "UPDATE verssement set reste=totale-verse WHERE idv= '"+ code7.getText()+"'";
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

            prepared.setString(1, reste.getText());
            resultat = prepared.executeQuery();
            while(  resultat.next()){
                reste.setText(resultat.getString("reste"));}

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_resteInputMethodTextChanged

    private void resteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resteMouseClicked
        // TODO add your handling code here:
        int a =Integer.parseInt(totale.getText());
        int b =Integer.parseInt(ver.getText());
        String answer =String.valueOf(a-b);
        reste.setText(answer);
    }//GEN-LAST:event_resteMouseClicked

    private void ref1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref1ActionPerformed

    private void totaleInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_totaleInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_totaleInputMethodTextChanged

    private void totaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totaleMouseClicked
        // TODO add your handling code here:
       /* try{

            String sql2="SELECT prix From bien where idb=? ";

            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql2);
            prepared.setString(1, ref1.getText());
            resultat = prepared.executeQuery();
            while(  resultat.next()){
                totale.setText(resultat.getString("prix"));}

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }*/

    }//GEN-LAST:event_totaleMouseClicked

    private void nom5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom5ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(code5.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez client");
        }else{

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir ajouter un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code5.getText()!=null){
                    String sql = "INSERT INTO client (idc,nomprenom,ccp,contact,adresse ) VALUES (?,?,?,?,?)";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code5.getText());
                    prepared.setString(2, nom3.getText());
                    prepared.setString(3, cpp2.getText());
                    prepared.setString(4, contact2.getText());
                    prepared.setString(5, adresse3.getText());

                    prepared.executeUpdate();

                    UpDateTableclient();
                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Nouveau client");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();}
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if (code5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selectionnez client");
        } else {

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Supprimer un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code5.getText()!=null){

                    String sql = "DELETE FROM client WHERE  idc='" + code5.getText() + "'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    JOptionPane.showMessageDialog(null, "Supprimer client");

                    prepared.executeUpdate();
                    UpDateTableclient();

                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Supprimer client");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        code5.setText("");
        nom3.setText("");
        cpp2.setText("");
        contact2.setText("");
        adresse3.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if (code5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selectionnez client");
        } else {

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Modifier un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code5.getText()!=null){

                    String sql = "UPDATE client SET idc=?,nomprenom=?,ccp=?,contact=?,adresse=? WHERE idc= '" + code5.getText() + "'";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code5.getText());
                    prepared.setString(2, nom3.getText());

                    prepared.setString(3, cpp2.getText());
                    prepared.setString(4, contact2.getText());
                    prepared.setString(5, adresse3.getText());

                    prepared.executeUpdate();
                    UpDateTableclient();

                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Modifier client");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)client.getModel();
        String search= jTextField10.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> idc = new TableRowSorter<DefaultTableModel>(table);
        client.setRowSorter(idc);
        idc.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField10KeyReleased

    private void clientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)client.getModel();
        int myIndex=client.getSelectedRow();
        code5.setText(model.getValueAt(myIndex,0).toString());
        nom3.setText(model.getValueAt(myIndex,1).toString());
        cpp2.setText(model.getValueAt(myIndex,2).toString());

        contact2.setText(model.getValueAt(myIndex,3).toString());
        adresse3.setText(model.getValueAt(myIndex,4).toString());
    }//GEN-LAST:event_clientMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\TM 161\\Desktop\\ihm\\src\\ihm\\client.jrxml"));
            JasperDesign jd=JRXmlLoader.load(in);
            String query ="select * from client ";
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(query);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);
            HashMap para=new HashMap();
            JasperPrint j=JasperFillManager.fillReport(jr,para,con);
            JasperViewer.viewReport(j,false);
            OutputStream os =new FileOutputStream(new File("C:\\ihm"));
            JasperExportManager.exportReportToPdfStream(j, os);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adresse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresse3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse3ActionPerformed

    private void cpp2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpp2KeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_cpp2KeyTyped

    private void code5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code5KeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_code5KeyTyped

    private void code5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code5KeyPressed
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_code5KeyPressed

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        // TODO add your handling code here:

        try {

            String sql = "SELECT prix * 2 as prix   FROM  bien where prix > 10 and idb='"+jComboBox3.getSelectedItem().toString()+"'";
            prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

            while (resultat.next()) {

                jTextField13.setText(resultat.getString(" prix "));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jTextField13MouseClicked

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("d MMM y", Locale.ENGLISH);
            Date firstDate = jDateChooser1.getDate();
            int  b =Integer.parseInt(j.getText());
            long diffInMillies = Math.abs(firstDate.getTime() + b);

            boolean dif2 = dif;
            long dif = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            Date date = new Date(dif);
            jDateChooser4.setDate(date);
        } catch (Exception e) {
            e.printStackTrace();}
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        getid();
    }//GEN-LAST:event_jButton37ActionPerformed

    private void emplacement5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emplacement5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emplacement5ActionPerformed

    private void jTextField12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)contrat.getModel();
        String search= jTextField12.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> code = new TableRowSorter<DefaultTableModel>(table);
        contrat.setRowSorter(code);
        code.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField12KeyReleased

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)contrat.getModel();
        String search= jTextField12.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        contrat.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        na.setText("");
        jDateChooser7.setDateFormatString("");

        jComboBox3.setSelectedItem("");
        type6.setText("");
        emplacement5.setText("");
        adresse9.setText("");
        jTextField13.setText("");
        nomprenom5 .setSelectedItem("");
        jDateChooser1.setDateFormatString("");
        j.setText("");

        jDateChooser4.setDateFormatString("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void nouveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouveauActionPerformed
        // TODO add your handling code here:
        if(na.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez contrat");
        }else{
            try{

                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir ajouter un enregistrement?","ajouter enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(na.getText()!=null){
                    String sql = "INSERT INTO contrat (code,date,idb,prix,nom,dateA,nbjr) VALUES (?,?,?,?,?,?,?)";

                    prepared = (PreparedStatement)NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, na.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String theDate = dateFormat.format(jDateChooser7.getDate());
                    prepared.setString(2,theDate);
                    prepared.setString(3, jComboBox3.getSelectedItem().toString());
                    prepared.setString(4, jTextField13.getText());
                    prepared.setString(5, nomprenom5.getSelectedItem().toString());

                    SimpleDateFormat datFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String theDat = dateFormat.format(jDateChooser1.getDate());
                    prepared.setString(6,theDat);
                    prepared.setString(7, j.getText());

                    /* SimpleDateFormat datFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String theDat = dateFormat.format(jDateChooser4.getDate());
                    prepared.setString(7,theDat);*/

                    prepared.executeUpdate();

                    UpDateTableEnseignant();

                    UpDateTableEnseignant();
                    JOptionPane.showMessageDialog(null, "Nouveau contrat");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Selectionnez contrat " + e.getMessage());
                e.printStackTrace();
            }}
            
            try{
                String sql = "UPDATE bien set recherche=1 WHERE idb= '"+ jComboBox3.getSelectedItem()+"'";
                prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                prepared.executeUpdate();

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
             try{
                String sql = "UPDATE client l,contrat c set c.idb=l.idb WHERE l.idc=c.idc and l.nomprenom= '"+ nomprenom5.getSelectedItem()+"'";
                prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                prepared.executeUpdate();

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
    }//GEN-LAST:event_nouveauActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(na.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez contrat");
        }else{
            try{

                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Supprimer un enregistrement?","Supprimer enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(na.getText()!=null){

                    String sql = "DELETE FROM contrat WHERE  code='"+na.getText()+"'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

                    prepared.executeUpdate();
                    UpDateTableEnseignant();
                    UpDateTableEnseignant();
                    JOptionPane.showMessageDialog(null, "Supprimer Contrat");
                    ;}

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }}
            try{
                String sql = "UPDATE bien set recherche=0 WHERE idb= '"+ ref.getSelectedItem()+"'";
                prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);

                prepared.executeUpdate();

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Selectionnez contrat  " + e.getMessage());
                e.printStackTrace();
            }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(na.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez contrat ");
        }else{

            try{
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Modifier un enregistrement?","Modifier enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(na.getText()!=null){
                    String sql = "UPDATE contrat SET code=?,date=?, idb=?,nom=?,dateA=?,nbjr=?   WHERE code= '"+na.getText()+"'";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, na.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
                    String theDate = dateFormat.format(jDateChooser2.getDate());
                    prepared.setString(2,theDate);
                    prepared.setString(3, ref.getSelectedItem().toString());
                    prepared.setString(4, nomprenom.getSelectedItem().toString());
                    SimpleDateFormat datFormat = new SimpleDateFormat("yyyy-M-dd");
                    String theDat = dateFormat.format(jDateChooser3.getDate());
                    prepared.setString(5,theDat);
                    prepared.setString(6, j.getText());
                    // SimpleDateFormat datFormat = new SimpleDateFormat("yyyy-M-dd");
                    // String theDat = dateFormat.format(jDateChooser3.getDate());
                    // prepared.setString(5,theDat);
                    JOptionPane.showMessageDialog(null, "Modifier contrat");
                    prepared.executeUpdate();
                    UpDateTableEnseignant();
                    UpDateTableEnseignant();}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Selectionnez contrat   " + e.getMessage());
                e.printStackTrace();}}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void contratMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contratMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)contrat.getModel();
        int myIndex=contrat.getSelectedRow();
        na.setText(model.getValueAt(myIndex,0).toString());
        try {
            // DefaultTableModel model = (DefaultTableModel)etudiant.getModel();
            //  int seectedRow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("d MMM y").parse((String)model.getValueAt(myIndex, 1).toString());
            jDateChooser7.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);

        }
        jComboBox3.setSelectedItem(model.getValueAt(myIndex,2).toString());
        jTextField13.setText(model.getValueAt(myIndex,3).toString());
        nomprenom5.setSelectedItem(model.getValueAt(myIndex,4).toString());

        try {
            // DefaultTableModel model = (DefaultTableModel)etudiant.getModel();
            //  int seectedRow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-M-dd").parse((String)model.getValueAt(myIndex, 5).toString());
            jDateChooser1.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);

        }

        j.setText(model.getValueAt(myIndex,6).toString());
        try {
            // DefaultTableModel model = (DefaultTableModel)etudiant.getModel();
            //  int seectedRow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-M-dd").parse((String)model.getValueAt(myIndex, 7).toString());
            jDateChooser4.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);

        }
    }//GEN-LAST:event_contratMouseClicked

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)produit.getModel();
        String search= jTextField11.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> idb = new TableRowSorter<DefaultTableModel>(table);
        produit.setRowSorter(idb);
        idb.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        /* try {
            InputStream in = new FileInputStream(new File("C:\\Users\\TM 161\\Desktop\\ihm\\src\\ihm\\report3.jrxml"));
            JasperDesign jd=JRXmlLoader.load(in);
            String query ="select idb from bien ";
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(query);
            jd.setQuery(newQuery);

            JasperReport jr = JasperCompileManager.compileReport(jd);

            HashMap hm = new HashMap();
            hm.put("id",code1.getText());

            JasperPrint j=JasperFillManager.fillReport(jr,hm,con);
            JasperViewer.viewReport(j,false);
            OutputStream os =new FileOutputStream(new File("C:\\ihm"));
            JasperExportManager.exportReportToPdfStream(j, os);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);*/
            image menu = new image();
            menu.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try {
            InputStream in = new FileInputStream(new File("C:\\Users\\TM 161\\Desktop\\ihm\\src\\ihm\\report1.jrxml"));
            JasperDesign jd=JRXmlLoader.load(in);
            String query ="select idb,etat,type,emplacement,adresse,Surface,prix,Description  from bien ";
            JRDesignQuery newQuery=new JRDesignQuery();
            newQuery.setText(query);
            jd.setQuery(newQuery);
            JasperReport jr = JasperCompileManager.compileReport(jd);

            HashMap<String, Object> para=new HashMap();
            para.put("idb",code1.getText());
            JasperPrint j=JasperFillManager.fillReport(jr,para,con);
            JasperViewer.viewReport(j,false);
            OutputStream os =new FileOutputStream(new File("C:\\ihm"));
            JasperExportManager.exportReportToPdfStream(j, os);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        code1.setText("");
        T.setDateFormatString("");

        etat .setSelectedItem("");
        type1.setSelectedItem("");
        emp .setSelectedItem("");
        adress.setText("");
        surf.setText("");
        prix.setText("");
        desc.setText("");
        nom.setSelectedItem("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(code1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez bien");
        }else{

            try{

                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Modifier un enregistrement?","Modifier enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "UPDATE bien SET idb=?,dateT=?,etat=?,type=?,emplacement=?,adresse=?,Surface=?,prix=?,Description=? ,proprietaire=? WHERE idb= '"+code1.getText()+"'";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code1.getText());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
                    String theDate = dateFormat.format(T.getDate());
                    prepared.setString(2,theDate);

                    prepared.setString(3, etat.getSelectedItem().toString());
                    prepared.setString(4, type1.getSelectedItem().toString());
                    prepared.setString(5, emp.getSelectedItem().toString());

                    prepared.setString(6, adress.getText());
                    prepared.setString(7, surf.getText());
                    prepared.setString(8, prix.getText());
                    prepared.setString(9, desc.getText());
                    prepared.setString(10, nom.getSelectedItem().toString());

                    prepared.executeUpdate();
                    UpDateTablebien();

                    UpDateTablebien();
                    JOptionPane.showMessageDialog(null, "Modifier produit");
                } } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                    e.printStackTrace();}}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(code1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez bien");
        }else{

            try{

                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Supprimer un enregistrement?","Supprimer  enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "DELETE FROM bien WHERE  idb='"+code1.getText()+"'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.executeUpdate();
                    UpDateTablebien();

                    UpDateTablebien();
                    JOptionPane.showMessageDialog(null, "Supprimer BIEN");}
                else{JOptionPane.showMessageDialog(null, "vollez selection produit");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(code1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez bien");
        }else{
            try{

                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir ajouter un enregistrement?","ajouter enregistrement",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code1.getText()!=null){
                    String sql = "INSERT INTO bien (idb,dateT,etat,type,emplacement,adresse,Surface,prix,Description,proprietaire) VALUES (?,?,?,?,?,?,?,?,?,?)";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code1.getText());
                    SimpleDateFormat datFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String theDat = datFormat.format(T.getDate());
                    prepared.setString(2,theDat);

                    prepared.setString(3, etat.getSelectedItem().toString());
                    prepared.setString(4, type1.getSelectedItem().toString());
                    prepared.setString(5, emp.getSelectedItem().toString());

                    prepared.setString(6, adress.getText());
                    prepared.setString(7, surf.getText());
                    prepared.setString(8, prix.getText());
                    prepared.setString(9, desc.getText());

                    prepared.setString(10, nom.getSelectedItem().toString());

                    prepared.executeUpdate();
                    UpDateTablebien();
                    UpDateTablebien();
                    JOptionPane.showMessageDialog(null, "Nouveau BIEN");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Selectionnez bien " + e.getMessage());
                e.printStackTrace();}}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void produitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produitMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)produit.getModel();
        int myIndex=produit.getSelectedRow();
        code1.setText(model.getValueAt(myIndex,0).toString());
        try {
            // DefaultTableModel model = (DefaultTableModel)etudiant.getModel();
            //  int seectedRow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(myIndex, 1).toString());
            T.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(principale.class.getName()).log(Level.SEVERE, null, ex);

        }
        etat.setSelectedItem(model.getValueAt(myIndex,2).toString());
        type1.setSelectedItem(model.getValueAt(myIndex,3).toString());
        emp.setSelectedItem(model.getValueAt(myIndex,4).toString());

        adress.setText(model.getValueAt(myIndex,5).toString());
        surf.setText(model.getValueAt(myIndex,6).toString());

        prix.setText(model.getValueAt(myIndex,7).toString());
        desc.setText(model.getValueAt(myIndex,8).toString());
        nom.setSelectedItem(model.getValueAt(myIndex,9).toString());
    }//GEN-LAST:event_produitMouseClicked

    private void TKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_TKeyTyped

    private void TPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TPropertyChange
        // TODO add your handling code here:
        /* if (T.getDate() != null) {
            try {
                //System.err.println("aise");
                long date =T.getDate().getTime() / 1000;
                //System.out.println(">> "+date);
                ResultSet x = db.getAvailableRooms(date);

                DefaultListModel model = new DefaultListModel();

                while (x.next()) {
                    model.addElement(x.getString("room_no"));
                }
                // roomsList.setModel(model);

            } catch (SQLException ex) {
                System.err.println("errrrrrrrrrrrr");
            }
        }*/
    }//GEN-LAST:event_TPropertyChange

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void prixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prixKeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_prixKeyTyped

    private void surfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surfKeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_surfKeyTyped

    private void surfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surfActionPerformed

    private void empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empActionPerformed

    private void code1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code1KeyTyped
        // TODO add your handling code here:
        char t=evt.getKeyChar();
        if(!(Character.isDigit(t)||(t==KeyEvent.VK_BACK_SPACE)||(t==KeyEvent.VK_DELETE)))
        evt.consume();
        {}
    }//GEN-LAST:event_code1KeyTyped

    private void code6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_code6KeyPressed

    private void code6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_code6KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_code6KeyTyped

    private void cpp3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpp3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cpp3KeyTyped

    private void adresse4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresse4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresse4ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         if(code6.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Selectionnez proprietaire");
        }else{

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir ajouter un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code6.getText()!=null){
                    String sql = "INSERT INTO proprietaire (idc,nomprenom,ccp,contact,adresse ) VALUES (?,?,?,?,?)";

                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code6.getText());
                    prepared.setString(2, nom4.getText());
                    prepared.setString(3, cpp3.getText());
                    prepared.setString(4, contact3.getText());
                    prepared.setString(5, adresse4.getText());

                    prepared.executeUpdate();

                    UpDateTableclient();
                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Nouveau proprietaire	");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();}
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
          if (code6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selectionnez proprietaire");
        } else {

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Modifier un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code5.getText()!=null){
                    String sql = "UPDATE proprietaire SET idr=?,nom=?contact=?,adresse=?,ccp=? WHERE idr= '" + code6.getText() + "'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    prepared.setString(1, code6.getText());
                    prepared.setString(2, nom4.getText());
                    prepared.setString(3, cpp3.getText());
                    prepared.setString(4, contact3.getText());
                    prepared.setString(5, adresse4.getText());
                    prepared.executeUpdate();
                    UpDateTableclient();
                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Modifier proprietaire");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
          if (code6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selectionnez proprietaire");
        } else {

            try {
                if(JOptionPane.showConfirmDialog(null,"Êtes-vous sûr de vouloir Supprimer un enregistrement?","",JOptionPane.YES_NO_OPTION)==JOptionPane.OK_OPTION)
                if(code5.getText()!=null){

                    String sql = "DELETE FROM proprietaire	 WHERE  idr='" + code6.getText() + "'";
                    prepared = (PreparedStatement) NewJFrame.cnx.prepareStatement(sql);
                    JOptionPane.showMessageDialog(null, "Supprimer proprietaire	");

                    prepared.executeUpdate();
                    UpDateTableclient();

                    UpDateTableclient();
                    JOptionPane.showMessageDialog(null, "Supprimer proprietaire	");}
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur ici  " + e.getMessage());
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
         code6.setText("");
        nom4.setText("");
        cpp3.setText("");
        contact3.setText("");
        adresse4.setText("");
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        int myIndex=jTable3.getSelectedRow();
        code6.setText(model.getValueAt(myIndex,0).toString());
        nom4.setText(model.getValueAt(myIndex,1).toString());
        cpp3.setText(model.getValueAt(myIndex,2).toString());

        contact3.setText(model.getValueAt(myIndex,3).toString());
        adresse4.setText(model.getValueAt(myIndex,4).toString());
    }//GEN-LAST:event_jTable3MouseClicked


   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser T;
    private com.toedter.calendar.JDateChooser a;
    private javax.swing.JTextField adress;
    private javax.swing.JTextField adresse;
    private javax.swing.JTextField adresse1;
    private javax.swing.JTextField adresse2;
    private javax.swing.JTextField adresse3;
    private javax.swing.JTextField adresse4;
    private javax.swing.JTextField adresse8;
    private javax.swing.JTextField adresse9;
    private javax.swing.JTable client;
    private javax.swing.JPanel code;
    private javax.swing.JTextField code1;
    private javax.swing.JPanel code11;
    private javax.swing.JPanel code12;
    private javax.swing.JTextField code2;
    private javax.swing.JTextField code3;
    private javax.swing.JTextField code4;
    private javax.swing.JTextField code5;
    private javax.swing.JTextField code6;
    private javax.swing.JTextField code7;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField contact1;
    private javax.swing.JTextField contact2;
    private javax.swing.JTextField contact3;
    private javax.swing.JTable contrat;
    private javax.swing.JTextField cpp;
    private javax.swing.JTextField cpp1;
    private javax.swing.JTextField cpp2;
    private javax.swing.JTextField cpp3;
    private javax.swing.JTextField date;
    private javax.swing.JTextField date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JTextField date3;
    private javax.swing.JTextField datea;
    private javax.swing.JTextField dated;
    private javax.swing.JTextField desc;
    private javax.swing.JComboBox<String> emp;
    private javax.swing.JTextField emplacement;
    private javax.swing.JTextField emplacement4;
    private javax.swing.JTextField emplacement5;
    private javax.swing.JComboBox<String> etat;
    private javax.swing.JTextField idc;
    private javax.swing.JTextField j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel m1;
    private javax.swing.JPanel m2;
    private javax.swing.JPanel m3;
    private javax.swing.JTextField montant;
    private javax.swing.JTextField montant1;
    private javax.swing.JTextField na;
    private javax.swing.JTextField nbc;
    private javax.swing.JTextField nbc4;
    private javax.swing.JTextField nbj;
    private javax.swing.JTextField nbj4;
    private javax.swing.JComboBox<String> nom;
    private javax.swing.JTextField nom1;
    private javax.swing.JTextField nom2;
    private javax.swing.JTextField nom3;
    private javax.swing.JTextField nom4;
    private javax.swing.JComboBox<String> nom5;
    private javax.swing.JComboBox<String> nomprenom;
    private javax.swing.JComboBox<String> nomprenom4;
    private javax.swing.JComboBox<String> nomprenom5;
    private javax.swing.JButton nouveau;
    private javax.swing.JTextField prix;
    private javax.swing.JTable produit;
    private rojerusan.RSButtonPane rSButtonPane1;
    private rojerusan.RSButtonPane rSButtonPane2;
    private rojerusan.RSButtonPane rSButtonPane3;
    private rojerusan.RSButtonPane rSButtonPane4;
    private rojerusan.RSButtonPane rSButtonPane5;
    private rojerusan.RSButtonPane rSButtonPane6;
    private rojerusan.RSButtonPane rSButtonPane7;
    private javax.swing.JTable rechercher;
    private javax.swing.JComboBox<String> ref;
    private javax.swing.JTextField ref1;
    private javax.swing.JTextField reste;
    private javax.swing.JTable revenue;
    private javax.swing.JTextField surf;
    private javax.swing.JTextField totale;
    private javax.swing.JTextField type;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JTextField type5;
    private javax.swing.JTextField type6;
    private javax.swing.JTextField ver;
    private javax.swing.JTable verse;
    // End of variables declaration//GEN-END:variables
}
