//game constants and variable
let inputDir = { x: 0, y: 0 };
// music
let foodMusic = new Audio("/music/food.mp3");
let gameOver = new Audio("/music/gameover.mp3");
let move = new Audio("/music/move.mp3");
let music = new Audio("/music/music.mp3");

const board = document.querySelector(".board");
const score = document.querySelector(".score");
const highScore = document.querySelector(".highScore");
let lastTime = 0;
let scorVal = 0;
let highVal=0;
let snakeArray = [
  {
    x: 3,
    y: 5,
  },
];
let food = {x:randomFood(2, 16), y:randomFood(2, 16)}
const speed = 5;

// box.style.left = 0;

//game ui engine
function playAnimation(time) {
  window.requestAnimationFrame(playAnimation);
//   music.pause();
//   music.play();
  if ((time - lastTime) / 1000 < 1 / speed) {
    return;
  }

  lastTime = time;
  gameEngine();
}
function isCollide(sarr) {
    // if snake cross
    for (let i = 1; i < snakeArray.length; i++) {
        if(sarr[i].x===sarr[0].x && sarr[i].y===sarr[0].y){
            return true;
        }
    }

    // if snake hit wall

    if(sarr[0].x>=18||sarr[0].x<=0||sarr[0].y>=18||sarr[0].y<=0){
        return true;
    }
  return false;
}

function gameEngine() {
  // upodate snake array and snake
  // collide
  if (isCollide(snakeArray)) {
    gameOver.play();
    music.pause();
    inputDir = { x: 0, y: 0 };
    alert("Game Over... \nPress any key ");
    snakeArray = [
      {
        x: 3,
        y: 5,
      },
    ];
    // music.play();
    scorVal = 0;
    score.textContent=scorVal;
  }

  // eaten food update food
  if (snakeArray[0].x === food.x && snakeArray[0].y === food.y) {
    foodMusic.play()
    snakeArray.unshift({
      x: snakeArray[0].x + inputDir.x,
      y: snakeArray[0].y + inputDir.y,
    });
    food = {x:randomFood(2, 16), y:randomFood(2, 16)}

    // score updation
    scorVal++;
    if(scorVal>highVal){
        highVal=scorVal;
        localStorage.setItem("highscore", JSON.stringify(highVal))
        highScore.textContent=highVal;
    }
    score.textContent=scorVal;
  }
  // moving snake

  for (let i = snakeArray.length - 2; i >= 0; i--) {
    
    snakeArray[i+1] = { ...snakeArray[i] };
  }
  snakeArray[0].x+=inputDir.x
  snakeArray[0].y+=inputDir.y
  //   display snake
  board.innerHTML = "";
  snakeArray.forEach((evt, ind) => {
    const snake = document.createElement("div");
    if (ind === 0) {
      snake.classList.add("head");
    } else {
      snake.classList.add("snake");
    }
    snake.style.gridRowStart = evt.y;
    snake.style.gridColumnStart = evt.x;
    board.appendChild(snake);
  });
  // display food

  const foodBox = document.createElement("div");
  foodBox.classList.add("food");
  foodBox.style.gridRowStart = food.y;
  foodBox.style.gridColumnStart = food.x;
  board.appendChild(foodBox);
}
function randomFood(a, b) {
  return Math.floor(a + Math.random() * (b - a));
}

//window start logic
window.requestAnimationFrame(playAnimation);
window.addEventListener("keyup", (e) => {
  inputDir = { x: 0, y: 1 }; //start the game
  move.play();
//   music.play();
  switch (e.key) {
    case "ArrowUp":
      inputDir.x = 0;
      inputDir.y = -1;
      break;
    case "ArrowDown":
      inputDir.x = 0;
      inputDir.y = 1;
      break;
    case "ArrowLeft":
      inputDir.x = -1;
      inputDir.y = 0;
      break;
    case "ArrowRight":
      inputDir.x = 1;
      inputDir.y = 0;
      break;
    default:
      break;
  }
});

//highscore localstorage
let highscore= localStorage.getItem("highscore");
if(highscore===null){
   
    localStorage.setItem("highscore", JSON.stringify(highVal))
}
else{
    highVal=JSON.parse(highscore);
    highScore.textContent=highVal;
}