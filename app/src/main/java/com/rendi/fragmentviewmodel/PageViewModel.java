package com.rendi.fragmentviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PageViewModel extends ViewModel {
    /**
     * Live Data Instance
     */
    private MutableLiveData<String> mName = new MutableLiveData<>();
    private MutableLiveData<String> mAlamat = new MutableLiveData<>();
    private MutableLiveData<String> mTlp = new MutableLiveData<>();
    private MutableLiveData<String> mSize = new MutableLiveData<>();

    public void setName(String name) {
        mName.setValue(name);
    }
    public LiveData<String> getName() {
        return mName;
    }
    // Alamat
    public void setAlamat(String name) {
        mAlamat.setValue(name);
    }
    public LiveData<String> getAlamat() {
        return mAlamat;
    }
    // Tlp
    public void setTlp(String name) {
        mTlp.setValue(name);
    }
    public LiveData<String> getTlp() {
        return mTlp;
    }
    // Size
    public void setSize(String name) {
        mSize.setValue(name);
    }
    public LiveData<String> getSize() {
        return mSize;
    }
}