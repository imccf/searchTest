package com.test.Contracts;

import com.test.Module.SearchResultBean;
import java.util.Map;

public class IContracts {
  public interface IView {
    void onResponse(SearchResultBean bean);
    void onFailure(String error);
  }

  public interface IPresenter {
    void search(String authorization, String location, Map<String, String> params);
  }
}
