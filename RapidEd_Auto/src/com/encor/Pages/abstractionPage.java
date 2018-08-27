package com.encor.Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class abstractionPage {

	WebDriver driver;

	
	By AbstractioIcon = By.xpath(".//*[@id='ctl00_LinkIconAbstraction']/img");
	By AbstractFirstCase = By.xpath(".//*[@id='ctl00_ctl00_DefaultMasterBody_AbstractionPage_AbsMasterBody_ASPxGridView1_cell0_17_AbsImg']");
	By MeasureStatus= By.xpath(".//*[@id='ctl00_DefaultMasterBody_ToolbarTabPage_SEP1Result']/span/span/span");
	By SaveButton = By.xpath(".//*[@id='ctl00_DefaultMasterBody_ToolbarTabPage_SaveWorksheet']");
	By SaveContinue = By.xpath(".//*[@id='ctl00_DefaultMasterBody_ToolbarTabPage_btnOk']");
	By AccountNumber = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody_acctInfo1_AccountInfoTabPage_lblMedisolvIdentifier']");
	By UnitNumber = By.xpath(".//*[@id='ctl00_DefaultMasterBody_acctInfo1_AccountInfoTabPage_lblUnitNo']");
	By MedisolvIdentifier = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody_acctInfo1_AccountInfoTabPage_lblMedisolvIdentifier']");
	By Firstname = By.xpath(".//*[@id='ctl00_DefaultMasterBody__patientFirstName__answerLabel']");
	By Lastname = By.xpath(".//*[@id='ctl00_DefaultMasterBody__patientLastName__answerLabel']");
	By Admissiondatetime = By.xpath(".//*[@id='ctl00_DefaultMasterBody__admitDate__arrivalDate']");
	By Dischargedatetime = By.xpath(".//*[@id='ctl00_DefaultMasterBody__dischargeDate__dischargeDate']");
	By Pincode = By.xpath(".//*[@id='ctl00_DefaultMasterBody__zipCode__answerLabel']");
	By patientSraceopt1 = By.xpath(".//*[@id='Race']/label[1]");
	By patientSraceopt2 = By.xpath(".//*[@id='Race']/label[2]");
	By patientSraceopt3 = By.xpath(".//*[@id='Race']/label[3]");
	By patientSraceopt4 = By.xpath(".//*[@id='Race']/label[4]");
	By patientSraceopt5 = By.xpath(".//*[@id='Race']/label[5]");
	By patientSraceopt6 = By.xpath(".//*[@id='Race']/label[6]");
	By patientSraceopt7 = By.xpath(".//*[@id='Race']/label[7]");
	By Hispanicthnicity1 = By.xpath(".//*[@id='HispanicEthnicity']/label[1]");
	By Hispanicthnicity2 = By.xpath(".//*[@id='HispanicEthnicity']/label[2]");
	By patientsex1 = By.xpath(".//*[@id='Sex']/label[1]");
	By patientsex2 = By.xpath(".//*[@id='Sex']/label[3]");
	By patientsex3 = By.xpath(".//*[@id='Sex']/label[3]");
	By Age33 = By.xpath(".//*[@id='ctl00_DefaultMasterBody_SectionContent0']/div/div/table/tbody/tr[13]/td[2]");
	By diagnosiscode = By.xpath(".//*[@id='ctl00_DefaultMasterBody__principalDiagnosis__answerLabel']");
	By TransferfromOtherHospital = By.xpath(".//*[@id='TransferFromAnotherHospitalOrAsc']/label[1]/input");
	By TransferfromOtherHospitalNO = By.xpath(".//*[@id='TransferFromAnotherHospitalOrAsc']/label[2]");
	By clinicaltrial = By.xpath(".//*[@id='ClinicalTrial']/label[1]/input");
	By clinicaltrialNo = By.xpath(".//*[@id='ClinicalTrial']/label[2]/input");
	By SevereSepsisPresent = By.xpath(".//*[@id='SevereSepsisPresent']/label[1]/input");
	By SevereSepsisPresentN = By.xpath(".//*[@id='SevereSepsisPresent']/label[2]/input");
	By severeSepsisPresentationDate = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody__severeSepsisPresentationDate__date']");
	By severeSepsisPresentationDateUTD = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody__severeSepsisPresentationDate_UTD']");
	By severeSepsisPresentationTime = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody__severeSepsisPresentationTime__time']");
	By severeSepsisPresentationTimeUTD = By
			.xpath(".//*[@id='ctl00_DefaultMasterBody__severeSepsisPresentationTime_UTD']");
	By AdministrativeContraindicationToCareSevereSepsis = By
			.xpath(".//*[@id='AdministrativeContraindicationToCareSevereSepsis']/label[1]");
	By AdministrativeContraindicationToCareSevereSepsisN = By
			.xpath(".//*[@id='AdministrativeContraindicationToCareSevereSepsis']/label[2]");
	By physicianAPNPAdocumentation = By.xpath(".//*[@id='DirectiveForComfortCareSevereSepsis']/label[1]/input");
	By physicianAPNPAdocumentationN = By.xpath(".//*[@id='DirectiveForComfortCareSevereSepsis']/label[2]/input");
	By patientDischargeDispositionHome = By.xpath(".//*[@id='DischargeDisposition']/label[1]/input");
	By patientDischargeDispositionHospiceHome = By.xpath(".//*[@id='DischargeDisposition']/label[2]/input");
	By patientDischargeDispositionHospiceHospiceHealthCareFacility = By
			.xpath(".//*[@id='DischargeDisposition']/label[3]/input");
	By patientDischargeDispositionHospiceAcuteCareFacility = By
			.xpath(".//*[@id='DischargeDisposition']/label[4]/input");
	By patientDischargeDispositionHospiceOtherHealthCareFacility = By
			.xpath(".//*[@id='DischargeDisposition']/label[5]/input");
	By patientDischargeDispositionHospiceExpired = By.xpath(".//*[@id='DischargeDisposition']/label[6]/input");
	By patientDischargeDispositionHospiceLeftAgainstMedicalAdviceAMA = By
			.xpath(".//*[@id='DischargeDisposition']/label[7]/input");
	By patientDischargeDispositionHospiceNotDocumentedorUTD = By
			.xpath(".//*[@id='DischargeDisposition']/label[8]/input");
	By patientDischargeDispositionHospiceReset = By.xpath(".//*[@id='DischargeDisposition']/a");

	public abstractionPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AbsIconClick() {

		driver.findElement(AbstractioIcon).click();

	}
	
	public void AbsFirstCaseClick() {

		driver.findElement(AbstractFirstCase).click();

	}

	public void TransferFromAnotherHospitalorASCYes() {

		driver.findElement(TransferfromOtherHospital).click();

	}

	public void TransferFromAnotherHospitalorASCNo() {

		driver.findElement(TransferfromOtherHospitalNO).click();
	}

	public void ClinicalTrialYes() {

		driver.findElement(clinicaltrial).click();
	}

	public void clinicalTrialNo() {
		driver.findElement(clinicaltrialNo).click();
	}
	
	public void ClickOnSaveButton() {
		driver.findElement(SaveButton).click();
	}
	
	public String GetMeasueStatusButtonColor() {
		
		String buttonColor = driver.findElement(MeasureStatus).getCssValue("background-color");
        String buttonTextColor = driver.findElement(MeasureStatus).getCssValue("color");
       
		return buttonColor;
		
	}
	
	public void ClickOnSaveContinue() {
		driver.findElement(SaveContinue).click();
	}
	
	
}