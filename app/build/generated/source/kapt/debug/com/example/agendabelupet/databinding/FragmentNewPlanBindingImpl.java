package com.example.agendabelupet.databinding;
import com.example.agendabelupet.R;
import com.example.agendabelupet.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewPlanBindingImpl extends FragmentNewPlanBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scroll_view, 2);
        sViewsWithIds.put(R.id.input_owner_name, 3);
        sViewsWithIds.put(R.id.edit_text_name_owner, 4);
        sViewsWithIds.put(R.id.input_name, 5);
        sViewsWithIds.put(R.id.edit_text_name, 6);
        sViewsWithIds.put(R.id.raca, 7);
        sViewsWithIds.put(R.id.text_raca, 8);
        sViewsWithIds.put(R.id.address_text, 9);
        sViewsWithIds.put(R.id.text_endereco, 10);
        sViewsWithIds.put(R.id.district_text, 11);
        sViewsWithIds.put(R.id.text_district, 12);
        sViewsWithIds.put(R.id.house_number_text, 13);
        sViewsWithIds.put(R.id.text_house_number, 14);
        sViewsWithIds.put(R.id.phone_text, 15);
        sViewsWithIds.put(R.id.text_telephone, 16);
        sViewsWithIds.put(R.id.text_week_day, 17);
        sViewsWithIds.put(R.id.plan_text, 18);
        sViewsWithIds.put(R.id.value_text, 19);
        sViewsWithIds.put(R.id.text_value, 20);
        sViewsWithIds.put(R.id.button_save_item, 21);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewPlanBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentNewPlanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (android.widget.Button) bindings[21]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (android.widget.ScrollView) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[12]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (com.google.android.material.textfield.TextInputEditText) bindings[14]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[16]
            , (com.google.android.material.textfield.TextInputEditText) bindings[20]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.valueDatePicker.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.agendabelupet.ui.newPlan.NewPlanViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.agendabelupet.ui.newPlan.NewPlanViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsbiweekly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsbiweekly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsbiweekly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsbiweekly = null;
        java.lang.Boolean viewModelIsbiweeklyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsbiweeklyGetValue = false;
        com.example.agendabelupet.ui.newPlan.NewPlanViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isbiweekly
                    viewModelIsbiweekly = viewModel.getIsbiweekly();
                }
                updateLiveDataRegistration(0, viewModelIsbiweekly);


                if (viewModelIsbiweekly != null) {
                    // read viewModel.isbiweekly.getValue()
                    viewModelIsbiweeklyGetValue = viewModelIsbiweekly.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isbiweekly.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsbiweeklyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsbiweeklyGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.valueDatePicker.setClickable(androidxDatabindingViewDataBindingSafeUnboxViewModelIsbiweeklyGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isbiweekly
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}