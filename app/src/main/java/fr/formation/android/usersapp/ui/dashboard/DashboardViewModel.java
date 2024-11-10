package fr.formation.android.usersapp.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<Integer> mInt;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
        mInt = new MutableLiveData<>();
        mInt.setValue(100);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<Integer> getInt() { return mInt;}

    public void setIn(Integer newInt) {
        mInt.setValue(newInt);
    }



}