package its340project;

import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class AllergyHistory extends javax.swing.JFrame {

    List<JTextField> textFields = new ArrayList<>();
    public int PatientID;
    public String PatientName;
    public AllergyHistory()
    {
        initComponents();
    }
    public AllergyHistory(int patientID, String name) {
        initComponents();
        PatientID = patientID;
        PatientName = name;
        
        lPatientID.setText(Integer.toString(PatientID));
        lName.setText(PatientName);
        
        textFields.add(tAllergyID);
        textFields.add(tAllergen);
        textFields.add(tAllergyStartDate);
        textFields.add(tAllergyEndDate);
        textFields.add(tAllergyDescription);
        
        String connString = DBUtils.getConnString();
        List<String> allergies = new ArrayList<>();
        
        allergies = DBUtils.getAllergyNames(PatientID, connString);
        jComboBox1.addItem("Select Allergy");
        for(String allergy : allergies)
        {
            jComboBox1.addItem(allergy);
        }     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tPatientID = new javax.swing.JTextField();
        tAllergyID = new javax.swing.JTextField();
        tAllergen = new javax.swing.JTextField();
        tAllergyStartDate = new javax.swing.JTextField();
        tAllergyEndDate = new javax.swing.JTextField();
        tAllergyDescription = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        bNew = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bInterview = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        bSelection = new javax.swing.JButton();
        bDemos = new javax.swing.JButton();
        bGenMed = new javax.swing.JButton();
        bFamHist = new javax.swing.JButton();
        bAlgHist = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        lPatientID = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("PatientID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("AllergyID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Allergen");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Allergy Start Date");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Allergy End Date");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Allergy Description");

        tPatientID.setEditable(false);
        tPatientID.setBackground(new java.awt.Color(153, 153, 153));
        tPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPatientIDActionPerformed(evt);
            }
        });

        tAllergyID.setEditable(false);
        tAllergyID.setBackground(new java.awt.Color(153, 153, 153));

        tAllergen.setEditable(false);
        tAllergen.setBackground(new java.awt.Color(153, 153, 153));

        tAllergyStartDate.setEditable(false);
        tAllergyStartDate.setBackground(new java.awt.Color(153, 153, 153));

        tAllergyEndDate.setEditable(false);
        tAllergyEndDate.setBackground(new java.awt.Color(153, 153, 153));

        tAllergyDescription.setEditable(false);
        tAllergyDescription.setBackground(new java.awt.Color(153, 153, 153));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tAllergyStartDate)
                    .addComponent(tAllergyEndDate)
                    .addComponent(tAllergyID)
                    .addComponent(tAllergen)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tAllergyDescription))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tAllergyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tAllergen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tAllergyStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tAllergyEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tAllergyDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        bNew.setText("New");
        bNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewActionPerformed(evt);
            }
        });

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bNew, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNew)
                    .addComponent(bEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSave)
                    .addComponent(bDelete))
                .addContainerGap())
        );

        bInterview.setText("Start Automated Interview");
        bInterview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInterviewActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        bSelection.setText("Patient Selection");
        bSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSelectionActionPerformed(evt);
            }
        });

        bDemos.setText("Patient Demographics");
        bDemos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDemosActionPerformed(evt);
            }
        });

        bGenMed.setText("Gen Med History");
        bGenMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenMedActionPerformed(evt);
            }
        });

        bFamHist.setText("Family History");
        bFamHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFamHistActionPerformed(evt);
            }
        });

        bAlgHist.setText("Allergy History");
        bAlgHist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlgHistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSelection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDemos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bGenMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFamHist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bAlgHist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(bSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bDemos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bGenMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bFamHist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAlgHist)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel23.setText("PatientID: ");

        lPatientID.setText("Value Not Loaded...");

        jLabel24.setText("Patient Name:");

        lName.setText("Value Not Loaded...");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lPatientID)
                .addGap(33, 33, 33)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(lName)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bInterview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bInterview)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPatientIDActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        for (JTextField tf: textFields)
        {
            tf.setEditable(true);
            tf.setBackground(Color.white);
        }
        tPatientID.setEditable(false);
    }//GEN-LAST:event_bEditActionPerformed

    private void bNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewActionPerformed
        for (JTextField tf: textFields)
        {
            tf.setText(null);
            tf.setEditable(true);
            tf.setBackground(Color.white);
        }
        tPatientID.setText(Integer.toString(PatientID));
        tPatientID.setEditable(false);
        tAllergyID.setEditable(false);
        tAllergyID.setBackground(Color.gray);
        
        jComboBox1.addItem("");
        jComboBox1.setSelectedItem("");
    }//GEN-LAST:event_bNewActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String selectedAllergy = String.valueOf(jComboBox1.getSelectedItem());
        String connString = DBUtils.getConnString();
        Patient patient = new Patient();
        
        patient = DBUtils.getAllergy(PatientID, selectedAllergy, connString);
        
        if(patient != null)
        {
            tAllergyID.setText(Integer.toString(patient.getAllergyID()));
            tAllergen.setText(patient.getAllergen());
            tAllergyStartDate.setText(patient.getAllergyStartDate());
            tAllergyEndDate.setText(patient.getAllergyEndDate());
            tAllergyDescription.setText(patient.getAllergyDescription());
            
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        String connString = DBUtils.getConnString();
        int AllergyID;
        
        if(tAllergyID.getText().isEmpty())
        {
            AllergyID = 999999;
        }
        else
        {
            AllergyID = Integer.parseInt(tAllergyID.getText());
        }
        Patient saveP = new Patient(
            PatientID,
            AllergyID,
            tAllergen.getText(),
            tAllergyStartDate.getText(),
            tAllergyEndDate.getText(),
            tAllergyDescription.getText()
        );

        DBUtils.saveAllergy(saveP, connString);
        
        List<JTextField> textFields = new ArrayList<>();
        textFields.add(tAllergen);
        textFields.add(tAllergyStartDate);
        textFields.add(tAllergyEndDate);
        textFields.add(tAllergyDescription);

        for (JTextField tf : textFields) {
            tf.setEditable(false);
            tf.setBackground(Color.gray);
        }

    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        String connString = DBUtils.getConnString();
        DBUtils.deleteAllergy(Integer.parseInt(tAllergyID.getText()), connString);
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bInterviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInterviewActionPerformed
        DecisionTree allergyInterview = new DecisionTree();
        int AllergyID;
        allergyInterview.createRoot(1, "Does the patient have an allergy?");
        
        allergyInterview.insertYesNode(1, 3, "Input: What is the patient's allergy?");
        allergyInterview.insertYesNode(3, 4, "Input: What is the allergy's start date?");
        allergyInterview.insertYesNode(4, 5, "Input: What is the allergy's end date?");
        allergyInterview.insertYesNode(5, 6, "Input: What is the allergy description?");
        allergyInterview.insertYesNode(6, 2, "Interview is complete, thank you!");
        allergyInterview.insertNoNode(1, 2, "Interview is complete, thank you!");
        
        allergyInterview.queryTree(allergyInterview.getRoot());
        List<String> interviewAnswers = new ArrayList<>();
        List<String> interviewQuestions = new ArrayList<>();
        interviewAnswers = allergyInterview.getAnswers(); 
        interviewQuestions = allergyInterview.getQuestions();
        if(tAllergyID.getText().isEmpty())
        {
            AllergyID = 999999;
        }
        else
        {
            AllergyID = Integer.parseInt(tAllergyID.getText());
        }
        Patient interview = new Patient(PatientID, AllergyID, interviewAnswers.get(0), interviewAnswers.get(1), interviewAnswers.get(2), interviewAnswers.get(3));
        
        DBUtils.saveFamHist(interview, DBUtils.getConnString());
        allergyInterview.logInterview(interview, allergyInterview);
        
        AllergyHistory ah = new AllergyHistory(PatientID, PatientName);
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_bInterviewActionPerformed

    private void bSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSelectionActionPerformed
        PatientSelection ps = new PatientSelection();
        ps.setVisible(true);
        dispose();
    }//GEN-LAST:event_bSelectionActionPerformed

    private void bDemosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDemosActionPerformed
        PatientDemographics dp = new PatientDemographics(PatientID);
        dp.setVisible(true);
        dispose();
    }//GEN-LAST:event_bDemosActionPerformed

    private void bGenMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenMedActionPerformed
        GeneralMedical gm = new GeneralMedical(PatientID, PatientName);
        gm.setVisible(true);
        dispose();
    }//GEN-LAST:event_bGenMedActionPerformed

    private void bFamHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFamHistActionPerformed
        FamilyHistory fh = new FamilyHistory(PatientID, PatientName);
        fh.setVisible(true);
        dispose();
    }//GEN-LAST:event_bFamHistActionPerformed

    private void bAlgHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlgHistActionPerformed
        AllergyHistory ah = new AllergyHistory(PatientID, PatientName);
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_bAlgHistActionPerformed

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
            java.util.logging.Logger.getLogger(AllergyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllergyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllergyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllergyHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllergyHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlgHist;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bDemos;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bFamHist;
    private javax.swing.JButton bGenMed;
    private javax.swing.JButton bInterview;
    private javax.swing.JButton bNew;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSelection;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPatientID;
    private javax.swing.JTextField tAllergen;
    private javax.swing.JTextField tAllergyDescription;
    private javax.swing.JTextField tAllergyEndDate;
    private javax.swing.JTextField tAllergyID;
    private javax.swing.JTextField tAllergyStartDate;
    private javax.swing.JTextField tPatientID;
    // End of variables declaration//GEN-END:variables
}
