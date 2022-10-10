package com.example.beatbox

import android.content.res.AssetManager
import android.util.Log
import java.lang.Exception

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager) {

    val sounds: List<Sound>

    init {
        sounds = loadSound()
    }

    private fun loadSound(): List<Sound> {
        val soundName: Array<String>
        try {
            soundName = assets.list(SOUNDS_FOLDER)!!
        } catch (e: Exception) {
            Log.d(TAG, "Could nto list access", e)
            return emptyList()
        }
        val sounds = mutableListOf<Sound>()
        soundName.forEach { filename ->
            val assetPath = "$SOUNDS_FOLDER/$filename"
            val sound = Sound(assetPath)
            sounds.add(sound)
        }
        return sounds
    }
}