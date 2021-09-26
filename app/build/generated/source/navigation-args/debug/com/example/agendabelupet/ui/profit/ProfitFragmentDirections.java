package com.example.agendabelupet.ui.profit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.agendabelupet.MobileNavigationDirections;
import com.example.agendabelupet.models.entities.ItemEntity;

public class ProfitFragmentDirections {
  private ProfitFragmentDirections() {
  }

  @NonNull
  public static MobileNavigationDirections.ActionGlobalNewPlanFragment actionGlobalNewPlanFragment(
      @Nullable ItemEntity newPlanArgument) {
    return MobileNavigationDirections.actionGlobalNewPlanFragment(newPlanArgument);
  }

  @NonNull
  public static NavDirections actionGlobalFragmentAgenda() {
    return MobileNavigationDirections.actionGlobalFragmentAgenda();
  }
}
