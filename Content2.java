
class Content {

    private String content;
    private String userPost;

public String getContent()
        {
            return content + "\n" +userPost;
        }
        Content(String postContent, String userPosted)
        {
            this.content=postContent;
            this.userPost=userPosted;
        }
}