package com.company.core.lesson18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask
{
    public static void main(String[] args) throws Exception
    {
        List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five", "One");

        System.out.println(strings);


//        Повернути кількість входжень об'єкта «One»
        System.out.println("Повернути кількість входжень об'єкта «One»");
        long countOne = strings.stream().filter(str -> str.equals("One")).count();
        System.out.println(countOne);

//        Повернути перший елемент колекції або 0, якщо колекція порожня
        System.out.println("Повернути перший елемент колекції або 0, якщо колекція порожня");
        String first = strings.stream().findFirst().orElse("0");
        System.out.println(first);

//        Повернути останній елемент колекції або «empty», якщо колекція порожня
        System.out.println("Повернути останній елемент колекції або «empty», якщо колекція порожня");
        String last = strings.stream().skip(strings.size() - 1).findFirst().orElse("empty");
        System.out.println(last);

//        Знайти елемент в колекції рівний «Three» або кинути помилку
        System.out.println("Знайти елемент в колекції рівний «Three» або кинути помилку");
        String three = strings.stream()
            .filter(str -> str.equals("Three"))
            .findFirst()
            .orElseThrow(() -> new Exception("No Such Element"));

//        Повернути третій елемент колекції по порядку
        System.out.println("Повернути третій елемент колекції по порядку");
        String third = strings.stream().skip(2).findFirst().orElse("");
        System.out.println(third);

//        Повернути два елементи починаючи з другого
        System.out.println("Повернути два елементи починаючи з другого");
        strings.stream().skip(1).limit(2).forEach(System.out::println);

//        Вибрати всі елементи в яких є більше ніж 3 букви у слові
        System.out.println("Вибрати всі елементи в яких є більше ніж 3 букви у слові");
        List<String> size3 = strings.stream()
            .filter(elem -> elem.length() > 3)
            .collect(Collectors.toList());
        System.out.println(size3);

//        Повернути колекції без дублікатів
        System.out.println("Повернути колекції без дублікатів");
        List<String> unique = strings.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

//        Знайти чи існують хоч один «One» елемент в колекції
        System.out.println("Знайти чи існують хоч один «One» елемент в колекції");
        boolean anyOne = strings.stream().anyMatch(elem -> elem.equals("One"));
        System.out.println(anyOne);

//        Знайти чи є символ «o» у всіх елементів колекції
        boolean allO = strings.stream()
            .allMatch(elem -> elem.contains("o") || elem.contains("O"));
        System.out.println(allO);

//        Додати "_1" до кожного елементу колекції
        System.out.println("Додати \"_1\" до кожного елементу колекції");
        List<String> upd = strings.stream()
            .map(elem -> elem + "_1")
            .collect(Collectors.toList());
        System.out.println(upd);

//        Відсортувати колекцію рядків за алфавітом і прибрати дублікати
        System.out.println("Відсортувати колекцію рядків за алфавітом і прибрати дублікати");
        List<String> sorted = strings.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(sorted);

    }
}
