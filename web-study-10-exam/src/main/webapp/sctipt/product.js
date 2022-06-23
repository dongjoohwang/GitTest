function productCheck() {
  if (document.frm.title.value.length == 0) {
  	alert("제목을 써주세요.");
  	frm.title.focus();
  	return false;
  }
  if (document.frm.price.value.length == 0) {
    alert("가격을 써주세요.");
    frm.price.focus();
    return false;
  }
  if (document.frm.director.value.length == 0) {
    alert("감독 이름을 적어주세요.");
    frm.director.focus();
    return false;
  }
  if (document.frm.actor.value.length == 0) {
    alert("베우 이름을 적어주세요.");
    frm.actor.focus();
    return false;
  }
  if (document.frm.synopsis.value.length == 0) {
    alert("설명을 적어주세요.");
    
  }
}










