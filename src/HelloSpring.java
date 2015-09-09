/**
 * Created by schandramouli on 9/8/15.
 */
public class HelloSpring {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
