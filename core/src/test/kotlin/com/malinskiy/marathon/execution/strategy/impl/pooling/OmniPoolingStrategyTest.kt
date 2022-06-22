package com.malinskiy.marathon.execution.strategy.impl.pooling

import com.malinskiy.marathon.device.DevicePoolId
import com.malinskiy.marathon.device.DeviceStub
import com.malinskiy.marathon.device.NetworkState
import com.malinskiy.marathon.device.OperatingSystem
import org.amshove.kluent.shouldEqual
import org.junit.jupiter.api.Test

class OmniPoolingStrategyTest {
    val strategy = OmniPoolingStrategy()
    val device1 = DeviceStub(OperatingSystem("22"), "Serial", NetworkState.CONNECTED, true)
    val device2 = DeviceStub(OperatingSystem("25"), "Serial2", NetworkState.DISCONNECTED, false)

    @Test
    fun `should return same DevicePoolId for all devices`() {
        strategy.associate(device1) shouldEqual DevicePoolId("omni")
        strategy.associate(device2) shouldEqual DevicePoolId("omni")
    }
}
