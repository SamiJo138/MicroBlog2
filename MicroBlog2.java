import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;

class MicroBlog2 {

    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        Scanner keyboard = new Scanner(System.in);
        boolean blogging = true;

        ArrayList<User2> allUsers = new ArrayList<>();

        allUsers.add(new User2("Cory Spruce","PhoenixRising","https://goo.gl/images/9MhB5i","CSpruce777@gmail.com"));
        allUsers.add(new User2("Jessie Andes","AliceForest","https://goo.gl/images/9uCRAd","Jandes@yahoo.com"));
        allUsers.add(new User2("Robert Terwilliger","SideshowBob","https://goo.gl/images/rGOXMb","MurderBart123@sbcglobal.com"));

        ArrayList<Content2> createdPosts = new ArrayList<>();

        User2 currentUser = null;
        int i;

        int postNum=0;

        do {

            printMenu(currentUser);
            option = keyboard.nextInt();
            keyboard.skip("\n");
            switch (option) {

                case 1:
                    out.println("Since you are a new user, please enter your first and last name.");
                    String name = keyboard.nextLine();
                    out.println("Please choose a screen name.");
                    String screenName = keyboard.nextLine();
                    out.println("Please select a url as the picture for your profile.");
                    String url = keyboard.nextLine();
                    out.println("Please enter your email address.");
                    String email = keyboard.nextLine();

                    currentUser = new User2(name, screenName, url, email);
                    allUsers.add(currentUser);
                    out.println("Thanks! Now you may log in from the menu.");
                    break;

                case 2:

                    out.println("If you are an existing user, please enter the number that corresponds to your username.");
                    for (i = 0; i < allUsers.size(); i++) {
                        out.println((i + 1) + "\n" + allUsers.get(i).getUser2Info() + "\n");

                    }
                    int userSelect = keyboard.nextInt();
                    if (allUsers.size() >= (userSelect - 1)) {
                        currentUser = allUsers.get(userSelect - 1);
                        out.println("You are now the user:\n" + currentUser.getScreenName() + "\n\n");
                    } else {
                        out.println("Value invalid. Please choose an option between 1 and " + (allUsers.size() + 1));
                    }
                    if (allUsers.size() == 0) {
                        out.println("There are no existing users. Please create one.");
                    }
                    break;

                case 3:
                    if (currentUser == null) {
                        out.println("I'm sorry, you need to become a user before you can make a post! Please create an account.");
                    } else {
                        if (!currentUser.getPosts().isEmpty()) {
                            out.println(currentUser.getLatestPost().getContent2Info());
                            out.println("\n\n");
                        }
                        out.println("To enter your post, just type a message and hit enter.");
                        String newPost = keyboard.nextLine();
                        String website = "";

                        Content2 savedPost = new Content2(postNum, newPost, currentUser.getScreenName(), website);
                        currentUser.addPost(savedPost);
                        createdPosts.add(savedPost);
                        postNum++;
                    }

                    break;

                case 4:
                    out.println("Here is the list of the posts in Microblog2:\n");
                    for (i = 0; i < createdPosts.size(); i++) {
                        out.println(""+createdPosts.get(i).getContent2Info()+ "\n");
                    }
                    break;

                case 5:
                    out.print("Here is a current list of all users who have signed up with MicroBlog2:\n");
                    for (i = 0; i < allUsers.size(); i++) {
                        out.println("" + allUsers.get(i).getUser2Info()+ "\n");
                    }
                    break;

                case 6:
                    out.println("Goodbye " + currentUser.getScreenName());
                    blogging = false;
                    break;
                default:
                    out.println("I'm sorry that is an invalid option. Try again.\n");
                    printMenu(currentUser);

                    break;

            }
        }
        while (blogging);
    }


    public static void printMenu(User2 currentUser) {
        if(currentUser != null){
            out.println("Welcome to MicroBlog2, " + currentUser.getUserName() + "!\nMAIN MENU");
        } else {
            out.println("Welcome to MicroBlog2\nMAIN MENU");
        }

        out.println("1:Create a new user");
        out.println("2:Existing user");
        out.println("3:Create post as current user");
        out.println("4:Print all posts");
        out.println("5:Print all users");
        out.println("6:Logout");
        out.println("What would you like to do?");

    }


}
