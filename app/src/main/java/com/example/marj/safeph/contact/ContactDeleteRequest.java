package com.example.marj.safeph.contact;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Marj on 4/2/2018.
 */

public class ContactDeleteRequest extends StringRequest{
    private static final String CONTACT_DELETE_REQUEST_URL = "https://ixuriz.000webhostapp.com/deletecontact.php";
    private Map<String, String> params;

    public ContactDeleteRequest(String username,String name,String phone,String relation,Response.Listener<String> listener){
        super(Request.Method.POST, CONTACT_DELETE_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username",username);
        params.put("name",name);
        params.put("phone",phone);
        params.put("relation",relation);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
