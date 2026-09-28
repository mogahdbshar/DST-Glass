package com.dstwr.glass.core.platform

import org.junit.Assert.assertTrue
import org.junit.Test

class PlatformCapabilitiesTest {
    @Test
    fun apiLevelIsPositive() {
        assertTrue(currentPlatformCapabilities().api > 0)
    }
}
