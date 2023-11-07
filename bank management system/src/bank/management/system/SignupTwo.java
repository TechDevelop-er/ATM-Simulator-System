package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, eyes, eno;
    JComboBox religionBox, categoryBox, incomeBox, educationBox,occupationBox;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setSize(850,800);
        setLocation(400,10);
        setVisible(true);
        
        getContentPane().setBackground(Color.WHITE);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        
        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Raleway", Font.BOLD,20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionBox = new JComboBox(valReligion);
        religionBox.setBounds(300, 140, 400, 30);
        religionBox.setBackground(Color.WHITE);
        add(religionBox);
        
        
        JLabel category = new JLabel("Category :");
        category.setFont(new Font("Raleway", Font.BOLD,20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
        categoryBox = new JComboBox(valCategory);
        categoryBox.setBounds(300, 190, 400, 30);
        categoryBox.setBackground(Color.WHITE);
        add(categoryBox);
        
        
        JLabel income = new JLabel("Income :");
        income.setFont(new Font("Raleway", Font.BOLD,20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomeCategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        incomeBox = new JComboBox(incomeCategory);
        incomeBox.setBounds(300, 240, 400, 30);
        incomeBox.setBackground(Color.WHITE);
        add(incomeBox);
        
        
        JLabel education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD,20));
        education.setBounds(100, 290, 200, 30);
        add(education);
        
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100, 315, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        educationBox = new JComboBox(educationValues);
        educationBox.setBounds(300, 315, 400, 30);
        educationBox.setBackground(Color.WHITE);
        add(educationBox);
        
   
        JLabel occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Raleway", Font.BOLD,20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationValues[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
        occupationBox = new JComboBox(occupationValues);
        occupationBox.setBounds(300, 390, 400, 30);
        occupationBox.setBackground(Color.WHITE);
        add(occupationBox);
        
        
        JLabel pan = new JLabel("PAN Number :");
        pan.setFont(new Font("Raleway", Font.BOLD,20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        
        JLabel aadhar = new JLabel("Aadhar Number :");
        aadhar.setFont(new Font("Raleway", Font.BOLD,20));
        aadhar.setBounds(100, 490, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        
        JLabel scitizen = new JLabel("Senior Citizen :");
        scitizen.setFont(new Font("Raleway", Font.BOLD,20));
        scitizen.setBounds(100, 540, 200, 30);
        add(scitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        
        JLabel existing = new JLabel("Existing Account :");
        existing.setFont(new Font("Raleway", Font.BOLD,20));
        existing.setBounds(100, 590, 200, 30);
        add(existing);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        
        next = new JButton("Next");
        next.setBackground(new Color(0,102,204));
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
    } 
    
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String)religionBox.getSelectedItem();
        String scategory = (String)categoryBox.getSelectedItem();
        String sincome = (String)incomeBox.getSelectedItem();
        String seducation = (String)educationBox.getSelectedItem();
        String soccupation = (String)occupationBox.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected()) {
            seniorcitizen = "No";
        }
        
    
        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "Yes";
        }
        else if(eno.isSelected()) {
            existingaccount = "No";
        }
        
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        
        try{
            Conn c = new Conn();
            String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
