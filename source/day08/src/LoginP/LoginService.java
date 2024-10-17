package LoginP;

public class LoginService {
    public void process(String userId, String passWord){
        try {
            if (!userId.equals("user01")) {
                throw new UserIdValidationException();
            }
            if (!passWord.equals("1234")) {
                throw new PassWordValidationException();
            }
        } catch (UserIdValidationException | PassWordValidationException e){

        }
    }
}
