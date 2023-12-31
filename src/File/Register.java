/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import javax.swing.JOptionPane;

/**
 *
 * @author Gertrude Anne Chua
 * Second Frame to be Run
 */
public class Register extends javax.swing.JFrame {


    public Register() {
        initComponents();
        jB_Proceed.setOpaque(false);                                            // Set Text Fields to Transparent                                      
        jB_Proceed.setContentAreaFilled(false);
        jB_Proceed.setBorderPainted(false);
        
        jTF_LastName.setBackground(new java.awt.Color(0,0,0,0));
        jTF_FirstName.setBackground(new java.awt.Color(0,0,0,0));
        jTF_MiddleInitial.setBackground(new java.awt.Color(0,0,0,0));
        
        jTF_Address.setBackground(new java.awt.Color(0,0,0,0));
        jTF_City.setBackground(new java.awt.Color(0,0,0,0));
        jTF_ZipCode.setBackground(new java.awt.Color(0,0,0,0));
        
        jTF_StudentNumber.setBackground(new java.awt.Color(0,0,0,0));
        jTF_Year.setBackground(new java.awt.Color(0,0,0,0));
        
        jTF_PlaceOfBirth.setBackground(new java.awt.Color(0,0,0,0));
        jTF_LastSchoolAttended.setBackground(new java.awt.Color(0,0,0,0));
        jTF_Lecture.setBackground(new java.awt.Color(0,0,0,0));
        jTF_Lab.setBackground(new java.awt.Color(0,0,0,0));
        
        jCB_Month.setBackground(new java.awt.Color(0,0,0,0));
        jCB_Day.setBackground(new java.awt.Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bttnGroup_HonorsReceived = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jTF_LastName = new javax.swing.JTextField();
        jTF_FirstName = new javax.swing.JTextField();
        jTF_MiddleInitial = new javax.swing.JTextField();
        jTF_StudentNumber = new javax.swing.JTextField();
        jTF_Address = new javax.swing.JTextField();
        jTF_City = new javax.swing.JTextField();
        jTF_ZipCode = new javax.swing.JTextField();
        jCB_Month = new javax.swing.JComboBox<>();
        jCB_Day = new javax.swing.JComboBox<>();
        jTF_Year = new javax.swing.JTextField();
        jTF_PlaceOfBirth = new javax.swing.JTextField();
        jTF_LastSchoolAttended = new javax.swing.JTextField();
        jRB_Valedictorian = new javax.swing.JRadioButton();
        jRB_Salutatorian = new javax.swing.JRadioButton();
        jRB_WithHonors = new javax.swing.JRadioButton();
        jRB_Varsity = new javax.swing.JRadioButton();
        jTF_Lecture = new javax.swing.JTextField();
        jTF_Lab = new javax.swing.JTextField();
        jB_Proceed = new javax.swing.JButton();
        RegisterIcon = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 768));

        jPanel2.setLayout(null);

        jTF_LastName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_LastName.setForeground(new java.awt.Color(51, 51, 51));
        jTF_LastName.setToolTipText("");
        jTF_LastName.setBorder(null);
        jPanel2.add(jTF_LastName);
        jTF_LastName.setBounds(400, 110, 150, 40);

        jTF_FirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_FirstName.setForeground(new java.awt.Color(51, 51, 51));
        jTF_FirstName.setBorder(null);
        jPanel2.add(jTF_FirstName);
        jTF_FirstName.setBounds(620, 110, 200, 40);

        jTF_MiddleInitial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_MiddleInitial.setForeground(new java.awt.Color(51, 51, 51));
        jTF_MiddleInitial.setBorder(null);
        jPanel2.add(jTF_MiddleInitial);
        jTF_MiddleInitial.setBounds(880, 110, 100, 40);

        jTF_StudentNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_StudentNumber.setForeground(new java.awt.Color(51, 51, 51));
        jTF_StudentNumber.setBorder(null);
        jPanel2.add(jTF_StudentNumber);
        jTF_StudentNumber.setBounds(400, 310, 190, 40);

        jTF_Address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_Address.setForeground(new java.awt.Color(51, 51, 51));
        jTF_Address.setBorder(null);
        jPanel2.add(jTF_Address);
        jTF_Address.setBounds(400, 210, 290, 40);

        jTF_City.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_City.setForeground(new java.awt.Color(51, 51, 51));
        jTF_City.setBorder(null);
        jPanel2.add(jTF_City);
        jTF_City.setBounds(750, 210, 110, 40);

        jTF_ZipCode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_ZipCode.setForeground(new java.awt.Color(51, 51, 51));
        jTF_ZipCode.setBorder(null);
        jPanel2.add(jTF_ZipCode);
        jTF_ZipCode.setBounds(920, 210, 70, 40);

        jCB_Month.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCB_Month.setForeground(new java.awt.Color(102, 102, 102));
        jCB_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jCB_Month.setBorder(null);
        jCB_Month.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jCB_Month);
        jCB_Month.setBounds(640, 310, 130, 40);

        jCB_Day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCB_Day.setForeground(new java.awt.Color(102, 102, 102));
        jCB_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jCB_Day.setBorder(null);
        jCB_Day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jCB_Day);
        jCB_Day.setBounds(810, 310, 60, 40);

        jTF_Year.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_Year.setForeground(new java.awt.Color(51, 51, 51));
        jTF_Year.setBorder(null);
        jPanel2.add(jTF_Year);
        jTF_Year.setBounds(920, 310, 70, 40);

        jTF_PlaceOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_PlaceOfBirth.setForeground(new java.awt.Color(51, 51, 51));
        jTF_PlaceOfBirth.setBorder(null);
        jPanel2.add(jTF_PlaceOfBirth);
        jTF_PlaceOfBirth.setBounds(400, 430, 300, 40);

        jTF_LastSchoolAttended.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_LastSchoolAttended.setForeground(new java.awt.Color(51, 51, 51));
        jTF_LastSchoolAttended.setBorder(null);
        jPanel2.add(jTF_LastSchoolAttended);
        jTF_LastSchoolAttended.setBounds(400, 530, 290, 40);

        bttnGroup_HonorsReceived.add(jRB_Valedictorian);
        jRB_Valedictorian.setBorder(null);
        jRB_Valedictorian.setBorderPainted(true);
        jRB_Valedictorian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRB_Valedictorian);
        jRB_Valedictorian.setBounds(780, 463, 20, 20);

        bttnGroup_HonorsReceived.add(jRB_Salutatorian);
        jRB_Salutatorian.setBorder(null);
        jRB_Salutatorian.setBorderPainted(true);
        jRB_Salutatorian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRB_Salutatorian);
        jRB_Salutatorian.setBounds(780, 513, 20, 20);

        bttnGroup_HonorsReceived.add(jRB_WithHonors);
        jRB_WithHonors.setBorder(null);
        jRB_WithHonors.setBorderPainted(true);
        jRB_WithHonors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRB_WithHonors);
        jRB_WithHonors.setBounds(780, 570, 20, 20);

        bttnGroup_HonorsReceived.add(jRB_Varsity);
        jRB_Varsity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRB_Varsity.setBorder(null);
        jRB_Varsity.setBorderPainted(true);
        jRB_Varsity.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRB_Varsity);
        jRB_Varsity.setBounds(780, 620, 20, 20);

        jTF_Lecture.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_Lecture.setForeground(new java.awt.Color(51, 51, 51));
        jTF_Lecture.setBorder(null);
        jPanel2.add(jTF_Lecture);
        jTF_Lecture.setBounds(400, 630, 110, 40);

        jTF_Lab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTF_Lab.setForeground(new java.awt.Color(51, 51, 51));
        jTF_Lab.setBorder(null);
        jPanel2.add(jTF_Lab);
        jTF_Lab.setBounds(570, 630, 116, 40);

        jB_Proceed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_Proceed.setForeground(new java.awt.Color(255, 255, 255));
        jB_Proceed.setToolTipText("Click to see your information");
        jB_Proceed.setBorder(null);
        jB_Proceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jB_Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ProceedActionPerformed(evt);
            }
        });
        jPanel2.add(jB_Proceed);
        jB_Proceed.setBounds(850, 710, 140, 40);

        RegisterIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/RegFrame-Interface.png"))); // NOI18N
        RegisterIcon.setText("jLabel1");
        jPanel2.add(RegisterIcon);
        RegisterIcon.setBounds(0, 0, 1020, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ProceedActionPerformed
        
        
        
        if(jTF_LastName.getText().trim().isEmpty() || jTF_FirstName.getText().trim().isEmpty()                      // Input Valiudation for all Text Fields
            ||jTF_MiddleInitial.getText().trim().isEmpty() || jTF_StudentNumber.getText().trim().isEmpty() 
            ||jTF_Address.getText().trim().isEmpty() || jTF_City.getText().trim().isEmpty() 
            || jTF_ZipCode.getText().trim().isEmpty()|| jTF_Year.getText().trim().isEmpty() 
            || jTF_PlaceOfBirth.getText().trim().isEmpty() || jTF_LastSchoolAttended.getText().trim().isEmpty()
            || jTF_Lecture.getText().trim().isEmpty() || jTF_Lab.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Empty Field \nType \"-\" to proceed ",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else if (!"0".equals(jTF_StudentNumber.getText().substring(5,6))                              // Input Validation for Student Number - Requires Specific Format
                || (!"1".equals(jTF_StudentNumber.getText().substring(6,7)) 
                && !"2".equals(jTF_StudentNumber.getText().substring(6,7)) 
                && !"3".equals(jTF_StudentNumber.getText().substring(6,7))))
        {
            JOptionPane.showMessageDialog(null,"Invalid Student Number \nFollow the Format YYYY-CN-NNN "
            + "\n Ex: 2019-01-000","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        else     // Evaluate and Get data from each Text fields                                                                                                                                                                   
        {
            Print print = new Print();          // Inialize Print Class (3rd Frame)
            if ( "0".equals(jTF_StudentNumber.getText().substring(5,6)) && "1".equals(jTF_StudentNumber.getText().substring(6,7))){             //Assess text field Student Number to determine course
                Print.course.setText("Bachelor of Engineering"); }
            else if("0".equals(jTF_StudentNumber.getText().substring(5,6)) && "2".equals(jTF_StudentNumber.getText().substring(6,7))){
                Print.course.setText("Bachelor of Engineering Technology");}
            else if ("0".equals(jTF_StudentNumber.getText().substring(5,6)) && "3".equals(jTF_StudentNumber.getText().substring(6,7))){
                Print.course.setText("Bachelor of Science");}
            
            String name = jTF_LastName.getText() + " " + jTF_FirstName.getText() + " " + jTF_MiddleInitial.getText() ; // Combine Last name, First Name and Middle initial into 1 string named "name"
            String fullAddress = jTF_Address.getText() + ", " + jTF_City.getText() + " City, " + jTF_ZipCode.getText(); // Combine address, city, and zipcode into 1 string named "Full address"
            String dateOfBirth = jCB_Month.getSelectedItem() + " " + jCB_Day.getSelectedItem() + ", " + jTF_Year.getText(); // Combine date of birth details into 1 string named "dateOfBirth"
            
            Print.fullName.setText(name); // Show name into Jlabel Full name of Print Class
            Print.studentNum.setText(jTF_StudentNumber.getText()); // Direct transfering of input from Register class to Print class- Show Student number into JLabel student num of Print Class.
            Print.presentAdd.setText(fullAddress); // Show fulladdress into jLabel presntAdd of Print Class.
            Print.dateOfBirth.setText(dateOfBirth); // Show date of birth into Jlabel date of Birth of Print class.
     
            int year = Integer.parseInt(jTF_Year.getText()); //set Text Field Year into integer
            int age = 2020 - year; // Formula to compute user's age.
            
            Print.agePrint.setText(String.valueOf(age)); //Direct transfering of input from Register class to Print class
            Print.placeOfBirth.setText(jTF_PlaceOfBirth.getText()); //Direct transfering of input from Register class to Print class
            Print.lastSchoolPrint.setText(jTF_LastSchoolAttended.getText()); //Direct transfering of input from Register class to Print class
            
            double discount; //  This condition will determine the discount, base on the users selected button in Honors Received
            if(jRB_Valedictorian.isSelected()== true)
            {
                Print.honorsReceived.setText("Valedictorian");
                discount = 1;
                Print.discountPrint.setText("100%");
            }
            else if(jRB_Salutatorian.isSelected()== true)
            {
                Print.honorsReceived.setText("Salutatorian");
                discount = .75;
                Print.discountPrint.setText("75%");
            }
            else if(jRB_WithHonors.isSelected()== true)
            {
                Print.honorsReceived.setText("With Honors");
                discount = .25;
                Print.discountPrint.setText("25%");
            }
            else if(jRB_Varsity.isSelected()== true)
            {
                Print.honorsReceived.setText("Varsity");
                discount = .10;
                Print.discountPrint.setText("10%");
            }
            else
            {
                Print.honorsReceived.setText("-");
                discount = 0;
                Print.discountPrint.setText(String.valueOf(discount));
            }
            
           Print.lecturePrint.setText(jTF_Lecture.getText()); //Direct transfering of input from Register class to Print class
           Print.labPrint.setText(jTF_Lab.getText()); //Direct transfering of input from Register class to Print class
           double unitsLec = Integer.parseInt(jTF_Lecture.getText()); // Convert Lecture and Lab inputs to integer
           double unitsLab = Integer.parseInt(jTF_Lab.getText());    
           double totalNumOfUnits = unitsLec + unitsLab;
           double FEE_PER_UNIT = 150; 
           double miscellaneouseFee = 2000; 
           double totalTuitionFee = totalNumOfUnits * FEE_PER_UNIT; // Compute for Total Tuition Fee
           double SPF = totalTuitionFee * 0.01; 
           double finalTuition = totalTuitionFee + miscellaneouseFee + SPF;
           double totalTuitionToBePaid = finalTuition - (finalTuition * discount); // Compute for Total Tuition fee to be Paid
           
            
           Print.totalTuitionPrint.setText(String.valueOf(totalTuitionFee)); // 
           Print.missFeePrint.setText(String.valueOf(miscellaneouseFee));    // Show computed values to Jlabel of Print class 
           Print.TotalTuitionTobePaid.setText(String.valueOf(totalTuitionToBePaid));//
            
            print.setVisible(true);             // Open Print Class - third frame- last to be run.
            dispose();
        }

    }//GEN-LAST:event_jB_ProceedActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterIcon;
    private javax.swing.ButtonGroup bttnGroup_HonorsReceived;
    private javax.swing.JButton jB_Proceed;
    public static javax.swing.JComboBox<String> jCB_Day;
    public static javax.swing.JComboBox<String> jCB_Month;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JRadioButton jRB_Salutatorian;
    public static javax.swing.JRadioButton jRB_Valedictorian;
    public static javax.swing.JRadioButton jRB_Varsity;
    public static javax.swing.JRadioButton jRB_WithHonors;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTF_Address;
    public static javax.swing.JTextField jTF_City;
    public static javax.swing.JTextField jTF_FirstName;
    public static javax.swing.JTextField jTF_Lab;
    public static javax.swing.JTextField jTF_LastName;
    public static javax.swing.JTextField jTF_LastSchoolAttended;
    public static javax.swing.JTextField jTF_Lecture;
    public static javax.swing.JTextField jTF_MiddleInitial;
    public static javax.swing.JTextField jTF_PlaceOfBirth;
    public static javax.swing.JTextField jTF_StudentNumber;
    public static javax.swing.JTextField jTF_Year;
    public static javax.swing.JTextField jTF_ZipCode;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
