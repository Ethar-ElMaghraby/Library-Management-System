/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner input=new Scanner (System.in);
  System.out.print("Enter the number of books you have: ");
  int num=input.nextInt();
  String[]bookTitles=new String[num];
  String[]bookDescription=new String[num];
  boolean[]bookStatue=new boolean[num];
  int bookCount=0;
  System.out.println("Welcome to the library management system: ");
  System.out.println("1.Add a book");
  System.out.println("2.(Search for a book (by title or ID)");
  System.out.println("3.Issue a Book (by ID)");
  System.out.println("4.Return a Book (by ID)");
  System.out.println("5.Delete a Book (by ID)");
  System.out.println("6.Edit a Book details (Title/Description by ID)");
  System.out.println("7.View all books");
  System.out.println("8.Exit");
  System.out.println("Note: The ID of the book is the number of the book.");
  System.out.println("Enter your choice: ");
  int x=input.nextInt();
  while (x!=8){
  switch(x){
      case 1:
      for(int i=0;i<num;i++){
          System.out.print("Enter the title of book number "+(i+1)+" : ");
         bookTitles[i]=input.next();
         System.out.print("Enter the description of book number "+(i+1)+" : ");
         bookDescription[i]=input.next();
         bookStatue[i]=true;
         bookCount++;
      }break;
      
      case 2:
         System.out.println("Do you want to search by title or ID: ");
         String search=input.next();
         if (search.equalsIgnoreCase("title")){
        System.out.println("Enter the title of the book: ");
        String title=input.next();
        for (int i=0;i<num;i++){
            if(bookTitles[i].equalsIgnoreCase(title))
                System.out.println("available");
         }}else{
            System.out.println("Enter the ID: ");
            int ID=input.nextInt();
            if (bookStatue[ID-1]==true)
                System.out.println("available");
            else
         System.out.println("unavailable");
         }
            break;
      case 3:
          System.out.println("Enter the ID of the book to issue it: ");
         int ID=input.nextInt();
         bookStatue[ID-1]=false;
         bookCount--;
         System.out.println("The book is issued successfully");
         break;
      case 4:
          System.out.println("Enter the ID of the book to return it: ");
           ID=input.nextInt();
           bookStatue[ID-1]=true;
           bookCount++;
           System.out.println("The book is added successfully");
           break;
      case 5:
          System.out.println("Enter the ID of the book to delete it: ");
          ID=input.nextInt();
       for(int i=ID-1;i<num-1;i++){
           num--;
             bookTitles[i]=bookTitles[i+1];
             bookDescription[i]=bookDescription[i+1];
             bookStatue[i]=bookStatue[i+1];
          }
         bookCount--;
             break;
       case 6:
       System.out.println("Enter the ID of the book that you want to edit: ");
       ID=input.nextInt();
       System.out.println("Do you want to edit title or description?");
       String Edit=input.next();
       if(Edit.equalsIgnoreCase("title")){
       System.out.println("Enter the new title: ");
       bookTitles[ID-1]=input.next();
         }
         if (Edit.equalsIgnoreCase("description")){
         System.out.println("Enter the new description: ");
         bookDescription[ID-1]=input.next();
         }break;
         case 7:
         for(int i=0;i<num;i++){
             System.out.println(bookTitles[i] +"\n"+ bookDescription[i]+ "\n"+ bookStatue[i]);
             System.out.println("");
         }break; 
  }
  System.out.println("Any other process? ");
  System.out.println("1.Add a book");
  System.out.println("2.(Search for a book (by title or ID)");
  System.out.println("3.Issue a Book (by ID)");
  System.out.println("4.Return a Book (by ID)");
  System.out.println("5.Delete a Book (by ID)");
  System.out.println("6.Edit a Book details (Title/Description by ID)");
  System.out.println("7.View all books");
  System.out.println("8.Exit");
  System.out.println("Enter your choice: ");
  System.out.println("Note: The ID of the book is the number of the book.");
  x=input.nextInt();
}System.out.println("Thanks for using our LMS project");
}
}