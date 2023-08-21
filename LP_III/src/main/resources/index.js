i= 0
document.addEventListener("DOMContentLoaded", () => {
    fetch("http://localhost:8080/coffees") 
        .then(response => response.json())
        .then(data => {
            
            const coffeeList = document.getElementById("coffee-list");
            data.forEach(coffee => {
                
                const listItem = document.createElement("li"); 
                const upItem = document.createElement("input")
                const upButton = document.createElement("button");
                upButton.innerHTML = "Editar";
                listItem.textContent = coffee.name;
                coffeeList.appendChild(listItem);
                coffeeList.appendChild(upItem);
                coffeeList.appendChild(upButton);
                upButton.setAttribute('id',i)
                i++;
                upButton.addEventListener('click',Enviar)
                function Enviar(){
                   upItemValor = upItem.value;
                   axios.put("http://localhost:8080/coffees/"+coffee.id , { name: upItemValor })
                   .then(response => {
                    console.log("Café atualizado com sucesso:", response.data);
                    coffee
                    // Atualizar a interface do usuário conforme necessário
                })
                .catch(error => {
                    console.error("Erro ao atualizar o café:", error);
                });

            

                }

            });
        });
});
