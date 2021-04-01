package Exception;

import java.io.File;

public class WorkingWithFiles {
    public static void main(String[] args) {

    }
    static class A{
        public static void main(String[] args) {
            File file = new File("a.txt");
            if(file.exists()){
                System.out.println("Yes");
            }
        }
    }
}
