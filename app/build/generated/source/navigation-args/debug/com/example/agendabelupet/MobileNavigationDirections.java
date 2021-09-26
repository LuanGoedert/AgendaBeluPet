package com.example.agendabelupet;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.example.agendabelupet.models.entities.ItemEntity;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MobileNavigationDirections {
  private MobileNavigationDirections() {
  }

  @NonNull
  public static ActionGlobalNewPlanFragment actionGlobalNewPlanFragment(
      @Nullable ItemEntity newPlanArgument) {
    return new ActionGlobalNewPlanFragment(newPlanArgument);
  }

  @NonNull
  public static NavDirections actionGlobalFragmentAgenda() {
    return new ActionOnlyNavDirections(R.id.action_global_fragment_agenda);
  }

  public static class ActionGlobalNewPlanFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionGlobalNewPlanFragment(@Nullable ItemEntity newPlanArgument) {
      this.arguments.put("newPlanArgument", newPlanArgument);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGlobalNewPlanFragment setNewPlanArgument(@Nullable ItemEntity newPlanArgument) {
      this.arguments.put("newPlanArgument", newPlanArgument);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("newPlanArgument")) {
        ItemEntity newPlanArgument = (ItemEntity) arguments.get("newPlanArgument");
        if (Parcelable.class.isAssignableFrom(ItemEntity.class) || newPlanArgument == null) {
          __result.putParcelable("newPlanArgument", Parcelable.class.cast(newPlanArgument));
        } else if (Serializable.class.isAssignableFrom(ItemEntity.class)) {
          __result.putSerializable("newPlanArgument", Serializable.class.cast(newPlanArgument));
        } else {
          throw new UnsupportedOperationException(ItemEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_global_new_plan_fragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public ItemEntity getNewPlanArgument() {
      return (ItemEntity) arguments.get("newPlanArgument");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGlobalNewPlanFragment that = (ActionGlobalNewPlanFragment) object;
      if (arguments.containsKey("newPlanArgument") != that.arguments.containsKey("newPlanArgument")) {
        return false;
      }
      if (getNewPlanArgument() != null ? !getNewPlanArgument().equals(that.getNewPlanArgument()) : that.getNewPlanArgument() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getNewPlanArgument() != null ? getNewPlanArgument().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGlobalNewPlanFragment(actionId=" + getActionId() + "){"
          + "newPlanArgument=" + getNewPlanArgument()
          + "}";
    }
  }
}
