package Exception;
import java.io.IOException;
public class Throw {
    public static void main(String[] args) {

    }
    public void do(int x)
            throws void IOException{
        if( x<0 )
        {
            throw new IOException();
        }
    }
}
