# Desafio dos Pedidos - Backend
## O Desafio
O desafio de Pedidos consiste em desenvolver um sistema de cadastro de pedidos.


Para concluir o desafio, neste repositório se encontra o backend do projeto.


Os requisitos do desafio são:
   + Desenvolver uma tela de consulta para exibir os pedidos e os itens cadastrados.
   + Desenvolver uma tela para cadastrar os pedidos e seus itens.
   + Desenvolver um relatório que exiba os pedidos e seus itens.
   
Como parte do desafio, desenvolvi APIs para cada um dos requisitos, estas que serão consumidas no desenvolvimento das telas no frontend.

## Pré Requisitos
> [!IMPORTANT]
> Para executar este projeto é necessário algumas configurações:
> + Possuir  o [JDK 17](https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.exe) instalado.
> + É necessario possuir uma [IDE Java](https://spring.io/tools) de sua preferência. 
> + Ter um banco de dados [PostgreSQL](https://www.postgresql.org/download/) instalado em sua máquina e devidamente configurado no properties do projeto.

## APIs Desenvolvidas
[Relatorio](http://localhost:8080/pedidos)


[Consulta](http://localhost:8080/pedidos/1) -> Para localizar outro pedido basta passar o numero do outro pedido que deseja visualizar.


[Cadastro](http://localhost:8080/pedidos/cadastro) 
> [!IMPORTANT]
> {
>    "pedido": 0,
>    "item": "TextoAqui",
>    "quantidade": 0
> }