
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		AddressBook book = new AddressBook();


		String firstAns;
		String lastAns;
		String addressAns;
		String phoneAns;
		String firstnameAdd;
		String lastnameAdd;
		String addressAdd;
		String phonenumberAdd;
		




		book.addEntry("Bill","Daniels", "152_Main_Street", "556-382-9283");
		book.addEntry("John", "Smith", "25_Park_Road", "468-392-2746");
		book.addEntry("Denise", "Johnson", "27_South_Lane", "781-876-9237");
		book.addEntry("Amanda", "Dean", "15_High_Street", "781-676-9398");
		book.addEntry("Kevin", "Klein", "786_Stetson_Way", "339-385-7694");
		book.addEntry("Haley", "Roberts", "546_Franklin_Road", "781-332-4371");


		book.favoriteEntry("Bill","Daniels", "152_Main_Street", "556-382-9283");
		book.favoriteEntry("Amanda", "Dean", "15_High_Street", "781-676-9398");


		System.out.println("\nEnter 0 to add/remove an entry" +
				"\nEnter 1 to favorite/unfavorite an entry" +
				"\nEnter 2 to search for an entry" +
				"\nEnter 3 to sort the book" +
				"\nEnter 4 to display the entire address book" +
				"\nEnter 5 to display favorites" +
				"\nEnter 6 to save the address book to a file" +
				"\nEnter 7 to read the address book from a file");
		int answerMain = in.nextInt();
		switch(answerMain) {
		case 0:
			System.out.println("Enter 0 to add an entry" +
					"\nEnter 1 to remove an entry");
			int answer0 = in.nextInt();
			switch(answer0) {
			case 0:
				System.out.println("Enter the first name of the person you want to add");
				firstnameAdd = in.next();

				System.out.println("Enter the last name of the person you want to add");
				lastnameAdd = in.next();
				System.out.println("Enter the address of the person you want to add(use underscores instead of spaces)");
				addressAdd = in.next();
				System.out.println("Enter the phone number of the person you want to add(use dashes: Ex: 873-372-2387)");
				phonenumberAdd = in.next();
				book.addEntry(firstnameAdd, lastnameAdd, addressAdd, phonenumberAdd);
				System.out.println("Your updated entry list is");
				book.printAddressBook();
				System.out.println("Your Entry has been added!");
				break;
			case 1:
				System.out.println("Enter 0 to remove Bill Daniel's entry" +
						"\nEnter 1 to remove John Smith's entry" +
						"\nEnter 2 to remove Denise Johnson's entry" +
						"\nEnter 3 to remove Amanda Dean's entry" +
						"\nEnter 4 to remove Kevin Klein's entry" +
						"\nEnter 5 to remove Haley Robert's entry");
				int ansRemove = in.nextInt();
				switch(ansRemove) {
				case 0:
					book.removeEntryBill();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");

					break;
				case 1:
					book.removeEntryJohn();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");
					break;

				case 2:
					book.removeEntryDenise();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");
					break;

				case 3:
					book.removeEntryAmanda();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");
					break;

				case 4:
					book.removeEntryKevin();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");
					break;

				case 5:
					book.removeEntryHaley();
					System.out.println("Your updated entry list is");
					book.printAddressBook();
					System.out.println("The entry has been removed!");
					break;

				}
				break;

			}
			
			break;

		case 1:
			System.out.println("Enter 0 to favorite an entry" + "\nEnter 1 to unfavorite an entry");
			int answer1 = in.nextInt();
			switch(answer1) {
			case 0:

				System.out.println("Enter 0 to favorite John Smith" +
						"\nEnter 1 to favorite Denise Johnson" +
						"\nEnter 2 to favorite Kevin Klein" +
						"\nEnter 3 to favorite Haley Roberts" +
						"\n***Bill Daniels and Amanda Dean are already favorites");
				int favAns = in.nextInt();
				switch(favAns) {
				case 0:
					book.favoriteEntry("John", "Smith", "25_Park_Road", "468-392-2746");
					break;
				case 1:
					book.favoriteEntry("Denise", "Johnson", "27_South_Lane", "781-876-9237");
					break;

				case 2:
					book.favoriteEntry("Kevin", "Klein", "786_Stetson_Way", "339-385-7694");
					break;

				case 3:
					book.favoriteEntry("Haley", "Roberts", "546_Franklin_Road", "781-332-4371");
					break;

				}
				System.out.println("Your updated favorites list is");
				book.printFavorites();
				System.out.println("Your entry has been favorited!");




				break;
			case 1:
				System.out.println("Your favorites are");
				book.printFavorites();
				System.out.println("Enter 0 to unfavorite Bill Daniels" +
						"\nEnter 1 to unfavorite Amanda Dean");
				int unfavAns = in.nextInt();
				switch(unfavAns) {
				case 0:
					book.unfavoriteEntryBill();
					System.out.println("Your updated favorites list is");
					book.printFavorites();
					System.out.println("Your entry has been unfavorited!");
					break;
					
				case 1:
					book.unfavoriteEntryAmanda();
					System.out.println("Your updated favorites list is");
					book.printFavorites();
					System.out.println("Your entry has been unfavorited!");
					break;
				
				}


				break;
			}
			
			break;

		case 2:
			System.out.println("Would you like to search by first name, last name, address, or phone number?");
			System.out.println("Enter 0 to search by first name" +
					"\nEnter 1 to search by last name" +
					"\nEnter 2 to search by address" +
					"\nEnter 3 to search by phone number");
			int answer2 = in.nextInt();
			switch(answer2) {
			case 0: 
				System.out.println("Please enter the first name of the person you're looking for");
				firstAns = in.next();
				System.out.println(book.searchAddressBookfirst(firstAns));
				break;
			case 1:
				System.out.println("Please enter the last name of the person you're looking for");
				lastAns = in.next();
				System.out.println(book.searchAddressBooklast(lastAns));
				break;
			case 2:
				System.out.println("Please enter the address of the person you're looking for(use underscores instead of spaces)");
				addressAns = in.next();
				System.out.println(book.searchAddressBookaddress(addressAns));
				break;
			case 3:
				System.out.println("Please enter the phone number of the person you're looking for(use dashes: Ex: 873-372-2387)");
				phoneAns = in.next();
				System.out.println(book.searchAddressBookphoneNumber(phoneAns));
				break;
			}
			break;

		case 3:
			System.out.println("How would you like to sort?" +
					"\nEnter 0 to sort by male" +
					"\nEnter 1 to sort by female" + 
					"\nEnter 2 to sort by favorites");
			int answer3 = in.nextInt();
			switch(answer3) {
			case 0:
				System.out.println(book.searchAddressBookfirst("Bill"));
				System.out.println(book.searchAddressBookfirst("John"));
				System.out.println(book.searchAddressBookfirst("Kevin"));


				break;

			case 1:
				System.out.println(book.searchAddressBookfirst("Denise"));
				System.out.println(book.searchAddressBookfirst("Amanda"));
				System.out.println(book.searchAddressBookfirst("Haley"));

				break;

			case 2:
				book.printFavorites();
				break;


			}

			break;

		case 4:
			System.out.println("Your entries are");
			book.printAddressBook();

			break;

		case 5:
			System.out.println("Your favorites are");
			book.printFavorites();

			break;

		case 6:
			book.writeToFile("AddressBK.txt");
			break;

		case 7:
			System.out.println("Here is the Address Book read from the file" 
					+ "\n");
			book.readFromFile("AddressBK.txt");

			break;
		}
	}


}


