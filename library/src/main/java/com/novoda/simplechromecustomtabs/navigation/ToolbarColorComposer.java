package com.novoda.simplechromecustomtabs.navigation;

import androidx.annotation.ColorInt;
import androidx.browser.customtabs.CustomTabsIntent;

class ToolbarColorComposer implements Composer {

    @ColorInt
    private final int color;

    public ToolbarColorComposer(@ColorInt int color) {
        this.color = color;
    }

    @Override
    public CustomTabsIntent.Builder compose(CustomTabsIntent.Builder builder) {
        return builder.setToolbarColor(color);
    }

}
