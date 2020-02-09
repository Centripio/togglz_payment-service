package com.centripio.togglz.payment.util;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum TogglzPaymentFeatureEnum implements Feature {
    @EnabledByDefault
    @Label("Enable AMEX Payment Service")
    ENABLE_AMEX_PAYMENT;

    public boolean isActive() {
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
