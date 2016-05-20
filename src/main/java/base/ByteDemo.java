package base;

public class ByteDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ByteDemo byteDemo = new ByteDemo();
        Demo demo = new Demo();
        
        System.out.println(demo.getB());
        System.out.println(demo.getBytes());
    }

    static class Demo {
        
        
        public Demo() {
            super();
        }

        private byte b;
        private byte[] bytes;

        public byte getB() {
            return b;
        }

        public void setB(byte b) {
            this.b = b;
        }

        public byte[] getBytes() {
            return bytes;
        }

        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

    }
}
