package com.example.admin.demo.repository.service;

import android.util.Log;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * Created by admin on 8/16/2017.
 */

public class LogJsonInterceptor implements Interceptor
{
    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException
    {
        Request request = chain.request();

        Response response = chain.proceed(request);
        String rawJson = response.body().string();

        Log.d("response info", String.format("raw JSON response is: %s", rawJson));

        // Re-create the response before returning it because body can be read only once
        return response.newBuilder()
                .body(ResponseBody.create(response.body().contentType(), rawJson)).build();
    }
}
