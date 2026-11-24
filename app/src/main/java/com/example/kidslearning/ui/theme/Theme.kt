package com.example.kidslearning.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val KidsColorScheme = lightColorScheme(
    primary = SkyBlue,
    secondary = SunnyYellow,
    tertiary = MintGreen,
    background = SoftBackground,
    surface = SoftBackground,
    onBackground = DeepNavy,
    onSurface = DeepNavy
)

@Composable
fun KidsLearningTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = KidsColorScheme,
        typography = Typography,
        content = content
    )
}