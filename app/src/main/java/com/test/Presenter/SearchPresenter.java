package com.test.Presenter;

import com.test.Contracts.IContracts;
import com.test.Module.SearchResultBean;
import com.test.Util.NetWork;
import java.util.Map;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchPresenter implements IContracts.IPresenter {
  IContracts.IView iView;
  public SearchPresenter(IContracts.IView iView) {
    this.iView = iView;
  }
  /**
   * Search API
   *
   * @param authorization Authorization string.
   * @param location Any location string
   * @param params Key, value pairs as search API params.
   * @return void.
   */
  @Override public void search(String authorization, String location, Map<String, String> params) {
    Call<SearchResultBean> result = NetWork.search().search(authorization, location, params);
    result.enqueue(new Callback<SearchResultBean>() {
      @Override
      public void onResponse(Call<SearchResultBean> call, Response<SearchResultBean> response) {
        iView.onResponse(response.body());
      }
      @Override public void onFailure(Call<SearchResultBean> call, Throwable t) {
        iView.onFailure(t.getMessage());
      }
    });
  }
}
