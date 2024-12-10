package com.example.audiorecording.record

import java.io.File

interface AudioRecord {
    fun startRecording(outputFile: File)
    fun stopRecording()
}