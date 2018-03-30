package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.support.v4.util.Pair;
import android.test.ApplicationTestCase;
import android.text.TextUtils;


/**
 * Created by User on 17/10/2017.
 */
public class EndpointsAsyncTaskTest extends ApplicationTestCase<Application> {

    String mJsonString = null;
    Exception mError = null;

    public EndpointsAsyncTaskTest() {

        super(Application.class);
    }



    public void test() throws InterruptedException {

        EndpointsAsyncTask task = new EndpointsAsyncTask();

        //noinspection unchecked
        task.setListener(new EndpointsAsyncTask.JsonGetTaskListener() {
            @Override
            public void onComplete(String jsonString, Exception e) {
                mJsonString = jsonString;
                mError = e;


            }
        }).execute(new Pair<Context, String>(getContext()," "));

        assertNull(mError);
        assertTrue(TextUtils.isEmpty(mJsonString));
        assertTrue(TextUtils.equals(mJsonString,null));
        assertNull("result is null", mJsonString);


    }

}