let SnowmanCanvas = document.querySelector(".Snowman");
let ctx = SnowmanCanvas.getContext("2d");

//horizon
ctx.beginPath();
ctx.fillStyle = "black"
ctx.fillRect(0, SnowmanCanvas.height/2 + 50,  SnowmanCanvas.width, 5);
ctx.fill();
ctx.closePath();

//bod1
ctx.beginPath();
ctx.fillStyle = "grey"
ctx.arc(SnowmanCanvas.width/2, 300, 40, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//bod2
ctx.beginPath();
ctx.fillStyle = "grey"
ctx.arc(SnowmanCanvas.width/2, 210, 60, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//bod3
ctx.beginPath();
ctx.fillStyle = "grey"
ctx.arc(SnowmanCanvas.width/2, 125, 30, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//rght eye
ctx.beginPath();
ctx.fillStyle = "red"
ctx.arc(SnowmanCanvas.width/2 - 25, 235, 10, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//left eye
ctx.beginPath();
ctx.fillStyle = "red"
ctx.arc(SnowmanCanvas.width/2 + 25, 185, 10, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//buttn1
ctx.beginPath();
ctx.fillStyle = "black"
ctx.arc(SnowmanCanvas.width/2, 125, 7, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();

//buttn2
ctx.beginPath();
ctx.fillStyle = "black"
ctx.arc(SnowmanCanvas.width/2, 300, 7, 0, 2*Math.PI);
ctx.fill();
ctx.closePath();