package com.novoda.simplechromecustomtabs.navigation;

import androidx.browser.customtabs.CustomTabsIntent;

public interface Composer {

    CustomTabsIntent.Builder compose(CustomTabsIntent.Builder builder);

}
