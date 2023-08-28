# Desafio de Desenvolvimento - Challenge Backend
My implementation of b2w-marketplace Back-end challenge

#Descrição
Este é o repositório que contém minha solução para o desafio de desenvolvimento "Challenge Backend".
O objetivo do desafio era criar um serviço que consumisse uma API externa, filtrasse os itens com base em datas e retornasse os resultados.

#Tecnologias Utilizadas
-Java
-Spring Boot
-Spring Framework
-RestTemplate
-Postman

#Endpoints
GET /challenge-backend/item
Este endpoint permite obter uma lista de itens filtrados com base nas datas fornecidas.

##Parâmetros de consulta:

begindate: Data de início no formato "dd-MM-yyyy"
finaldate: Data final no formato "dd-MM-yyyy"

##Exemplo de uso:
GET http://localhost:8080/challenge-backend/item?begindate=05-10-2016&finaldate=10-10-2016
