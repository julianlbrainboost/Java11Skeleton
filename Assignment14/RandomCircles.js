let RandomCircleCanvas = document.querySelector(".RandomCircles");
let randctx = RandomCircleCanvas.getContext("2d");

for (let i = 0; i < 10; i++) {
    let xpos = Math.floor((Math.random() * 360) + 20);
	let ypos = Math.floor((Math.random() * 360) + 20);
	
	randctx.beginPath();
	randctx.arc(xpos, ypos, 20, 0, 2*Math.PI);
	randctx.stroke();
	randctx.closePath();
	
}