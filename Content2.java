
public class Content2 {

    private int postNum;
    private String newPost;
    private String currentUser;
    private String website;

    Content2(int postNum, String newPost, String currentUser, String website) {

        this.postNum = postNum;
        this.newPost = newPost;
        this.currentUser = currentUser;
        this.website = website;
    }


    public String getContent2Info() {
        return this.postNum + ": " + this.currentUser + "\n" + this.newPost;

    }

}
