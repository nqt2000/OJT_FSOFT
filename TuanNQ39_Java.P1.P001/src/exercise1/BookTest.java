package exercise1;

import java.util.Scanner;

public class BookTest {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Book[] book = new Book[30];
			System.out.println("Enter the Book data:");
			for(int i = 0; i < 30; i++) {
				System.out.printf("Book %d\n", (i+1));
				String Name;
				int ISBN;
				String Author;
				String Publisher;
				
				System.out.printf("Enter Name: ");
				Name = sc.next();
				
				System.out.printf("Enter ISBN number: ");
				ISBN = sc.nextInt();
				
				System.out.printf("Enter Author: ");
				Author = sc.next();
				
				System.out.printf("Enter Publisher: ");
				Publisher = sc.next();
				
				System.out.println();
				
				book[i] = new Book(Name, ISBN, Author, Publisher);
			}
			
			for (int i = 0; i < 30; i++) {
				System.out.printf("\n\nBook %d\n", (i+1));
				System.out.printf("%s\n", book[i].getBookInfo());
			}
		}
}
