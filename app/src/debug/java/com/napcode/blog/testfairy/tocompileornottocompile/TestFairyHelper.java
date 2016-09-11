package com.napcode.blog.testfairy.tocompileornottocompile;

import android.content.Context;
import com.testfairy.TestFairy;

public class TestFairyHelper {

    public static void begin(Context context) {
        TestFairy.begin(context, "MY_ID");
    }
}
