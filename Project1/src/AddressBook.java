import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	

	private List<Entry> book;
	private List<Entry> favorites;
	
	public AddressBook() {
		book = new ArrayList<Entry>();
		favorites = new ArrayList<Entry>();
	}
	
	public void addEntry(String firstName,String lastName, String address, String phoneNumber) {
		this.book.add(new Entry(firstName, lastName, address, phoneNumber));
		
	}
	public void removeEntryBill() {
		this.book.remove(0);
		
	}
	public void removeEntryJohn() {
		this.book.remove(1);
		
	}
	public void removeEntryDenise() {
		this.book.remove(2);
		
	}
	public void removeEntryAmanda() {
		this.book.remove(3);
		
	}
	public void removeEntryKevin() {
		this.book.remove(4);
		
	}
	public void removeEntryHaley() {
		this.book.remove(5);
		
	}
	
	
	
	public void favoriteEntry(String firstName,String lastName, String address, String phoneNumber) {
		this.favorites.add(new Entry(firstName, lastName, address, phoneNumber));
	}
	
	public void unfavoriteEntryBill() {
		this.favorites.remove(0);
	}
	
	public void unfavoriteEntryAmanda() {
		this.favorites.remove(1);
	}
	
	
	public String searchAddressBookfirst(String firstName) {
		for(Entry e : this.book) {
			if(e.getfirstName().equalsIgnoreCase(firstName)) {
				return e.toString();
			}
		}
		
		return "Entry not found!";
	}
	
	public String searchAddressBooklast(String lastName) {
		for(Entry e : this.book) {
			if(e.getlastName().equalsIgnoreCase(lastName)) {
				return e.toString();
			}
		}
		
		return "Entry not found!";
	}
	public String searchAddressBookaddress(String address) {
		for(Entry e : this.book) {
			if(e.getaddress().equalsIgnoreCase(address)) {
				return e.toString();
			}
		}
		
		return "Entry not found!";
	}
	public String searchAddressBookphoneNumber(String phoneNumber) {
		for(Entry e : this.book) {
			if(e.getphoneNumber().equalsIgnoreCase(phoneNumber)) {
				return e.toString();
			}
		}
		
		return "Entry not found!";
	}
	
	public void printAddressBook() {
		for(Entry e : this.book) {
			System.out.println(e.toString());
		}
		
		/*
		for(int i = 0; i < this.book.size(); i++) {
			System.out.println(this.book.get(i).toString());
		}
		*/
	}
	public void printFavorites() {
		for(Entry e : this.favorites) {
			System.out.println(e.toString());
		}
	}
	public static void writeToFile(String fileName) {
		BufferedWriter fileWriter = null;
		
		// Attempt to open the file
		try {
			fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "utf-8"));
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		
		// Attempt to read data from the user and write it to the file
		try {
			fileWriter.write("Bill Daniels, 152_Main_Street, 556-382-9283");
			fileWriter.newLine();
			fileWriter.write("John Smith, 25_Park_Road, 468-392-2746");
			fileWriter.newLine();
			fileWriter.write("Denise Johnson, 27_South_Lane, 781-876-9237");
			fileWriter.newLine();
			fileWriter.write("Amanda Dean, 15_High_Street, 781-676-9398");
			fileWriter.newLine();
			fileWriter.write("Kevin Klein, 786_Stetson_Way, 339-385-7694");
			fileWriter.newLine();
			fileWriter.write("Haley Roberts, 546_Franklin_Road, 781-332-4371");
			
			
			System.out.println("Address Book saved to file");
		}catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			// Close the BufferedWriter and the Scanner
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void readFromFile(String fileName) {
		BufferedReader fileReader = null;
		String lineBuffer;
		
		// Attempt to open the file
		try {
			fileReader = new BufferedReader(new FileReader(new File(fileName)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Attempt to read the file line by line, outputting the contents of the file to console
		try {
			while((lineBuffer = fileReader.readLine()) != null) {
				System.out.println(lineBuffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Close the BufferedReader
			try {
				fileReader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
