// create a Array to store the values to be sorted
const container= document.querySelector(".container")
const arr=[];

const randomArray=()=>{
    for (let index = 0; index < 100; index++) {
        arr.push(randomNumber(5,1000))
        
    }
}

function randomNumber(startVal,endVal){
    return(
        (Math.floor(Math.random()*(endVal))+startVal)
    )
}

const printDisplay=()=>{
    console.log(arr);
    arr.map(element=>container.textContent+=`${element}`)
}
randomArray();
printDisplay();
