package com.example.beatbox

private const val WAV = ".wav"

class Sound (assetPath: String) {
    val name = assetPath.split('/').last().removeSuffix(WAV)
}