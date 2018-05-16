let TenCircleCanvas = document.querySelector(".TenCircles");
let tenctx = TenCircleCanvas.getContext("2d");

for (let i = 0; i < 10; i++) {
	tenctx.beginPath();
	tenctx.fillStyle = "indigo";
	tenctx.arc(TenCircleCanvas.width / 2, (i * 40) + 20, 20, 0, 2*Math.PI);
	tenctx.fill();
	tenctx.closePath();
	}