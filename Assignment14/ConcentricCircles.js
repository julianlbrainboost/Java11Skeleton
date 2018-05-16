let ConcentricCircleCanvas = document.querySelector(".ConcentricCircles");
let conctx = ConcentricCircleCanvas.getContext("2d");

for (let i = 10; i > 0; i--) {

	conctx.beginPath();
	conctx.fillStyle = "orange";
	conctx.arc(ConcentricCircleCanvas.width / 2, ConcentricCircleCanvas.width/2, (i * 10), 0, 2*Math.PI);
	conctx.fill();
	conctx.stroke ();
	conctx.closePath();
	}