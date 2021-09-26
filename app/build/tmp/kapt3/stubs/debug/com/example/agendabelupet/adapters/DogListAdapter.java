package com.example.agendabelupet.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u00a2\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a8\u0006\u0015"}, d2 = {"Lcom/example/agendabelupet/adapters/DogListAdapter;", "Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter;", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "Lcom/example/agendabelupet/adapters/DogListAdapter$ViewHolder;", "activity", "Landroid/app/Activity;", "itensList", "", "onItemClickListener", "Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;", "(Landroid/app/Activity;Ljava/util/List;Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;)V", "abstractOnBindViewHolder", "", "viewHolder", "item", "position", "", "getViewHolder", "view", "Landroid/view/View;", "ViewHolder", "app_debug"})
public final class DogListAdapter extends com.example.agendabelupet.adapters.AbstractRecyclerAdapter<com.example.agendabelupet.models.entities.ItemEntity, com.example.agendabelupet.adapters.DogListAdapter.ViewHolder> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.agendabelupet.adapters.DogListAdapter.ViewHolder getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public void abstractOnBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.adapters.DogListAdapter.ViewHolder viewHolder, @org.jetbrains.annotations.Nullable()
    com.example.agendabelupet.models.entities.ItemEntity item, int position) {
    }
    
    public DogListAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.agendabelupet.models.entities.ItemEntity> itensList, @org.jetbrains.annotations.NotNull()
    com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<com.example.agendabelupet.models.entities.ItemEntity> onItemClickListener) {
        super(null, null, null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/agendabelupet/adapters/DogListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/example/agendabelupet/adapters/DogListAdapter;Landroid/view/View;)V", "petDistrict", "Landroid/widget/TextView;", "getPetDistrict", "()Landroid/widget/TextView;", "petHouseNumber", "getPetHouseNumber", "petName", "getPetName", "petRace", "getPetRace", "petStreet", "getPetStreet", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView petName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView petRace = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView petStreet = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView petDistrict = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView petHouseNumber = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPetName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPetRace() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPetStreet() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPetDistrict() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPetHouseNumber() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}