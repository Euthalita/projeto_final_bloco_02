## Introdução
Este projeto é uma aplicação para gerenciamento de uma loja farmacêutica, desenvolvida com Java e Spring Boot. O sistema implementa uma funcionalidade de desconto, permitindo tanto a aplicação de desconto automático com base na categoria do produto, quanto a possibilidade de aplicar um desconto manual diretamente no produto.

---
### Funcionalidade do desconto

A funcionalidade de desconto foi projetada para oferecer flexibilidade, permitindo que o desconto seja aplicado de duas formas:

* Desconto Automático: Aplica um desconto ao preço do produto com base no desconto padrão atribuído à categoria do produto.
* Desconto Manual: Permite ao administrador da loja aplicar um desconto específico e direto ao produto, sem depender do desconto da categoria.

### 1. Desconto Automático por Categoria

Cada Categoria de produto pode ter um desconto padrão associado. Quando um produto é atribuído a uma categoria, o desconto correspondente a essa categoria é aplicado automaticamente ao preço do produto.

Como Funciona:
Quando um produto é criado ou atualizado, o sistema verifica se o produto possui uma categoria associada e se essa categoria tem um desconto padrão.
O preço do produto é ajustado automaticamente com base nesse desconto de categoria.

Esse desconto é visualizado pela api:

GET /produtos/{id}/desconto

localhost:8080/produtos/1/desconto

### 2. Desconto Manual no Produto
Além do desconto automático baseado na categoria, o sistema permite que um desconto específico seja aplicado diretamente a um produto. Esse desconto pode ser definido manualmente no momento da criação ou atualização do produto.

Como Funciona:
O administrador pode especificar um desconto percentual diretamente no produto, que será aplicado independentemente do desconto da categoria.
Esse desconto manual prevalece sobre o desconto automático da categoria.

#### Exemplo de Requisição para Atualizar o Produto:
PUT /produtos/{id}  
```json
{
    "nome": "Paracetamol",
    "preco": 20.00,
    "desconto": 10.00, 
    "categoria": {
        "id": 2  
    }
}
