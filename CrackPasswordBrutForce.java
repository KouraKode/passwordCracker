public class CrackPasswordBrutForce extends CrackPassword{
    private final char chars[] = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z','A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0','1','2', '3', '4', '5', '6', '7', '8', '9','@', '#', '$', '&','*','!', '?'};

    public void search(User user){
        String generatePassword = "";
        long start = System.currentTimeMillis();
        boolean found = false;
        System.out.println("Waiting for...............");
        for (int i = 0; i < chars.length; i++) {
                generatePassword = ""+chars[i]+"";
                // System.out.println(generatePassword);
                if(user.authentificate(generatePassword)){
                    found = true;
                    super.printResult(generatePassword, found, System.currentTimeMillis()-start);
                    break;
                }
            for (int j = 0; j < chars.length; j++) {
                    generatePassword = ""+chars[i]+chars[j];
                    // System.out.println(generatePassword);
                    if(user.authentificate(generatePassword)){
                        found = true;
                        super.printResult(generatePassword, found, System.currentTimeMillis()-start);
                        break;
                    }
                for (int j2 = 0; j2 < chars.length; j2++) {
                        generatePassword = ""+chars[i]+chars[j]+chars[j2];
                        // System.out.println(generatePassword);
                        if(user.authentificate(generatePassword)){
                            found = true;
                            super.printResult(generatePassword, found, System.currentTimeMillis()-start);
                            break;
                        }
                    for (int k = 0; k < chars.length; k++) {
                            generatePassword = ""+chars[i]+chars[j]+chars[j2]+chars[k];
                            // System.out.println(generatePassword);
                            if(user.authentificate(generatePassword)){
                                found = true;
                                super.printResult(generatePassword, found, System.currentTimeMillis()-start);
                                break;
                            }
                        for (int k2 = 0; k2 < chars.length; k2++) {
                                generatePassword = ""+chars[i]+chars[j]+chars[j2]+chars[k]+chars[k2];
                                // System.out.println(generatePassword);
                                if(user.authentificate(generatePassword)){
                                    found = true;
                                    super.printResult(generatePassword, found, System.currentTimeMillis()-start);
                                    break;
                                }
                            if(found) break;
                        }
                        if(found) break;
                    }
                    if(found) break;
                }
                if(found) break;
            }
            if(found) break;
        }
    }
    
}
