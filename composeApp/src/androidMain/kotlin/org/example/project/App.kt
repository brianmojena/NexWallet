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
import org.example.project.ui.components.BankingScreen

@Composable
fun App() {
    BankingAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            BankingScreen()
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

// Colores del tema
private val md_theme_dark_primary = Color(0xFF4CAF50)
private val md_theme_dark_onPrimary = Color(0xFFFFFFFF)
private val md_theme_dark_primaryContainer = Color(0xFF1B5E20)
private val md_theme_dark_onPrimaryContainer = Color(0xFFA5D6A7)
private val md_theme_dark_secondary = Color(0xFF2196F3)
private val md_theme_dark_onSecondary = Color(0xFFFFFFFF)
private val md_theme_dark_secondaryContainer = Color(0xFF0D47A1)
private val md_theme_dark_onSecondaryContainer = Color(0xFF90CAF9)
private val md_theme_dark_tertiary = Color(0xFF9C27B0)
private val md_theme_dark_onTertiary = Color(0xFFFFFFFF)
private val md_theme_dark_tertiaryContainer = Color(0xFF4A148C)
private val md_theme_dark_onTertiaryContainer = Color(0xFFE1BEE7)
private val md_theme_dark_error = Color(0xFFCF6679)
private val md_theme_dark_onError = Color(0xFF000000)
private val md_theme_dark_errorContainer = Color(0xFFB00020)
private val md_theme_dark_onErrorContainer = Color(0xFFFFCDD2)
private val md_theme_dark_background = Color(0xFF121212)
private val md_theme_dark_onBackground = Color(0xFFFFFFFF)
private val md_theme_dark_surface = Color(0xFF121212)
private val md_theme_dark_onSurface = Color(0xFFFFFFFF)
private val md_theme_dark_surfaceVariant = Color(0xFF2C2C2C)
private val md_theme_dark_onSurfaceVariant = Color(0xFFE0E0E0)
private val md_theme_dark_outline = Color(0xFF938F99)