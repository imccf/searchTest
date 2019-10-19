package com.test.Module;

import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface SearchAPI {

  /**
   * Search API
   *
   * @param authorization Authorization string.
   * @param location Any location string
   * @param params Key, value pairs as search API params.
   * @return SearchResultBean type.
   */
  @GET("/v3/businesses/search")
  Call<SearchResultBean> search(@Header("Authorization") String authorization,
      @Query("location") String location, @QueryMap
      Map<String, String> params);
}


