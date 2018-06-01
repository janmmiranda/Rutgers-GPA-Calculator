package GradeCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;

public class GradeCalcGUI {

	private JFrame frame;
	private JTextField currentCumGPAIN;
	private JTextField totalCrdIN;
	private JTextField course1;
	private JTextField course2;
	private JTextField course3;
	private JTextField course4;
	private JTextField course5;
	private JTextField course6;
	private JTextField course7;
	private JLabel lblSemGPA;
	private JLabel lblCumGPA;
	private JSpinner grade1;
	private JSpinner grade2;
	private JSpinner grade3;
	private JSpinner grade4;
	private JSpinner grade5;
	private JSpinner grade6;
	private JSpinner grade7;
	private JSpinner credits1;
	private JSpinner credits2;
	private JSpinner credits3;
	private JSpinner credits4;
	private JSpinner credits5;
	private JSpinner credits6;
	private JSpinner credits7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeCalcGUI window = new GradeCalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}

	/**
	 * Create the application.
	 */
	public GradeCalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRutgersGradeCalculator = new JLabel("Rutgers Grade Calculator");
		lblRutgersGradeCalculator.setBounds(0, 0, 529, 27);
		lblRutgersGradeCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutgersGradeCalculator.setFont(new Font("Courier New", Font.PLAIN, 18));
		lblRutgersGradeCalculator.setBackground(Color.WHITE);
		frame.getContentPane().add(lblRutgersGradeCalculator);
		
		JLabel lblCurrentCumulativeGpa = new JLabel("Current Cumulative GPA");
		lblCurrentCumulativeGpa.setFont(new Font("Courier New", Font.PLAIN, 12));
		lblCurrentCumulativeGpa.setBounds(10, 38, 161, 14);
		frame.getContentPane().add(lblCurrentCumulativeGpa);
		
		currentCumGPAIN = new JTextField();
		currentCumGPAIN.setBounds(167, 34, 86, 20);
		frame.getContentPane().add(currentCumGPAIN);
		currentCumGPAIN.setColumns(10);
		
		JLabel lblTotalCredits = new JLabel("Total Credits");
		lblTotalCredits.setFont(new Font("Courier New", Font.PLAIN, 12));
		lblTotalCredits.setBounds(266, 38, 101, 14);
		frame.getContentPane().add(lblTotalCredits);
		
		totalCrdIN = new JTextField();
		totalCrdIN.setBounds(363, 34, 86, 20);
		frame.getContentPane().add(totalCrdIN);
		totalCrdIN.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 63, 529, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 24, 529, 3);
		frame.getContentPane().add(separator_1);
		
		JLabel lblCourseName = new JLabel("Course Name");
		lblCourseName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCourseName.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblCourseName.setBounds(23, 76, 86, 14);
		frame.getContentPane().add(lblCourseName);
		
		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredit.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblCredit.setBounds(133, 76, 57, 14);
		frame.getContentPane().add(lblCredit);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Courier New", Font.PLAIN, 11));
		lblGrade.setBounds(200, 76, 46, 14);
		frame.getContentPane().add(lblGrade);
		
		course1 = new JTextField();
		course1.setBounds(23, 101, 86, 20);
		frame.getContentPane().add(course1);
		course1.setColumns(10);
		
		course2 = new JTextField();
		course2.setBounds(23, 132, 86, 20);
		frame.getContentPane().add(course2);
		course2.setColumns(10);
		
		course3 = new JTextField();
		course3.setBounds(23, 163, 86, 20);
		frame.getContentPane().add(course3);
		course3.setColumns(10);
		
		course4 = new JTextField();
		course4.setBounds(23, 194, 86, 20);
		frame.getContentPane().add(course4);
		course4.setColumns(10);
		
		course5 = new JTextField();
		course5.setBounds(23, 225, 86, 20);
		frame.getContentPane().add(course5);
		course5.setColumns(10);
		
		course6 = new JTextField();
		course6.setBounds(23, 256, 86, 20);
		frame.getContentPane().add(course6);
		course6.setColumns(10);
		
		course7 = new JTextField();
		course7.setBounds(23, 287, 86, 20);
		frame.getContentPane().add(course7);
		course7.setColumns(10);
		
		credits1 = new JSpinner();
		credits1.setToolTipText("");
		credits1.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits1.setBounds(142, 101, 39, 20);
		frame.getContentPane().add(credits1);
		
		credits2 = new JSpinner();
		credits2.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits2.setBounds(142, 132, 39, 20);
		frame.getContentPane().add(credits2);
		
		credits3 = new JSpinner();
		credits3.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits3.setBounds(142, 163, 39, 20);
		frame.getContentPane().add(credits3);
		
		credits4 = new JSpinner();
		credits4.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits4.setBounds(142, 194, 39, 20);
		frame.getContentPane().add(credits4);
		
		credits5 = new JSpinner();
		credits5.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits5.setBounds(142, 225, 39, 20);
		frame.getContentPane().add(credits5);
		
		credits6 = new JSpinner();
		credits6.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits6.setBounds(142, 256, 39, 20);
		frame.getContentPane().add(credits6);
		
		credits7 = new JSpinner();
		credits7.setModel(new SpinnerNumberModel(0.0, 0.0, 4.0, 1.0));
		credits7.setBounds(142, 287, 39, 20);
		frame.getContentPane().add(credits7);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(131, 63, 2, 255);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 318, 529, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(190, 63, 10, 255);
		frame.getContentPane().add(separator_4);
		
		grade1 = new JSpinner();
		grade1.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade1.setBounds(200, 101, 39, 20);
		frame.getContentPane().add(grade1);
		
		grade2 = new JSpinner();
		grade2.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade2.setBounds(200, 132, 39, 20);
		frame.getContentPane().add(grade2);
		
		grade3 = new JSpinner();
		grade3.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade3.setBounds(200, 163, 39, 20);
		frame.getContentPane().add(grade3);
		
		grade4 = new JSpinner();
		grade4.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade4.setBounds(200, 194, 39, 20);
		frame.getContentPane().add(grade4);
		
		grade5 = new JSpinner();
		grade5.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade5.setBounds(200, 225, 39, 20);
		frame.getContentPane().add(grade5);
		
		grade6 = new JSpinner();
		grade6.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade6.setBounds(200, 256, 39, 20);
		frame.getContentPane().add(grade6);
		
		grade7 = new JSpinner();
		grade7.setModel(new SpinnerListModel(new String[] {"-", "F", "D", "C", "C+", "B", "B+", "A"}));
		grade7.setBounds(200, 287, 39, 20);
		frame.getContentPane().add(grade7);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(255, 65, 2, 253);
		frame.getContentPane().add(separator_5);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(266, 154, 89, 23);
		btnCalculate.addActionListener((ActionListener) new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double curCumGPA, curTotalCredits;
				double[] currentCredits = new double[7]; String[] currentGrades = new String[7];
				
				if (currentCumGPAIN.getText().equals(null)) { curCumGPA = 0.0; }
				else { curCumGPA = Double.parseDouble(currentCumGPAIN.getText());}
				
				if (totalCrdIN.getText().equals(null)) { curTotalCredits = 0.0; }
				else { curTotalCredits = Double.parseDouble(totalCrdIN.getText()); }
					
				currentCredits[0] = (double) credits1.getValue(); currentCredits[1] = (double) credits2.getValue(); currentCredits[2] = (double) credits3.getValue(); currentCredits[3] = (double) credits4.getValue(); currentCredits[4] = (double) credits5.getValue(); currentCredits[5] = (double) credits6.getValue(); currentCredits[6] = (double) credits7.getValue();
				currentGrades[0] = (String) grade1.getValue(); currentGrades[1] = (String) grade2.getValue(); currentGrades[2] = (String) grade3.getValue(); currentGrades[3] = (String) grade4.getValue(); currentGrades[4] = (String) grade5.getValue(); currentGrades[5] = (String) grade6.getValue(); currentGrades[6] = (String) grade7.getValue(); 
				GradeCalculator gpaCalc = new GradeCalculator(curCumGPA, curTotalCredits, currentCredits, currentGrades);
				double semGPA = round(gpaCalc.processCurGPA(),3);
				lblSemGPA.setText(Double.toString(semGPA));
				lblCumGPA.setText(Double.toString(round(gpaCalc.processCumGPA(semGPA), 3)));
				
			}
		});
		
		frame.getContentPane().add(btnCalculate);
		
		JLabel lblSemesterGpa = new JLabel("Semester GPA");
		lblSemesterGpa.setBounds(363, 135, 86, 14);
		frame.getContentPane().add(lblSemesterGpa);
		
		lblSemGPA = new JLabel("");
		lblSemGPA.setBounds(363, 166, 86, 14);
		frame.getContentPane().add(lblSemGPA);
		
		JLabel lblNewCumulativeGpa = new JLabel("New Cumulative GPA");
		lblNewCumulativeGpa.setBounds(363, 197, 115, 14);
		frame.getContentPane().add(lblNewCumulativeGpa);
		
		lblCumGPA = new JLabel("");
		lblCumGPA.setBounds(363, 228, 86, 14);
		frame.getContentPane().add(lblCumGPA);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(266, 188, 89, 23);
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				course1.setText(""); grade1.setValue("-"); credits1.setValue(0);
				course2.setText(""); grade2.setValue("-"); credits2.setValue(0);
				course3.setText(""); grade3.setValue("-"); credits3.setValue(0);
				course4.setText(""); grade4.setValue("-"); credits4.setValue(0);
				course5.setText(""); grade5.setValue("-"); credits5.setValue(0);
				course6.setText(""); grade6.setValue("-"); credits6.setValue(0);
				course7.setText(""); grade7.setValue("-"); credits7.setValue(0);
				lblSemGPA.setText(""); lblCumGPA.setText(""); 
			}
		});
		
		frame.getContentPane().add(btnClear);
	}
}
