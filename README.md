# **Projetos de Programação - Estacionamento e Restaurante Universitário (RU)**
Este repositório contém dois desafios de programação que desenvolvi em Java. Eles abordam conceitos importantes como orientação a objetos, coleções e boas práticas de código, sendo voltados para simular cenários reais de sistemas de gerenciamento.

## ***Desafio 1: Sistema de Estacionamento*** 🚗
### Descrição:
Este projeto simula o funcionamento de forma robusta uma máquina de estacionamento, com funcionalidades para:

- Emitir tickets com um valor fixo de R$ 20,00.

- Controlar se o ticket foi pago ou não.

- Calcular valores adicionais baseados nas horas passadas no estacionamento.

- Permitir o pagamento de tickets e consultar o saldo total recebido pelo estacionamento.

**Funcionalidades:**
  
1 - Solicitar Ticket: O sistema gera automaticamente um número de ticket aleatório com valor fixo de R$ 20,00.

2 - Cálculo do Valor a Pagar: O valor inicial é de R$ 20,00 para a primeira hora, e cada hora adicional tem um custo extra de R$ 5,00.

3 - Pagamento de Ticket: O usuário pode pagar o ticket e o sistema confirma o pagamento.

4 - Consulta de Valor: É possível consultar o saldo total das operações do estacionamento.

**Tecnologias Utilizadas**:
  
***Java***

***POO*** (Classes, Objetos, Métodos)

***Coleções*** (ArrayList)

***Lombok*** (@Data para geração automática de getters e setters)

===========================================================================

## ***Desafio 2: Cardápio Semanal do Restaurante Universitário (RU)*** 🍽️
###Descrição:
Este projeto implementa um sistema de cardápio semanal para o RU (Restaurante Universitário), onde é possível cadastrar alimentos e montar refeições associadas a dias da semana e turnos (almoço e jantar).

**Funcionalidades:**

1 - Cadastro de Alimentos: O sistema permite o cadastro de alimentos, como salada, prato principal e acompanhamento.

2 - Criação de Refeição: O usuário pode associar alimentos para montar uma refeição completa.

3 - Criação de Menu Diário: A refeição criada pode ser associada a um dia da semana e a um turno específico.

4 - Exibição do Cardápio Semanal: O sistema exibe o cardápio completo, mostrando as refeições de cada dia e turno.

**Tecnologias Utilizadas**:

***Java***

***POO*** (Classes, Objetos, Métodos)

***Coleções*** (ArrayList)

***Lombok*** (@Data para geração automática de getters e setters)

===========================================================================

## ***Como Rodar os Projetos***
1 - Clone o repositório:
```
git clone https://github.com/seu-usuario/seu-repositorio.git
```
2 - Navegue até a pasta do projeto desejado:
```
cd desafiosInc
```
3 - Compile e rode o projeto na IDEA desejada, classe main:
```
EstacionamentoTeste.java
RUTeste
```
