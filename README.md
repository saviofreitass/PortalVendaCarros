# 🚗 Portal de Venda de Carros — Arquitetura de Microsserviços

Projeto **exemplo de estudo** desenvolvido com o objetivo de praticar e consolidar conhecimentos em **microsserviços orientados a eventos**, comunicação assíncrona e boas práticas de arquitetura distribuída.

## 🧠 Visão Geral

O sistema simula um **portal de venda de carros**, dividido em microsserviços independentes que se comunicam de forma **assíncrona via Kafka**.

A arquitetura foi pensada para demonstrar:

* Separação de responsabilidades
* Comunicação orientada a eventos
* Escalabilidade e desacoplamento
* Uso de containers com Docker

---

## 🏗️ Arquitetura

O projeto é composto por **3 microsserviços**:

### 1️⃣ API Principal

Responsável por:

* Expor endpoints REST
* Receber requisições dos clientes
* Orquestrar ações iniciais do sistema
* Publicar eventos no Kafka

### 2️⃣ Car Store Service

Responsável por:

* Gerenciar os dados de carros
* Cadastro, atualização e consulta de veículos
* Consumir eventos relacionados a carros
* Persistência em banco de dados PostgreSQL

### 3️⃣ Analytics Service

Responsável por:

* Processar eventos do sistema
* Gerar métricas e estatísticas (ex: carros mais visualizados, cadastros, etc.)
* Demonstrar consumo de eventos sem impactar o fluxo principal

---

## 🔄 Comunicação entre Microsserviços

A comunicação entre os serviços é feita de forma **assíncrona utilizando Apache Kafka**.

* A API Principal **publica eventos**
* Os demais serviços **consomem eventos conforme sua responsabilidade**
* Não há dependência direta entre os serviços

---

## 🛠️ Tecnologias Utilizadas

* **Java** (Spring Boot)
* **Apache Kafka** (mensageria)
* **PostgreSQL** (persistência de dados)
* **Docker & Docker Compose** (containerização)
* **Arquitetura de Microsserviços**
* **Comunicação Orientada a Eventos**

---

## 📚 Objetivos de Aprendizado

* Entender comunicação assíncrona com Kafka
* Aplicar conceitos de microsserviços
* Trabalhar com eventos e desacoplamento
* Utilizar Docker no desenvolvimento
* Praticar integração entre serviços
