# 🎬 TechStream App - Sistema de Gestão de Catálogo de Streaming

> **Atividade Prática Colaborativa de Gestão da Qualidade de Software (GQS)**  
> Projeto desenvolvido para exercitar Controle de Versionamento com **Git**, **GitHub Flow**, **GitHub Projects (Kanban)**, **GitHub Codespaces** e **Maven** em ambiente Java com Orientação a Objetos.

---

## 📌 Sobre o Projeto

O **TechStream** é uma aplicação Java construída para simular o gerenciamento do catálogo de uma plataforma de *streaming*. O sistema organiza e manipula diferentes tipos de mídias (Filmes, Séries, Documentários e Podcasts) utilizando conceitos fundamentais de Orientação a Objetos:

- **Abstração & Herança:** Classe abstrata base `Conteudo` estendida por subclasses de mídias específicas.
- **Polimorfismo:** Sobrescrita do método `exibirDetalhes()` em cada subclasse para exibir atributos específicos.
- **Encapsulamento & Coleções:** Classe de serviço `CatalogoService` para gestão, filtragem e cálculo de estatísticas da lista de conteúdos.

---

## 🎯 Objetivos Didáticos

1. **Trabalho em Equipe com Git & GitHub:** Integração simultânea de 9 desenvolvedores no mesmo repositório.
2. **GitHub Flow:** Utilização de branches de desenvolvimento (`dev`), branches de funcionalidades (`feature/*`), Pull Requests e Code Review.
3. **Gestão de Tarefas:** Acompanhamento do progresso da equipe via **GitHub Projects (Board Kanban)** e vinculação de **Issues**.
4. **Gerenciamento com Maven:** Padronização da estrutura do projeto para facilidade de compilação e preparação para futuras etapas de automação de testes.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17+
* **Gerenciador de Build:** Apache Maven
* **Controle de Versão:** Git / GitHub
* **IDE Recomendada:** IntelliJ IDEA ou GitHub Codespaces

---

## 📂 Estrutura do Projeto

```text
techstream-app/
├── .github/                     # Configurações de workflows e templates do GitHub
├── pom.xml                      # Configurações de dependências e build do Maven
└── src/
    └── main/
        └── java/
            └── br/
                └── com/
                    └── techstream/
                        ├── Main.java                 # Classe principal (Ponto de entrada)
                        ├── model/                    # Modelo de Domínio (OO)
                        │   ├── Conteudo.java         # Classe base abstrata
                        │   ├── Filme.java            # Subclasse de Conteudo
                        │   ├── Serie.java            # Subclasse de Conteudo
                        │   ├── Documentario.java     # Subclasse de Conteudo
                        │   └── Podcast.java          # Subclasse de Conteudo
                        └── service/                  # Camada de Regra de Negócio
                            └── CatalogoService.java  # Gerenciamento do catálogo de mídias

```
