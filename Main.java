class Main {
  public static void main(String[] args) {
    for(int i=1; i<100; i++) {
      String str = Integer.toString(i);
      if(i%5==0 && i%3==0) {
        str = "FizzBuzz";
      } else if(i%3 == 0) {
        str = "Fizz";
      } else if(i%5 == 0) {
        str = "Buzz";
      }
      System.out.println(str);
    }
}
}