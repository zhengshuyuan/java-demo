package exception;

public class ClassAException {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            ClassBException exception = new ClassBException();
            exception.nullExceptionLead();
        } catch (Exception e) {
            e.printStackTrace();
            String errorMsg = new String();
            StringBuffer sb = new StringBuffer();
            sb.append(e.getMessage());
            for (StackTraceElement element : e.getStackTrace()) {
                sb.append("\r\n");
                sb.append(element.toString());
            }
            // 只截取前500个字符
            if (sb.length() > 500) {
                errorMsg = sb.substring(0, 500);
            } else {
                errorMsg = sb.toString().trim();
            }
            System.out.println("errorMsg："+errorMsg);
        }
    }

}
