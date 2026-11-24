package com.example.lab09
data class TaskItem(
    val id: Int,
    val title: String,
    val category: String,
    val isCompleted: Boolean = false
)