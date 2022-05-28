import java.io.FileNotFoundException;

/**
 * CrackPassword
 */
abstract public class CrackPassword {

    abstract protected void search(User user) throws FileNotFoundException;

    protected void printResult(String password, boolean found, long time){
        if (found) {
            System.out.println("Mot de passe: "+password);
            this.printTime(time);
        } else {
            System.out.println("Mot de passe non trouvé...");
        }
    }

    protected void printTime(long time){
        int milli = 0,seconds = 0, minutes = 0;
        if(time > 1000){
            milli = (int) (time % 1000);
            seconds = (int)(time/1000);
            minutes = (int)(time/1000) / 60;
        }
        else{
            milli = (int)time;
        }

        System.out.println("Trouvé en: "+minutes+"min "+seconds+"s "+milli+"ms");
    }
}
