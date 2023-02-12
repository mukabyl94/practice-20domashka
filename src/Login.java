public class Login {

    public static void loginMethod(String login, String password, String confirmPassword){
        boolean latinAlphabet = login.matches("^[a-zA-Z0-9]");
        if(latinAlphabet == latinAlphabet){
            if (login.length() < 20){
                System.out.println("Login successfully authorize");
            }else{
                throw new WrongLoginException("Logindin uzundugu 20 dan chon bolup ketti");
            }
            if (password.length() < 20){
                System.out.println("Password successfully authorize");
            }else{
                throw new WrongPasswordException("Paroldun uzundugu 20dan chon bolup ketti");
            }
            if (password.equals(confirmPassword)){
                System.out.println("Password matches confirmPassword");
            }else{
                throw new PasswordMisMatchException("Paroldor biri birine okshosh emes");
            }
        }
        else{
            throw new WrongLoginException("Login tek gana latyn tamgalar menen bolushu kerek");
        }
    }

}
