package com.commonsware.empublite;

/**
 * Created by dm on 08.01.16.
 */
public class BookLoadedEvent {
    private  BookContents contents = null;

    public BookLoadedEvent(BookContents contents) {
        this.contents = contents;
    }

    public BookContents getBook() {
        return contents;
    }
}
