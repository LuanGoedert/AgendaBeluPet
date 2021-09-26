package com.example.agendabelupet.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/example/agendabelupet/adapters/WeekDaysAdapter;", "Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter;", "Lcom/example/agendabelupet/models/entities/WeekDaysModel;", "Lcom/example/agendabelupet/adapters/WeekDaysAdapter$ViewHolder;", "activity", "Landroid/app/Activity;", "itensList", "", "onItemClickListener", "Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;", "(Landroid/app/Activity;Ljava/util/List;Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;)V", "abstractOnBindViewHolder", "", "viewHoleder", "item", "position", "", "getViewHolder", "view", "Landroid/view/View;", "ViewHolder", "app_debug"})
public final class WeekDaysAdapter extends com.example.agendabelupet.adapters.AbstractRecyclerAdapter<com.example.agendabelupet.models.entities.WeekDaysModel, com.example.agendabelupet.adapters.WeekDaysAdapter.ViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.agendabelupet.adapters.WeekDaysAdapter.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void abstractOnBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.adapters.WeekDaysAdapter.ViewHolder viewHoleder, @org.jetbrains.annotations.Nullable()
    com.example.agendabelupet.models.entities.WeekDaysModel item, int position) {
    }
    
    public WeekDaysAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.agendabelupet.models.entities.WeekDaysModel> itensList, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<com.example.agendabelupet.models.entities.WeekDaysModel> onItemClickListener) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/agendabelupet/adapters/WeekDaysAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/agendabelupet/adapters/WeekDaysAdapter;Landroid/view/View;)V", "weekday", "Landroid/widget/TextView;", "getWeekday", "()Landroid/widget/TextView;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView weekday = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getWeekday() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}