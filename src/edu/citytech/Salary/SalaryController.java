package edu.citytech.Salary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SalaryController {

	@FXML
	private TextField InputHrsWorked;

	// InputHrsWorked.setPromptText("Enter hours worked");

	@FXML
	private TextField InputHlyWage;

	@FXML
	private TextField OTHours;

	@FXML
	private TextField RegHours;

	@FXML
	private TextField OTPay;

	@FXML
	private TextField RegPay;

	@FXML
	private TextField WkPay;

	@FXML
	private TextField YrPay;

	@FXML
	private TextField NetPay;

	@FXML
	private TextField Tax;

	@FXML
	private TextField GrossPay;

	@FXML
	void ClaculateSalary(ActionEvent event) {

		double hoursWorked, hourlyPay, RegularPay, RegularHour, OvTime, OvTimePay, WeeklyPay, YearlyPay;

		double bNetPay = 0, bTax = 0;

		hoursWorked = Double.parseDouble(InputHrsWorked.getText());
		hourlyPay = Double.parseDouble(InputHlyWage.getText());
		double tax = 0.10;
		double tax1 = 0.12;
		double tax2 = 0.22;
		double tax3 = 0.24;
		double tax4 = 0.32;
		double tax5 = 0.35;
		double tax6 = 0.37;

		if (hoursWorked <= 40) {
			RegularHour = hoursWorked;
			hoursWorked = RegularHour;
			OvTimePay = 0;
			OvTime = 0;
			RegularPay = hoursWorked * hourlyPay;
			WeeklyPay = RegularPay;
			YearlyPay = WeeklyPay * 52;
			
			
			if (YearlyPay >= 510300){
				bTax = YearlyPay * tax6;
				bNetPay = YearlyPay - bTax;

			}
			

			else if (YearlyPay < 9699) {
				bTax = YearlyPay * tax;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 39475) {
				bTax = YearlyPay * tax1;
				bNetPay = YearlyPay - bTax;

			} else if (YearlyPay < 84200) {
				bTax = YearlyPay * tax2;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 160725) {
				bTax = YearlyPay * tax3;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 204100) {
				bTax = YearlyPay * tax4;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 510300) {
				bTax = YearlyPay * tax5;
				bNetPay = YearlyPay - bTax;

			}

			

		}

		else {
			OvTime = hoursWorked - 40;
			OvTimePay = OvTime * 1.5 * hourlyPay;
			RegularHour = 40;
			hoursWorked = RegularHour;
			RegularPay = 40 * hourlyPay;
			WeeklyPay = OvTimePay + RegularPay;
			YearlyPay = WeeklyPay * 52;

			if (YearlyPay >= 510300) {
				bTax = YearlyPay * tax6;
				bNetPay = YearlyPay - bTax;

			}

			if (YearlyPay < 9699) {
				bTax = YearlyPay * tax;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 39475) {
				bTax = YearlyPay * tax1;
				bNetPay = YearlyPay - bTax;

			} else if (YearlyPay < 84200) {
				bTax = YearlyPay * tax2;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 160725) {
				bTax = YearlyPay * tax3;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 204100) {
				bTax = YearlyPay * tax4;
				bNetPay = YearlyPay - bTax;

			}

			else if (YearlyPay < 510300) {
				bTax = YearlyPay * tax5;
				bNetPay = YearlyPay - bTax;

			}

		}

		String strDouble1 = String.format("%.2f", OvTime);
		String strDouble2 = String.format("%.2f", RegularHour);
		String strDouble3 = String.format("%.2f", OvTimePay);
		String strDouble4 = String.format("%.2f", RegularPay);
		String strDouble5 = String.format("%.2f", WeeklyPay);
		String strDouble6 = String.format("%.2f", YearlyPay);

		String strDouble10 = String.format("%.2f", bNetPay);
		String strDouble11 = String.format("%.2f", bTax);

		OTHours.setText(strDouble1);
		RegHours.setText(strDouble2);
		OTPay.setText(strDouble3);
		RegPay.setText(strDouble4);
		WkPay.setText(strDouble5);
		YrPay.setText(strDouble6);

		NetPay.setText(strDouble10);
		Tax.setText(strDouble11);

		System.out.print(YearlyPay);

	}

	@FXML
	void Quit(ActionEvent event) {

		System.exit(0);

	}

	@FXML
	void Reset(ActionEvent event) {

		InputHrsWorked.setText("");
		InputHlyWage.setText("");
		OTHours.setText("");
		RegHours.setText("");
		OTPay.setText("");
		RegPay.setText("");
		WkPay.setText("");
		YrPay.setText("");

		NetPay.setText("");
		Tax.setText("");
		//GrossPay.setText("");

	}

}
