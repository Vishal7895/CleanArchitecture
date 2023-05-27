package com.example.structurepatterns

interface Device{
    var volume:Int
    fun getName():String

}

class Radio:Device{
    override var volume= 0


    override fun getName()="Radio $this"

}
class TV:Device{
    override var volume= 0


    override fun getName()="TV $this"
}

interface Remote{
    fun VolumeUp()
    fun VolumeDown()
}

class BasicRemote(val device: Device):Remote{
    override fun VolumeUp() {
        device.volume++
        println("${device.getName()} volumeup:${device.volume}")
    }

    override fun VolumeDown() {
        device.volume--

        TODO("Not yet implemented")
    }

}