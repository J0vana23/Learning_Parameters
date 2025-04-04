package com.example.learningparameters.data

// Dados de usuário padrão (Aluno DS)
val userDefault = User(
    userId = "Aluno",
    name = "Aluno DS",
    avatarUrl = null,
    age = 17,
    score = 75,
    turma = "3° AMS",
    registerDate = "31/03/2025",
    email = "aluno@etec.sp.gov.br",
    bio = "Estudante de Desenvolvimento de Sistemas na ETEC Zona Leste. Desenvolvi um aplicativo utilizando JetPack Compose com passagem de parâmetros."
)

// Dados de usuário Jovana
val jovana = User(
    userId = "Jovana",
    name = "Jovana Oliveira da Silva",
    avatarUrl = null,
    age = 17,
    score = 85,
    turma = "3° AMS",
    registerDate = "23/08/2007",
    email = "jovana.silva01@etec.sp.gov.br",
    bio = "Estudante de Desenvolvimento de Sistemas na ETEC Zona Leste. Desenvolvi um aplicativo utilizando JetPack Compose com passagem de parâmetros."
)

// Função para retornar os dados do usuário baseado no nome
fun getUserData(userName: String): User {
    return if (userName == "Jovana") {
        jovana
    } else {
        userDefault
    }
}
