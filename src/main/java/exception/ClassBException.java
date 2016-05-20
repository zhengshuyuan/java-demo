package exception;

public class ClassBException {

    public void nullExceptionLead(){
        try{
            String str = null;
            str.substring(0);
        }catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            System.out.println("空指针异常");
        }
    }
}
