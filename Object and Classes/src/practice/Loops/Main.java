package practice.Loops;

public class Main {

    //While Loop
    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in"
                + "The category:apparel and the slightly"
                + "more in demand category:makeup along with the category:furniture and ...";

        printCategories(str);

    }

    // extract all categories
    public static void printCategories(String str){
        int i = 0;
        while(true){
            int found = str.indexOf("category:",i);
            if(found == -1)break;
            int start = found + 9;
            int end = str.indexOf(" ",start );
            System.out.println(str.substring(start,end));
            i = end +1;

        }
    }
}
