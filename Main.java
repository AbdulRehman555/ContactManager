import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        ContactsManager myContactManager=new ContactsManager();

        Contact friendAsad=new Contact();
        friendAsad.name="M. Asad";
        friendAsad.phoneNumber="03123267901";
        myContactManager.addContact(friendAsad);

        Contact friendSaad=new Contact();
        friendSaad.name="M. Saad";
        friendSaad.phoneNumber="03123267902";
        myContactManager.addContact(friendSaad);

        Contact friendBilal=new Contact();
        friendBilal.name="M. Bilal";
        friendBilal.phoneNumber="03123267903";
        myContactManager.addContact(friendBilal);

        Scanner scanner=new Scanner(System.in);
        String result1=scanner.nextLine();

        Contact result=myContactManager.searchContact(result1);
        System.out.println(result.phoneNumber);


    }
}
