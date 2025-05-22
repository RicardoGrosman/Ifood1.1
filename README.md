Sistema de Gerenciamento de Pedidos
Descrição
Este projeto implementa um sistema de gerenciamento de estados de pedidos utilizando a linguagem Java. O sistema modela o ciclo de vida de um pedido, que pode estar em estados como "Em preparo", "A caminho", "Entregue" ou "Cancelado". Ele utiliza padrões de projeto para garantir modularidade, extensibilidade e manutenibilidade.
Padrões de Projeto Utilizados

State: Gerencia os diferentes estados de um pedido (EmPreparo, ACaminho, Entregue, Cancelado) por meio da classe abstrata PedidoEstado.
Singleton: Garante que cada estado (EmPreparo, ACaminho, Entregue, Cancelado) tenha uma única instância.
Observer: Permite que clientes (Cliente) sejam notificados automaticamente sobre mudanças no estado de um pedido (Pedido), utilizando as classes Observable e Observer do Java.
Factory: Fornece uma interface (IPedidoFactory) e uma implementação (PedidoFactory) para criar instâncias de Pedido.

Estrutura do Projeto
O projeto contém as seguintes classes e interfaces:

Classes de Estado:

PedidoEstado (abstrata): Define a interface para os estados do pedido.
EmPreparo: Estado inicial de um pedido, permite finalizar o preparo ou cancelar.
ACaminho: Estado intermediário, permite entregar ou cancelar o pedido.
Entregue: Estado final de um pedido.
Cancelado: Estado final para pedidos cancelados.


Classe Principal:

Pedido: Representa um pedido, gerencia transições de estado e notifica observadores.


Classe Observadora:

Cliente: Implementa Observer para receber notificações sobre mudanças de estado do pedido.


Fábrica:

IPedidoFactory: Interface para criação de pedidos.
PedidoFactory: Implementação da fábrica para criar instâncias de Pedido.



Pré-requisitos

Java: JDK 8 ou superior.
IDE: Qualquer IDE que suporte Java (e.g., IntelliJ IDEA, Eclipse) ou um compilador Java manual.
Ferramentas de Build (opcional): Maven ou Gradle para gerenciar dependências, caso necessário.

Como Executar

Clone o repositório ou copie os arquivos do projeto para um diretório local.
Certifique-se de que o JDK está configurado corretamente no seu ambiente.
Compile os arquivos Java:javac *.java


Crie uma classe principal (não fornecida no código) para testar o sistema. Um

