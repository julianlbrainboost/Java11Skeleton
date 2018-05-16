let RandomRadiusCanvas = document.querySelector(".RandomRadius");
let randrctx = RandomRadiusCanvas.getContext("2d");

for (let i = 0; i < 10; i++) {
    let xpos = Math.floor((Math.random() * 360) + 20);
	let ypos = Math.floor((Math.random() * 360) + 20);
	
	let rad = Math.floor((Math.random() * 20) + 5);
	
	randrctx.beginPath();
	randrctx.arc(xpos, ypos, rad, 0, 2*Math.PI);
	randrctx.stroke();
	
	let randomColor = 'hsl(' + 360 * Math.random() + ', 100%, 50%)';
	randrctx.fillStyle = randomColor;
	randrctx.fill();
	randrctx.closePath();
	
}