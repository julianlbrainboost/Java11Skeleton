let canvas = document.querySelector(".CircleDraw")

let context = canvas.getContext("2d");

context.beginPath();
context.arc(canvas.width/2, canvas.height/2, 70, 0, 2*Math.PI);
context.fillStyle = "blue";
context.fill();
context.closePath();

context.fillStyle = "white";
context.textAlign= "center";
context.textBaseline = "middle";
context.font = "30px Arial";
context.fillText("My Name", 200, 200);