package com.example.agendabelupet.ui.dogList;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.example.agendabelupet.models.entities.ItemEntity;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DogListFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DogListFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private DogListFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DogListFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DogListFragmentArgs __result = new DogListFragmentArgs();
    bundle.setClassLoader(DogListFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("ItemEntity")) {
      ItemEntity ItemEntity;
      if (Parcelable.class.isAssignableFrom(ItemEntity.class) || Serializable.class.isAssignableFrom(ItemEntity.class)) {
        ItemEntity = (ItemEntity) bundle.get("ItemEntity");
      } else {
        throw new UnsupportedOperationException(ItemEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (ItemEntity == null) {
        throw new IllegalArgumentException("Argument \"ItemEntity\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("ItemEntity", ItemEntity);
    } else {
      throw new IllegalArgumentException("Required argument \"ItemEntity\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public ItemEntity getItemEntity() {
    return (ItemEntity) arguments.get("ItemEntity");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DogListFragmentArgs that = (DogListFragmentArgs) object;
    if (arguments.containsKey("ItemEntity") != that.arguments.containsKey("ItemEntity")) {
      return false;
    }
    if (getItemEntity() != null ? !getItemEntity().equals(that.getItemEntity()) : that.getItemEntity() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getItemEntity() != null ? getItemEntity().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DogListFragmentArgs{"
        + "ItemEntity=" + getItemEntity()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(DogListFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ItemEntity ItemEntity) {
      if (ItemEntity == null) {
        throw new IllegalArgumentException("Argument \"ItemEntity\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("ItemEntity", ItemEntity);
    }

    @NonNull
    public DogListFragmentArgs build() {
      DogListFragmentArgs result = new DogListFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setItemEntity(@NonNull ItemEntity ItemEntity) {
      if (ItemEntity == null) {
        throw new IllegalArgumentException("Argument \"ItemEntity\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("ItemEntity", ItemEntity);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public ItemEntity getItemEntity() {
      return (ItemEntity) arguments.get("ItemEntity");
    }
  }
}
