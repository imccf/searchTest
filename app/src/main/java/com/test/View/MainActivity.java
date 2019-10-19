package com.test.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.test.Contracts.IContracts;
import com.test.Module.SearchResultBean;
import com.test.Presenter.SearchPresenter;
import com.test.R;
import com.test.Util.Global;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements IContracts.IView {

  SearchPresenter searchPresenter;
  private AdapterRecyclerViewSearchResult adapterRecyclerViewMall;
  private RecyclerView recyclerViewList;
  private Button searchButton;
  private LinearLayoutManager mLayoutManager;
  private EditText findEdit;
  private EditText locationEdit;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    searchPresenter = new SearchPresenter(this);
    recyclerViewList = findViewById(R.id.list_view);
    findEdit = findViewById(R.id.findEdit);
    locationEdit = findViewById(R.id.locationEdit);
    searchButton = findViewById(R.id.search);
    searchButton.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        search();
      }
    });
    mLayoutManager = new LinearLayoutManager(this);
    recyclerViewList.setLayoutManager(mLayoutManager);
    adapterRecyclerViewMall = new AdapterRecyclerViewSearchResult(this, this);
    recyclerViewList.setAdapter(adapterRecyclerViewMall);
  }

  @Override public void onResponse(SearchResultBean bean) {
    if (bean != null && bean.getBusinesses() != null) {
      adapterRecyclerViewMall.setData(bean.getBusinesses());
      adapterRecyclerViewMall.notifyDataSetChanged();
    } else {
      Toast.makeText(this, "No data!", Toast.LENGTH_SHORT).show();
    }
  }
  @Override public void onFailure(String error) {
    Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
  }

  void search() {
    if (!(locationEdit.getText().toString().equals(null)
        || findEdit.getText().toString().equals(null))) {
      String authorization = "Bearer " + Global.apiKey;
      Map<String, String> params = new HashMap<>();
      params.put("term", findEdit.getText().toString());
      searchPresenter.search(authorization, locationEdit.getText().toString(), params);
    } else {
      Toast.makeText(this, "Please input something!", Toast.LENGTH_SHORT).show();
    }
  }
}
