package com.avratech;

import javam.button.Button;
import javam.button.OnClickListener;

public class CloseWindow implements OnClickListener {
    @Override
    public void onClick(Button b) {
        Runtime.getRuntime().exit(0);
    }
}
