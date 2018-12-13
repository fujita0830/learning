document.write("<br>"+"問1"+"<br>");

for(var star1=1;star1<=30;star1++){
	document.write("★");
	if(star1%6==0){
		document.write("<br>");
	}
}

document.write("<br>"+"問2"+"<br>");

for(var star2=1;star2<=25;star2++){
	if(star2%2==0){
		document.write("☆")
	}else{
	document.write("★");
	}	
	if(star2%5==0){
		document.write("<br>");
	}
}

document.write("<br>"+"問3"+"<br>");

for(var star3=1;star3<=25;star3++){
	if(star3%6==1){
		document.write("☆")
	}else{
	document.write("★");
	}	
	if(star3%5==0){
		document.write("<br>");
	}
}

document.write("<br>"+"問4"+"<br>");

for(var retsu4=1;retsu4<=5;retsu4++){
	for(var star4=1;star4<=retsu4;star4++){
	document.write("★");
	if(star4==retsu4){
			document.write("<br>");
	}
  }
}

document.write("<br>"+"問5"+"<br>");

for(var retsu5=1;retsu5<=5;retsu5++){
	for(var star5=1;star5<=retsu5;star5++){if(star5!=retsu5){
	document.write("★");
	}
	else if(star5==retsu5){
			document.write("☆"+"<br>");
	}
  }
}
