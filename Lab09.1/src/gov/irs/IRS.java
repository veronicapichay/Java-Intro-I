/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    //holding an instance of Corporation
    private TaxPayer[] payers = new TaxPayer[100];
    private int currentIndex = 0;  // for dealing with the array

    public void collectTaxes() {
        for (int i = 0; i < currentIndex; i++) {
            double deduction = payers[i].getStandardDeduction();
            System.out.println("Deduction is " + deduction);

            payers[i].fileReturn();
            payers[i].payTaxes(); //Reference -> Corp, HourlyEmp, SalariedEmp
            System.out.println();

            //will not work since taxpayer class has no getName method
            //payers[i].getName();
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers[currentIndex++] = payer;

    }
}