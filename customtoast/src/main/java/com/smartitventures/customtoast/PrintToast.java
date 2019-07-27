package com.smartitventures.customtoast;
import android.content.Context;
import android.widget.Toast;
public class PrintToast {

    public static void print(Context context)
    {
        Toast.makeText(context,"print toast",Toast.LENGTH_SHORT).show();
    }

}
