package Final_Production;

import java.io.ByteArrayInputStream;
/*
    ByteArrayInputStream - is used to read an array of bytes as an input stream.

    @author: aayushgulia07@outlook.com
 */

public class ByteArrayInputStream_exm {
    public static void main(String[] args) throws Exception{
        String str = "This is an example of Java ByteArrayInputStream";
        byte[] bytes = str.getBytes();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        int i;
        while ((i= byteArrayInputStream.read())!=-1){
            System.out.print((char) i);
        }
    }
}
