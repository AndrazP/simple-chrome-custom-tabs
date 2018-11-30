package com.novoda.simplechromecustomtabs.navigation;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;

class CloseButtonIconComposer implements Composer {

    private final Bitmap icon;

    public CloseButtonIconComposer(@NonNull Bitmap icon) {
        this.icon = icon;
    }

    @Override
    public CustomTabsIntent.Builder compose(CustomTabsIntent.Builder builder) {
        return builder.setCloseButtonIcon(icon);
    }

}
