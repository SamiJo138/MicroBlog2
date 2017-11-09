
import java.util.Scanner;

public class User {

    private String name;
private String screenName;
private String url;
private String email;
static Scanner keyboard=new Scanner(System.in);
private int userID;
public String getUserInfo()
        {
            return name+"\n" +screenName+"\n"+url+ "\n"+email;
        }
        User(String firstLast, String userName, String urlPic, String emailAdd)
        {
            this.name=firstLast;
            this.screenName=userName;
            this.url=urlPic;
            this.email=emailAdd;
        }

}