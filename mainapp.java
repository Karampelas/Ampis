import java.util.*;

public class mainapp {
    public static void main(String[] args) {
        ArrayList <Item> items = new ArrayList<Item>();
        items.add(new DVD("1", 2000, "malakes AE", "comedy", "malakas", "author", "actor", "blue_ray"));
        items.add(new DVD("2", 2001, "malakes AE", "drama", "paparas", "author1", "actor1", "DVD"));
        items.add(new DVD("3", 2000, "malakes AE", "comedy", "malakas", "author", "actor", "blue_ray"));
        items.add(new DVD("4", 2000, "malakes AE", "comedy", "malakas", "author", "actor", "DVD"));
        items.add(new Games("g1",1928,"malakes AE","fps","Nitendo"));
        items.add(new Games("g2",1928,"malakes AE","fps","Nitendo"));
        items.add(new Games("g3",1928,"malakes AE","fps","Play Station"));
        items.add(new Games("g4",1928,"malakes AE","fps","Play Station"));
        items.add(new Games("g5",1928,"malakes AE","fps","Xbox"));
        items.add(new Games("g6",1928,"malakes AE","fps","Xbox"));
        boolean done = false;
        int count = 0;
        HashMap<Integer, Item> rented = new HashMap<Integer, Item>();
        Scanner in = new Scanner(System.in);
        while (!done) {
            int i = 0;
            System.out.println("1.episkopish tainiwn");
            System.out.println("2.episkopish paixnidiwn");
            System.out.println("3.episkopish enoikiasewn");
            System.out.println("0.Exit");
            System.out.print(">");
            String answer = in.nextLine();
            if (answer.equals("1")) {
                System.out.println("select DVD or blue-ray");
                String category_DVD_selection = in.nextLine();
                System.out.println("Name?");
                String movie_name = in.nextLine();
                for (int counter =  items.size()-1; counter >=0; counter--) {
                    if (items.get(counter) instanceof DVD) {
                        if (category_DVD_selection.equals("DVD")) {
                            if (items.get(counter).getType().equals("DVD")) {
                                if (items.get(counter).getName().equals(movie_name)) {
                                    System.out.println(items.get(counter).toString());
                                    System.out.println("Would you like to rent it?\n[Y]es - [N]o \n>");
                                    String rent_choice = in.nextLine();
                                    if (rent_choice.equals("Y")) {
                                        rented.put(count,items.get(counter));
                                        count ++;
                                        items.remove(counter);
                                        System.out.println("ok from dvd");
                                    } else if (rent_choice.equals("N")) {
                                        System.out.println("OK next!");
                                    }
                                } else
                                    i += 1;
                            } else
                                i += 1;
                        } else {
                            if (category_DVD_selection.equals("blue_ray")) {
                            } else {
                                if (items.get(counter).getType().equals("blue_ray")) {
                                    if (items.get(counter).getName().equals(movie_name)) {
                                        System.out.println(items.get(counter).toString());
                                        String rent_choice = in.nextLine();
                                        if (rent_choice.equals("Y")) {
                                            rented.put(count,items.get(counter));
                                            count ++;
                                            items.remove(counter);
                                            System.out.println("it is moving ");
                                        }
                                        else if (rent_choice.equals("N")) {
                                            System.out.println("OK next!");
                                        }
                                    } else
                                        i += 1;
                                } else
                                    i += 1;
                            }
                        }
                        System.out.println("loop!");
                    } else
                        i += 1;
                }
                if (i >= items.size()) {
                    System.out.println("Movie not found!");
                }
                // System.out.println(items);
                System.out.println(rented);
            } else if (answer.equals("2")) {
                System.out.println("Xbox-playstation-nitendo");
                String category_game_selection = in.nextLine();
                System.out.println("Name of game?");
                String game_name = in.nextLine();
                for (Item item : items) {
                    if (item instanceof Games) {
                        if (category_game_selection.equals("xbox")) {
                            if (((Games) item).getConsole().equals("xbox")) {
                                if (((Games) item).getName().equals(game_name)) {
                                    System.out.println(((Games) item));
                                    String rent_choice = in.nextLine();
                                    if (rent_choice.equals("Y")) {
                                        rented.put(count,((DVD) item));
                                        count ++;
                                        items.remove((DVD) item);
                                    } else if (rent_choice.equals("N")) {
                                        System.out.println("OK next!");
                                    }
                                } else
                                    i += 1;
                            } else
                                i += 1;
                        } else if (category_game_selection.equals("playstation")) {
                            if (((Games) item).getConsole().equals("playstation")) {
                                if (((Games) item).getName().equals(game_name)) {
                                    System.out.println(((Games) item));
                                    String rent_choice = in.nextLine();
                                    if (rent_choice.equals("Y")) {
                                        rented.put(count,((DVD) item));
                                        count ++;
                                        items.remove((DVD) item);
                                    } else if (rent_choice.equals("N")) {
                                        System.out.println("OK next!");
                                    }
                                } else
                                    i += 1;
                            } else
                                i += 1;
                        } else if (category_game_selection.equals("nitendo")) {
                            if (((Games) item).getConsole().equals("nitendo")) {
                                if (((Games) item).getName().equals(game_name)) {
                                    System.out.println(((Games) item));
                                    String rent_choice = in.nextLine();
                                    if (rent_choice.equals("Y")) {
                                        rented.put(count,((DVD) item));
                                        count ++;
                                        items.remove((DVD) item);
                                    } else if (rent_choice.equals("N")) {
                                        System.out.println("OK next!");
                                    }
                                }
                                else i+=1;
                            }
                            else i+=1;
                        }
                    }
                    else i+=1;
                }
                
                if (i == items.size()) {
                    System.out.println("Game not found!");
                }
            }
            else if (answer.equals("0")){
                done = true;
            }
        }   
    }
    
}


