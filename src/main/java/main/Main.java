package main;

import data.Admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int typeLogin(Scanner sc) {
        int option;

        do {
            System.out.print("Do you want to log in as Admin (1) or User (2)?: ");
            option = sc.nextInt();
        } while(option != 1 && option != 2);

        return option;
    }

    public static boolean adminPassword(Scanner sc, Admin admin) {
        sc.nextLine();
        boolean password = false;

        for(int i = 3; i > 0 && !password; i--) {
            System.out.print("You have " + (i) + " attempts.\nPassword: ");
            password = admin.getPassword().equals(sc.nextLine());
        }

        if(!password) {
            System.out.println("Incorrect password, you've run out of attempts, exiting...");
        }

        return password;
    }

    public static int adminOptions(Scanner sc) {
        int option;

        do {
            System.out.print("\nADMIN PANEL\n1. Create user.\n2. Delete user.\n3. Exit.\n> ");
            option = sc.nextInt();
        } while(option != 1 && option != 2 && option != 3);

        return option;
    }

    public static File[] getUsers() {
        File usersDirectory = new File(System.getProperty("user.dir") + "/users");
        return usersDirectory.listFiles();
    }

    public static boolean userExists(String name) {
        File[] users = getUsers();
        boolean userFound = false;

        for(int i=0; i<users.length && !userFound; i++) {
            userFound = users[i].getName().substring(0, users[i].getName().length() - 4).equals(name);
        }

        return userFound;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        switch (typeLogin(sc)) {
            case 1:
                if(adminPassword(sc, Examples.CreateBaseAdmin())) {
                    boolean menu = true;
                    do {
                        System.out.println();

                        switch (adminOptions(sc)) {
                            case 1:
                                sc.nextLine();
                                System.out.print("Name: ");
                                String userName = sc.nextLine();

                                if(!userExists(userName)) {
                                    File file = new File(System.getProperty("user.dir") + "/users/" + userName + ".txt");
                                    try {
                                        file.createNewFile();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }

                                    System.out.print("Surname: ");
                                    String userSurname = sc.nextLine();

                                    System.out.print("Contact: ");
                                    String userContact = sc.nextLine();

                                    System.out.print("Password: ");
                                    String userPassword = sc.nextLine();

                                    try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + "/users/" + userName + ".txt")) {
                                        writer.write(userName + "\n");
                                        writer.write(userSurname + "\n");
                                        writer.write(userContact + "\n");
                                        writer.write(userPassword + "\n");
                                    }
                                } else {
                                    System.out.println("That user already exists.");
                                }
                                break;
                            case 2:
                                File[] users = getUsers();
                                for(int i=0; i<users.length; i++) {
                                    System.out.println((i+1) + ". " + users[i].getName());
                                }
                                System.out.print("\nWhat user you want to delete?: ");
                                int userSelected = sc.nextInt();

                                if(userSelected >= 1 && userSelected <= users.length) {
                                    System.out.println("User deleted.");
                                    users[userSelected - 1].delete();
                                } else {
                                    System.out.println("Not a valid option.");
                                }
                                break;
                            case 3:
                                System.out.println("Leaving...");
                                menu = false;
                                break;
                        }
                    } while (menu);
                }
                break;
            case 2:
                break;
        }

        sc.close();
    }
}
