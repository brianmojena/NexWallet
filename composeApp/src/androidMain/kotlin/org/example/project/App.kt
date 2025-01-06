package org.example.project

import MainScreen
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun App() {
    BankingAppTheme {
        // Contenedor principal
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            MainScreen() // Inicia la navegación principal con LoadingScreen y BankingScreen
        }
    }
}

// Tema personalizado para la aplicación
@Composable
fun BankingAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = darkColorScheme(
            primary = md_theme_dark_primary,
            onPrimary = md_theme_dark_onPrimary,
            primaryContainer = md_theme_dark_primaryContainer,
            onPrimaryContainer = md_theme_dark_onPrimaryContainer,
            secondary = md_theme_dark_secondary,
            onSecondary = md_theme_dark_onSecondary,
            secondaryContainer = md_theme_dark_secondaryContainer,
            onSecondaryContainer = md_theme_dark_onSecondaryContainer,
            tertiary = md_theme_dark_tertiary,
            onTertiary = md_theme_dark_onTertiary,
            tertiaryContainer = md_theme_dark_tertiaryContainer,
            onTertiaryContainer = md_theme_dark_onTertiaryContainer,
            error = md_theme_dark_error,
            onError = md_theme_dark_onError,
            errorContainer = md_theme_dark_errorContainer,
            onErrorContainer = md_theme_dark_onErrorContainer,
            background = md_theme_dark_background,
            onBackground = md_theme_dark_onBackground,
            surface = md_theme_dark_surface,
            onSurface = md_theme_dark_onSurface,
            surfaceVariant = md_theme_dark_surfaceVariant,
            onSurfaceVariant = md_theme_dark_onSurfaceVariant,
            outline = md_theme_dark_outline,
        ),
        typography = Typography(
            bodyLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp
            ),
            titleLarge = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                letterSpacing = 0.sp
            ),
            labelSmall = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp
            )
        ),
        shapes = Shapes(
            small = RoundedCornerShape(4.dp),
            medium = RoundedCornerShape(8.dp),
            large = RoundedCornerShape(16.dp)
        )
    ) {
        content()
    }
}

// Colores del tema llamativo
private val md_theme_dark_primary = Color(0xFFFF6F00) // Naranja vivo
private val md_theme_dark_onPrimary = Color(0xFFFFFFFF)
private val md_theme_dark_primaryContainer = Color(0xFFFFA040) // Naranja más suave
private val md_theme_dark_onPrimaryContainer = Color(0xFF4E2600)

private val md_theme_dark_secondary = Color(0xFF00C853) // Verde brillante
private val md_theme_dark_onSecondary = Color(0xFFFFFFFF)
private val md_theme_dark_secondaryContainer = Color(0xFF66FFA6) // Verde más claro
private val md_theme_dark_onSecondaryContainer = Color(0xFF00391C)

private val md_theme_dark_tertiary = Color(0xFF6200EA) // Morado vibrante
private val md_theme_dark_onTertiary = Color(0xFFFFFFFF)
private val md_theme_dark_tertiaryContainer = Color(0xFFB388FF) // Lavanda
private val md_theme_dark_onTertiaryContainer = Color(0xFF21005F)

private val md_theme_dark_error = Color(0xFFFF5252) // Rojo vivo
private val md_theme_dark_onError = Color(0xFFFFFFFF)
private val md_theme_dark_errorContainer = Color(0xFFFFD7D7)
private val md_theme_dark_onErrorContainer = Color(0xFF690000)

private val md_theme_dark_background = Color(0xFF1E1E1E) // Gris oscuro
private val md_theme_dark_onBackground = Color(0xFFECECEC) // Blanco suave

private val md_theme_dark_surface = Color(0xFF2E2E2E) // Gris un poco más claro
private val md_theme_dark_onSurface = Color(0xFFECECEC)

private val md_theme_dark_surfaceVariant = Color(0xFF424242) // Gris intermedio
private val md_theme_dark_onSurfaceVariant = Color(0xFFE8E8E8)

private val md_theme_dark_outline = Color(0xFF9E9E9E) // Gris claro