package com.commonsware.empublite;

import retrofit.http.GET;

/**
 * Created by dm on 24.01.16.
 */
public interface BookUpdateInterface {
    @GET("/misc/empublite-update.json")
    BookUpdateInfo update();
}
