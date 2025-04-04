package com.example.learningparameters.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningparameters.R
// 2° Página do projeto a ser codada

/*
 * Irá receber os parametros da página de login
 * e fazer a compração (variável "name") dentro da
 * HomeRoute.kt para a autenticação dos usuários
*/

// Função composable que representa a tela inicial do usuário.
@Composable
fun HomeScreen(user: com.example.learningparameters.data.User) {
    // Coluna principal contendo todos os elementos da tela
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ){
        // Espaço superior para separar os elementos
        Spacer(modifier = Modifier.height(50.dp))

        // Cabeçalho da tela com a cor de fundo e alinhamento centralizado
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = Color(0xFF5A6C9A)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            // Texto centralizado dentro do cabeçalho
            Text (
                text = "Você está na tela Home",
                fontSize = 18.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White,
            )
        }

        // Texto com o nome do usuário, que é passado como parâmetro
        Text (
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
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

        // Texto com a bio do usuário, centralizado e estilizado
        Text (
            text = "\" ${user.bio}\"",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
            textAlign = TextAlign.Center
        )

        // Texto com o e-mail do usuário
        Text (
            text = "E-mail: ${user.email}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Texto com a turma do usuário
        Text (
            text = "Turma: ${user.turma}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Texto com a data de nascimento do usuário
        Text (
            text = "Data de Nascimento: ${user.registerDate}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Texto com a pontuação do usuário
        Text (
            text = "Pontuação: ${user.score}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )

        // Texto com a idade do usuário
        Text (
            text = "Idade: ${user.age}",
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
