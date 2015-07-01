package com.russiancasetester.russiancasetester;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Azmat on 23/06/2015.
 */
public class RetrieveNouns {

    final StringBuffer storedString = new StringBuffer();
    String strLine = null;
    private Context context;
    private InputStream is;


    public RetrieveNouns(final Context context) {
        this.context = context;
    }

    public void retrieve() {
        InputStream is = null;
        try {
            is = context.getAssets().open("nouns.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            String strLine = new String(buffer);
            System.out.println(strLine.substring(0, 8));
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getStrLine() {
        return strLine;
    }
}
