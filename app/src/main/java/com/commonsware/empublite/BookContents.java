package com.commonsware.empublite;

import java.util.List;

/**
 * Created by dm on 08.01.16.
 */
public class BookContents {
    List<Chapter> chapters;

    int getChapterCount() {
        return chapters.size();
    }

    String getChapterFile(int position) {
        return chapters.get(position).file;
    }

    static class Chapter {
        String file;

    }
}
