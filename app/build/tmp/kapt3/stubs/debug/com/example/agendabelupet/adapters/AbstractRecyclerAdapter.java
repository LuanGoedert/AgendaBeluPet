package com.example.agendabelupet.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001+B+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00028\u00012\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001c\u001a\u00020\bH&\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\bH\u0016J\u0015\u0010\u001f\u001a\u00028\u00012\u0006\u0010 \u001a\u00020!H&\u00a2\u0006\u0002\u0010\"J\u001d\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00028\u00012\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\bH\u0016\u00a2\u0006\u0002\u0010*R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006,"}, d2 = {"Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter;", "T", "K", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "context", "Landroid/content/Context;", "layout", "", "onClick", "Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;", "(Landroid/content/Context;Ljava/lang/Integer;Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;)V", "value", "", "itens", "getItens", "()Ljava/util/List;", "setItens", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "getOnClick", "()Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;", "setOnClick", "(Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;)V", "abstractOnBindViewHolder", "", "viewHoleder", "item", "position", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;I)V", "getItemCount", "getViewHolder", "view", "Landroid/view/View;", "(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onBindViewHolder", "holder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onClickListener", "app_debug"})
public abstract class AbstractRecyclerAdapter<T extends java.lang.Object, K extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.RecyclerView.Adapter<K> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<T> itens;
    private final android.content.Context context = null;
    private java.lang.Integer layout;
    @org.jetbrains.annotations.Nullable()
    private com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<T> onClick;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<T> getItens() {
        return null;
    }
    
    public final void setItens(@org.jetbrains.annotations.NotNull()
    java.util.List<T> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract K getViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public K onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public abstract void abstractOnBindViewHolder(@org.jetbrains.annotations.NotNull()
    K viewHoleder, @org.jetbrains.annotations.Nullable()
    T item, int position);
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    K holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<T> getOnClick() {
        return null;
    }
    
    public final void setOnClick(@org.jetbrains.annotations.Nullable()
    com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<T> p0) {
    }
    
    public AbstractRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.LayoutRes()
    java.lang.Integer layout, @org.jetbrains.annotations.Nullable()
    com.example.agendabelupet.adapters.AbstractRecyclerAdapter.onClickListener<T> onClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\'\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\tH&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/agendabelupet/adapters/AbstractRecyclerAdapter$onClickListener;", "T", "", "onItemCLickListener", "", "view", "Landroid/view/View;", "item", "position", "", "(Landroid/view/View;Ljava/lang/Object;I)V", "app_debug"})
    public static abstract interface onClickListener<T extends java.lang.Object> {
        
        public abstract void onItemCLickListener(@org.jetbrains.annotations.Nullable()
        android.view.View view, T item, int position);
    }
}