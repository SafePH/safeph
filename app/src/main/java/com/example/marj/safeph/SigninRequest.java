package com.example.marj.safeph;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marj on 3/12/2018.
 */

public class SigninRequest extends StringRequest {
    private static final String SIGNIN_REQUEST_URL = "https://ixuriz.000webhostapp.com/Signin.php";
    private Map<String, String> params;

    public SigninRequest(String username, String password, Response.Listener<String> listener){
        super(Method.POST, SIGNIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username",username);
        params.put("password",password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
