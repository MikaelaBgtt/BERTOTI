i= 0
document.addEventListener("DOMContentLoaded", () => {
    fetch("http://localhost:8080/coffees") 
        .then(response => response.json())
        .then(data => {
            
            const coffeeList = document.getElementById("coffee-list");
            data.forEach(coffee => {
                
                const listItem = document.createElement("li");
                const deleteButton = document.createElement('button') 
                const upItem = document.createElement("input")
                const upButton = document.createElement("button");
                upButton.innerHTML = "Editar nome";
                deleteButton.innerHTML = "Excluir";
                listItem.textContent = coffee.name;
                coffeeList.appendChild(listItem);
                coffeeList.appendChild(upItem);
                coffeeList.appendChild(upButton);
                coffeeList.appendChild(deleteButton);
                upButton.setAttribute('id',i);
                upButton.setAttribute('class','btn btn-primary')
                deleteButton.setAttribute('class','btn btn-danger')
                i++;
                upButton.addEventListener('click',Update)
                deleteButton.addEventListener('click', Excluir)
                function Update(){
                   upItemValor = upItem.value;
                   axios.put("http://localhost:8080/coffees/"+coffee.id , { id: coffee.id, name: upItemValor })
                   .then(response => {
                    console.log("Café atualizado com sucesso:", response.data)
                        listItem.innerText = upItemValor
                })
                .catch(error => {
                    console.error("Erro ao atualizar o café:", error);
                });


                }
                function Excluir(){
                    axios.delete("http://localhost:8080/coffees/"+coffee.id, { id: coffee.id })
                    .then(response =>{
                        console.log('Deletado', response.data)
                        upButton.remove()
                        deleteButton.remove()
                        listItem.remove()
                        upItem.remove()
                    })
                    .catch(error => {
                        console.error("Erro ao deletar", error)
                    })
                }

            });
        });
});
