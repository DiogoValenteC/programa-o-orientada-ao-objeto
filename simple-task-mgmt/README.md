# Desafios de Sala

**Desafio 1:**
Crie uma nova classe chamada `Categoria` com um atributo `nome`. Crie um objeto da classe `Categoria` e associe-o a uma tarefa.

- **Instruções:**
  - Crie a classe `Categoria` com um atributo `nome` e métodos `getNome` e `setNome`.
  - Modifique a classe `Tarefa` para incluir uma associação a `Categoria`.
  - Crie objetos `Categoria` e `Tarefa`, e associe uma categoria a uma tarefa.

**Desafio 2:**
Crie um método privado que valida a prioridade de uma tarefa, garantindo que seja um valor entre 1 e 5, e utilize esse método no construtor.

- **Instruções:**
  - Crie o método `isPrioridadeValida(int prioridade)` que verifica se a prioridade está dentro do intervalo permitido.
  - Utilize esse método no construtor para garantir que a prioridade seja sempre válida.

**Desafio 3:**
Modifique o código para que, ao imprimir uma lista de tarefas, seja indicado de forma clara se a tarefa é urgente ou flexível.

- **Instruções:**
  - Use o método `toString()` sobrescrito em cada classe derivada (`TarefaUrgente`, `TarefaComPrazoFlexivel`), garantindo que o comportamento específico de cada classe seja exibido adequadamente ao usuário.

**Desafio 4:**
Crie uma interface chamada `Notificacao` com um método `enviarNotificacao()`. Faça com que a classe `TarefaUrgente` implemente essa interface.

- **Instruções:**
  - A interface deve conter o método `enviarNotificacao()`, e a classe `TarefaUrgente` deve exibir uma mensagem quando esse método for chamado.