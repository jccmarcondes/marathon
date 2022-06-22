package com.malinskiy.marathon.analytics.external

import com.malinskiy.marathon.test.Test
import java.time.Instant

interface MetricsProvider {
    fun successRate(test: Test, limit: Instant): Double
    fun executionTime(test: Test, percentile: Double, limit: Instant): Double
    fun close()
}
