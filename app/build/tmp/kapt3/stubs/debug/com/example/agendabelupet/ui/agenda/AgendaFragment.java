package com.example.agendabelupet.ui.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\"\u001a\u00020\u0012H\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001d2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lcom/example/agendabelupet/ui/agenda/AgendaFragment;", "Landroidx/fragment/app/Fragment;", "()V", "abstractRecyclerAdapter", "Lcom/example/agendabelupet/adapters/DogListAdapter;", "binding", "Lcom/example/agendabelupet/databinding/FragmentAgendaBinding;", "customDialogsExt", "Lcom/example/agendabelupet/utils/CustomDialogsExt;", "navController", "Landroidx/navigation/NavController;", "viewModel", "Lcom/example/agendabelupet/ui/agenda/AgendaViewModel;", "getViewModel", "()Lcom/example/agendabelupet/ui/agenda/AgendaViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "iniciaRecyclerView", "", "listaItens", "", "Lcom/example/agendabelupet/models/entities/ItemEntity;", "navigateToNewPlanFragment", "item", "navigateToScreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class AgendaFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.agendabelupet.adapters.DogListAdapter abstractRecyclerAdapter;
    private com.example.agendabelupet.databinding.FragmentAgendaBinding binding;
    private androidx.navigation.NavController navController;
    private com.example.agendabelupet.utils.CustomDialogsExt customDialogsExt;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.agendabelupet.ui.agenda.AgendaViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void iniciaRecyclerView(java.util.List<com.example.agendabelupet.models.entities.ItemEntity> listaItens) {
    }
    
    private final void navigateToScreen(com.example.agendabelupet.models.entities.ItemEntity item) {
    }
    
    private final void navigateToNewPlanFragment(com.example.agendabelupet.models.entities.ItemEntity item) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public AgendaFragment() {
        super();
    }
}