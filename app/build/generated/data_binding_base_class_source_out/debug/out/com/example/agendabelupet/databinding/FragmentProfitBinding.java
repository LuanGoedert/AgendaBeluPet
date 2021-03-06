// Generated by data binding compiler. Do not edit!
package com.example.agendabelupet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.agendabelupet.R;
import com.example.agendabelupet.ui.profit.ProfitViewModel;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfitBinding extends ViewDataBinding {
  @NonNull
  public final PieChart barTeste;

  @Bindable
  protected ProfitViewModel mViewModel;

  protected FragmentProfitBinding(Object _bindingComponent, View _root, int _localFieldCount,
      PieChart barTeste) {
    super(_bindingComponent, _root, _localFieldCount);
    this.barTeste = barTeste;
  }

  public abstract void setViewModel(@Nullable ProfitViewModel viewModel);

  @Nullable
  public ProfitViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentProfitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profit, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfitBinding>inflateInternal(inflater, R.layout.fragment_profit, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profit, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfitBinding>inflateInternal(inflater, R.layout.fragment_profit, null, false, component);
  }

  public static FragmentProfitBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentProfitBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfitBinding)bind(component, view, R.layout.fragment_profit);
  }
}
