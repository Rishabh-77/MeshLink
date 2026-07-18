package com.Meshlink.android.mesh

import com.Meshlink.android.model.RoutedPacket
import com.Meshlink.android.protocol.MeshlinkPacket

/**
 * Transport abstraction used by MeshCore to send packets via a specific medium.
 */
interface MeshTransport {
    val id: String

    fun broadcastPacket(routed: RoutedPacket)

    fun sendPacketToPeer(peerID: String, packet: MeshlinkPacket): Boolean

    fun cancelTransfer(transferId: String): Boolean = false

    fun getDeviceAddressForPeer(peerID: String): String? = null

    fun getDeviceAddressToPeerMapping(): Map<String, String> = emptyMap()

    fun getTransportDebugInfo(): String = ""
}
