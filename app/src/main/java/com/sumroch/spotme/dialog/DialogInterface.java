package com.sumroch.spotme.dialog;

import android.os.Bundle;

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 19-11-2017
 * ------------------------------
 * This class for
 */
public interface DialogInterface {

    int getDialogView();

    boolean isDialogCancelable();

    void onLoadInstance(Bundle savedInstanceBundle);

    void onPostInit();

    boolean onBackPressed();
}
