package week3.homework;

abstract class BaseCreditManager implements CreditService{

    public abstract void calculate();

    public void save(){
        System.out.println("Kaydedildi");
    }
}