package com.test;

import com.test.Module.SearchResultBean;
import com.test.Util.Global;
import com.test.Util.NetWork;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import static org.junit.Assert.*;

public class SearchAPITest {
  Response<SearchResultBean> mResponse;
  @Before
  public void setUp() throws Exception {
    System.out.println("***start test***");
  }
  @After
  public void tearDown() throws Exception {
    System.out.println("***end test***");
  }
  @Test
  public void testSearchAPI() {
    String authorization = "Bearer " + Global.apiKey;
    String location = "Melbourne City";
    Map<String, String> params = new HashMap<>();
    params.put("term", "food");
    Call<SearchResultBean> result = NetWork.search().search(authorization, location, params);
    try {
      Response<SearchResultBean> response = result.execute();
      Assert.assertEquals(200, response.code());
      SearchResultBean business = response.body();
      Assert.assertNotNull(business);
      System.out.println("*** testSearchAPI pass ***");
    } catch (IOException e) {
      fail();
    }
  }

}