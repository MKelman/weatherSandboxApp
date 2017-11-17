package com.sandbox.mitchellkelman.javasandbox;


import android.os.Bundle;

public interface ViewModel {
    public void resume();
    public void pause();
    public void restoreInstanceState(Bundle savedInstanceState);
    public void saveInstanceState(Bundle outState);
}
