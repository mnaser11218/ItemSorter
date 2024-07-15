package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter implements Comparator<Item>{
    public Item[] items;

    // Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item>myList = new ArrayList<>(Arrays.asList(items));
        myList.sort(Comparator.comparing(Item :: getId));
        Item[] solution = myList.toArray(new Item[0]);
        return solution;
    }

    @Override
    public int compare(Item o1, Item o2) {

        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<Item> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Item> thenComparing(Comparator<? super Item> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Item> thenComparing(Function<? super Item, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Item> thenComparing(Function<? super Item, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Item> thenComparingInt(ToIntFunction<? super Item> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Item> thenComparingLong(ToLongFunction<? super Item> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Item> thenComparingDouble(ToDoubleFunction<? super Item> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
