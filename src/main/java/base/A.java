package base;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.omg.CORBA.DATA_CONVERSION;

public class A {

    /**
     * @param args
     */
    public static void main(String[] args) {
       long seq = Long.valueOf("1844674407370955161");
       System.out.println(seq);
       System.out.println(Long.MAX_VALUE);
       
       B b = new B();
       System.out.println(b.getA());
       
       System.out.println(b.getA() == null ? 3:4);
    }
    
   static class B{
        String a;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }
        
        
    }

}
