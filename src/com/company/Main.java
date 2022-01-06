package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final List<Movies> movies = JsonIO.getMovies();
    private static MovieStore movieStore = new MovieStore();
    private static FindAble f = (FindAble) new FindByMap();
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputException {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            commands();

            int a = scanner.nextInt();

            if (a == 1) {
                System.out.println("все категории фильмов");
                movieStore.printAllMovies(movies);
            } else if (a == 2) {
                System.out.print("write movies name: ");
                String input = in.nextLine();
                movieStore.findMovie(movies, input);
            } else if (a == 3) {
                System.out.println("отсортированы по годам: ");
                movieStore.sortByYear(movies);
            } else if (a == 4) {
                System.out.println("отсортированы по названию: ");
                movieStore.sortByName(movies);
            } else if (a == 5) {
                System.out.println("отсортированы по алфавитному порядку директора: ");
                movieStore.sortByDirector(movies);
            } else if (a == 6) {
                System.out.print("write actor's name: ");
                f.findMoviesByActor(movies, in.nextLine());
            } else if (a == 7) {
                System.out.println("write director's name");
                f.findMoviesByDirector(movies, in.nextLine());
            } else if (a == 8) {
                System.out.println("write years");
                f.findMoviesByYear(movies, in.nextInt());
            } else if (a == 9) {
                System.out.println("write actor name");
                f.findMoviesAndRoleByActor(movies, in.nextLine());
            } else if (a == 10) {
                System.out.println("актер с ролями: ");
                f.showActorRoles(movies);
            }
        }
    }

    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to print catalog");
        System.out.println("Press 2 to Find a Movie by full or part name");
        System.out.println("Press 3 to sort by year");
        System.out.println("Press 4 to sort by name");
        System.out.println("Press 5 to sort by director");
        System.out.println("Press 6 to find movies by actor's name");
        System.out.println("Press 7 to find movies by director's name");
        System.out.println("Press 8 to find movies by year");
        System.out.println("Press 9 to List all movies and roles by actor's name");
        System.out.println("Press 10 to sorted List of all actors with his roles");
        System.out.println("---------------------------------------------");
    }



}
