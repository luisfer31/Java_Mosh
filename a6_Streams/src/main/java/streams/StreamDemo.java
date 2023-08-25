package streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 10, Genre.THRILLER),
                new Movie("d", 10, Genre.COMEDY),
                new Movie("a", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        // Imperative programming
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10) {
                count++;
            }
        }

        // Declarative programming
        long count1 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
        System.out.println(count1);

        movies.stream().forEach(movie -> System.out.print(movie.getTitle()));
        System.out.println();
        movies.stream().map(movie -> movie.getTitle()).forEach(System.out::println);

        // Generate stream
        Stream<Double> stream = Stream.generate(() -> Math.random());
        stream.limit(8).forEach(a -> System.out.println(a));

        // Iterate stream
        Stream.iterate(1, n -> n + 1).limit(8).forEach(n -> System.out.println(n));

        // Map FlatMap
        Stream<List<Integer>> listStream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        listStream
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.print(n));

        System.out.println();

        // filter movies more thant ten likes
        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;

        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));

        // Slicing streams
        // 1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip( (page - 1) x pagesSize )
        // limit(10) = limit(pageSize)
        movies.stream()
                .skip(20)
                .limit(10)
                .forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println();

        // takeWhile dropWhile
        movies.stream()
//                .takeWhile(m -> m.getLikes() < 30)
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(movie -> System.out.println(movie.getTitle()));

        System.out.println();

        // Sort order
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(movie -> System.out.println(movie.getTitle()));

        // Unique elements
        movies.stream()
                .map(Movie::getLikes)
                .distinct()
                .forEach(System.out::println);

        // peek
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .peek(movie -> System.out.println("filtered: " + movie.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);

        //
        Movie result = movies.stream()
                .max(Comparator.comparing(movie -> movie.getLikes()))
                .get();
        System.out.println(result.getTitle());

        // Reduction
        Optional<Integer> sum = movies.stream()
                .map(movie -> movie.getLikes())
                .reduce((a, b) -> a + b);
        System.out.println(sum.orElse(0));

        // Collectors
        Map<String, Integer> resultM = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));
        System.out.println(resultM);

        System.out.println();

        IntSummaryStatistics resultSummaryStast = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(resultSummaryStast);

        System.out.println();

        String join = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                        .collect(Collectors.joining(", "));
        System.out.println(join);

        // GROUPING
        var resultGenre = movies.stream()
//                .collect(Collectors.groupingBy(Movie::getGenre));
                .collect(Collectors.groupingBy(Movie::getGenre,Collectors.counting()));
        System.out.println(resultGenre);

        System.out.println();

        var resultCategory = movies.stream()
                        .collect(Collectors.groupingBy(
                                Movie::getGenre,
                                Collectors.mapping(
                                        Movie::getTitle,
                                        Collectors.joining(", "))));

        System.out.println(resultCategory);

        System.out.println();

        // PARTITIONING
        Map<Boolean, String> resultPartitioning = movies.stream().collect(Collectors.partitioningBy(
                m -> m.getLikes() > 20,
                Collectors.mapping(Movie::getTitle,
                        Collectors.joining(", "))));
        System.out.println(resultPartitioning);

        System.out.println();

        // PRIMITIVE STREAM
        IntStream.rangeClosed(1,6).forEach(item-> System.out.print(item+" "));


    }
}
