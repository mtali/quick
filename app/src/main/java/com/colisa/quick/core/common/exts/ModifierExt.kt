package com.colisa.quick.core.common.exts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


fun Modifier.toolbarActions(): Modifier {
    return this.wrapContentSize(Alignment.TopEnd)
}

fun Modifier.card(): Modifier {
    return this.padding(16.dp, 0.dp, 16.dp, 8.dp)
}

fun Modifier.spacer() = this
    .fillMaxWidth()
    .padding(12.dp)

fun Modifier.fieldModifier() = this
    .fillMaxWidth()
    .padding(16.dp, 4.dp)

fun Modifier.basicButton() = this
    .fillMaxWidth()
    .padding(16.dp, 8.dp)

fun Modifier.dropdownSelector() = fillMaxWidth()

fun Modifier.contextMenu() = wrapContentWidth()
