import java.util.ArrayList;

public class User2 {

    private String name;
    private String screenName;
    private String url;
    private String email;
    private ArrayList<Content2> posts;

    User2(String name, String screenName, String url, String email)
    {
        this.name=name;
        this.screenName=screenName;
        this.url=url;
        this.email=email;
        this.posts=new ArrayList<>();
    }

    public void addPost(Content2 post)
    {
        this.posts.add(post);
    }

    public String getUser2Info()

    {
        return this.name+"\n" +this.screenName+"\n"+this.url+ "\n"+this.email;
    }


    public String getScreenName()
    {
        return this.screenName;
    }

    public String getUserName()
    {
        return this.name;
    }

    public ArrayList<Content2> getPosts()
    {
        return this.posts;
    }

    public Content2 getLatestPost()
    {
        return this.posts.get(this.posts.size()-1);
    }
}
