package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Joselito", 0, 1);
    accountTwo = new CheckingAccount("Rodolfo", 0, 2);
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    bankOfGods.accountOne.getBalance();//Apertura cuenta en el Banco Usuario 1
    
    bankOfGods.accountOne.setBalance(2000);//Consignacion 1
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.retirar(250);//Retiro 1
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.consignar(9500);//Consignacion 2
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.retirar(2500);//Retiro 2
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.consignar(4000);//Consignacion 3
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.retirar(1550);//Retiro 3
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.consignar(89250);//Consignacion 4
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();

    bankOfGods.accountOne.retirar(13000);//Retiro 4
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.consignar(43000);//Consignacion 5
    bankOfGods.accountOne.getValorConsignado();
    bankOfGods.accountOne.getBalance();
    
    bankOfGods.accountOne.retirar(4450);//Retiro 5
    bankOfGods.accountOne.getValorRetirado();
    bankOfGods.accountOne.getBalance();
//---------------------------------------------------------------------------------    
    bankOfGods.accountTwo.getBalance();//Apertura cuenta en el Banco Usuario 2
    
    bankOfGods.accountTwo.setBalance(100);//Consignacion 1
    bankOfGods.accountTwo.getValorConsignado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.retirar(50);//Retiro 1
    bankOfGods.accountTwo.getValorRetirado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.consignar(50000);//Consignacion 2
    bankOfGods.accountTwo.getValorConsignado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.retirar(16500);//Retiro 2
    bankOfGods.accountTwo.getValorRetirado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.consignar(67500);//Consignacion 3
    bankOfGods.accountTwo.getValorConsignado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.retirar(4050);//Retiro 3
    bankOfGods.accountTwo.getValorRetirado();
    bankOfGods.accountTwo.getBalance();

    bankOfGods.accountTwo.consignar(4650);//Consignacion 4
    bankOfGods.accountTwo.getValorConsignado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.retirar(20000);//Retiro 4
    bankOfGods.accountTwo.getValorRetirado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.consignar(17050);//Consignacion 5
    bankOfGods.accountTwo.getValorConsignado();
    bankOfGods.accountTwo.getBalance();
    
    bankOfGods.accountTwo.retirar(65500);//Retiro 5
    bankOfGods.accountTwo.getValorRetirado();
    bankOfGods.accountTwo.getBalance();
  }
}