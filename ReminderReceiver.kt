
package com.example.reminderapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ReminderReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "C'est l'heure de manger !", Toast.LENGTH_LONG).show()
    }
}
