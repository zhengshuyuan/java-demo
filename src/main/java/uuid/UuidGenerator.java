package uuid;


public class UuidGenerator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Demo.runThread();
    }
    
    static class Demo{
        public static void runThread(){
            for(int i=0;i<100;i++){
                UuidThread thread = new UuidThread();
                thread.start();
            }
        }
    }

}
