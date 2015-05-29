package com.ryanbrooks.expandablerecyclerviewsample;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ryanbrooks.expandablerecyclerview.ClickListeners.ParentItemClickListener;
import com.ryanbrooks.expandablerecyclerview.ViewHolder.ParentViewHolder;


/**
 * Created by Ryan Brooks on 5/20/15.
 */
public class CustomParentViewHolder extends ParentViewHolder {

    public TextView numberText, dataText;
    public ImageButton arrowExpand;

    public CustomParentViewHolder(View itemView, ParentItemClickListener parentItemClickListener) {
        super(itemView, parentItemClickListener);

        numberText = (TextView) itemView.findViewById(R.id.recycler_item_number_parent);
        dataText = (TextView) itemView.findViewById(R.id.recycler_item_text_parent);
        arrowExpand = (ImageButton) itemView.findViewById(R.id.recycler_item_arrow_parent);
        setCustomClickableView(arrowExpand);
    }

    @Override
    public void setCustomClickableView(View clickableView) {
        super.setCustomClickableView(clickableView);
    }
}
