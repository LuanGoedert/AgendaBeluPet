package com.example.agendabelupet;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.agendabelupet.databinding.FragmentAgendaBindingImpl;
import com.example.agendabelupet.databinding.FragmentCollectedItemsBindingImpl;
import com.example.agendabelupet.databinding.FragmentDogListBindingImpl;
import com.example.agendabelupet.databinding.FragmentNewPlanBindingImpl;
import com.example.agendabelupet.databinding.FragmentProfitBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTAGENDA = 1;

  private static final int LAYOUT_FRAGMENTCOLLECTEDITEMS = 2;

  private static final int LAYOUT_FRAGMENTDOGLIST = 3;

  private static final int LAYOUT_FRAGMENTNEWPLAN = 4;

  private static final int LAYOUT_FRAGMENTPROFIT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agendabelupet.R.layout.fragment_agenda, LAYOUT_FRAGMENTAGENDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agendabelupet.R.layout.fragment_collected_items, LAYOUT_FRAGMENTCOLLECTEDITEMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agendabelupet.R.layout.fragment_dog_list, LAYOUT_FRAGMENTDOGLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agendabelupet.R.layout.fragment_new_plan, LAYOUT_FRAGMENTNEWPLAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.agendabelupet.R.layout.fragment_profit, LAYOUT_FRAGMENTPROFIT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTAGENDA: {
          if ("layout/fragment_agenda_0".equals(tag)) {
            return new FragmentAgendaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_agenda is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCOLLECTEDITEMS: {
          if ("layout/fragment_collected_items_0".equals(tag)) {
            return new FragmentCollectedItemsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_collected_items is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDOGLIST: {
          if ("layout/fragment_dog_list_0".equals(tag)) {
            return new FragmentDogListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dog_list is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWPLAN: {
          if ("layout/fragment_new_plan_0".equals(tag)) {
            return new FragmentNewPlanBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_plan is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFIT: {
          if ("layout/fragment_profit_0".equals(tag)) {
            return new FragmentProfitBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profit is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/fragment_agenda_0", com.example.agendabelupet.R.layout.fragment_agenda);
      sKeys.put("layout/fragment_collected_items_0", com.example.agendabelupet.R.layout.fragment_collected_items);
      sKeys.put("layout/fragment_dog_list_0", com.example.agendabelupet.R.layout.fragment_dog_list);
      sKeys.put("layout/fragment_new_plan_0", com.example.agendabelupet.R.layout.fragment_new_plan);
      sKeys.put("layout/fragment_profit_0", com.example.agendabelupet.R.layout.fragment_profit);
    }
  }
}
