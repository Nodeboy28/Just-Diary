package com.example.sudipto.justdiary;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.CalendarView;

/**
 * Created by ganesh on 6/10/2017.
 */

public class CalendarActivity extends AppBaseActivity {

    private  static final String TAG = "CalendarActivity";
    private CalendarView mCalendarView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_view);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

    }
}