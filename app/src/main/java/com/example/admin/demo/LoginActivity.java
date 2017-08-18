package com.example.admin.demo;

import android.arch.lifecycle.LifecycleActivity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.example.admin.demo.ui.fragment.LoginFragment;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends LifecycleActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//        ServiceHelper.getInstance().create(AuthenService.class);
        // Add product list fragment if this is first creation
        if (savedInstanceState == null) {
            LoginFragment fragment = new LoginFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, fragment, LoginFragment.TAG).commit();
        }
    }
}

