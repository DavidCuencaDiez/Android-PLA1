package com.example.david.pla1;

import android.icu.util.GregorianCalendar;

import com.example.david.pla1.model.BookItem;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class bookContent {

    public static final List<BookItem> ITEMS = new ArrayList<BookItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<Integer, BookItem> ITEM_MAP = new HashMap<Integer, BookItem>();

    private static final int COUNT = 2;

    static {
        // Add some sample items.
        /*
        for (int i = 1; i <= COUNT; i++) {
            addItem(createBookItem(i));
        }
        */
    }

    public static void addItem(BookItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
    }

    private static BookItem createBookItem(int position) {
        String imageURl = "https://marketplace.canva.com/MACXC0twKgo/1/0/thumbnail_large/canva-green-and-pink-science-fiction-book-cover-MACXC0twKgo.jpg";

        return new BookItem(position, "Title" + position, "Author" + position, new Date(), "Description " + position, imageURl);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }
}
