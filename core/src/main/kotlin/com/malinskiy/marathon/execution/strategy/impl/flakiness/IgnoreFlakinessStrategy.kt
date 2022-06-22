package com.malinskiy.marathon.execution.strategy.impl.flakiness

import com.malinskiy.marathon.analytics.external.MetricsProvider
import com.malinskiy.marathon.execution.TestShard
import com.malinskiy.marathon.execution.strategy.FlakinessStrategy

class IgnoreFlakinessStrategy : FlakinessStrategy {
    override fun process(testShard: TestShard, metricsProvider: MetricsProvider): TestShard {
        return testShard
    }

    override fun hashCode() = javaClass.canonicalName.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        val javaClass: Class<Any> = other.javaClass
        return this.javaClass.canonicalName == javaClass.canonicalName
    }

    override fun toString(): String {
        return "IgnoreFlakinessStrategy()"
    }


}
