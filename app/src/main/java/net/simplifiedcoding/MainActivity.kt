package net.simplifiedcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import net.simplifiedcoding.ui.auth.LoginScreen
import net.simplifiedcoding.ui.theme.AppTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                LoginScreen()
            }
        }
    }
}