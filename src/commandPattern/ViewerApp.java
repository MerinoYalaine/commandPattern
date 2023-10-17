package commandPattern;

import java.util.Scanner;
public class ViewerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aircon aircon = new Aircon();
        Lights lights = new Lights();
        MusicPlayer musicPlayer = new MusicPlayer();
        Tv tv = new Tv();
        Remote remote = new Remote();

        while (true){

            boolean exit = false;

            System.out.println("\nRemote Commands (Please Pick Number): ");
            System.out.println("1. Aircon ");
            System.out.println("2. Lights ");
            System.out.println("3. Music Player");
            System.out.println("4. Tv");
            System.out.println("5. Exit");
            System.out.print("Choose Command: ");
            int choice = scanner.nextInt();

            switch (choice){


                case 1:

                    while (!exit){

                        boolean airconMenu = true;

                        System.out.println("\nAircon Commands: ");
                        System.out.println("1. Power On");
                        System.out.println("2. Power Off");
                        System.out.println("3. Temperature Up");
                        System.out.println("4. Temperature Down");
                        System.out.println("5. Swing");
                        System.out.println("6. Return");
                        System.out.print("Choose Command: ");
                        choice = scanner.nextInt();

                        if (choice == 1){

                            remote.setCommand(new PowerOn (aircon));
                            remote.clickButton();

                        }

                        else if (choice == 2){

                            remote.setCommand(new PowerOff (aircon));
                            remote.clickButton();

                        }

                        else if (choice == 3){

                            remote.setCommand(new Increment (aircon));
                            remote.clickButton();

                        }

                        else if (choice == 4){

                            remote.setCommand(new Decrement (aircon));
                            remote.clickButton();

                        }

                        else if (choice == 5){

                            remote.setCommand(new Swing (aircon));
                            remote.clickButton();

                        }

                        else if (choice == 6){

                            exit = true;

                        }

                        else {

                            System.out.print("\nUnable to recognize choice.\n");

                        }

                    }

                    break;

                case 2:

                    while (!exit){
                        System.out.println("\nLights Commands: ");
                        System.out.println("1. Power On");
                        System.out.println("2. Power Off");
                        System.out.println("3. Brightness Up");
                        System.out.println("4. Brightness Down");
                        System.out.println("5. RGB");
                        System.out.println("6. Return");
                        System.out.print("Choose Command: ");
                        choice = scanner.nextInt();

                        if (choice == 1){

                            remote.setCommand(new PowerOn (lights));
                            remote.clickButton();

                        }

                        else if (choice == 2){

                            remote.setCommand(new PowerOff (lights));
                            remote.clickButton();

                        }

                        else if (choice == 3){

                            remote.setCommand(new Increment (lights));
                            remote.clickButton();

                        }

                        else if (choice == 4){

                            remote.setCommand(new Decrement (lights));
                            remote.clickButton();

                        }

                        else if (choice == 5){

                            remote.setCommand(new RGB (lights));
                            remote.clickButton();

                        }
                        else if (choice == 6){

                            exit = true;

                        }

                        else {

                            System.out.print("\nUnable to recognize choice.\n");

                        }

                    }

                    break;

                        case 3:

                            while (!exit){
                                System.out.println("\nMusic Player Commands: ");
                                System.out.println("1. Power On");
                                System.out.println("2. Power Off");
                                System.out.println("3. Shuffle");
                                System.out.println("4. Return");
                                System.out.print("Choose Command: ");
                                choice = scanner.nextInt();

                                scanner.nextLine();

                                if (choice == 1){

                                    remote.setCommand(new PowerOn (musicPlayer));
                                    remote.clickButton();

                                } else if (choice == 2){

                                    remote.setCommand(new PowerOff (musicPlayer));
                                    remote.clickButton();

                                } else if (choice == 3){

                                    remote.setCommand(new Shuffle (musicPlayer));
                                    remote.clickButton();

                                }

                                else if (choice == 4){

                                     exit = true;
                                }

                                else {

                                    System.out.print("\nUnable to recognize choice.\n");

                                }

                            }

                            break;

                        case 4:

                            while (!exit){
                                System.out.println("\nTv Commands: ");
                                System.out.println("1. Power On");
                                System.out.println("2. Power Off");
                                System.out.println("3. Channel Up");
                                System.out.println("4. Channel Down");
                                System.out.println("5. Karaoke");
                                System.out.println("6. Return");
                                System.out.print("Choose Command: ");
                                choice = scanner.nextInt();

                                if (choice == 1){

                                    remote.setCommand(new PowerOn (tv));
                                    remote.clickButton();

                                }

                                else if (choice == 2){

                                    remote.setCommand(new PowerOff (tv));
                                    remote.clickButton();

                                }

                                else if (choice == 3){

                                    remote.setCommand(new Increment (tv));
                                    remote.clickButton();

                                }

                                else if (choice == 4){

                                    remote.setCommand(new Decrement (tv));
                                    remote.clickButton();

                                }

                                else if (choice == 5){

                                    remote.setCommand(new Karaoke (tv));
                                    remote.clickButton();

                                }
                                else if (choice == 6){

                                    exit = true;

                                }

                                else {

                                    System.out.print("\nUnable to recognize choice.\n");

                                }
                            }

                            break;

                case 5:

                    System.exit(0);

                default:

                    System.out.print("\nUnable to recognize choice.\n");

            }

        }

    }

}