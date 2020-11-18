package Pratice;

import java.sql.*;
import java.util.Scanner;

public class StudentView {
    public static void main(String[] args) {

    }

        Scanner scanner = new Scanner(System.in);
        public static String slt;
        public static ResultSet rst;

        public void addStudent(){
            System.out.println("Enter Student ID :");
            String ID = scanner .nextLine();

            System.out.println("Enter Stundet Name :");
            String Name = scanner .nextLine();

            System.out.println("Enter Stundent Address :");
            String Address = scanner.nextLine();

            System.out.println("Enter Stundent Phone :");
            String Phone = scanner.next();

        }

        public void displayStudent(){
            try(
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratice","root","");
                    Statement stmt = conn.createStatement();
            ){
                slt = "SELECT * FROM pratice";
                rst = stmt.executeQuery(slt);
                while(rst.next()){
                    String ID = rst.getString("ID");
                    String Name = rst.getString("Name");
                    String Address = rst.getString("Address");
                    String Phone = rst.getString("Phone");
                    System.out.println("ID NAME ADDRESS PHONE");
                }
            }catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

        public void savestudent(){

        }



        public static void menu(){
            int choice;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("=======================");
                System.out.println("1.Add student record");
                System.out.println("2.Display student record");
                System.out.println("3.Save");
                System.out.println("4.Exit");
                choice = scanner.nextInt();

                switch (choice){
                    case 1 :
                        addStudent();
                        break;

                    case 2 :
                        displayStudent();
                        break;

                    case 3 :
                        savestudent();
                        break;

                    case 4:
                        break;
                }
            }while (choice != 0);
        }


    }



