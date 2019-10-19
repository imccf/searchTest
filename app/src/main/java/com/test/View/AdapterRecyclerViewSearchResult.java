package com.test.View;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.test.Contracts.IContracts;
import com.test.Module.SearchResultBean;
import com.test.R;
import java.util.ArrayList;
import java.util.List;

public class AdapterRecyclerViewSearchResult
    extends RecyclerView.Adapter<AdapterRecyclerViewSearchResult.MyViewHolder> {

  public static final String TAG = "AdapterRecyclerViewSearchResult";
  List<SearchResultBean.BusinessesBean> list;
  IContracts.IView iView;
  private Context context;

  public AdapterRecyclerViewSearchResult(Context context, IContracts.IView iView) {
    this.context = context;
    this.iView = iView;
  }

  public void setData(List<SearchResultBean.BusinessesBean> businessesBeanList) {
    if (list == null) {
      list = new ArrayList<>();
    }
    list.clear();
    list.addAll(businessesBeanList);
  }

  @Override
  public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
        context).inflate(R.layout.list_item_layout, parent,
        false));
    return holder;
  }

  @Override
  public void onBindViewHolder(final MyViewHolder holder, final int position) {
    holder.address.setText(list.get(position).getLocation().getAddress1());
    holder.businessName.setText(list.get(position).getName());
    holder.reviewCount.setText(String.valueOf(list.get(position).getReview_count()));
    holder.phoneNum.setText(list.get(position).getPhone());
  }

  @Override
  public int getItemCount() {
    if (list != null) {
      return list.size();
    } else {
      return 0;
    }
  }

  class MyViewHolder extends RecyclerView.ViewHolder {
    TextView businessName;
    TextView address;
    TextView reviewCount;
    TextView phoneNum;

    public MyViewHolder(View itemView) {
      super(itemView);
      businessName = itemView.findViewById(R.id.business_name);
      address = itemView.findViewById(R.id.address);
      reviewCount = itemView.findViewById(R.id.review_count);
      phoneNum = itemView.findViewById(R.id.phoneNum);
    }
  }
}
