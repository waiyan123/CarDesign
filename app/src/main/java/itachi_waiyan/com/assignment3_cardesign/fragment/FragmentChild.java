package itachi_waiyan.com.assignment3_cardesign.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import itachi_waiyan.com.assignment3_cardesign.CarDetailActivity;
import itachi_waiyan.com.assignment3_cardesign.R;
import itachi_waiyan.com.assignment3_cardesign.adapter.RvAdapter;
import itachi_waiyan.com.assignment3_cardesign.delegate.EventItemDelegate;

public class FragmentChild extends Fragment {

    EventItemDelegate mEventItemDelegate;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment,container,false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        RecyclerView rv = rootView.findViewById(R.id.rv);
        mEventItemDelegate = new EventItemDelegate() {
            @Override
            public void onTapEventItem() {
                startActivity(new Intent(getActivity(), CarDetailActivity.class));
            }
        };
        RvAdapter rvAdapter = new RvAdapter(mEventItemDelegate);
        rv.setAdapter(rvAdapter);
        rv.setLayoutManager(linearLayoutManager);
        return rootView;
    }
}
