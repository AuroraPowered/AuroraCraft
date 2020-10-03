package io.github.aurorapowered.auroracraft

import io.github.aurorapowered.endpoints.ClientEndpoint
import net.fabricmc.fabric.api.network.ClientSidePacketRegistry
import net.minecraft.util.Identifier


@Suppress("unused")
fun init() {
    ClientSidePacketRegistry.INSTANCE.register(Identifier("aurora", "packet"), AuroraPacketConsumer())
    println("Hello Fabric world!")
}

val endpoint = ClientEndpoint()