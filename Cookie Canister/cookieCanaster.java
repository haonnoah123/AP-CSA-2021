public class cookieCanister{
  private String type;
  private int max;
  private int amount;
  private boolean lid; 
  
  public cookieCanister(String t, int m){
    type = t;
    max = m;
    amount = 0;
    lid = false;
  }

  public void dispense(int d){
    amount -= d;
    if(amount < 0){
      amount = 0;
    }
  }

  public void fill(int a){
    amount += a;
    if(amount > max){
      amount = max;
    }
  }

  public void fillMax(){
    amount = max;
  }

  public void open(){
    lid = true;
  }

  public void close(){
    lid = false;
  }

  public String type(){
    return type;
  }

  public int max(){
    return max;
  }

  public int amount(){
    return amount;
  }

  public String lid(){
    if(lid){
      return "open";
    } else {
      return "closed";
    }
  }

  public String toString(){
    return "The cookie jar is " + lid() + " and has " + amount + " " + type + " cookie's " + "the max it can hold is " + max;
  }
}
