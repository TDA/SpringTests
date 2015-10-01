/**
 * Created by schandramouli on 9/8/15.
 */
public class HelloSpring {
    private String message;
    private String sai;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void setSai(String message){
        this.sai  = message;
    }

    public void getSai(){
        System.out.println("Your Message : " + sai);
    }

}
