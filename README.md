# Tarefas Web

Este é um projeto simples que gerencia uma lista de tarefas. Foi desenvolvido usando Spring Boot e é acessado por meio de uma interface web.

## Funcionalidades

### 1. Visualizar Tarefas

Você pode visualizar suas tarefas acessando o endpoint `/tasks` através de um navegador. As tarefas são exibidas em uma página simples.

### 2. Adicionar Tarefas

Para adicionar uma nova tarefa, envie uma requisição POST para o endpoint `/tasks` com os detalhes da tarefa no corpo da requisição.

### 3. Excluir Tarefas

Para excluir uma tarefa, envie uma requisição DELETE para o endpoint /tasks/{taskId}, onde {taskId} é o ID da tarefa que você deseja excluir.

### 4. Como executar

- Clone o repositório:
git clone https://github.com/marcos-miotto/TaskManagerBoot.git
cd tarefas-web

- Compile e execute o projeto usando o Maven:
./mvnw spring-boot:run

- Abra o navegador e acesse http://localhost:8080/tasks para visualizar suas tarefas.

Para adicionar ou excluir tarefas, utilize as instruções fornecidas nas seções "Adicionar Tarefas" e "Excluir Tarefas".

Este é um projeto simples, mas pode servir como um ponto de partida para o desenvolvimento de aplicativos mais complexos de gerenciamento de tarefas. 
Sinta-se à vontade para explorar e modificar conforme necessário.