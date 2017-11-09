import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;

public class MicroBlog2
{
    Scanner keyboard=new Scanner(System.in);

    public static void main(String[]args)
    {
        int option;
        Scanner keyboard=new Scanner(System.in);
        boolean blogging=true;
        ArrayList<User>allUsers= new ArrayList<User>();
        ArrayList<Content>createdPosts=new ArrayList<Content>();

        String currentUser="";
        int i=0;

        do {
            printMenu();
            option = keyboard.nextInt();
            keyboard.skip("\n");
            if(option<1||option>6)
            {
                out.println("I'm sorry that is an invalid option.\n");
            }

            if (option == 1) {
                out.println("Since you are a new user, please enter your first and last name.");
                String name = keyboard.nextLine();
                out.println("Please choose a screen name.");
                String screenName=keyboard.nextLine();
                out.println("Please select a url as the picture for your profile.");
                String url = keyboard.nextLine();
                out.println("Please enter your email address.");
                String emailAdd = keyboard.nextLine();

                allUsers.add(new User(name,screenName, url,emailAdd));
                out.println("Thanks! Now you may log in from the menu.");

            }
            if (option == 2) {
                out.println("If you are an existing user, please enter the number that corresponds to your username.");
                for (i = 0; i < allUsers.size(); i++) {
                    out.println((i + 1) + "\n" + allUsers.get(i).getUserInfo() + "\n");

                }
                int userSelect = keyboard.nextInt();
                currentUser = allUsers.get(userSelect - 1).getUserInfo();
                out.println("You are now the user:\n" + currentUser + "\n\n");
            }

                if (option == 3)
                {
                if(currentUser.equals(""))
                {
                    out.println("I'm sorry, you need to become a user before you can make a post!");
                }
                    out.println("To enter your post, just type a message and hit enter.");
                    String newPost = keyboard.nextLine();
                    createdPosts.add(new Content(newPost, currentUser));
                }
                if (option == 4)
                {
                    out.println("Here is the list of the posts in Microblog2\n");
                    for (i = 0; i < createdPosts.size(); i++) {
                        out.println("\n" + createdPosts.get(i).getContent() + "\n");
                    }
                }
                if (option == 5)
                {
                    out.print("Here is a current list of all users who have signed up with MicroBlog2\n");
                    for (i = 0; i < allUsers.size(); i++) {
                        out.println("" + allUsers.get(i).getUserInfo() + "\n");
                    }
                }
                if (option == 6)
                {
                    out.println("Goodbye " +currentUser);
                    blogging = false;
                }
            }
            while (blogging) ;
        }

    public static void printMenu()
    {
        out.println("Welcome to MicroBlog2\nMAIN MENU");
        out.println("1:Create a new user");
        out.println("2:Existing user");
        out.println("3:Create post as current user");
        out.println("4:Print all posts");
        out.println("5:Print all users");
        out.println("6:Logout");
        out.println("What would you like to do?");

    }
}