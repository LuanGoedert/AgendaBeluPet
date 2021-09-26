package com.example.agendabelupet.ui.newPlan;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import com.example.agendabelupet.models.entities.ItemEntity;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NewPlanFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private NewPlanFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private NewPlanFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static NewPlanFragmentArgs fromBundle(@NonNull Bundle bundle) {
    NewPlanFragmentArgs __result = new NewPlanFragmentArgs();
    bundle.setClassLoader(NewPlanFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("newPlanArgument")) {
      ItemEntity newPlanArgument;
      if (Parcelable.class.isAssignableFrom(ItemEntity.class) || Serializable.class.isAssignableFrom(ItemEntity.class)) {
        newPlanArgument = (ItemEntity) bundle.get("newPlanArgument");
      } else {
        throw new UnsupportedOperationException(ItemEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("newPlanArgument", newPlanArgument);
    } else {
      throw new IllegalArgumentException("Required argument \"newPlanArgument\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public ItemEntity getNewPlanArgument() {
    return (ItemEntity) arguments.get("newPlanArgument");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    NewPlanFragmentArgs that = (NewPlanFragmentArgs) object;
    if (arguments.containsKey("newPlanArgument") != that.arguments.containsKey("newPlanArgument")) {
      return false;
    }
    if (getNewPlanArgument() != null ? !getNewPlanArgument().equals(that.getNewPlanArgument()) : that.getNewPlanArgument() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getNewPlanArgument() != null ? getNewPlanArgument().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "NewPlanFragmentArgs{"
        + "newPlanArgument=" + getNewPlanArgument()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(NewPlanFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@Nullable ItemEntity newPlanArgument) {
      this.arguments.put("newPlanArgument", newPlanArgument);
    }

    @NonNull
    public NewPlanFragmentArgs build() {
      NewPlanFragmentArgs result = new NewPlanFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setNewPlanArgument(@Nullable ItemEntity newPlanArgument) {
      this.arguments.put("newPlanArgument", newPlanArgument);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public ItemEntity getNewPlanArgument() {
      return (ItemEntity) arguments.get("newPlanArgument");
    }
  }
}
