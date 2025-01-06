package org.example.project.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.More
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.SwapHoriz
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BankingScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // org.example.project.ui.components.Header
            Header()

            Spacer(modifier = Modifier.height(24.dp))

            // Card Section
            CreditCard()

            Spacer(modifier = Modifier.height(24.dp))

            // Actions
            ActionButtons()

            Spacer(modifier = Modifier.height(24.dp))

            // Transactions
            TransactionSection()

            Spacer(modifier = Modifier.weight(1f))

            // Bottom Navigation
            BottomNavigation()
        }
    }
}

@Composable
private fun Header() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Surface(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                color = MaterialTheme.colorScheme.surfaceVariant
            ) {
                // Profile image placeholder
            }
            Text(
                text = "Brian Mojena",
                style = MaterialTheme.typography.titleMedium
            )
        }
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "Notifications"
            )
        }
    }
}

@Composable
private fun CreditCard() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        shape = RoundedCornerShape(16.dp),
        color = Color.Black
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            Text(
                text = "$1000 USD",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.White
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "BANDEC",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
            Text(
                text = "•••• •••• •••• 3123",
                style = MaterialTheme.typography.bodyMedium,
                color = Color.White.copy(alpha = 0.7f)
            )
        }
    }
}

@Composable
private fun ActionButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ActionButton(text = "Send", icon = Icons.Default.Send)
        ActionButton(text = "Request", icon = Icons.Default.Download)
        ActionButton(text = "Pay Bills", icon = Icons.Default.Payment)
    }
}

@Composable
private fun ActionButton(text: String, icon: ImageVector) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        IconButton(
            onClick = { },
            modifier = Modifier
                .size(48.dp)
                .background(
                    MaterialTheme.colorScheme.surfaceVariant,
                    CircleShape
                )
        ) {
            Icon(
                imageVector = icon,
                contentDescription = text,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        Text(
            text = text,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
private fun TransactionSection() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recent Transactions",
                style = MaterialTheme.typography.titleMedium
            )
            TextButton(onClick = { }) {
                Text("See all")
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        TransactionItem("Shopping", "-$50.75", "Just now")
        TransactionItem("Drink", "-$1.99", "2h ago")
        TransactionItem("Electricity Bill", "-$30.25", "1 day")
    }
}

@Composable
private fun TransactionItem(title: String, amount: String, time: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = time,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        Text(
            text = amount,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.SemiBold
            )
        )
    }
}

@Composable
private fun BottomNavigation() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 5.dp, vertical = 8.dp) // Espacio alrededor de la barra
            .clip(RoundedCornerShape(24.dp)), // Forma redondeada estilo Apple
        color = MaterialTheme.colorScheme.surfaceVariant, // Fondo de la barra
        shadowElevation = 8.dp // Elevación para añadir sombra
    ) {
        NavigationBar(
            modifier = Modifier
                .background(Color.Transparent) // Fondo transparente para respetar el Surface
        ) {
            NavigationBarItem(
                selected = true,
                onClick = { },
                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                label = { Text("Home") }
            )
            NavigationBarItem(
                selected = false,
                onClick = { },
                icon = { Icon(Icons.Default.SwapHoriz, contentDescription = "Transfer") },
                label = { Text("Transfer") }
            )
            NavigationBarItem(
                selected = false,
                onClick = { },
                icon = { Icon(Icons.Default.More, contentDescription = "More") },
                label = { Text("More") }
            )
        }
    }
}