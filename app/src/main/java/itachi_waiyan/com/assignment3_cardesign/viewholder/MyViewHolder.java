package itachi_waiyan.com.assignment3_cardesign.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import itachi_waiyan.com.assignment3_cardesign.delegate.EventItemDelegate;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private EventItemDelegate mEventItemDelegate;
    public MyViewHolder(@NonNull View itemView,EventItemDelegate eventItemDelegate) {
        super(itemView);
        this.mEventItemDelegate = eventItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEventItemDelegate.onTapEventItem();
            }
        });
    }
}
