import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class CrackPasswordDico extends CrackPassword{


    protected void search(User user) throws FileNotFoundException {
        InputStream file = new FileInputStream("dico.txt");
        boolean found = false;
        long start = 0;
        try (Scanner obj = new Scanner(file)) {
            start = System.currentTimeMillis();
            String line = "";
            while(obj.hasNextLine()){
                line = obj.nextLine();
                if(user.authentificate(line)){
                    found = true;
                    break;
                }
            }
            super.printResult((found) ? line : "", found, System.currentTimeMillis()-start);
        }
    }
    
}
