package kr.re.kitri.collect;

import kr.re.kitri.stream.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class CollectDemo03 {
    static List<Dish> dishes = Arrays.asList(
            new Dish("pork", false, 800, "MEAT"),
            new Dish("beef", false, 700, "MEAT"),
            new Dish("chicken", false, 450, "MEAT"),
            new Dish("french fires", true, 530, "OTHER"),
            new Dish("rice", true, 300, "OTHER"),
            new Dish("spagetti", true, 400, "NOODLE"),
            new Dish("apple", true, 300, "FRUIT"),
            new Dish("melon", true, 320, "FRUIT"),
            new Dish("salmon", true, 420, "FISH"),
            new Dish("prawn", true, 420, "FISH")
    );
    public static void main(String[] args) {
        Map<String, Map<Boolean, List<Dish>>> collect = dishes.stream()
                .collect(groupingBy(Dish::getType, partitioningBy(e -> e.getCalrories() > 400)));

        System.out.println(collect);
    }

}
