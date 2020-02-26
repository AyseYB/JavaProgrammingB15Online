package day43;

import day42.Movie;

public class MovieActions {

    public static void main(String[] args) {

        Movie m1 = new Movie("Joker", 2.5,"Drama");
        Movie m2 = new Movie("Cinderella", 1.5,"Family");
        printMovieInfo(m1);
        printMovieInfo(m2);

        printShorterDurationMovieName(m1, m2);

        Movie result = getJokerMovieObject();
        System.out.println("Name is " + result.getName());
    }


    // create a static method that return  movie object with
    // name Joker 2.5 hour and type Drama
    public static Movie getJokerMovieObject(){
        Movie j = new Movie("Joker", 2.5,"Drama");
        return j;
    }



    /**
     * A void method that accept any movie object
     * and print out it's information in below format
     * The movie <name> is <length> hour long and it genre is <type>
     *
     * @param movieObj the movie object to get information from
     */
    public static void printMovieInfo(Movie movieObj){
        System.out.print("the movie name is " + movieObj.getName());
        System.out.print("is " + movieObj.getLength() + " hour long ");
        System.out.println("and the type is " + movieObj.getType());



    }
    /**
     * A void method that accept 2 movie objects
     * and print the name of movie with shorter movie length
     * for example Frozen is 1.5 hours , Joker is 2.2 hours
     * so print The shorter movie is : Frozen
     *
     * @param movieObj1 movie object
     * @param movieObj2 second movie object
     */
    public static void printShorterDurationMovieName(Movie movieObj1, Movie movieObj2 ){
        if(movieObj1.getLength() < movieObj1.getLength()) {
            System.out.println("movieObj1.getName() = " + movieObj1.getName());
        }else{
            System.out.println("movieObj2.getName() = " + movieObj2.getName());
        }
    }
}
