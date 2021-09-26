package com.example.agendabelupet.ui.collected;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.example.agendabelupet.MobileNavigationDirections;
import com.example.agendabelupet.R;
import com.example.agendabelupet.models.entities.ItemEntity;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class CollectedItemsFragmentDirections {
  private CollectedItemsFragmentDirections() {
  }

  @NonNull
  public static ActionCollectedItemsFragmentToDogListFragment actionCollectedItemsFragmentToDogListFragment(
      @NonNull ItemEntity ItemEntity) {
    return new ActionCollectedItemsFragmentToDogListFragment(ItemEntity);
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

  public static class ActionCollectedItemsFragmentToDogListFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionCollectedItemsFragmentToDogListFragment(@NonNull ItemEntity ItemEntity) {
      if (ItemEntity == null) {
        throw new IllegalArgumentException("Argument \"ItemEntity\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("ItemEntity", ItemEntity);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionCollectedItemsFragmentToDogListFragment setItemEntity(
        @NonNull ItemEntity ItemEntity) {
      if (ItemEntity == null) {
        throw new IllegalArgumentException("Argument \"ItemEntity\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("ItemEntity", ItemEntity);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("ItemEntity")) {
        ItemEntity ItemEntity = (ItemEntity) arguments.get("ItemEntity");
        if (Parcelable.class.isAssignableFrom(ItemEntity.class) || ItemEntity == null) {
          __result.putParcelable("ItemEntity", Parcelable.class.cast(ItemEntity));
        } else if (Serializable.class.isAssignableFrom(ItemEntity.class)) {
          __result.putSerializable("ItemEntity", Serializable.class.cast(ItemEntity));
        } else {
          throw new UnsupportedOperationException(ItemEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_collectedItemsFragment_to_dogListFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ItemEntity getItemEntity() {
      return (ItemEntity) arguments.get("ItemEntity");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionCollectedItemsFragmentToDogListFragment that = (ActionCollectedItemsFragmentToDogListFragment) object;
      if (arguments.containsKey("ItemEntity") != that.arguments.containsKey("ItemEntity")) {
        return false;
      }
      if (getItemEntity() != null ? !getItemEntity().equals(that.getItemEntity()) : that.getItemEntity() != null) {
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
      result = 31 * result + (getItemEntity() != null ? getItemEntity().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionCollectedItemsFragmentToDogListFragment(actionId=" + getActionId() + "){"
          + "ItemEntity=" + getItemEntity()
          + "}";
    }
  }
}
