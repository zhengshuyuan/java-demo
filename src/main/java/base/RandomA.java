package base;

import java.util.Random;

public class RandomA {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random r =new Random();
        for(int i=0;i<1000;i++){
//            int random = java.util.concurrent.ThreadLocalRandom.current().nextInt(8);
            int random = r.nextInt(8);
            if(random == 8){
                System.out.println("ca");
            }
            else {
                System.out.println("a");
            }
        }
        
    }

}
