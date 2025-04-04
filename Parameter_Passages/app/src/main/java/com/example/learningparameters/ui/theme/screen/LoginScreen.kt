package com.example.learningparameters.ui.theme.screen

// 1° Página do projeto a ser codada

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.learningparameters.ui.theme.LearningParametersTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.layout.size
import com.example.learningparameters.R


// Anotação usada para permitir o uso de API's inacabadas/testes
@OptIn(ExperimentalMaterial3Api::class)

// Função composable que representa a tela de login
@Composable
fun LoginScreen(navController: NavController) {

    // A variável irá receber os parâmetros instanciados no HomeScreen.kt
    var text by remember { mutableStateOf("") }

    // Coluna principal que organiza os elementos da tela
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        // Espaço superior para separar os elementos
        Spacer(modifier = Modifier.height(50.dp))

        // Texto que informa que o usuário está na tela de login
        Text (
            text = "Você está na tela de login",
            modifier = Modifier.padding(top = 16.dp)
        )

        // Imagem do perfil do usuário, com formato arredondado
        Image(
            painter = painterResource(id = R.drawable.user),
            contentDescription = "Imagem de perfil",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 8.dp)
                .clip(RoundedCornerShape(150.dp))
        )

        // Campo de texto onde o usuário digita seu nome de usuário
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Digite o nome de usuário:") }
        )

        // Botão que navega para a tela principal (Home) ao ser clicado
        Button(
            onClick = {
                val name = text.ifEmpty { "Cara" }

                // Irá atribuir a variável "name" e guardar o id
                navController.navigate("home/$name")
            },
            modifier = Modifier.padding(16.dp)
        ) {
            // Texto dentro do botão
            Text(text = "Navegar para a Home")
        }

    }
}

// Função preview para visualização no Android Studio
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LearningParametersTheme {
        LoginScreen(
            navController = rememberNavController()
        )
    }
}
