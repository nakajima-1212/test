var i = 1;
var l = 1;

for(i=1;i<=5;i++){
  for(l=1;l<=5;l++){
    if((l+i) % 2 == 0 ){
      document.write("★");
    }else{
      document.write("☆");
    }
  }
  document.write("<br>");
}

var i2 = 1;
var l2 = 1;

for(i2=1;i2<=5;i2++){
  for(l2=1;l2<=5;l2++){
    if(l2<=i2){
      document.write("★");
    }
  }
  document.write("<br>");
}

var i3 = 1;
var l3 = 1;

for(i3=1;i3<=5;i3++){
  for(l3=1;l3<=5;l3++){
    if(l3<i3){
      document.write("★");
    }else if(l3==i3){
      document.write("☆");
    }
  }
  document.write("<br>");
}

var i4 = 1;
var l4 = 1;

for(i4=1;i4<=5;i4++){
  for(l4=1;l4<=5;l4++){
    if(l4==i4){
      document.write("☆");
    }else{
      document.write("★");
    }
  }
  document.write("<br>");
}