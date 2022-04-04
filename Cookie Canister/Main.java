class Main {
  public static void main(String[] args) {
    cookieCanister c = new cookieCanister("Chocolate", 10);
    System.out.println(c);
    c.fillMax();
    System.out.println(c);
    c.dispense(5);
    System.out.println(c);
    c.open();
    System.out.println(c.lid());
  }
}
