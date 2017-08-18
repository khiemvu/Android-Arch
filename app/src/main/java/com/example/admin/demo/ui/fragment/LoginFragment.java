package com.example.admin.demo.ui.fragment;

import android.arch.lifecycle.LifecycleFragment;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import com.example.admin.demo.R;
import com.example.admin.demo.repository.dto.LoginInfoDTO;
import com.example.admin.demo.repository.dto.UserDTO;
import com.example.admin.demo.ui.adapter.AccountListAdapter;
import com.example.admin.demo.ui.viewmodel.LoginViewModel;
import io.reactivex.disposables.CompositeDisposable;

import java.util.List;

/**
 * Created by admin on 8/15/2017.
 */

public class LoginFragment extends LifecycleFragment
{
    public static final String TAG = "LOGIN_FRAGMENT";
    LoginViewModel loginViewModel;
    EditText etEmail, etPassword;
    ListView lvContent;
    Button btLogin;
    TelephonyManager telephonyManager;
    LiveData<List<UserDTO>> userDTOs;
    AccountListAdapter accountListAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
//        getAppComponent().inject(this);
        View view = inflater.inflate(R.layout.activity_login, container, false);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);

        this.telephonyManager = (TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE);
        etEmail = (EditText) view.findViewById(R.id.email);
        etPassword = (EditText) view.findViewById(R.id.password);
        lvContent = (ListView) view.findViewById(R.id.lvContent);
        btLogin = (Button) view.findViewById(R.id.email_sign_in_button);

        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                loginViewModel.setLoginInfoDTO(new LoginInfoDTO().createLoginInfoDTO(etEmail.getText().toString(), etPassword.getText().toString(),
                        Build.SERIAL, "Samsung galaxy S5"));
                loginViewModel.doLogin(loginViewModel.getLoginInfoDTO());
            }
        });

        loginViewModel.loadUsers().observe(this, new Observer<List<UserDTO>>()
        {
            @Override
            public void onChanged(@Nullable List<UserDTO> userList)
            {
//                if (accountListAdapter == null)
//                {
                accountListAdapter = new AccountListAdapter(loginViewModel.getApplication(), userList);
                lvContent.setAdapter(accountListAdapter);
//                }
//                else
//                {
//                    accountListAdapter.notifyDataSetChanged();
//                }
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

    }

}
