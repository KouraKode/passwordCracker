public class FactoryCrack {
    public static CrackPassword getInstance(String method) throws UnknownModCrackException{
        CrackPassword crack = null;
        
        if(method.equalsIgnoreCase("brutForce")){
            crack = new CrackPasswordBrutForce();
        }
        else if (method.equalsIgnoreCase("dico")) {
            crack = new CrackPasswordDico();
        }
        else{
            throw new UnknownModCrackException(method);
        }
        return crack;
    }
}
