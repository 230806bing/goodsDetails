package com.example.goods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Share extends Fragment {
    List<DataBean> dataBeans = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.share,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = getView().findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ShareAdapter shareAdapter = new ShareAdapter(dataBeans);
        recyclerView.setAdapter(shareAdapter);
        initData();
    }

    private void initData() {
        for (int i = 0; i<3;i++){
            DataBean dataBean1 = new DataBean(R.drawable.image,"A用户种草分享一万字","A用户种草分享一万字A用户种草分享一万字A用户种草分享一万字A用户种草分享一万字A用户种草分享一万字A用户种草分享一万字A用户种草分享一万字");
            dataBeans.add(dataBean1);
            DataBean dataBean2 = new DataBean(R.drawable.image,"B用户种草分享一万字","B用户种草分享一万字B用户种草分享一万字B用户种草分享一万字B用户种草分享一万字B用户种草分享一万字B用户种草分享一万字B用户种草分享一万字");
            dataBeans.add(dataBean2);
            DataBean dataBean3 = new DataBean(R.drawable.image,"C用户种草分享一万字","C用户种草分享一万字C用户种草分享一万字C用户种草分享一万字C用户种草分享一万字C用户种草分享一万字C用户种草分享一万字C用户种草分享一万字");
            dataBeans.add(dataBean3);
        }
    }
}
