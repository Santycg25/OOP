package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.consignar(2000);
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.retirar(250);
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.consignar(9500);
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.retirar(2500);
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.consignar(4000);
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    bankOfGods.accountOne.retirar(1550);
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
  }
}