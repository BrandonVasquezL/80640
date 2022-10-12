function leer(){
return document.getElementById("todo").value
}
// var todo = document.getElementById("todo").value

function agregar(){
nodo = document.createElement("li")
// texto = document.createTextNode("hola")
texto = document.createTextNode(leer())
console.log(texto)
nodo.appendChild(texto)
nodo.setAttribute("id", leer())
document.getElementById("lista").appendChild(nodo)
}
function buscar() {
     listaTodo = document.getElementsByTagName("li")
    // var ban = false
    // var arr = [].slice.call(listaTodo)
    // arr.forEach(element => {
    //    if (leer() == element.textContent) {
    //     ban = true
    //    } 
    // });
    // if(ban == true){
    //     console.log("Existe")
    // }else{
    //     console.log("no existe")
    // }


    // if(document.getElementById(leer())!= null){
    //     console.log("Ya existe padrino")
    // } else{
    //     alert("ojo cuate que no existe")
    // }

    for(let i =0; i<listaTodo.length; i++){
        const tarea =listaTodo[i];
        if (leer() == tarea.textContent){
            console.log("ya existe")
        }else{
            console.log("aun no existe")  
        }
    }
}
