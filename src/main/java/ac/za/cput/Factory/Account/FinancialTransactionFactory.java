package ac.za.cput.Factory.Account;

import ac.za.cput.Domain.Account.FinancialTransactions;

public class FinancialTransactionFactory {

    public static FinancialTransactions getFinancialTransactions(int transId, int accountId, int itemRentalId, int transCode, int transDate, int transAmt)
    {
        return new FinancialTransactions.Builder()
                .transId(transId)
                .accountId(accountId)
                .itemRentalId(itemRentalId)
                .transCode(transCode)
                .transAmt(transAmt)
                .build();
    }
}
