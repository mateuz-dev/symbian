package com.example.symbian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.symbian.model.User;
import com.example.symbian.remote.APIUtils;
import com.example.symbian.remote.RouterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextLastName;
    EditText editTextEmail;
    EditText editTextPhone;
    EditText editTextPassword;

    Button buttonCreateAccount;

    RouterInterface routerInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        editTextName = findViewById(R.id.edit_text_name);
        editTextLastName = findViewById(R.id.edit_text_last_name);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextPhone = findViewById(R.id.edit_text_phone);
        editTextPassword = findViewById(R.id.edit_text_password);

        buttonCreateAccount = findViewById(R.id.button_create_account);

        buttonCreateAccount.setOnClickListener(view -> {
            User user = new User();

            user.setName(editTextName.getText().toString());
            user.setLast_name(editTextLastName.getText().toString());
            user.setEmail(editTextEmail.getText().toString());
            user.setPhone(editTextPhone.getText().toString());
            user.setPassword(editTextPassword.getText().toString());

            routerInterface = APIUtils.symbianInterface();
            createUser(user);
        });
    }


    public void createUser(User user){

        Call<User> call = routerInterface.createUser(user);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Toast.makeText(MainActivity.this,
                        "USUÁRIO INSERIDO COM SUCESSO",
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.d("ERRO-API", t.getMessage());
            }
        });
    }
}