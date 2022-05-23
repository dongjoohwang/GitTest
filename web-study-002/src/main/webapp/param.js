function check() {
  if (document.frm.id.value == "") {
    alert("아이디 입력");
    document.frm.id.focus();
    return false;
    } else if (document.frm.age.value == "") {
      alert("나이 입력")
      document.frm.age.focus();
      return false;
    } else if (isNaN(document.frm.age.value)) {
      alert("숫자로 입력")
      document.frm.age.focus();
      return false;
    } else {
      return true;
    }
  }  