package com.novoda.simplechromecustomtabs.navigation;

import androidx.browser.customtabs.CustomTabsIntent;

class ShowTitleComposer implements Composer {

    @Override
    public CustomTabsIntent.Builder compose(CustomTabsIntent.Builder builder) {
        return builder.setShowTitle(true);
    }

}
