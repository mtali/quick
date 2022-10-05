package com.colisa.quick.core.common

import android.content.res.Resources
import androidx.annotation.StringRes
import com.colisa.quick.R.string as AppText

sealed interface SnackbarMessage {
    data class StringSnackbar(val message: String) : SnackbarMessage
    data class ResourceSnackbar(@StringRes val message: Int) : SnackbarMessage

    companion object {
        fun SnackbarMessage.toMessage(resources: Resources): String {
            return when (this) {
                is StringSnackbar -> message
                is ResourceSnackbar -> {
                    resources.getString(message)
                }
            }
        }

        fun Throwable.toSnackbarMessage(): SnackbarMessage {
            val message = this.message.orEmpty()
            return if (message.isNotBlank()) {
                StringSnackbar(message)
            } else {
                ResourceSnackbar(AppText.generic_error)
            }
        }
    }
}