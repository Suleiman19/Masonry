package com.grafixartist.masonry;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Suleiman on 26-07-2015.
 */
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private final int mSpace;

    public SpacesItemDecoration(int space) {
        this.mSpace = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) < 2)
            outRect.top = mSpace;
    }
}
