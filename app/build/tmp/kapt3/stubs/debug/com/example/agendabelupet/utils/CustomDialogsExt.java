package com.example.agendabelupet.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011JM\u0010\u0012\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/agendabelupet/utils/CustomDialogsExt;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "dialog", "Landroid/app/AlertDialog;", "defaultDialog", "", "title", "", "image", "isCancelable", "", "onPositive", "Lkotlin/Function0;", "defaultDialogTwoOptions", "message", "onNegative", "(Ljava/lang/Integer;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "dismissCustomFragment", "startProgressBar", "app_debug"})
public final class CustomDialogsExt {
    private android.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull()
    private final android.app.Activity activity = null;
    
    public final void defaultDialog(int title, int image, boolean isCancelable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositive) {
    }
    
    public final void startProgressBar() {
    }
    
    public final void dismissCustomFragment() {
    }
    
    public final void defaultDialogTwoOptions(@org.jetbrains.annotations.Nullable()
    java.lang.Integer title, int message, int image, boolean isCancelable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPositive, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNegative) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getActivity() {
        return null;
    }
    
    public CustomDialogsExt(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
}