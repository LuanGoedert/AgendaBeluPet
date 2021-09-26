package com.example.agendabelupet.ui.newPlan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.agendabelupet.MobileNavigationDirections;
import com.example.agendabelupet.R;
import com.example.agendabelupet.models.entities.ItemEntity;

public class NewPlanFragmentDirections {
  private NewPlanFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNavigationDashboardToFragmentAgenda() {
    return new ActionOnlyNavDirections(R.id.action_navigation_dashboard_to_fragment_agenda);
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
