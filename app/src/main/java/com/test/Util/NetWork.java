package com.test.Util;

import com.test.Module.SearchAPI;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Charlie.
 * Created on 19/10/2019
 */

public class NetWork {
  private static OkHttpClient okHttpClient = new OkHttpClient();
  private static SearchAPI searchAPI;
  public static SearchAPI search() {
    if (searchAPI == null) {
      Retrofit retrofit = new Retrofit.Builder()
          .client(okHttpClient)
          .baseUrl(Global.baseUrl)
          .addConverterFactory(GsonConverterFactory.create())
          .build();
      searchAPI = retrofit.create(SearchAPI.class);
    }
    return searchAPI;
  }
}
