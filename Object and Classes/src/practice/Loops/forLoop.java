package practice.Loops;

public class forLoop {
    public static void main(String[] args) {

//        String name = "abcdefghijklmnopqrstuvwxyz";
//
//        for (int i = name.length()-1; i >= 0 ; i-- ){
//            System.out.println(name.charAt(i));
//        }

       //Print all even no between 0 to 100

        for(int i = 0; i <= 100;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }
}
