package main;

import data.Stop;
import data.Trip;
import data.User;
import interfaces.Login;
import interfaces.PublicTransport;
import interfaces.WheeledVehicles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class Main {
    public static int typeLogin(Scanner sc) { // Function to choose the type of login at boot
        int option;

        do {
            System.out.print("Do you want to log in as Admin (1) or User (2)?: ");
            option = sc.nextInt();
        } while(option != 1 && option != 2);

        return option;
    }

    public static boolean verifyPassword(Scanner sc, Login login) { // Function with 3 attempts to put the password
        sc.nextLine();
        boolean password = false;

        for(int i = 3; i > 0 && !password; i--) {
            System.out.print("You have " + (i) + " attempts.\nPassword: ");
            password = login.getPassword().equals(sc.nextLine());
        }

        if(!password) {
            System.out.println("Incorrect password, you've run out of attempts, exiting...");
        }

        return password;
    }

    public static int adminOptions(Scanner sc) { // Selected option of admin menu
        int option;

        do {
            System.out.print("\nADMIN PANEL\n1. Create user.\n2. Delete user.\n3. Exit.\n> ");
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3);

        return option;
    }

    public static File[] getUsers() { // Get all users in a File array (File[])
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

    public static void createUser(Scanner sc) { // Admin option 1/3
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
                writer.write(0 + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("That user already exists.");
        }
    }

    public static void deleteUser(Scanner sc) { // Admin option 2/3
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
    }

    public static User selectUser(Scanner sc) {
        File[] users = getUsers();

        int option;
        do {
            System.out.println();
            for (int i = 0; i < users.length; i++) {
                System.out.println((i + 1) + ". " + users[i].getName().substring(0, users[i].getName().length() - 4));
            }

            System.out.print("With which user do you want to log in?: ");
            option = sc.nextInt();
        } while(option < 1 || option > users.length);

        File selectedUser = users[option-1];

        User user = null;
        try {
            List<String> lines = Files.readAllLines(selectedUser.toPath());

            String name = lines.get(0);
            String surname = lines.get(1);
            String contact = lines.get(2);
            String password = lines.get(3);
            double money = Double.parseDouble(lines.get(4));

            user = new User(name, surname, contact, password);
            user.setMoney(money);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static int userOptions(Scanner sc) {
        int option;

        do {
            System.out.print("\nUSER PANEL\n1. Check money.\n2. Deposit money.\n3. Buy trips.\n4. Consult trips.\n5. Check stops.\n6. Exit.\n> ");
            option = sc.nextInt();
        } while (option < 1 || option > 6);
        return option;
    }

    public static Trip buyTrip(Scanner sc, User user) {
        int option;
        do {
            System.out.print("\nWhen do you want to book the trip?\n1. In an hour\n2. In two hours.\n3. In three hours.\n> ");
            option = sc.nextInt();
        } while (option != 1 && option != 2 && option != 3);

        Trip trip = null;
        Date dateNow = new Date();

        switch (option) {
            case 1:
                trip = new Trip(Examples.CreateBaseTaxi(), new Date(dateNow.getTime() + 3600000));
                break;
            case 2:
                trip = new Trip(Examples.CreateBaseTaxi(), new Date(dateNow.getTime() + 7200000));
                break;
            case 3:
                trip = new Trip(Examples.CreateBaseTaxi(), new Date(dateNow.getTime() + 10800000));
                break;
        }

        if(user.getMoney() >= trip.getTaxi().getCost()) {
            user.setMoney(user.getMoney() - trip.getTaxi().getCost());
        } else {
            trip = null;
        }

        return trip;
    }

    public static void seeTrips(List<Trip> trips) {
        if (trips == null || trips.isEmpty()) {
            System.out.println("No trips.");
        } else {
            System.out.println("List of trips:");
            for (Trip trip : trips) {
                System.out.println(trip);
            }
        }
    }

    public static void checkStops(Scanner sc) {
        List<Stop> stops = Examples.CreateBaseStops();
        List<PublicTransport> publicTransports = Examples.CreateBasePublicTransports();

        int option;
        int index;
        do {
            System.out.println("Which stop do you want to consult?:");
            index = 0;
            for (Stop stop : stops) {
                index += 1;
                System.out.println(index + ". " + stop);
            }
            System.out.print("> ");
            option = sc.nextInt();
        } while (option < 1 || option > index);

        Stop stop = stops.get(option);
        List<PublicTransport> transports = new ArrayList<>();

        for (PublicTransport p : publicTransports) {
            if(p.getStop().getId() == stop.getId()) {
                transports.add(p);
            }
        }

        Random random = new Random();
        PublicTransport transport = transports.get(random.nextInt(transports.size()));
        System.out.println("Stop: " + stop);
        System.out.println("There is a " + transport);
    }

    public static void saveUser(User user) {
        try {
            String fileName = "users/" + user.getName() + ".txt";
            File file = new File(fileName);

            if (file.exists()) {
                file.delete();
            }

            FileWriter userFile = new FileWriter(file);
            userFile.write(user.getName() + "\n");
            userFile.write(user.getSurname() + "\n");
            userFile.write(user.getContact() + "\n");
            userFile.write(user.getPassword() + "\n");
            userFile.write(user.getMoney() + "\n");
            userFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        switch (typeLogin(sc)) {
            case 1:
                if(verifyPassword(sc, Examples.CreateBaseAdmin())) {
                    boolean menu = true;
                    do {
                        System.out.println();

                        switch (adminOptions(sc)) {
                            case 1:
                                createUser(sc);
                                break;
                            case 2:
                                deleteUser(sc);
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
                User user = selectUser(sc);

                if(verifyPassword(sc, user)) {
                    boolean menu = true;
                    do {
                        System.out.println();

                        switch (userOptions(sc)) {
                            case 1:
                                System.out.print("You have " + user.getMoney()  + "€.");
                                break;
                            case 2:
                                System.out.print("How much money do you want to deposit?: ");
                                double deposit = sc.nextDouble();
                                user.addMoney(deposit);
                                break;
                            case 3:
                                Trip trip = buyTrip(sc, user);
                                if(trip != null) {
                                    user.addTrip(trip);
                                    System.out.println("Trip added!!!");
                                } else {
                                    System.out.println("You don't have enought money...");
                                }
                                break;
                            case 4:
                                seeTrips(user.getTrips());
                                break;
                            case 5:
                                checkStops(sc);
                                break;
                            case 6:
                                saveUser(user);
                                System.out.print("Leaving...");
                                menu = false;
                                break;
                        }
                    } while (menu);
                }
                break;
        }

        sc.close();
    }
}
