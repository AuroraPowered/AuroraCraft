package io.github.aurorapowered.auroracraft

import net.fabricmc.fabric.api.network.PacketConsumer
import net.fabricmc.fabric.api.network.PacketContext
import net.minecraft.network.PacketByteBuf

class AuroraPacketConsumer : PacketConsumer {
    override fun accept(context: PacketContext, buf: PacketByteBuf) {
        val bytes: ByteArray
        val length = buf.readableBytes()

        if (buf.hasArray()) {
            bytes = buf.array()
        } else {
            bytes = ByteArray(length)
            buf.getBytes(buf.readerIndex(), bytes)
        }

        endpoint.handleRawPacket(bytes)
    }
}
