package itachi_waiyan.com.assignment3_cardesign.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import itachi_waiyan.com.assignment3_cardesign.R;
import itachi_waiyan.com.assignment3_cardesign.delegate.EventItemDelegate;
import itachi_waiyan.com.assignment3_cardesign.viewholder.MyViewHolder;

public class RvAdapter extends RecyclerView.Adapter {
    EventItemDelegate mEventItemDelegate;

    public RvAdapter(EventItemDelegate eventItemDelegate){
        mEventItemDelegate = eventItemDelegate;
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item_view,viewGroup,false);
        return new MyViewHolder(itemView,mEventItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 7;
    }
}
