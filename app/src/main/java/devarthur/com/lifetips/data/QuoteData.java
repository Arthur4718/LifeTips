package devarthur.com.lifetips.data;

//Fetch all data from the Json Object.

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import devarthur.com.lifetips.controller.AppController;
import devarthur.com.lifetips.model.QuoteModel;

public class QuoteData {

    ArrayList<QuoteData> quoteDataArrayList = new ArrayList<>();

    public void getQuotes(){
        String url = "https://raw.githubusercontent.com/pdichone/UIUX-Android-Course/master/Quotes.json%20";

        JsonArrayRequest jsonObjectRequest = new JsonArrayRequest
                (Request.Method.GET, url, new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {
                        for(int i = 0; i < response.length(); i++){

                            try {
                                JSONObject quoteObject = response.getJSONObject(i);
                                QuoteModel quote = new QuoteModel();
                                quote.setQuote(quoteObject.getString("quote"));
                                quote.setAuthor(quoteObject.getString("name"));

                                Log.d("LipeApp", "Request Json sucessfull!");
                                Log.d("json", "response: " + quoteObject.getString("name"));

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // TODO: Handle error

                    }
                });

        AppController.getmInstance().addToRequestQueue(jsonObjectRequest);
    }

}
