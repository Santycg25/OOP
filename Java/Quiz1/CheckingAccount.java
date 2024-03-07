package bank;
public class CheckingAccount{
  private String name;
  private int balance;
  private int id;
  private double interestRate;
  private int valorConsignado;
  private int valorRetirado;

  public CheckingAccount(String inputName, int inputBalance, int inputId){
    this.name = inputName;
    this.balance = inputBalance;
    this.id = inputId;
    this.interestRate = 0.02;
    this.valorConsignado = 0;
    this.valorRetirado = 0;
  }

  public int getBalance(){
    System.out.println("Saldo actual de la cuenta de "+this.name+" :"+ this.balance+"\n");
    return this.balance;
  }
  
  public void setBalance(int newBalance){
    this.balance = newBalance;
  }
  
  public int getValorConsignado(){
    System.out.println("- Valor Consignado: "+ valorConsignado);
    return this.valorConsignado;
  }
  
  public int getValorRetirado(){
    System.out.println("- Valor Retirado: "+ valorRetirado);
    return this.valorRetirado;
  }

  public double getMonthlyInterest(){
    return this.interestRate * this.balance;
  }
  
  public void consignar(int valorConsignado){
      this.valorConsignado = valorConsignado;
      this.balance = this.balance + valorConsignado;
  }
  
  public void retirar(int valorRetirado){
      this.valorRetirado = valorRetirado;
      this.balance = this.balance - valorRetirado;
  }
  
}