<p align="center">
  <img src="images/logo-sistemas-multas.png" alt="Logo Sistema de Multas" width="300"/>
</p>
<br>

# Sistema de Gestão de Multas e CNH (G2_Projeto)

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Status](https://img.shields.io/badge/status-Em_Desenvolvimento-green)

## 📝 Descrição

Este projeto é um sistema em **Java** desenvolvido para simular o processamento de infrações de trânsito. Ele calcula automaticamente a pontuação na Carteira Nacional de Habilitação (CNH) do motorista e determina a situação legal do documento (Regular, Em Risco ou Suspensa) com base nas regras de trânsito brasileiras.

O projeto foi estruturado com foco em **Orientação a Objetos** e **Princípios SOLID**, utilizando interfaces para desacoplar as regras de negócio da implementação técnica.

## ✨ Funcionalidades

* **Registro de Infrações:** Processamento de multas (Leve, Média, Grave, Gravíssima) com valores e pontuações dinâmicas.
* **Cálculo de Pontos:** Acúmulo automático de pontos no perfil do motorista.
* **Análise de Situação da CNH:** Verifica o status da carteira com base na pontuação acumulada:
    * *Regular:* Abaixo de 10 pontos.
    * *Em Risco:* Entre 10 e 19 pontos.
    * *Suspensa:* 20 pontos ou mais.
* **Sistema de Notificação:** Notificação via console (extensível para outros métodos).

## 🛠️ Tecnologias e Arquitetura

* **Linguagem:** Java (JDK 17+)
* **Conceitos Aplicados:**
    * *Injeção de Dependência:* O `ProcessadorInfracaoService` não cria suas dependências, ele as recebe, facilitando testes e manutenção.
    * *Interfaces:* Uso de `Notificador`, `Penalidade` e `AnaliseSituacaoCNH` para flexibilidade.
    * *Enums:* Tipagem forte para os tipos de infração.

## 📂 Estrutura do Projeto

```text
trabalho_g2/
├── enums/          # Tipos de infração (Grave, Gravíssima, etc.)
├── infra/          # Implementações de infraestrutura (Console)
├── interfaces/     # Contratos (Notificador, Regras, Penalidades)
├── logic/          # Lógica de negócio (Regra Brasileira CNH)
├── model/          # Entidades (Motorista, Veículo)
├── service/        # Serviço processador de infrações
└── Main.java       # Classe principal de execução
```

## 🚀 Como Executar
Clone o repositório:

Bash
```
git clone [https://github.com/Wellingtn/G2_Projeto.git](https://github.com/Wellingtn/G2_Projeto.git)
```
Acesse a pasta do projeto:
Bash
```
cd G2_Projeto
```
Compile e execute: Se estiver usando terminal:
```
javac trabalho_g2/Main.java
java trabalho_g2.Main
```

Ou abra a pasta diretamente na sua IDE favorita (IntelliJ, Eclipse, VS Code) e execute o arquivo Main.java.

## 📊 Exemplo de Saída
Ao executar o sistema, o resultado no console será semelhante a:

Plaintext

=== SISTEMA DE MULTAS ===

> Multa 1 (Grave):
--- NOVA INFRAÇÃO REGISTRADA ---
Veículo: Fiat Uno
Motorista: Wellington Juan
Multa: R$ 195.23 (+5 pontos)
Status Atual da CNH: REGULAR
--------------------------------

> Multa 2 (Gravíssima):
--- NOVA INFRAÇÃO REGISTRADA ---
Veículo: Fiat Uno
Motorista: Wellington Juan
Multa: R$ 293.47 (+7 pontos)
Status Atual da CNH: EM RISCO
--------------------------------

## 👨‍💻 Autor
Desenvolvido por Wellington Juan.



