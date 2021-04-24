import java.util.*;

  public class AddressBookManagerDay7 {
	  static {
		  System.out.println("\t \t \t\t"+"WELCOME TO THE ADDRESS BOOK MANAGER");
	  }
	String name , address;//Variable declaration
        static Scanner sc=new Scanner(System.in);
        static ArrayList<ArrayList> addressBooks=new ArrayList<>();  // whole collection of the contacts 


    public static void main(String[] args) {
        new AddressBookManagerDay7().userInput();
    }


    public void userInput() {
        AddressBookManagerDay7 addressBook = new AddressBookManagerDay7();
        System.out.println(
                "Select the option to be performed: \n " +
                        "Enter 1 to ADD the contact with address and Name  \n " +
			"Enter 2 to EDIT\n" +
                        "Enter 3 to DELETE the CONTACT\n" +
                        "Enter 4 to Display addressbook\n"+
                        "Enter 5 to EXIT   ");
         int option = sc.nextInt();
         
        switch (option) {
            case 1:
                addressBook.addContact();
                break;
                
            case 2:
                break;
            
            case 3:
                break;
                
            case 4:
               getAddressBook();
                break;

            default:
                System.out.println("Invalid input");
        }
    }                 
                        


    void addContact()
        {
            System.out.println("enter address : ");
                String address =sc.next();
                System.out.println("enter Name : ");
                String name =sc.next();
            
            ArrayList<String> oneContact=new ArrayList<>();
            oneContact.add("address : "+address);
            oneContact.add("name : "+name);
            
            addressBooks.add(oneContact); // add the address to the collection of the address book
            userInput();
       }
          
 
	  public void getAddressBook() {
                System.out.println(addressBooks.toString());
        }
          
          void exit()
	  {
		 System.exit(0);
	  }
	
	  
}