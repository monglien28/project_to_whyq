package com.bawp.showmyname;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;

import java.util.ArrayList;

//public class Controller {
//    ArrayList<Dataclass> DataList = new ArrayList<>();
//
//    String url = "http://stores.staging.whyq.sg/hawker_litev2/user/signup";
//
//    void getQuestions() {
//
//        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET,
//                url, null, response -> {
//            for (int i = 0; i < response.length(); i++) {
//
//                try {
//                    Dataclass dataclass = new Dataclass();
//                    dataclass.setStatus(String.valueOf(response.getJSONObject("status")));
//                    dataclass.setOTP(String.valueOf(response.getJSONObject("otp")));
//
//                    //Add questions to arraylist/list
//                    DataList.add(dataclass);
//
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//
//
//        }, error -> {
//
//        });
//
//
//    }
//
//}
