package lat.pam.dailytipsapp_unit3

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Definisikan palet warna untuk tema Anda
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC5),
    background = Color(0xFFFFFFFF),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFFBB86FC),
    secondary = Color(0xFF03DAC5),
    background = Color(0xFF121212),
    surface = Color(0xFF121212),
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White,
)

@Composable
fun DailyTipsAppTheme(content: @Composable () -> Unit) {
    // Menggunakan tema cahaya atau gelap
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography, // Anda dapat mendefinisikan Typography jika perlu
        shapes = Shapes, // Anda dapat mendefinisikan Shapes jika perlu
        content = content // Konten aplikasi Anda
    )
}
