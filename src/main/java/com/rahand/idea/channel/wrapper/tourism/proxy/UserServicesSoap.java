/**
 * UserServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;


import com.rahand.idea.channel.wrapper.tourism.proxy.signature.ActionResult;
import com.rahand.idea.channel.wrapper.tourism.proxy.signature.DepositAmountInput;
import com.rahand.idea.channel.wrapper.tourism.proxy.signature.InvoiceInput;

public interface UserServicesSoap extends java.rmi.Remote {
    public String getDataToSign(BaseInput input) throws java.rmi.RemoteException;
    public String registerOTPGeneratorSoftware(String request, String signature) throws java.rmi.RemoteException;
    public ActionResult getInvoice(InvoiceInput input) throws java.rmi.RemoteException;
    public ActionResult getDepositAmount(DepositAmountInput input) throws java.rmi.RemoteException;
    public String transferMoney(String request, String signature) throws java.rmi.RemoteException;
    public String transferMoneySetOrder(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositBalance(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositBaseInfo(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositInvoice(String request, String signature) throws java.rmi.RemoteException;
    public String getTransferMoneyState(String request, String signature) throws java.rmi.RemoteException;
    public String convertDepositNumberToSheba(String request, String signature) throws java.rmi.RemoteException;
    public String confirmCustomerInfo(String request, String signature) throws java.rmi.RemoteException;
    public String cardToCardTransfer(String request, String signature) throws java.rmi.RemoteException;
    public String cardToCardTransferWithoutSubDeposit(String request, String signature) throws java.rmi.RemoteException;
    public String getCardInformation(String request, String signature) throws java.rmi.RemoteException;
    public String getCardInformationByCardInfo(String request, String signature) throws java.rmi.RemoteException;
    public String convertShebaToDepositNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getCustomerInfoByDepositNumberAndDate(String request, String signature) throws java.rmi.RemoteException;
    public String getShebaByCardNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getShebaInfoByCardNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositNumberByCardNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositInfoByCardNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getCardTransactionsList(String request, String signature) throws java.rmi.RemoteException;
    public String getShebaInfo(String request, String signature) throws java.rmi.RemoteException;
    public String billPaymentByDeposit(String request, String signature) throws java.rmi.RemoteException;
    public String billPaymentByCard(String request, String signature) throws java.rmi.RemoteException;
    public String purchaseCharge(String request, String signature) throws java.rmi.RemoteException;
    public String coreBatchTransferPaya(String request, String signature) throws java.rmi.RemoteException;
    public String getPayaList(String request, String signature) throws java.rmi.RemoteException;
    public String issueOtherChequesDeposit(String request, String signature) throws java.rmi.RemoteException;
    public String batchTransferMoney(String request, String signature) throws java.rmi.RemoteException;
    public String getCardToCardTransferReport(String request, String signature) throws java.rmi.RemoteException;
    public String checkCustomerExistenceByContactNumberAndIdNumber(String request, String signature) throws java.rmi.RemoteException;
    public String getBonCardOrganizationAccounts(String request, String signature) throws java.rmi.RemoteException;
    public String chargeOrganizationBonCards(String request, String signature) throws java.rmi.RemoteException;
    public String getOrganizationBonCards(String request, String signature) throws java.rmi.RemoteException;
    public String payInstallment(String request, String signature) throws java.rmi.RemoteException;
    public String getTransactionInquiries(String request, String signature) throws java.rmi.RemoteException;
    public String getTransactionDocumentNumbers(String request, String signature) throws java.rmi.RemoteException;
    public String getsubmissionCheque(String request, String signature) throws java.rmi.RemoteException;
    public String getTransactionsOfOrganizationBonCards(String request, String signature) throws java.rmi.RemoteException;
    public String getBonCardTransactionsList(String request, String signature) throws java.rmi.RemoteException;
    public String reverseWholeChargeOfOrganizationBonCards(String request, String signature) throws java.rmi.RemoteException;
    public String getOrganizationBonCardState(String request, String signature) throws java.rmi.RemoteException;
    public String getOrganizationBatchChargeDescriptions(String request, String signature) throws java.rmi.RemoteException;
    public String getOrganizationBatchChargeReport(String request, String signature) throws java.rmi.RemoteException;
    public String inquiryBillPayment(String request, String signature) throws java.rmi.RemoteException;
    public String createWebServiceUser(String request, String signature) throws java.rmi.RemoteException;
    public String getCardBalance(String request, String signature) throws java.rmi.RemoteException;
    public String getBillNumberGeneratorDoc(String request, String signature) throws java.rmi.RemoteException;
    public String getDepositBillStructure(String request, String signature) throws java.rmi.RemoteException;
    public String isPersonNameMatch(String request, String signature) throws java.rmi.RemoteException;
    public String matchNationalIdWithMobile(String request, String signature) throws java.rmi.RemoteException;
    public String matchNationalIdWithMobileOnCore(String request, String signature) throws java.rmi.RemoteException;
    public String getCustomerNumberByNationalIdAndMobile(String request, String signature) throws java.rmi.RemoteException;
    public String checkCardPANAndNinCorrespondence(String request, String signature) throws java.rmi.RemoteException;
}
