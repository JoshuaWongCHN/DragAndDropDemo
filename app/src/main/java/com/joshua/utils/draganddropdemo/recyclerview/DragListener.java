package com.joshua.utils.draganddropdemo.recyclerview;

public interface DragListener {

     public static final int NO_ID = -1;

    /**
     * Called when item is moved. Should apply the move operation result to data set.
     *
     * @param fromPosition Previous position of the item.
     * @param toPosition   New position of the item.
     * @return return true if the data change successfully
     */
    boolean onMoveItem(int fromPosition, int toPosition);

    void notifyItemChange(int position, int dragItemId);

    int getPosition(Object object);

    void onDragEnd(int position);
}
