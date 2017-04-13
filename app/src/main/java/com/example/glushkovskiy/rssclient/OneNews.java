package com.example.glushkovskiy.rssclient;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import android.view.*;

public class OneNews extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_news_activity);

        RSSNews selectedRssItem = MainActivity.selectedRssItem;
        //Bundle extras = getIntent().getExtras();
        TextView titleTv = (TextView)findViewById(R.id.titleTextView);
        TextView contentTv = (TextView)findViewById(R.id.contentTextView);

        String title = "";
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd - hh:mm:ss");
        title = "\n" + selectedRssItem.getTitle() + "  ( "
                + sdf.format(selectedRssItem.getPubDate()) + " )\n\n";

        String content = "";
        content += selectedRssItem.getDescription() + "\n"
                + selectedRssItem.getLink();

        titleTv.setText(title);
        contentTv.setText(content);
    }
}
