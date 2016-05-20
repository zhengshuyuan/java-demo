package uuid;

import java.util.UUID;

public class UuidThread extends Thread{
    @Override
    public void run() {
        while(true){
            UUID uuid = UUID.randomUUID();
            String str = uuid.toString().replaceAll("-", "");
            System.out.println(Thread.currentThread()+getName()+":"+str);
        }
    }
}
