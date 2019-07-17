
class MyArrayExcp {
    public static void main(String [ ] args){

        int number = 1;  

        int result = divisionE(number);

        System.out.println(result);
}

    static int divisionE(int x) {
        try {
        
        x =  (x / 0);
      
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
        return x;
  }
}